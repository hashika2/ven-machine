/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venchmachine;

/**
 *
 * @author madurang_se16024
 */
import java.util.Scanner;
public class Venchmachine {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
       int stationNum;
       System.out.println(" ***we  consider only first 5 station numbers which you can go ***" );
       System.out.println();
       
       System.out.println("Galle to Colombo press 1");
       System.out.println("Galle to Kaluthara press 2");
       System.out.println("Galle to Gampaha press 3");
       System.out.println("Galle to Jafna press 4");
       System.out.println("Galle to Matara press 5");
      
      Scanner sc=new Scanner(System.in);
       do{
          System.out.println("enter your num: ");
          
         stationNum=sc.nextInt();
       }while(stationNum>=5);
       
         
           
    
      
       System.out.print("how many children you have:");
       double chidren=sc.nextInt();
       System.out.print("how many oiders you have:");
       double older=sc.nextInt();
       details dtl=new details();
       dtl.detl(stationNum,chidren,older);
       
     
       
          }
       
       
    
}
class details{
    double price;
     Scanner sc=new Scanner(System.in);
     public void detl(int town,double children,double older){
        if(town==1){
            price=children*50+older*100;
           System.out.println("your price is:"+price);
          
       }
       else if(town==2){
            price=children*20+older*40;
           System.out.println("your price is:"+price);
        
       }
       else  if(town==3){
            price=children*60+older*150;
           System.out.println("your price is:"+price);
         
       }
         else if(town==4){
            price=children*150+older*350;
           System.out.println("your price is:"+price);
         
       }
         else  if(town==5){
            price=children*40+older*80;
           System.out.println("your price is:"+price);
         
       }
         else{
             System.out.println("invlaid number you entered");
         }
        
        getbalance get=new getbalance(price);
        
          
    }
    
}


    
    

class getbalance extends details  {
   
   public getbalance(double price){
       this.price=price;
       
         Scanner sc=new Scanner(System.in);
       
       System.out.println("enter your money ");
       System.out.println("thousands ");
       int thousand=sc.nextInt();
       System.out.println("fivehundreds");
       int fivehundred=sc.nextInt();
       System.out.println("hundreds ");
       int hundred=sc.nextInt();
       System.out.println("fifty ");
       int fifty=sc.nextInt();
       System.out.println("twentys ");
       int twenty=sc.nextInt();
       double Total=thousand*1000+fivehundred*500+hundred*100+fifty*50+twenty*20;
        
        
     
       
       double balnce=Total-price;
         System.out.println("your balnce is :"+balnce);
         System.out.println("you are welcome");
         
       remainingMoney rm=new remainingMoney();
        rm.reMoney(thousand,fivehundred,hundred,fifty,twenty);
    }
}

class remainingMoney {
     double machineallmaoney=58500;
     void reMoney(double thousand,double fivehundred,double hundred,double fifty,double twenty){
         double validthousands=50-thousand;
          System.out.println("remaining thousands is :"+validthousands);
         if(validthousands<0){
             System.out.println("we can't pay ballance Sorry!");
         }
         double validfivehundred=10-fivehundred;
         
          if(validfivehundred<0){
             System.out.println("we can't pay ballance Sorry!");
         }
         double validhundred=20-hundred;
          if(validhundred<0){
             System.out.println("we can't pay ballance Sorry!");
         }
         double validfifty=50-fifty;
          if(validfifty<0){
             System.out.println("we can't pay ballance Sorry!");
         }
         double validtwenty=25-twenty;
          if(validtwenty<0){
             System.out.println("we can't pay ballance Sorry!");
         }
         
         double reamainingmoney=machineallmaoney-(validthousands+validfivehundred+validhundred+validfifty+validtwenty);
         System.out.println("remaining money is :"+reamainingmoney);
       
         
     }
     
    
}

      
         
      
