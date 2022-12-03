package DataProvider;

import org.testng.annotations.DataProvider;

import utils.ExcelDataReader;

public class DataProviderclass{

	@DataProvider
	public Object [][] loginData(){
		ExcelDataReader reader = new ExcelDataReader("Login");
		return reader.getAllData();
	
	}
	@DataProvider
	public Object [][] createAccount(){
		ExcelDataReader reader = new ExcelDataReader("AddAccount");
		return reader.getAllData();
	}
	@DataProvider
	public Object [][] updateAccount(){
		ExcelDataReader reader = new ExcelDataReader("UpdateAccount");
		return reader.getAllData();
	}
}
