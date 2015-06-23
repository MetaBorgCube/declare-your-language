program class02

class Z {
	Num count() { 0 }
}

class A extends Z {
	Num count() { 1 }
}

class B extends A {
	Num count() { 2 } 
}

class C extends A {
	Num count() { 3; }	
}
 
run let 
  B b = new B()
  C c = new C()
  A a = new A()
  Z z = new Z()
 in 
   (if (true)
     if (true) b else c 
   else z).count() 
 
 