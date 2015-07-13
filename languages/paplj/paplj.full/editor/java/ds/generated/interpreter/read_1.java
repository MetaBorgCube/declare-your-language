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

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in23400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in31500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in31500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in31500 = _4;
    final int loc4500000 = this._1;
    final A_This this_124300 = this_in23400;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_131800 = env_in31500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_138100 = c_in31500;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S3100000 = store_in31500;
    final A_V lifted_18910000 = S3100000.get(loc4500000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out31500 = S3100000;
    final A_V result_out31500 = lifted_18910000;
    return new R_default_V(result_out31500, store_out31500);
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