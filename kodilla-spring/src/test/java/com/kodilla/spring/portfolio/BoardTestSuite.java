package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.getInProgressList().add("Task In Progress");
        board.getToDoList().add("Task To Do");
        board.getDoneList().add("Task Done");
        //Then
        System.out.println(board.getDoneList() + "\n" + board.getInProgressList() + "\n" + board.getToDoList());

    }


}
