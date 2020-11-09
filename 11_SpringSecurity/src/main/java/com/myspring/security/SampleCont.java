package com.myspring.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class SampleCont {

	@Controller
	@RequestMapping("/sample/*")
	public class sampleCont{
		@GetMapping("admin")
			public void admin() {
				
			}
		}
	}

