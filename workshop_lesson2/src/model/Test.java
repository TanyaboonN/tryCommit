package model;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
			
		Drink d1 = new Drink(1 ,"Cappucino", 45);
//		d1.id = 1;
//		d1.name = "Cappucino";
//		d1.price = 45;
		
		Drink d2 = new Drink(2, "Americano", 50);		
		Drink d3 = new Drink(3, "Latte",60 );
		Drink d4 = new Drink(4, "Mocha",65 );
		Drink d5 = new Drink(5, "Machiato",70 );
		
		List<Drink> list = new ArrayList<Drink>() ; //Arraylist มันคือการเอาข้อมูลมาวางต่อกันตามลำดับที่เพิ่มเข้าไปม, ตัวแปร  list เก็บค่า arraylist ของ class Drink 
		list.add(d1);      //การเพิ่มข้อมูลตัวแปร d1 เข้าไปใน list 
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		
		System.out.println(list.toString());
		
		list.remove(0);
		System.out.println(list);
		
		// d2.name = ""; 		เข้าถึงตัวแปร name ตรงๆไม่ได้เนื่องจาก private
		
//		System.out.println(d2.id); 
		System.out.println(d2.getID());
		

		
//		Customer c1 = new Customer(1, "Jack", 27, 123456789);
//		Customer c2 = new Customer(2, "Joke", 30, 123456789);
//		Customer c3 = new Customer(3, "Jame", 34, 123456789);
//		
//		List<Customer> list = new ArrayList<Customer>();
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);

	
		System.out.println(list.toString());
//		System.out.println(list);
	}

}
