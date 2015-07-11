package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class True_0 extends A_Expr 
{ 
  public True_0 (INodeSource source) 
  { 
    this.setSourceInfo(source);
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
    { 
      return true;
    }
    if(obj == null)
    { 
      return false;
    }
    if(getClass() != obj.getClass())
    { 
      return false;
    }
    final True_0 other = (True_0)obj;
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in1700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1700 = _4;
    final A_This this_11800 = this_in1700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11800 = env_in1700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11700 = c_in1700;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11800 = store_in1700;
    final boolean lifted_320000 = true;
    final BoolV_1 lifted_310000 = new BoolV_1(this.getSourceInfo(), lifted_320000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1700 = store_11800;
    final A_V result_out1700 = lifted_310000;
    return new R_default_V(result_out1700, store_out1700);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("True", 0));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}