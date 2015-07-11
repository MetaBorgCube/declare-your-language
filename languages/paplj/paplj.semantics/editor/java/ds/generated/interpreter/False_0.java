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

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in1800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1800 = _4;
    final A_This this_11900 = this_in1800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11900 = env_in1800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11800 = c_in1800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11900 = store_in1800;
    final boolean lifted_1420000 = false;
    final BoolV_1 lifted_1411000 = new BoolV_1(this.getSourceInfo(), lifted_1420000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1800 = store_11900;
    final A_V result_out1800 = lifted_1411000;
    return new R_default_V(result_out1800, store_out1800);
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