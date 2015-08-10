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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126400 = env_in25800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130900 = c_in25800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126400 = store_in25800;
    final boolean lifted_17050000 = true;
    final BoolV_1 lifted_17040000 = new BoolV_1(this.getSourceInfo(), lifted_17050000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25800 = store_126400;
    final A_V result_out25800 = lifted_17040000;
    return new R_default_V(result_out25800, store_out25800);
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