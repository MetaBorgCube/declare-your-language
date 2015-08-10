package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class False_0 extends A_Expr 
{ 
  public False_0 (INodeSource source) 
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
    final False_0 other = (False_0)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126500 = env_in25900;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131200 = c_in25900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126500 = store_in25900;
    final boolean lifted_17660000 = false;
    final BoolV_1 lifted_17650000 = new BoolV_1(this.getSourceInfo(), lifted_17660000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25900 = store_126500;
    final A_V result_out25900 = lifted_17650000;
    return new R_default_V(result_out25900, store_out25900);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("False", 0));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}