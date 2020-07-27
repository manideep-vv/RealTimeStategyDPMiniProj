package com.nt.test;

import java.sql.SQLException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.PatientController;
import com.nt.vo.PatientVO;

public class RealTimeDITest {

	public static void main(String[] args) throws SQLException {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader r = new XmlBeanDefinitionReader(f);
		r.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		PatientController cont= f.getBean("controller", PatientController.class);
		PatientVO o=new PatientVO("ammamma", "gudlur", "65", "55");
		System.out.println(cont.addPatient(o));
	}

}
