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
    final A_This this_in21700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29700 = _4;
    final A_Expr lifted_19920000 = this._1;
    final A_Expr lifted_18570000 = this._2;
    final A_Expr e7400000 = this._3;
    { 
      final A_This this_122700 = this_in21700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130300 = env_in29700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_135400 = c_in29700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130300 = store_in29700;
      final R_default_V $tmp604 = lifted_19920000.exec_default(this_122700, env_130300, c_135400, store_130300);
      final A_V lifted_2137000 = $tmp604.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221800 = $tmp604.get_1();
      final BoolV_1 $tmp605 = lifted_2137000.match(BoolV_1.class);
      if($tmp605 != null)
      { 
        final boolean lifted_19930000 = $tmp605.get_1();
        if(lifted_19930000 == true)
        { 
          final R_default_V $tmp606 = lifted_18570000.exec_default(this_122700, env_130300, c_135400, store_221800);
          final A_V lifted_2135000 = $tmp606.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313800 = $tmp606.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29700 = store_313800;
          final A_V result_out29700 = lifted_2135000;
          return new R_default_V(result_out29700, store_out29700);
        }
        else
        { 
          if(lifted_19930000 == false)
          { 
            final R_default_V $tmp607 = e7400000.exec_default(this_122700, env_130300, c_135400, store_221800);
            final A_V lifted_2138000 = $tmp607.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313900 = $tmp607.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29700 = store_313900;
            final A_V result_out29700 = lifted_2138000;
            return new R_default_V(result_out29700, store_out29700);
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