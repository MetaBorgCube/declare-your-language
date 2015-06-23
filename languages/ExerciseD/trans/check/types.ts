module types

imports include/ExerciseD 

relations

  define reflexive, transitive <sub: 

type rules 

  Class(c1, Extends(c2), _, _) :-
  where store ClassT(c1) <sub: ClassT(c2)
  
  Extends(c) : t
  where definition of c : t
  
  NoExtends() : ClassT("Object")

  