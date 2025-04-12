package com.okushyn.patterns.design.creational.simple_factory;

public class Client {

    public static void main(String[] args) {

        Post post = PostFactory.createPost("Blog");
        System.out.println(post);
    }

}
