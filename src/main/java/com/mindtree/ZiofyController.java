package com.mindtree;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mindtree.ziofy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.ziofy.dao.ZiofyDao;
import com.mindtree.ziofy.dao.ZiofyDaoImpl;

@Controller
public class ZiofyController {

	ZiofyDao daoObj = new ZiofyDaoImpl();

	//-----------for login-------------


	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public ModelAndView loginMethod(HttpServletRequest request, HttpServletResponse response) {		
		ModelAndView mv = new ModelAndView();	
		boolean valid = daoObj.verifyUser(
				request.getParameter("username"),
				request.getParameter("password"));	
		if(valid==true) {
			request.setAttribute("username", request.getParameter("username"));
			request.setAttribute("password", request.getParameter("password"));
			mv.setViewName("homepage");
			return mv;
		}
		else {
			mv.setViewName("errorpage");
			return mv;
		}
	}

	//-----------for going to signup-------------

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView toSignupMethod(HttpServletRequest request, HttpServletResponse response) {		
		ModelAndView mv = new ModelAndView();

		mv.setViewName("register");
		return mv;
	}

	//----------- for signup -------------

	@RequestMapping(value = "/homepage", method = RequestMethod.POST)
	public ModelAndView SignupMethod(HttpServletRequest request, HttpServletResponse response) {		
		ModelAndView modelAndView = new ModelAndView();

		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setFname(request.getParameter("fisrtname"));
		user.setLname(request.getParameter("lastname"));
		user.setPassword(request.getParameter("password"));
		
		String msg = daoObj.addUser(user);
		
		if(msg.equals("Success")) {
			request.setAttribute("username", request.getParameter("username"));
			request.setAttribute("password", request.getParameter("password"));
			modelAndView.setViewName("homepage");
			return modelAndView;
		}
		else {
		
		modelAndView.setViewName("errorpage");
		return modelAndView;
		}
	}
}