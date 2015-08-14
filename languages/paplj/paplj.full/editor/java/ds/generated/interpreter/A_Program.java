package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

public abstract class A_Program extends AbstractNode implements IMatchableNode
{ 
  public R_init_V exec_init()
  { 
    this.specializeChildren(0);
    final A_Program p382000004 = this;
    final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_9290004 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
    final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_9300004 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
    final A_This lifted_9310004 = ds.manual.interpreter.Natives.mkNullThis_0();
    final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_9320004 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
    final R_default_V $tmp208 = p382000004.exec_default((com.github.krukow.clj_ds.PersistentMap<String, A_Class>)lifted_9290004, (com.github.krukow.clj_ds.PersistentMap<String, A_V>)lifted_9300004, lifted_9310004, (com.github.krukow.clj_ds.PersistentMap<Integer, A_V>)lifted_9320004);
    final A_V v1125000004 = $tmp208.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> lifted_7500004 = $tmp208.get_1();
    final A_V result_out103 = v1125000004;
    return new R_init_V(result_out103);
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    throw new InterpreterException("Rule failure", "default", this);
  }
}