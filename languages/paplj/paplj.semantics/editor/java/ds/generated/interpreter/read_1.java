package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class read_1 extends A_read__Arrow 
{ 
  public int _1;

  public read_1 (INodeSource source, int _1) 
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
    final read_1 other = (read_1)obj;
    if(_1 != other._1)
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26700 = _3;
    final int loc3500000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127100 = env_in26700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131900 = c_in26700;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S2400000 = store_in26700;
    final A_V lifted_17110000 = S2400000.get(loc3500000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26700 = S2400000;
    final A_V result_out26700 = lifted_17110000;
    return new R_default_V(result_out26700, store_out26700);
  }

  public int get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("read", 1), factory.makeInt(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}