package com.ibrahim.backendmongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibrahim.backendmongodb.controller.CustomerContoller;
import com.ibrahim.backendmongodb.controller.EmployeeController;
import com.ibrahim.backendmongodb.controller.OrderController;
import com.ibrahim.backendmongodb.controller.OrderDetailController;
import com.ibrahim.backendmongodb.controller.ProductController;
import com.ibrahim.backendmongodb.controller.ShippingMethodsController;

@SpringBootApplication
public class BackendMongodbApplication implements CommandLineRunner {
	
	@Autowired
	private ShippingMethodsController shippingMethodsController;
	
	@Autowired
	private CustomerContoller customerContoller;
	
	@Autowired
	private EmployeeController employeeController;
	
	@Autowired
	private OrderController orderController;
	
	@Autowired
	private OrderDetailController orderDetailController;
	
	@Autowired
	private ProductController productController;

	public static void main(String[] args) {
		SpringApplication.run(BackendMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		shippingMethodsController.transferShippingMethod();
//		productController.transferProducts();
//		customerContoller.transferCustomers();
//		employeeController.transferEmployees();
//		orderController.transferOrder();
//		orderDetailController.transferOrderDetail();
	}

}

