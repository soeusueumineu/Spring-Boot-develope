package me.songsungmin.springbootdeveloper.repository;

import me.songsungmin.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

