package com.mjc.school.controller.command.impl.author;

import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.Utils;
import com.mjc.school.controller.command.Command;
import com.mjc.school.service.dto.AuthorDtoRequest;
import com.mjc.school.service.dto.AuthorDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CreateAuthorCommand implements Command {
    private final BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> authorController;
    private final Scanner scanner;

    public CreateAuthorCommand(BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> authorController, Scanner scanner) {
        this.authorController = authorController;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        String name;

        System.out.println("Please enter author's name:");
        name = Utils.readStringFromUser(scanner);

        AuthorDtoRequest authorDto = new AuthorDtoRequest(null, name);

        System.out.println(authorController.create(authorDto));
    }

    @Override
    public String getDescription() {
        return "Create Author";
    }
}
