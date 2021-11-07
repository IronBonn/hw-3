class ATM{
public int countBanknotes(int sum){  
    int count = 0;  
    while(sum != 0){  
      if(sum >= 500){  
        sum -= 500;  
        count++;  
      }else if(sum >= 200 && sum < 500){  
        sum -= 200;  
        count++;  
      }else if(sum >= 100 && sum < 200){  
        sum -= 100;  
        count++;  
      }else if(sum >= 50 && sum < 100){  
        sum -= 50;  
        count++;  
      }else if(sum >= 20 && sum < 50){  
        sum -= 20;  
        count++;  
      }else if(sum >= 10 && sum < 20){  
        sum -= 10;  
        count++;  
      }else if(sum >= 5 && sum < 10){  
        sum -= 5;  
        count++;  
      }else if(sum >= 3 && sum < 5){ 
        sum -= 3; 
        count += 2; 
      }else if(sum >= 2 && sum < 3){  
        sum -= 2;  
        count++;  
      }else if(sum == 1){  
        sum -= 1;  
        count++;  
      }else{  
        System.out.println("No money");  
      }  
    }  
    return count;  
  }
}
