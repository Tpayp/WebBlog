package com.company;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 * Created by Tpayp on 17.11.2014.
 */
public class Post {

    private long id;
    private String nickname;
    private String message;
    private Date timestamp;
    private URL image;

    public Post() {
        id = 0;
        timestamp = new Date();
    }

    public Post(Post post)
    {
        this.id = post.getId() + 1;
        this.timestamp = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(String url) {
        try {
            image = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();

        }
    }

}
