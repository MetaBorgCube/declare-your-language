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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25600 = _3;
    final String i4700000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126200 = env_in25600;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130700 = c_in25600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126200 = store_in25600;
    final int lifted_17150000 = ds.manual.interpreter.Natives.str2int_1(i4700000);
    final NumV_1 lifted_17140000 = new NumV_1(this.getSourceInfo(), lifted_17150000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25600 = store_126200;
    final A_V result_out25600 = lifted_17140000;
    return new R_default_V(result_out25600, store_out25600);
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