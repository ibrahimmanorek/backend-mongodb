package com.ibrahim.backendmongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shippingMethods")
public class ShippingMetods {
	
	@Id
	private ObjectId _id;
	private String shippingMethodId;
	private String shippingMethod;
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getShippingMethodID() {
		return shippingMethodId;
	}
	public void setShippingMethodID(String shippingMethodID) {
		this.shippingMethodId = shippingMethodID;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

}
