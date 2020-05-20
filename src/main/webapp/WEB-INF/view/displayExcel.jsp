<%@page import="java.io.IOException"%>
<%@page import="java.util.List"%>
<%@page import="com.ashish.excelReadThenDisplay.entity.ExcelModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Excel Details</title>
<style>

#table {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#table td, #table th {
  border: 1px solid #ddd;
  padding: 8px;
}

#table tr:nth-child(even){background-color: #f2f2f2;}

#table tr:hover {background-color: #ddd;}

#table th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #000d1a;
  color: white;

</style>
</head>
<body>

<table id="table">
<thead>
<tr>
<th>SEGMENT </th>
<th>COUNTRY</th>
<th>PRODUCT</th>
<th>Discount Band</th>
<th>Unit SOLD </th>
<th>MANUFACTURE</th>
<th>SALE PRICE </th>
<th>GROSS SALE</th>
<th>DISCOUNT  </th>
<th>SALE</th>
<th>COGS</th>
<th>PROFIT</th>
<th>DATE</th>
<th>MONTH Number</th>
<th>MONTH NAME </th>
<th>YEAR </th>
</tr>
</thead>

<tbody>
<%int count=0; %>
<c:forEach items="${listExcel}" var="el">
<tr>
<%count++;
if(count>1){
%>
<td>${el.getSegment()}</td>
<td>${el.getCountry()}</td>
<td>${el.getProduct()}</td>
<td>${el.getDiscountBand()}</td>
<td>${el.getUnitsSold()}</td>
<td>${el.getManufacture()}</td>
<td>${el.getSalePrise()}</td>
<td>${el.getGrossSales()}</td>
<td>${el.getDiscount()}</td>
<td>${el.getSales()}</td>
<td>${el.getCogs()}</td>
<td>${el.getProfit()}</td>
<td>${el.getDate()}</td>
<td>${el.getMonthNumber()}</td>
<td>${el.getMonthName()}</td>
<td>${el.getYear()}</td>
<%} %>
</tr>

 </c:forEach>



</tbody>
</table>
</body>
</html>