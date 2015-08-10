package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Neq_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Neq_2 (INodeSource source, A_Expr _1, A_Expr _2) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final Neq_2 other = (Neq_2)obj;
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
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
    final A_This this_in21500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29500 = _4;
    final A_Expr e13200000 = this._1;
    final A_Expr e23100000 = this._2;
    final A_This this_122500 = this_in21500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130100 = env_in29500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_135200 = c_in29500;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130100 = store_in29500;
    final Eq_2 lifted_19170000 = new Eq_2(this.getSourceInfo(), e13200000, e23100000);
    final Not_1 lifted_19160000 = new Not_1(this.getSourceInfo(), lifted_19170000);
    final R_default_V $tmp599 = lifted_19160000.exec_default(this_122500, env_130100, c_135200, store_130100);
    final A_V lifted_2102000 = $tmp599.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221600 = $tmp599.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29500 = store_221600;
    final A_V result_out29500 = lifted_2102000;
    return new R_default_V(result_out29500, store_out29500);
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Neq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}