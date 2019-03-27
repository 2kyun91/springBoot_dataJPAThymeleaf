package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 스프링 부트에서는 JSP를 사용하는 기존 화면 개발 방식에서 벗어나 템플릿 기반의 화면 처리가 지원된다.
 * JSP와 어느 정도 유사한 Thymeleaf를 이용해서 화면을 구성할 수 있다.
 * 
 * Thymeleaf를 이용해 화면을 개발하기 위한 설정
 *  - 별도의 라이브러리 : 서버의 내부에서 처리되는 템플릿이기 때문에 별도의 라이브러리가 필요하다.
 *  - 추가 플러그인 : JSTL과 달리 이클립스에서는 편집기능을 기본으로 제공하지 않기 때문에 추가적인 플러그인이 설치되어야 한다.
 *  			 (Help -> Install New Software -> Add -> Location == http://www.thymeleaf.org/eclipse-plugin-update-site/)
 *  - 자동재시작 기능 : 코드를 수정하면 자동으로 스프링 부트를 재시작해서 수정된 코드를 반여해 주는 기능(DevTools)
 * 
 * src/main/resources 하위 폴더의 역할
 *  - static : js, css, html, 이미지 파일들을 추가하는 경로
 *  - templates : Thymeleaf를 이용한 템플릿들을 추가하는 경로
 *  
 * 만약 스프링 부트가 아닌 스프링으로 진행하는 경우에는 별도로 ViewResolver등의 설정이 필요하다.
 * 
 * Thymeleaf로 된 템플릿을 이용하더라도 Web MVC의 컨트롤러들을 구성해야한다.
 * */
@SpringBootApplication
public class SpringBootSpringDataJpaThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringDataJpaThymeleafApplication.class, args);
	}

}
