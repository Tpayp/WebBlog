package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Controller controller = new Controller();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Select Action: Add/Delete/List/Exit");
            String action = in.next();
            if (action.equalsIgnoreCase("exit") || action.equalsIgnoreCase("quit")) {
                break;
            } else if (action.equalsIgnoreCase("add")) {

                System.out.println("Enter nickname: ");
                String nickname = in.next();

                System.out.println("Enter message: ");
                String msg = in.next();

                System.out.println("Enter imageURL: ");
                String imageURL = in.next();

                Post lastPost = controller.getLast();
                Post post = new Post(lastPost);
                post.setNickname(nickname);
                post.setMessage(msg);
                post.setImage(imageURL);
                controller.add(post);

                System.out.println();
            } else if (action.equalsIgnoreCase("delete")) {
                System.out.println("Enter post ID:");
                long id = in.nextLong();
                controller.remove(id);
                System.out.println("Post #:"+ id +" removed");
            } else if (action.equalsIgnoreCase("list")) {
                List<Post> list = controller.getList();
                for (Post post : list) {
                    System.out.println("-------------------");
                    System.out.println("Post ID: " + post.getId());
                    System.out.println("Nickname: " + post.getNickname());
                    System.out.println("Timestamp: " + post.getTimestamp());
                    System.out.println("Image URL:  " + post.getImage());
                    System.out.println("-------------------");
                }
            }
        }
    }
}

