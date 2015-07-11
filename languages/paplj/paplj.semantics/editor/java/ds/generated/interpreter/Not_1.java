package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Not_1 extends A_Expr 
{ 
  @Child public A_Expr _1;

  public Not_1 (INodeSource source, A_Expr _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final Not_1 other = (Not_1)obj;
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in1900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1900 = _4;
    final A_Expr lifted_620000 = this._1;
    { 
      final A_This this_12000 = this_in1900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12000 = env_in1900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11900 = c_in1900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12000 = store_in1900;
      final R_default_V $tmp46 = lifted_620000.exec_default(this_12000, env_12000, c_11900, store_12000);
      final A_V lifted_236000 = $tmp46.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21400 = $tmp46.get_1();
      final BoolV_1 $tmp47 = lifted_236000.match(BoolV_1.class);
      if($tmp47 != null)
      { 
        final boolean lifted_640000 = $tmp47.get_1();
        if(lifted_640000 == true)
        { 
          final boolean lifted_610000 = false;
          final BoolV_1 lifted_590000 = new BoolV_1(this.getSourceInfo(), lifted_610000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1900 = store_21400;
          final A_V result_out1900 = lifted_590000;
          return new R_default_V(result_out1900, store_out1900);
        }
        else
        { 
          if(lifted_640000 == false)
          { 
            final boolean lifted_650000 = true;
            final BoolV_1 lifted_630000 = new BoolV_1(this.getSourceInfo(), lifted_650000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1900 = store_21400;
            final A_V result_out1900 = lifted_630000;
            return new R_default_V(result_out1900, store_out1900);
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

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Not", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}