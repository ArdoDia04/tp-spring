package com.tp.blog.service;

import com.tp.blog.model.Article;
import com.tp.blog.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repo;

    public ArticleServiceImpl(ArticleRepository repo) {
        this.repo = repo;
    }

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public List<Article> getAll() {
        return repo.findAll();
    }

    @Override
    public Article getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}