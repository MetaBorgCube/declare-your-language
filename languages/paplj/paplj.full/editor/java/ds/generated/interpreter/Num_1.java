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
    final A_This this_in20200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28300 = _4;
    final String i6400000 = this._1;
    final A_This this_121300 = this_in20200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_128800 = env_in28300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_133700 = c_in28300;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_128800 = store_in28300;
    final int lifted_19020000 = ds.manual.interpreter.Natives.str2int_1(i6400000);
    final NumV_1 lifted_19010000 = new NumV_1(this.getSourceInfo(), lifted_19020000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28300 = store_128800;
    final A_V result_out28300 = lifted_19010000;
    return new R_default_V(result_out28300, store_out28300);
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