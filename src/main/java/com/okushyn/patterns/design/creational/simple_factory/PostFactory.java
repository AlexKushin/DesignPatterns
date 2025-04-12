package com.okushyn.patterns.design.creational.simple_factory;


/**
 * This class acts as a simple factory for creation of
 * different posts on website.
 */
public class PostFactory {

    public static Post createPost(String type) {
        String postType = type.toLowerCase();
        return switch (postType) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Unknown post type: " + postType);
        };
    }

}
