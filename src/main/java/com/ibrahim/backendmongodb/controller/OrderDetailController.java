package com.ibrahim.backendmongodb.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibrahim.backendmongodb.model.OrderDetail;
import com.ibrahim.backendmongodb.repository.OrderDetailRepository;
import com.ibrahim.backendmongodb.utils.Helper;

@Component
public class OrderDetailController {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	public void transferOrderDetail() {
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ";";
	
	        try {
	
	            br = new BufferedReader(new FileReader(Helper.pathUrl + Helper.orderDetailCsv));
	            int i = 1;
	            while ((line = br.readLine()) != null) {
	            	if(i == 1) {
	            		i++;
	            		continue;
	            	}
	            	OrderDetail od = new OrderDetail();
	                String[] data = line.split(cvsSplitBy);
	                od.setOrderDetailId(data[0]);
	                od.setOrderId(data[1]);
	                od.setProductId(data[2]);
	                od.setQuantity(data[3]);
	                od.setUnitPrice(data[4].replaceAll(",","."));
	                od.setDiscount(data[5].replace("%", ""));
	                
	                orderDetailRepository.save(od);
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
