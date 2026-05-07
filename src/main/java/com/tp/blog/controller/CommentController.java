package com.tp.blog.controller;

import com.tp.blog.model.Article;
import com.tp.blog.model.Comment;
import com.tp.blog.repository.ArticleRepository;
import com.tp.blog.repository.CommentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentRepository commentRepo;
    private final ArticleRepository articleRepo;

    public CommentController(CommentRepository commentRepo, ArticleRepository articleRepo) {
        this.commentRepo = commentRepo;
        this.articleRepo = articleRepo;
    }

    @PostMapping("/{articleId}")
    public Comment addComment(@PathVariable Long articleId,
                              @RequestBody Comment comment) {

        Article article = articleRepo.findById(articleId)
                .orElseThrow(() -> new RuntimeException("Article not found"));

        comment.setArticle(article);

        return commentRepo.save(comment);
    }
}