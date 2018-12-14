package com.ibrahim.backendmongodb.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibrahim.backendmongodb.model.Order;
import com.ibrahim.backendmongodb.repository.OrderRepository;
import com.ibrahim.backendmongodb.utils.Helper;

@Component
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public void transferOrder() {
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ";";
	
	        try {
	
	            br = new BufferedReader(new FileReader(Helper.pathUrl + Helper.orderCsv));
	            int i = 1;
	            while ((line = br.readLine()) != null) {
	            	if(i == 1) {
	            		i++;
	            		continue;
	            	}
	            	Order o = new Order();
	                String[] data = line.split(cvsSplitBy);
	                o.setOrderId(data[0]);
	                o.setCustomerId(data[1]);
	                o.setEmployeeId(data[2]);
	                o.setOrderDate(data[3]);
	                o.setPurchaseOrderNumber(data[4]);
	                try {
		                o.setShipDate(data[5]);
					} catch (Exception e) {
						// TODO: handle exception
					}
	                o.setShippingMethodId(data[6]);
	                try {
	                	o.setFreightCharge(data[7]);
					} catch (Exception e) {
					}

	                o.setTaxes(data[8]);
	                o.setPaymentReceived(data[9]);
	                try {
	                	o.setComment(data[10]);
					} catch (Exception e) {
						o.setComment("");
					}
	                
	                orderRepository.save(o);
	                i++;
	            }
	
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	}

}
