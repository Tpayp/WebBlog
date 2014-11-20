package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tpayp on 17.11.2014.
 */
public class Controller {

    private List<Post> postList;

    public Controller() {
        postList = new ArrayList<Post>();
    }

    public void add(Post post) {
        postList.add(post);
    }

    public Post get(long id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public void remove(long id) {
        Post post = get(id);
        if (post == null) {
            throw new NullPointerException("The post with id = " + id + " not found");
        }
        remove(post);
    }

    public void remove(Post post) {
        postList.remove(post);
    }

    public Post getLast() {
        return postList.isEmpty() ? new Post() : postList.get(postList.size() - 1);
    }

    public List<Post> getList() {
        return postList;
    }
}
