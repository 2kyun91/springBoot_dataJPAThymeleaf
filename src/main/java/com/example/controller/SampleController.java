package com.example.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dto.MemberVO;

@Controller
public class SampleController {
	
	// @GetMapping을 이용하면 @RequestMapping을 이용하는 것보다 간단히 get 방식의 설정을 지정할 수 있다.
	@GetMapping("/sample1") 
	public void sample1(Model model) {
		model.addAttribute("greeting", "헬로 월드!");
	}
	
	@GetMapping("/sample2")
	public void sample2(Model model) {
		MemberVO memberVO = new MemberVO(123, "u00", "p00", "홍길동", new Timestamp(System.currentTimeMillis()));
		
		model.addAttribute("memberVO", memberVO);
	}
	
	@GetMapping("/sample3")
	public void sample3(Model model) {
		List<MemberVO> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new MemberVO(123, "u0" + i, "p0" + i, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/sample4")
	public void sample4(Model model) {
		List<MemberVO> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new MemberVO(i, "u000" + i % 3, "p000" + i % 3, "홍길동" + i % 3, new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/sample5")
	public void sample5(Model model) {
		String result = "SUCCESS";
		
		model.addAttribute("result", result);
	}
	
	@GetMapping("/sample6")
	public void sample6(Model model) {
		List<MemberVO> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new MemberVO(i , "u0" + i, "po" + i, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list", list);
		
		String result = "SUCCESS";
		
		model.addAttribute("result", result);
	}
	
	@GetMapping("/sample7")
	public void sample7(Model model) {
		
	}
	
	@GetMapping("/sample/hello")
	public void hello() {
		
	}
}
