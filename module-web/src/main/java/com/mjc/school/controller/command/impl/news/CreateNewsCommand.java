package com.mjc.school.controller.command.impl.news;

import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.Utils;
import com.mjc.school.controller.command.Command;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CreateNewsCommand implements Command {
    private final BaseController<NewsDtoRequest, NewsDtoResponse, Long> newsController;
    private final Scanner scanner;

    public CreateNewsCommand(BaseController<NewsDtoRequest, NewsDtoResponse, Long> newsController, Scanner scanner) {
        this.newsController = newsController;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        String title;
        String content;
        Long authorId;

        System.out.println("Please enter the news title:");
        title = Utils.readStringFromUser(scanner);

        System.out.println("Please enter the news content:");
        content = Utils.readStringFromUser(scanner);

        System.out.println("Please enter the author's ID:");
        authorId = Utils.readNumberFromUser(scanner);

        NewsDtoRequest newsDto = new NewsDtoRequest(null, title, content, authorId);

        System.out.println(newsController.create(newsDto));
    }

    @Override
    public String getDescription() {
        return "Create News";
    }
}
