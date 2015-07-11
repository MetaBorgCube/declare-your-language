package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Num_1 extends A_Expr 
{ 
  public String _1;

  public Num_1 (INodeSource source, String _1) 
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
    final Num_1 other = (Num_1)obj;
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
    final A_This this_in1200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1200 = _4;
    final String i2200000 = this._1;
    final A_This this_11300 = this_in1200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11300 = env_in1200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11200 = c_in1200;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11300 = store_in1200;
    final int lifted_560000 = ds.manual.interpreter.Natives.str2int_1(i2200000);
    final NumV_1 lifted_550000 = new NumV_1(this.getSourceInfo(), lifted_560000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1200 = store_11300;
    final A_V result_out1200 = lifted_550000;
    return new R_default_V(result_out1200, store_out1200);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Num", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}