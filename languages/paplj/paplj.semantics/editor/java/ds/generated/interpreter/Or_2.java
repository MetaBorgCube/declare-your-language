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
    final A_This this_in2110 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2110 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2110 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2110 = _4;
    final A_Expr lifted_530000 = this._1;
    final A_Expr e2900000 = this._2;
    { 
      final A_This this_12200 = this_in2110;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12200 = env_in2110;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12110 = c_in2110;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12200 = store_in2110;
      final R_default_V $tmp51 = lifted_530000.exec_default(this_12200, env_12200, c_12110, store_12200);
      final A_V lifted_232000 = $tmp51.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21600 = $tmp51.get_1();
      final BoolV_1 $tmp52 = lifted_232000.match(BoolV_1.class);
      if($tmp52 != null)
      { 
        final boolean lifted_540000 = $tmp52.get_1();
        if(lifted_540000 == true)
        { 
          final boolean lifted_520000 = true;
          final BoolV_1 lifted_500000 = new BoolV_1(this.getSourceInfo(), lifted_520000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2110 = store_21600;
          final A_V result_out2110 = lifted_500000;
          return new R_default_V(result_out2110, store_out2110);
        }
        else
        { 
          if(lifted_540000 == false)
          { 
            final R_default_V $tmp53 = e2900000.exec_default(this_12200, env_12200, c_12110, store_21600);
            final A_V lifted_233000 = $tmp53.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31000 = $tmp53.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2110 = store_31000;
            final A_V result_out2110 = lifted_233000;
            return new R_default_V(result_out2110, store_out2110);
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