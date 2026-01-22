package io.github.RainDrop3.Newsy.domain.repository;

import io.github.RainDrop3.Newsy.domain.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
    //기본적인 CRUD 기능 자동 사용
}
