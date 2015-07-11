module sub

imports src-gen/signatures/Programs-sig
src-gen/signatures/Expressions-sig
src-gen/signatures/Classes-sig

relations

  define reflexive, transitive <sub: 
    
type rules

  Class(c1, Extends(c2), _, _) :-
  where store ClassT(c1) <sub: ClassT(c2)

  If(e1, e2, e3) : t 
  where e1 : BoolT() else error "boolean expected" on e1
    and e2 : t2
    and e3 : t3
    and <least-upper-bound>(t2, t3) => t 
         else error $[Branches do not have a common super type: [t3] does not have a common super type with [t2]] on e3
    
type functions

  least-upper-bound: False() -> False() // implemented manually
 