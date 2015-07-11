package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Null_1 extends A_Expr 
{ 
  public String _1;

  public Null_1 (INodeSource source, String _1) 
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
    final Null_1 other = (Null_1)obj;
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

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3400 = _4;
    final String lifted_210000 = this._1;
    final A_This this_13400 = this_in3400;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13500 = env_in3400;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13400 = c_in3400;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13500 = store_in3400;
    final NullV_0 lifted_570000 = new NullV_0(this.getSourceInfo());
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3400 = store_13500;
    final A_V result_out3400 = lifted_570000;
    return new R_default_V(result_out3400, store_out3400);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Null", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}