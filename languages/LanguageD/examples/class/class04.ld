program class04 // error

class A {
	Num x;
}

class B extends A {
	Bool x;  
}

class C extends B {

}

run  
  
  let C c = new B() // sub-type error
   in c.x
   