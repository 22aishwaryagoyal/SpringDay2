package com.fis.demoproject.main;




import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.fis.demoproject.model.ElectronicDevice;
import com.fis.demoproject.model.Client;
import com.fis.demoproject.service.ClientService;
public class UserRunner
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		
		
		ClientService clientservice = (ClientService)spring.getBean("clientService");
		
		System.out.println(" \n\n------------New AOP Approach --------- \n\n");
		clientservice.doBookProduct();
		
		System.out.println(" \n\n--------- No Argument call ---------\n\n");
		clientservice.doMakePayment();
		
		System.out.println(" \n\n--------- make payment with argument ---------\n\n");
		clientservice.doMakePayment("Paytm");
		
		//ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		/*
		 * ElectronicDevice e1 = (ElectronicDevice)spring.getBean("electronics1");
		 * System.out.println(e1);
		 */
		/*
		 * ElectronicDevice e2 = (ElectronicDevice)spring.getBean("electronics2");
		 * System.out.println(e2);
		 */
		/*
		 * ElectronicDevice e3 = (ElectronicDevice)spring.getBean("electronicDevice");//
		 * ElectronicDevice //List<DeviceType> devicelist=e3.getDeviceTypeList();
		 * System.out.println(e3);
		 */
		/*
		 * int count=1; for(DeviceType dev:devicelist) {
		 * System.out.println("Device Types"+count+":");
		 * System.out.println("Device type name "+dev.getDeviceTypeName());
		 * System.out.println("Device type Id "+dev.getDeviceTypeId());
		 * System.out.println("Device type Rating "+dev.getDeviceTypeRating()); count++;
		 * }
		 */
		 
		//spring.close();
	}
}
