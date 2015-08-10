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
    final A_This this_in20800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28900 = _4;
    final A_This this_121900 = this_in20800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129500 = env_in28900;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134500 = c_in28900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129500 = store_in28900;
    final boolean lifted_19980000 = false;
    final BoolV_1 lifted_19970000 = new BoolV_1(this.getSourceInfo(), lifted_19980000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28900 = store_129500;
    final A_V result_out28900 = lifted_19970000;
    return new R_default_V(result_out28900, store_out28900);
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