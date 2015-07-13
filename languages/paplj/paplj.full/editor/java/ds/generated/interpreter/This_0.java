package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class This_0 extends A_Expr 
{ 
  public This_0 (INodeSource source) 
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
    final This_0 other = (This_0)obj;
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
    final A_This this_in22600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30600 = _4;
    { 
      final A_This lifted_18770000 = this_in22600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_131300 = env_in30600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_137300 = c_in30600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_131300 = store_in30600;
      final T_1 $tmp637 = lifted_18770000.match(T_1.class);
      if($tmp637 != null)
      { 
        final A_Obj o8600000 = $tmp637.get_1();
        final o2v_1 lifted_2074000 = new o2v_1(this.getSourceInfo(), o8600000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30600 = store_131300;
        final A_V result_out30600 = lifted_2074000;
        return new R_default_V(result_out30600, store_out30600);
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("This", 0));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}