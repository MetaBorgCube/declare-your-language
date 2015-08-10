package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class allocate_1 extends A_allocate__Arrow 
{ 
  @Child public A_V _1;

  public allocate_1 (INodeSource source, A_V _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final allocate_1 other = (allocate_1)obj;
    if(_1 == null)
    { 
      if(other._1 != null)
      { 
        return false;
      }
    }
    else
      if(!_1.equals(other._1))
      { 
        return false;
      }
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_Int exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in23200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in31300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in31300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in31300 = _4;
    final A_V v16200000 = this._1;
    final A_This this_124100 = this_in23200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_131600 = env_in31300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_137800 = c_in31300;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_131800 = store_in31300;
    final int loc4600000 = ds.manual.interpreter.Natives.fresh();
    final write_2 lifted_20510000 = new write_2(this.getSourceInfo(), loc4600000, v16200000);
    final R_default_V $tmp639 = lifted_20510000.exec_default(this_124100, env_131600, c_137800, store_131800);
    final A_V lifted_18650000 = $tmp639.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222900 = $tmp639.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out31300 = store_222900;
    final int result_out31300 = loc4600000;
    return new R_default_Int(result_out31300, store_out31300);
  }

  public A_V get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("allocate", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}