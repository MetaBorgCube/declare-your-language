package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Var_1 extends A_Expr 
{ 
  public String _1;

  public Var_1 (INodeSource source, String _1) 
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
    final Var_1 other = (Var_1)obj;
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
    final A_This this_in2700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2700 = _4;
    final String x1800000 = this._1;
    final A_This this_12800 = this_in2700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12800 = env_in2700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12700 = c_in2700;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12800 = store_in2700;
    final readVar_1 lifted_300000 = new readVar_1(this.getSourceInfo(), x1800000);
    final R_default_V $tmp71 = lifted_300000.exec_default(this_12800, env_12800, c_12700, store_12800);
    final A_V lifted_209000 = $tmp71.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22200 = $tmp71.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2700 = store_22200;
    final A_V result_out2700 = lifted_209000;
    return new R_default_V(result_out2700, store_out2700);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Var", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}