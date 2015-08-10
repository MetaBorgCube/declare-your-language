module types

imports src-gen/signatures/Programs-sig
src-gen/signatures/Expressions-sig
src-gen/signatures/Classes-sig

type rules 

  Num(i) : NumT()
  
type rules

  True() : BoolT()
  
  False() : BoolT()
  
  Not(e) : BoolT()
  where e : BoolT() else error "Boolean expression expected" on e
  
type rules

  Param(t, x) : t

  Var(x) : t
  where definition of x : t 
  