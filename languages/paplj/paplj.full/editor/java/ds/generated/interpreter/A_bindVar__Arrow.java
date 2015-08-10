package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;

public abstract class A_bindVar__Arrow extends AbstractNode implements IMatchableNode
{ 
  public R_default_Env exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    throw new InterpreterException("Rule failure", "default", this);
  }
}