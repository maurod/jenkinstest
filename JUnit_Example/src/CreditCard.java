
public class CreditCard {
	 int cardNum;  
	 String branch;  
	 int purchasedAmt;  
	 int creditLimit;  
	  
	 /** 
	  * This creates a creditcard with given details. 
	  */  
	 public CreditCard(int cardNum, String branch, int creditLimit) {  
	  this.cardNum = cardNum;  
	  this.branch = branch;  
	  this.creditLimit = creditLimit;  
	  
	 }  
	  
	 /** 
	  * purchase through credit card. 
	  *  
	  * @param amount 
	  * @return true if purchase is successful else returns false 
	  */  
	 public boolean purchase(int amount) {  
	  if (amount + purchasedAmt > creditLimit)  
	   return false;  
	  purchasedAmt += amount;  
	  return true;  
	 }  
	  
	 /** 
	  * makes cc payment 
	  */  
	 public void makePayment(int amount) {  
	  purchasedAmt -= amount;  
	 }  
	  
	 /** 
	  * prints detail about credit card 
	  */  
	 public void printDetails() {  
	  System.out.println("Card Number : " + cardNum);  
	  System.out.println("Bank Name : " + branch);  
	  System.out.println("Balance avaliable : " + (purchasedAmt - creditLimit));  
	  System.out.println("Credit Limit :" + creditLimit);  
	 }  
	  
	 /** 
	  * get available balance. 
	  */  
	 public int getAvailableBal() {  
	  return  creditLimit-purchasedAmt;  
	 }  
	}  

