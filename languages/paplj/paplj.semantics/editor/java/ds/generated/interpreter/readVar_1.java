package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class readVar_1 extends A_readVar__Arrow 
{ 
  public String _1;

  public readVar_1 (INodeSource source, String _1) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
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
    final readVar_1 other = (readVar_1)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26300 = _3;
    final String x39000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> E3400000 = env_in26300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131500 = c_in26300;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126800 = store_in26300;
    final A_V lifted_17060000 = E3400000.get(x39000000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26300 = store_126800;
    final A_V result_out26300 = lifted_17060000;
    return new R_default_V(result_out26300, store_out26300);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("readVar", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}