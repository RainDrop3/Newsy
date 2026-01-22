package io.github.RainDrop3.Newsy.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title; //뉴스 제목

    @Column(columnDefinition = "TEXT")
    private String content; //뉴스 본문

    private String source; //뉴스 출처

    @Column(unique = true)
    private String originalUrl; //중복 수집 방지

    private LocalDateTime publishedAt; //뉴스 실제 발행 시간
    private LocalDateTime createdAt; //시스템 수집 시간

    // SCD 버전 관리 필드
    private LocalDateTime startDate; //데이터 유효 시작일
    private LocalDateTime endDate; //데이터 유효 종료일
    private boolean isCurrent; //현재 최신 버전 여부
}
