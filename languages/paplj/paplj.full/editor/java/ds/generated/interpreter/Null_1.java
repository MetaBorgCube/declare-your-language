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
    final A_This this_in22700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30700 = _4;
    final String lifted_18430000 = this._1;
    final A_This this_123600 = this_in22700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_131400 = env_in30700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_137400 = c_in30700;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_131400 = store_in30700;
    final NullV_0 lifted_19030000 = new NullV_0(this.getSourceInfo());
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30700 = store_131400;
    final A_V result_out30700 = lifted_19030000;
    return new R_default_V(result_out30700, store_out30700);
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