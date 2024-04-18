package com.mjc.school.controller.impl;

import com.mjc.school.controller.BaseController;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NewsControllerImpl implements BaseController<NewsDtoRequest, NewsDtoResponse, Long> {
    private final BaseService<NewsDtoRequest, NewsDtoResponse, Long> newsService;

    public NewsControllerImpl(BaseService<NewsDtoRequest, NewsDtoResponse, Long> newsService) {
        this.newsService = newsService;
    }

    @Override
    public List<NewsDtoResponse> readAll() {
        return newsService.readAll();
    }

    @Override
    public NewsDtoResponse readById(Long newsId) {
        return newsService.readById(newsId);
    }

    @Override
    public NewsDtoResponse create(NewsDtoRequest createRequest) {
        return newsService.create(createRequest);
    }

    @Override
    public NewsDtoResponse update(NewsDtoRequest updateRequest) {
        return newsService.update(updateRequest);
    }

    @Override
    public boolean deleteById(Long newsId) {
        return newsService.deleteById(newsId);
    }
}
