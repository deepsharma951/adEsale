package com.org.abde.listing.flipkart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "ListingFlipkart")  
public class ListingFlipkart {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String listingId;
	private String skuId;
	private double attributeValues;
	private String listings;
	private double mrp;
	private double selling_price;
	private int stock_countSale;
	private double local_shipping_charge;
	private double zonal_shipping_charge;
	private double national_shipping_charge;
	private String  listing_status;
	private String procurement_sla;
	private String procurement_type;
	private int actual_stock_count;
	private int stock_countPending;
	private String status;
	private String response;
	private String errors;
	private String errorCode;
	private String message;
	private String selling_region_restriction;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListingId() {
		return listingId;
	}
	public void setListingId(String listingId) {
		this.listingId = listingId;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public double getAttributeValues() {
		return attributeValues;
	}
	public void setAttributeValues(double attributeValues) {
		this.attributeValues = attributeValues;
	}
	public String getListings() {
		return listings;
	}
	public void setListings(String listings) {
		this.listings = listings;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(double selling_price) {
		this.selling_price = selling_price;
	}
	public int getStock_countSale() {
		return stock_countSale;
	}
	public void setStock_countSale(int stock_countSale) {
		this.stock_countSale = stock_countSale;
	}
	public double getLocal_shipping_charge() {
		return local_shipping_charge;
	}
	public void setLocal_shipping_charge(double local_shipping_charge) {
		this.local_shipping_charge = local_shipping_charge;
	}
	public double getZonal_shipping_charge() {
		return zonal_shipping_charge;
	}
	public void setZonal_shipping_charge(double zonal_shipping_charge) {
		this.zonal_shipping_charge = zonal_shipping_charge;
	}
	public double getNational_shipping_charge() {
		return national_shipping_charge;
	}
	public void setNational_shipping_charge(double national_shipping_charge) {
		this.national_shipping_charge = national_shipping_charge;
	}
	public String getListing_status() {
		return listing_status;
	}
	public void setListing_status(String listing_status) {
		this.listing_status = listing_status;
	}
	public String getProcurement_sla() {
		return procurement_sla;
	}
	public void setProcurement_sla(String procurement_sla) {
		this.procurement_sla = procurement_sla;
	}
	public String getProcurement_type() {
		return procurement_type;
	}
	public void setProcurement_type(String procurement_type) {
		this.procurement_type = procurement_type;
	}
	public int getActual_stock_count() {
		return actual_stock_count;
	}
	public void setActual_stock_count(int actual_stock_count) {
		this.actual_stock_count = actual_stock_count;
	}
	public int getStock_countPending() {
		return stock_countPending;
	}
	public void setStock_countPending(int stock_countPending) {
		this.stock_countPending = stock_countPending;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSelling_region_restriction() {
		return selling_region_restriction;
	}
	public void setSelling_region_restriction(String selling_region_restriction) {
		this.selling_region_restriction = selling_region_restriction;
	}
	
}
