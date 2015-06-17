program CounterOrg
  
class Counter {
  Num count // default value 0
   
  Num count() {
    this.count = this.count + 1
  }
   
  Counter init() {
   	this.count = 1; this
  }
   
  Counter reset(Num i) {
   	this.count = i; this
  }
}

run

  let Counter c1 = new Counter()
      Counter c2 = new Counter().init()
      Counter c3 = new Counter()
   in {
   	 c1.reset(c2.count);
     c1.count(); 
     c2.count();
     c1.count(); 
     c2.count();
     c3.count();
     c1.count();
     c1.count * c2.count;
   }
   