package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class And_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public And_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final And_2 other = (And_2)obj;
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
    final A_This this_in2000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2000 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2000 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2000 = _4;
    final A_Expr lifted_1860000 = this._1;
    final A_Expr e3400000 = this._2;
    { 
      final A_This this_12110 = this_in2000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12110 = env_in2000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12010 = c_in2000;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12110 = store_in2000;
      final R_default_V $tmp48 = lifted_1860000.exec_default(this_12110, env_12110, c_12010, store_12110);
      final A_V lifted_319000 = $tmp48.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21500 = $tmp48.get_1();
      final BoolV_1 $tmp49 = lifted_319000.match(BoolV_1.class);
      if($tmp49 != null)
      { 
        final boolean lifted_1870000 = $tmp49.get_1();
        if(lifted_1870000 == false)
        { 
          final boolean lifted_1850000 = false;
          final BoolV_1 lifted_1830000 = new BoolV_1(this.getSourceInfo(), lifted_1850000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2000 = store_21500;
          final A_V result_out2000 = lifted_1830000;
          return new R_default_V(result_out2000, store_out2000);
        }
        else
        { 
          if(lifted_1870000 == true)
          { 
            final R_default_V $tmp50 = e3400000.exec_default(this_12110, env_12110, c_12010, store_21500);
            final A_V lifted_321000 = $tmp50.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3900 = $tmp50.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2000 = store_3900;
            final A_V result_out2000 = lifted_321000;
            return new R_default_V(result_out2000, store_out2000);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("And", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}