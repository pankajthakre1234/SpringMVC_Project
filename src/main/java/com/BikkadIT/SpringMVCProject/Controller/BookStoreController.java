package com.BikkadIT.SpringMVCProject.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMVCProject.model.Books;


@Controller
public class BookStoreController {

	@GetMapping("/Books")
	public ModelAndView GetBookdata() {
		
		Books bk=new Books();
		
		bk.setBookId(10012);
		bk.setBookName("Java");
		bk.setBookPrice(650.00);
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("BOOKS",bk);
		mav.setViewName("books");
		
		return mav;
		
		
	}

	
	@GetMapping("/GetAllData")
	public ModelAndView GetAllBooks() {
		
		Books book=new Books();

		book.setBookId(10013);
		book.setBookName("C Language");
		book.setBookPrice(780.00);
		
		Books book1=new Books();
		
		book1.setBookId(10014);
		book1.setBookName("C Language");
		book1.setBookPrice(780.0);
		
		Books book2=new Books();
		
		book2.setBookId(10015);
		book2.setBookName("Python");		
		book2.setBookPrice(900.0);	
		
		List<Books> lis=new ArrayList<>();
		lis.add(book);
		lis.add(book1);
		lis.add(book2);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("BOOKS", lis);
		mav.setViewName("books");
		
		
		return mav;
		
		
	}
}
