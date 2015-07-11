package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class write_2 extends A_write__Arrow 
{ 
  public int _1;

  @Child public A_V _2;

  public write_2 (INodeSource source, int _1, A_V _2) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChild(_2);
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
    final write_2 other = (write_2)obj;
    if(_1 != other._1)
    { 
      return false;
    }
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
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
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3900 = _4;
    final int loc900000 = this._1;
    final A_V v4000000 = this._2;
    final A_This this_13900 = this_in3900;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13800 = env_in3900;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13900 = c_in3900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S600000 = store_in3900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> lifted_290000 = MapUtils.plus(S600000, new com.github.krukow.clj_lang.PersistentTreeMap<Integer, A_V>().plus(loc900000, v4000000));
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3900 = lifted_290000;
    final A_V result_out3900 = v4000000;
    return new R_default_V(result_out3900, store_out3900);
  }

  public int get_1()
  { 
    return this._1;
  }

  public A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("write", 2), factory.makeInt(_1), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}