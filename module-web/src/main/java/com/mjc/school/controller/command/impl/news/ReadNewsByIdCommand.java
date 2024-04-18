package com.mjc.school.controller.command.impl.news;


import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.Utils;
import com.mjc.school.controller.command.Command;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReadNewsByIdCommand implements Command {
    private final BaseController<NewsDtoRequest, NewsDtoResponse, Long> newsController;
    private final Scanner scanner;

    public ReadNewsByIdCommand(BaseController<NewsDtoRequest, NewsDtoResponse, Long> newsController, Scanner scanner) {
        this.newsController = newsController;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Long id;

        System.out.println("Please enter the news id:");
        id = Utils.readNumberFromUser(scanner);

        System.out.println(newsController.readById(id));
    }

    @Override
    public String getDescription() {
        return "Read news by id";
    }
}
