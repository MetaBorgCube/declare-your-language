package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Or_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Or_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Or_2 other = (Or_2)obj;
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
    final A_This this_in21300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29300 = _4;
    final A_Expr lifted_18980000 = this._1;
    final A_Expr e7100000 = this._2;
    { 
      final A_This this_122300 = this_in21300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129800 = env_in29300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134900 = c_in29300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129800 = store_in29300;
      final R_default_V $tmp592 = lifted_18980000.exec_default(this_122300, env_129800, c_134900, store_129800);
      final A_V lifted_2091000 = $tmp592.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221400 = $tmp592.get_1();
      final BoolV_1 $tmp593 = lifted_2091000.match(BoolV_1.class);
      if($tmp593 != null)
      { 
        final boolean lifted_18990000 = $tmp593.get_1();
        if(lifted_18990000 == true)
        { 
          final boolean lifted_18970000 = true;
          final BoolV_1 lifted_18950000 = new BoolV_1(this.getSourceInfo(), lifted_18970000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29300 = store_221400;
          final A_V result_out29300 = lifted_18950000;
          return new R_default_V(result_out29300, store_out29300);
        }
        else
        { 
          if(lifted_18990000 == false)
          { 
            final R_default_V $tmp594 = e7100000.exec_default(this_122300, env_129800, c_134900, store_221400);
            final A_V lifted_2092000 = $tmp594.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313500 = $tmp594.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29300 = store_313500;
            final A_V result_out29300 = lifted_2092000;
            return new R_default_V(result_out29300, store_out29300);
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

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Or", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}