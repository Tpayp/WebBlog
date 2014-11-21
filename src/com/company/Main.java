package com.company;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Controller controller = new Controller();
        Scanner in = new Scanner(System.in);


            System.out.println("Select Action: Post/Comment/Exit");
            String action = in.next();
            switch (action.toLowerCase()) {
                case "post":
                    System.out.println("Select Action: Add/List/Delete/Exit");
                    String actionOnPost = in.next();
                    if (actionOnPost.equalsIgnoreCase("exit") || actionOnPost.equalsIgnoreCase("quit")) {
                        break;
                    } else if (actionOnPost.equalsIgnoreCase("add")) {

                        System.out.println("Enter nickname: ");
                        String nickname = in.next();

                        System.out.println("Enter message: ");
                        String msg = in.next();

                        System.out.println("Enter imageURL: ");
                        String imageURL = in.next();

                        Post lastPost = controller.getLastPost();
                        Post post = new Post(lastPost);
                        post.setNickname(nickname);
                        post.setMessage(msg);
                        post.setImage(imageURL);
                        controller.addPost(post);

                        System.out.println();
                    } else if (actionOnPost.equalsIgnoreCase("delete")) {
                        System.out.println("Enter post ID:");
                        long id = in.nextLong();
                        controller.removePost(id);
                        System.out.println("Post #:" + id + " removed");
                    } else if (actionOnPost.equalsIgnoreCase("list")) {
                        List<Post> list = controller.getPostList();
                        for (Post post : list) {
                            System.out.println("-------------------");
                            System.out.println("Post ID: " + post.getId());
                            System.out.println("Nickname: " + post.getNickname());
                            System.out.println("Timestamp: " + post.getTimestamp());
                            System.out.println("Image URL:  " + post.getImage());
                            System.out.println("-------------------");
                        }

                    }
                case "comment":

                    System.out.println("Select Action: Add/List/Delete/Exit");
                    String actionOnComment = in.next();
                    if (actionOnComment.equalsIgnoreCase("exit") || actionOnComment.equalsIgnoreCase("quit")) {
                        break;
                    } else if (actionOnComment.equalsIgnoreCase("add")) {

                        System.out.println("Enter nickname: ");
                        String nickname = in.next();

                        System.out.println("Enter message: ");
                        String msg = in.next();

                        System.out.println("Enter imageURL: ");
                        String imageURL = in.next();

                        Post lastPost = controller.getLastPost();
                        Post post = new Post(lastPost);
                        post.setNickname(nickname);
                        post.setMessage(msg);
                        post.setImage(imageURL);
                        controller.addPost(post);

                        System.out.println();
                    } else if (actionOnComment.equalsIgnoreCase("delete")) {
                        System.out.println("Enter post ID:");
                        long id = in.nextLong();
                        controller.removePost(id);
                        System.out.println("Post #:" + id + " removed");
                    } else if (actionOnComment.equalsIgnoreCase("list")) {
                        List<Post> list = controller.getPostList();
                        for (Post post : list) {
                            System.out.println("-------------------");
                            System.out.println("Post ID: " + post.getId());
                            System.out.println("Nickname: " + post.getNickname());
                            System.out.println("Timestamp: " + post.getTimestamp());
                            System.out.println("Image URL:  " + post.getImage());
                            System.out.println("-------------------");
                        }

                    }

                case "exit":
                    break;
            }
        }


                }



