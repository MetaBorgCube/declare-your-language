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
    final A_This this_in3300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3300 = _4;
    { 
      final A_This lifted_330000 = this_in3300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13400 = env_in3300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13300 = c_in3300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13400 = store_in3300;
      final T_1 $tmp96 = lifted_330000.match(T_1.class);
      if($tmp96 != null)
      { 
        final A_Obj o2500000 = $tmp96.get_1();
        final o2v_1 lifted_214000 = new o2v_1(this.getSourceInfo(), o2500000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3300 = store_13400;
        final A_V result_out3300 = lifted_214000;
        return new R_default_V(result_out3300, store_out3300);
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