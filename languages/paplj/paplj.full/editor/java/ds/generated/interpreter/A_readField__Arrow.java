package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;

public abstract class A_readField__Arrow extends AbstractNode implements IMatchableNode
{ 
  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    throw new InterpreterException("Rule failure", "default", this);
  }
}