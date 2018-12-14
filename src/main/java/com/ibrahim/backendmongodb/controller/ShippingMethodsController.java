package com.ibrahim.backendmongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibrahim.backendmongodb.model.ShippingMetods;
import com.ibrahim.backendmongodb.repository.ShippingMethodsRepository;
import com.ibrahim.backendmongodb.utils.Helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ShippingMethodsController {
	
	@Autowired
	private ShippingMethodsRepository shippingMethodsRepository;
	
	public void transferShippingMethod() {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(Helper.pathUrl + Helper.shippingMethodsCsv));
            int i = 1;
            while ((line = br.readLine()) != null) {
            	if(i == 1) {
            		i++;
            		continue;
            	}
            	ShippingMetods sm = new ShippingMetods();
                String[] data = line.split(cvsSplitBy);
                sm.setShippingMethodID(data[0]);
                sm.setShippingMethod(data[1]);
                shippingMethodsRepository.save(sm);
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
