package com.ashish.excelReadThenDisplay.entity;

public class ExcelModel {

	
	private String segment;
	private String country;
	private String product;
	private String discountBand;
	private String unitsSold;
	private String manufacture;
	private String salePrise;
	private String grossSales;
	private String discount;
	private String sales;
	private String cogs;
	private String profit;
	private String date;
	private String monthNumber;
	private String monthName;
	private String year;
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDiscountBand() {
		return discountBand;
	}
	public void setDiscountBand(String discountBand) {
		this.discountBand = discountBand;
	}
	public String getUnitsSold() {
		return unitsSold;
	}
	public void setUnitsSold(String unitsSold) {
		this.unitsSold = unitsSold;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getSalePrise() {
		return salePrise;
	}
	public void setSalePrise(String salePrise) {
		this.salePrise = salePrise;
	}
	public String getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(String grossSales) {
		this.grossSales = grossSales;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getCogs() {
		return cogs;
	}
	public void setCogs(String cogs) {
		this.cogs = cogs;
	}
	public String getProfit() {
		return profit;
	}
	public void setProfit(String profit) {
		this.profit = profit;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMonthNumber() {
		return monthNumber;
	}
	public void setMonthNumber(String monthNumber) {
		this.monthNumber = monthNumber;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "ExcelModel [segment=" + segment + ", country=" + country + ", product=" + product + ", discountBand="
				+ discountBand + ", unitsSold=" + unitsSold + ", manufacture=" + manufacture + ", salePrise="
				+ salePrise + ", grossSales=" + grossSales + ", discount=" + discount + ", sales=" + sales + ", cogs="
				+ cogs + ", profit=" + profit + ", date=" + date + ", monthNumber=" + monthNumber + ", monthName="
				+ monthName + ", year=" + year + "]";
	}
	
	
	
}
