package com.dsa;

import java.util.*;
import java.util.concurrent.*;
import java.text.*;
import java.io.*;

class OverLimitException extends Exception{
    
    public OverLimitException(String s){
        super(s);
    }
}

class Account{
    String accountNumber;
    String accountName;
    Double dueAmount;
    
    void setDueAmount(Double db){
        dueAmount=db;
    }
    
    Double getDueAmount(){
        return dueAmount;
    }
    
    Account(){}
    
    Account(String accNo,String accName,Double dueAm){
        accountNumber=accNo;
        accountName=accName;
        dueAmount=dueAm;
    }
    
    static Integer validate(String dt,String unpaidAmount,String amount){
        try{
            for(int i=0;i<unpaidAmount.length();i++){
                if((unpaidAmount.charAt(i)<'0' || unpaidAmount.charAt(i)>'9')&& unpaidAmount.charAt(i)!='.')
                    return -1;
            }
            
            for(int i=0;i<amount.length();i++){
                if((amount.charAt(i)<'0' || amount.charAt(i)>'9')&& amount.charAt(i)!='.')
                    return -1;
            }
            
            Double unpaid = Double.parseDouble(unpaidAmount);
            SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
            String inputString1 = "01/12/2015";
            Date dt1 = myFormat.parse(inputString1);
            Date dt2 = myFormat.parse(inputString1);
            long diff = dt2.getTime()-dt1.getTime();
            long day = TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
            day = Math.abs(day);
            if(day>45 || unpaid>=2000)
                return -3;
        }
        catch(Exception e){
            return -2;
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException,ParseException,OverLimitException{
        
        int n =0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the transaction details");
        System.out.println("Enter the account number");
        String accNo = in.nextLine();
        System.out.println("Enter the account holder name");
        String accName = in.nextLine();
        System.out.println("Enter the last due date");
        String date = in.nextLine();
        System.out.println("Enter the unpaid amount");
        String unpaid = in.nextLine();
        System.out.println("Enter the transaction amount");
        String tcamt = in.nextLine();
        
        
        try{
            n=Account.validate(date,unpaid,tcamt);
        }
        catch(Exception o){
            if(n==-1)
                throw new IOException("Invalid Amount");
            else if(n==-2){
                ParseException e = null;
                throw new ParseException("Invalid Date Format",e.getErrorOffset());
            }
            else if(n==-3){
                throw new OverLimitException("Further Transactions Not Possible until clearance of bill");
            }
        }
        
        Double due = Double.parseDouble(unpaid);
        Double amts = Double.parseDouble(tcamt);
        
        Account acc = new Account(accNo,accName,due);
        
        System.out.println("Transaction sucessfully completed.");
        System.out.println("Account Number : "+accNo);
        System.out.println("Account Name : "+accName);
        System.out.println("Unpaid Amount : "+due+amts);
        
    }
}
