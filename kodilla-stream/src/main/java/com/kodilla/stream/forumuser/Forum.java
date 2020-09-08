package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(221331, "mobydick", 'M', LocalDate.of(1988, 3, 22), 0));
        userList.add(new ForumUser(221332, "mosafdfk", 'F', LocalDate.of(2010, 3, 22), 4));
        userList.add(new ForumUser(221333, "bczdfdick", 'F', LocalDate.of(1988, 3, 22), 4));
        userList.add(new ForumUser(221334, "h56ewdick", 'M', LocalDate.of(2010, 3, 22), 4));
        userList.add(new ForumUser(221335, "dsfggick", 'F', LocalDate.of(1988, 3, 22), 4));
        userList.add(new ForumUser(221336, "juytdudick", 'M', LocalDate.of(2010, 3, 22), 4));
        userList.add(new ForumUser(221337, "1mobydick", 'M', LocalDate.of(1988, 3, 22), 8));
        userList.add(new ForumUser(221338, "2mosafdfk", 'F', LocalDate.of(2010, 3, 22), 4));
        userList.add(new ForumUser(221339, "3bczdfdick", 'F', LocalDate.of(1988, 3, 22), 4));
        userList.add(new ForumUser(221340, "4h56ewdick", 'M', LocalDate.of(2010, 3, 22), 4));
        userList.add(new ForumUser(221341, "5dsfggick", 'F', LocalDate.of(1988, 3, 22), 4));
        userList.add(new ForumUser(221342, "6juytdudick", 'M', LocalDate.of(2010, 3, 22), 4));


    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
