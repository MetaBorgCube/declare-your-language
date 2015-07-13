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
    final A_This this_in20700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28800 = _4;
    final A_This this_121800 = this_in20700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129400 = env_in28800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134400 = c_in28800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129400 = store_in28800;
    final boolean lifted_18760000 = true;
    final BoolV_1 lifted_18750000 = new BoolV_1(this.getSourceInfo(), lifted_18760000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28800 = store_129400;
    final A_V result_out28800 = lifted_18750000;
    return new R_default_V(result_out28800, store_out28800);
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