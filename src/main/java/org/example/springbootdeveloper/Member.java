package org.example.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
@Getter
@Entity // 엔티티로 지정, Member클래스와 실제 DB테이블을 매핑시킨다. -> member이름을 가진 테이블과 매핑
//@Entity(name = "member_list") -> member_list라는 이름을 가진 테이블과 매핑하고 싶다면 이렇게!
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY는 AUTO_INCREMENT와 뜻이 같다.
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", nullable = false)
    private String name; // DB 테이블의 'name' 컬럼과 매칭
}
