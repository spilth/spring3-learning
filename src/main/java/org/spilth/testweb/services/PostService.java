package org.spilth.testweb.services;

import org.spilth.testweb.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public Post addPost(Post post) {
        return new Post();
    }

    public List<Post> getPosts() {
        List posts = new ArrayList<Post>();
        posts.add(new Post());
        posts.add(new Post());
        posts.add(new Post());

        return posts;
    }

    public Post getPost(Integer id) {
       return new Post();
    }
}
