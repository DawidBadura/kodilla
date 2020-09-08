package com.kodilla.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamMain {
    public static void main(String[] args) {
    /*    Forum forum = new Forum();
        Map<Integer, ForumUser> userMap = forum.getUserList().stream().
                filter(forumUser -> forumUser.getSex()=='M').
                filter(forumUser -> forumUser.getBirthDate().until(LocalDate.now()).toTotalMonths()/12>20).
                filter(forumUser -> forumUser.getPublishedPosts()>0).
                collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser ));
        System.out.println(userMap);*/
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result=numbers.stream().map(x->x=x*x).collect(toList());
        System.out.println(result);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream()
                .filter(j->(j+i)%3==0)
                .map((j->new int[]{i,j})))
                .collect(Collectors.toList());


    }


}