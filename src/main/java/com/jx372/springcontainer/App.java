package com.jx372.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args ){
    	testBeanFactory();
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
