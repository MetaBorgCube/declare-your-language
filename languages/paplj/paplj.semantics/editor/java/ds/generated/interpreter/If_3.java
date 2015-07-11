package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class If_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  @Child public A_Expr _3;

  public If_3 (INodeSource source, A_Expr _1, A_Expr _2, A_Expr _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
    this._3 = adoptChild(_3);
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
    final If_3 other = (If_3)obj;
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
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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
      if(_3 instanceof IGenericNode)
      { 
        ((IGenericNode)_3).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in2500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2500 = _4;
    final A_Expr lifted_1360000 = this._1;
    final A_Expr lifted_1510000 = this._2;
    final A_Expr e3200000 = this._3;
    { 
      final A_This this_12600 = this_in2500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12600 = env_in2500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12500 = c_in2500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12600 = store_in2500;
      final R_default_V $tmp63 = lifted_1360000.exec_default(this_12600, env_12600, c_12500, store_12600);
      final A_V lifted_282000 = $tmp63.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22000 = $tmp63.get_1();
      final BoolV_1 $tmp64 = lifted_282000.match(BoolV_1.class);
      if($tmp64 != null)
      { 
        final boolean lifted_1370000 = $tmp64.get_1();
        if(lifted_1370000 == true)
        { 
          final R_default_V $tmp65 = lifted_1510000.exec_default(this_12600, env_12600, c_12500, store_22000);
          final A_V lifted_279000 = $tmp65.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31300 = $tmp65.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2500 = store_31300;
          final A_V result_out2500 = lifted_279000;
          return new R_default_V(result_out2500, store_out2500);
        }
        else
        { 
          if(lifted_1370000 == false)
          { 
            final R_default_V $tmp66 = e3200000.exec_default(this_12600, env_12600, c_12500, store_22000);
            final A_V lifted_283000 = $tmp66.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31400 = $tmp66.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2500 = store_31400;
            final A_V result_out2500 = lifted_283000;
            return new R_default_V(result_out2500, store_out2500);
          }
          else
          { }
        }
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  public A_Expr get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("If", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}