﻿import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class program
{
//setting private class attributes
private int accountNumber; 				//the customer's account number
private double accountBalance=0;		//the customer's account balance
private int bankNumber;					//the customer's bank account number
private int socialNumber;				//the customer's social security number
private boolean verifiedSocial = false; //check of the customer verified their social number
private int transactions =0; 			//records the number of bank transactions
private boolean activeAccount = true;	//checks if the customer's account is active
private int loginAttempts;				//records the number of login attemps
private int passwordAttempts; 			//stores the number of *password attempts
private int usernameLoginAttempts; // stores thr number of login *username attempts
private String customerPhoneNumber;		//the customer's phone number
private String fname;					//the customer's first name
private String lname;					//the customer's last name
private boolean in_session;			//cheks if the account is logged in
//---------------------------------------------------------------------------------//	
//setter for customer's first and last name
public void setCustomerName(String Firstname, String Lastname){
	fname = Firstname;
	lname = Lastname;
}

//account number setter
public void setaAccNumber(int AccNum)
{	
	int accLength;
	String strAccNum;
  strAccNum = Integer.toString(AccNum);
  accLength= strAccNum.length();
  if(accLength <=9 && accLength >=11){
	  System.out.println("Insufficient number of digits.");
  }else{
		accountNumber = AccNum;
		}
	}
//setter for customers account number
public void setaAccountNumber(int accountnumber)
	{
		accountNumber = accountnumber;
	}
	

//set customers login attempts
public void setLoginAttempts(){
	loginAttempts++;
}
//setter for customer ssn verification 
public void verifiedSocialNumber(boolean verfiedSSN)
{
	if(verfiedSSN == true){verifiedSocial = true;
		
}
	else if(verfiedSSN == false)
	{
		verifiedSocial = false;
	}	
	else
	{
		verifiedSocial = false;
	}
}
//setter for funds withdraw
public void accWithdraw(double funds)
	{
	if(activeAccount == true && funds < accountBalance)
	{
		accountBalance -= funds; 
		transactions++;
	}
	else
	{
		System.out.println("insufficient balance");
	}
}
//setter for deposit function
public void accDeposit(double funds){
	if
(activeAccount == true){
	accountBalance += funds;
	transactions++;
}else{System.out.println("account is inactive:..");
	
}}
public void setAccountStatus(boolean setStatus){
if(setStatus == true){
	activeAccount = true;}
else if(setStatus == false){
	activeAccount = false;
}
else{
	activeAccount = false;
}}

//Set the current time
void setaTimeStamp(){
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/HH:mm:ss");
}

public void setSocialNumber(int SSN){
int ssnStringLengh;
	String convertToString;
	convertToString = (Integer.toString(SSN));
	ssnStringLengh = convertToString.length();
	if(ssnStringLengh <= 9 && ssnStringLengh >=10){
	System.out.println("Insufficient Digits");
	System.out.println("A social security number must be 9 digits long.");
}else{
	System.out.println("setting ssn");
	socialNumber = SSN;
	}
}

public void getUserTime(){
	//Datetime.now();
}

//getters for user data
int displayAccountNumber(){
	return accountNumber;
	}
double displayAccountBalance(){
	return accountBalance;
	}
long displaySocial(){
	return socialNumber;
	}
int displayTransactions(){
	return transactions;
	}
String displayCustomerName(){
	return fname + " " + lname;
}
boolean displayAccountStatus(){
	return activeAccount;
}
//
int userPasswordAttempts()
{
	return passwordAttempts;
}
//This command returns the number of username login attempts
int usernameLoginAttemptsfunc()
{
	return usernameLoginAttempts;
}
//This command returns the number of password login attempts
int userPasswordLoginAttempts()
{
	return passwordAttempts;
}

String displayCurrentTime()
{
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/MM/HH:mm:ss");
	return dtf.format(now);
}



//main function
public static void main(String[] args){
program p = new program();
//p.setAccountStatus(true);
p.accDeposit(1322.33);
p.accDeposit(13.44);
p.accDeposit(13.44);
p.accDeposit(13.44);
System.out.println(p.displayAccountStatus());
p.setAccountStatus(false);
System.out.println(p.displayAccountStatus());
System.out.println(p.displayAccountStatus());
p.setAccountStatus(true);
System.out.println(p.displayAccountStatus());
System.out.println(p.displayAccountBalance());
System.out.println(p.displayCurrentTime());


}
}