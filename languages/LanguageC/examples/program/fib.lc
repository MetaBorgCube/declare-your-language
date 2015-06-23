program fib

class Fib {
   Num value
   Fib next 
   
   Fib initialize(Num n) {
     if (n == 0)
       this 
     else { 
     	 this.next = new Fib(); 
       this.next.initialize(n - 1);
     }
   }
   
   Num calculate(Num n) {
     if (n == 1)
       1
     else
       let 
         Fib nplus1 = this.next
         Fib nplus2 = this.next.next
        in {
            nplus2.value = this.value + nplus1.value;
            nplus1.calculate(n - 1);
        }
    }
    
    Num getValue(Num n) {
     if (n == 0)
       this.value
     else
       this.next.getValue(n - 1)
    }
  }

run
 let
   Fib fib = new Fib()
   Num n = 5
  in {
    fib.initialize(n);
    //fib.value = 0;    // default value
    fib.next.value = 1;
    fib.calculate(n);
    fib.getValue(n);
  }
