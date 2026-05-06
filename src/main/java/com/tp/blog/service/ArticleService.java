package com.tp.blog.service;

import com.tp.blog.model.Article;
import java.util.List;

public interface ArticleService {
    Article save(Article article);
    List<Article> getAll();
    Article getById(Long id);
}
