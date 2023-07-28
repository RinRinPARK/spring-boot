package org.example.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ExampleController {

    @GetMapping("/thymeleaf/example")
    public String thymeleafExample(Model model) { // 뷰로 데이터를 넘겨주는 모델 객체
        Person examplePerson = new Person();
        examplePerson.setId(1L);
        examplePerson.setName("박수린");
        examplePerson.setAge(22);
        examplePerson.setHobbies(List.of("요가", "코딩"));

        model.addAttribute("person", examplePerson); // Person 객체 저장
        model.addAttribute("today", LocalDate.now());

        // 스프링부트는 @Controller어노테이션을 보고 반환하는 값의 이름을 가진 뷰 파일을 찾음
        return "example"; // example.html이라는 뷰 조회
    }

    @Setter
    @Getter
    class Person {
        private Long id;
        private String name;
        private int age;
        private List<String> hobbies;
    }
}
