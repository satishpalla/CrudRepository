package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Books;
import com.example.demo.repository.BooksRepository;

@SpringBootApplication
public class DataJpaDemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(DataJpaDemo2Application.class, args);
	BooksRepository br=cac.getBean(BooksRepository.class);
	
	/*Books b1=new Books(101,"Java",102.52);
	Books b2=new Books(102,"c",4745);
	Books b3=new Books(103,"Html",524);
	br.saveAll(Arrays.asList(b1,b2,b3));*/

	
	/*Optional<Books> op=br.findById(101);
	if(op.isPresent())
	{
		System.out.println(op.get());
	}
	System.out.println("Done............");
*/	

	
	/*Iterable<Books> it=br.findAll();
	for (Books books : it) {
		System.out.println(books);
	}
	*/
	
/*	Iterable<Books> it1=br.findAllById(Arrays.asList(101,103));
for (Books books : it1) {
	System.out.println(books);
}*/
	

	Boolean b=br.existsById(102);
	System.out.println(b);

	
	Long l=br.count();
	System.out.println(l);
	
	
	/*br.deleteById(102);
	System.out.println("102 Record deleted");*/
	
	Books b1=new Books(104,"perl",107.52);
	Books b2=new Books(105,"jfjf",475);
	Books b3=new Books(106,"php",521);
	br.saveAll(Arrays.asList(b1,b2,b3));
Iterable it=Arrays.asList(103,105);
	
	/*	br.deleteAllById(it);
	System.out.println("Deleted");
	*/
br.deleteAll();

	}
}