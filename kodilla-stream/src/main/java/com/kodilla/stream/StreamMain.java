package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> userMap = forum.getUserList().stream().
                filter(forumUser -> forumUser.getSex()=='M').
                filter(forumUser -> forumUser.getBirthDate().until(LocalDate.now()).toTotalMonths()/12>20).
                filter(forumUser -> forumUser.getPublishedPosts()>0).
                collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser ));
        System.out.println(userMap);



    }

}