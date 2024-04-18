package com.mjc.school.controller.command.impl.author;

import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.command.Command;
import com.mjc.school.service.dto.AuthorDtoRequest;
import com.mjc.school.service.dto.AuthorDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReadAllAuthorsCommand implements Command {
    private final BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> authorController;
    private final Scanner scanner;

    public ReadAllAuthorsCommand(BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> authorController, Scanner scanner) {
        this.authorController = authorController;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        authorController.readAll().forEach(System.out::println);
    }

    @Override
    public String getDescription() {
        return "Read all Authors";
    }
}
