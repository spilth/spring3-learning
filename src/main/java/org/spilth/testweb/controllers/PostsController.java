package org.spilth.testweb.controllers;

import org.spilth.testweb.services.PostService;
import org.spilth.testweb.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostService postService;

    @RequestMapping
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/posts/index");
        modelAndView.addObject("posts", postService.getPosts());

        return modelAndView;
    }

    @RequestMapping(value = "/new")
    public ModelAndView newPost() {
        ModelAndView modelAndView = new ModelAndView("/posts/new");
        modelAndView.addObject("post", new Post());

        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute Post post, final RedirectAttributes redirectAttributes) {
        post = postService.addPost(post);

        ModelAndView modelAndView = new ModelAndView("/posts/index");
        redirectAttributes.addFlashAttribute("message","Post was successfully added.");
        modelAndView.setViewName("redirect:/posts/" + post.getId());

        return modelAndView;
    }

    @RequestMapping(value="/{id}")
    public ModelAndView show(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/posts/show");

        modelAndView.addObject("post", postService.getPost(id));

        return modelAndView;
    }

    @RequestMapping(value="/{id}/edit")
    public ModelAndView edit(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/posts/edit");

        modelAndView.addObject("post", postService.getPost(id));

        return modelAndView;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public ModelAndView update(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/posts/show");

        // UPDATE HERE

        Post post = postService.getPost(id);

        modelAndView.addObject("message", "Post was successfully updated.");
        modelAndView.setViewName("redirect:/posts/" + post.getId());

        return modelAndView;
    }

    // TODO
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();

        // DELETE HERE

        // REDIRECT HERE
        modelAndView.addObject("message", "Post was successfully deleted.");
        modelAndView.setViewName("redirect:/posts");

        return modelAndView;
    }
}
