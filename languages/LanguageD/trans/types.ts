module types

imports include/LangD

relations

  define reflexive, transitive <sub: 

type rules

  Class(c1, Extends(c2), _, _) :-
  where store ClassT(c1) <sub: ClassT(c2)
  
  Extends(c) : t
  where definition of c : t
  
  NoExtends() : ClassT("Object")

  x@This() : t
  where definition of x : t
    
  New(c) : t
  where definition of c : t
  
  Null(c) : t
  where definition of c : t
  
  Cast(c, e) : t
  where definition of c : t
    and e : t_e
    and (t_e <sub: t or t <sub: t_e) 
        else error $[[c] should be sub- or super-type of [t_e]] on c
  
type rules

  Param(t, x) : t

  Var(x) : t
  where definition of x : t 
  
  Call(e, m, es) : t
  where definition of m : (t1*, t)
    and es : t2*
    and t2* <sub: t1* else error $[argument types [t2*] not a sub-type of method parameter types [t1*]] on es

  Bind(t, x, e) : t
  where e : t_e
    and t_e <sub: t else error $[[t] is not a sub-type of [t_e]] on e
 
type rules

  Num(i) : NumT()
  
  Min(e) : NumT()
  where e : NumT() else error "number expected" on e
  
  Add(e1, e2) + Sub(e1, e2) + Mul(e1, e2) : NumT()
  where e1 : NumT() else error "number expected" on e1
    and e2 : NumT() else error "number expected" on e2

  Eq(e1, e2) + Neq(e1, e2) : BoolT()
  where e1 : NumT() else error "number expected" on e1
    and e2 : NumT() else error "number expected" on e2
  
  True() : BoolT()
  False() : BoolT()
  
  Not(e) : BoolT()
  where e : BoolT() else error "boolean expected" on e
         
  And(e1, e2) + Or(e1, e2) : BoolT()
  where e1 : BoolT() else error "boolean expected" on e1 
    and e2 : BoolT() else error "boolean expected" on e2
    
  Do([e]) : t
  where e : t
   
  Do([e1, e2]) : t2
  where e1 : t1 and e2 : t2
  
  Let(bs, e): t
  where e : t

  If(e1, e2, e3) : t
  where e1 : BoolT() else error "boolean expected" on e1
    and e2 : t2
    and e3 : t3
    and <least-upper-bound>(t2, t3) => t 
         else error $[Branches do not have a common super type: [t3] does not have a common super type with [t2]] on e3
    
type functions

	least-upper-bound: False() -> False() // implemented manually
 
  
type rules

  Stat(e) : t
  where e : t
  
  Get(e, f) : t
  where e : ClassT(c) else error "class type expected" on e
    and definition of f has type t
  
  Set(e1, f, e2) : t2
  where e1 : t_e1 
    and t_e1 => ClassT(c) else error "class type expected" on e1
    and definition of f : t1        
    and e2 : t2
    and (t2 == t1 or t2 <sub: t1) else error $[should be subtype of [t1]] on e2
  
  