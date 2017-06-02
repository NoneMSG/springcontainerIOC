package com.jx372.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args ){
    	//testBeanFactory();
    	testApplicationContext();
    }
    public static void testApplicationContext(){
    	//spring MVC 에서는 WebXmlApplicationContext
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext2.xml");
    	
    	//bean의 id로 가져오기
    	User1 user1 = (User1)ac.getBean("myuser1"); //캐스팅 필요
    	System.out.println(user1);
    	
    	//type으로 가져오기
//    	user1 = ac.getBean(User1.class);
//    	System.out.println(user1);
    	
    	//name으로 가져오기 (옛날에 쓰던방식)
    	user1 = (User1)ac.getBean("user1");
    	System.out.println(user1);
    	
    	//같은 type의 bean도 생성할 수 있다. 단, id로 가져와야 한다.
    	user1= (User1)ac.getBean("myuser1-2");
    			System.out.println(user1);
    	
    	//같은 type의 bean이 2개 이상 있는 경우 타입으로 가져오는것은 실패 무엇을 가져와야 할 지 모르기 때문
//		user1 = ac.getBean(User1.class);
//		System.out.println(user1);
    	
    	//bean을 통해서 생성자에 데이터 주입
    	User2 user2 = (User2)ac.getBean("user2");
    	System.out.println(user2);
    	
    	User3 user3 = (User3)ac.getBean("user3-1");
    	System.out.println(user3);
    	User3 user3_2 = (User3)ac.getBean("user3-2");
    	System.out.println(user3_2);
    	
    	User4 user4 = (User4)ac.getBean("user4");
    	System.out.println(user4);
    	
    	//DI test
    	User user = (User)ac.getBean("user");
    	System.out.println(user);
    	
    	User usr = (User)ac.getBean("usr");
    	System.out.println(usr);
    	
    	User usr2 = (User)ac.getBean("usr2");
    	System.out.println(usr2);
    	
    }
    public static void testBeanFactory(){
    	BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/applicationContext1.xml"));
    	
    	//Type으로 bean 얻어오기
    	User1 user1 = bf1.getBean(User1.class);
    	System.out.println(user1);
    	
    	//id로 bean 얻어오기 default id는 소문자 클래스이름
    	user1 = (User1)bf1.getBean("user1");
    	System.out.println(user1);
    	
    	
    	//bean 설정인 경우에는 id를 설정하지 않으면 id가 생성되지 않는다.
    	BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/applicationContext2.xml"));
    	user1 = bf2.getBean(User1.class);
    	System.out.println(user1);
    	//bean 설정은 id가 자동으로 들어가지 않는다.
    	user1 = (User1)bf2.getBean("myuser1");
    	System.out.println(user1);
    }
}
