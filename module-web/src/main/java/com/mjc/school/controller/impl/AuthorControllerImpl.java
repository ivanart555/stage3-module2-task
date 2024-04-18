package com.mjc.school.controller.impl;

import com.mjc.school.controller.BaseController;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.AuthorDtoRequest;
import com.mjc.school.service.dto.AuthorDtoResponse;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorControllerImpl implements BaseController<AuthorDtoRequest, AuthorDtoResponse, Long> {
    private final BaseService<AuthorDtoRequest, AuthorDtoResponse, Long> authorService;

    public AuthorControllerImpl(BaseService<AuthorDtoRequest, AuthorDtoResponse, Long> authorService) {
        this.authorService = authorService;
    }

    @Override
    public List<AuthorDtoResponse> readAll() {
        return authorService.readAll();
    }

    @Override
    public AuthorDtoResponse readById(Long authorId) {
        return authorService.readById(authorId);
    }

    @Override
    public AuthorDtoResponse create(AuthorDtoRequest createRequest) {
        return authorService.create(createRequest);
    }

    @Override
    public AuthorDtoResponse update(AuthorDtoRequest updateRequest) {
        return authorService.update(updateRequest);
    }

    @Override
    public boolean deleteById(Long authorId) {
        return authorService.deleteById(authorId);
    }
}
