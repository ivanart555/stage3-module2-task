package com.mjc.school.controller.command.impl.author;

import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.Utils;
import com.mjc.school.controller.command.Command;
import com.mjc.school.service.dto.AuthorDtoRequest;
import com.mjc.school.service.dto.AuthorDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReadAuthorByIdCommand implements Command {
    private final BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> authorController;
    private final Scanner scanner;

    public ReadAuthorByIdCommand(BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> authorController, Scanner scanner) {
        this.authorController = authorController;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Long id;

        System.out.println("Please enter the author's id:");
        id = Utils.readNumberFromUser(scanner);

        System.out.println(authorController.readById(id));
    }

    @Override
    public String getDescription() {
        return "Read author by id";
    }
}
