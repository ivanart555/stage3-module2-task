package com.mjc.school.controller.command.impl.news;


import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.Utils;
import com.mjc.school.controller.command.Command;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UpdateNewsByIdCommand implements Command {
    private final BaseController<NewsDtoRequest, NewsDtoResponse, Long> newsController;
    private final Scanner scanner;

    public UpdateNewsByIdCommand(BaseController<NewsDtoRequest, NewsDtoResponse, Long> newsController, Scanner scanner) {
        this.newsController = newsController;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Long id;
        String title;
        String content;
        Long authorId;

        System.out.println("Please enter the news id to edit:");
        id = Utils.readNumberFromUser(scanner);

        System.out.println("Please enter new news title:");
        title = Utils.readStringFromUser(scanner);

        System.out.println("Please enter new the news content:");
        content = Utils.readStringFromUser(scanner);

        System.out.println("Please enter new the author's ID:");
        authorId = Utils.readNumberFromUser(scanner);

        NewsDtoRequest newsDto = new NewsDtoRequest(id, title, content, authorId);

        System.out.println(newsController.update(newsDto));
    }

    @Override
    public String getDescription() {
        return "Edit news by id";
    }
}