package org.example.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id // id필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키가 자동으로 1씩 증가
    @Column(name = "id", updatable = false) // 이 컬럼이 DB에 저장된 이후에는 값을 변경할 수 없음. -> 데이터가 한 번 저장되면 업데이트 불가
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder // 빌더 패턴으로 객체 생성
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
