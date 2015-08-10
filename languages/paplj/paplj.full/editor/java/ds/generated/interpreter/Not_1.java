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
    final A_This this_in20900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29100 = _4;
    final A_Expr lifted_19080000 = this._1;
    { 
      final A_This this_122100 = this_in20900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129600 = env_in29100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134700 = c_in29100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129600 = store_in29100;
      final R_default_V $tmp587 = lifted_19080000.exec_default(this_122100, env_129600, c_134700, store_129600);
      final A_V lifted_2095000 = $tmp587.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221200 = $tmp587.get_1();
      final BoolV_1 $tmp588 = lifted_2095000.match(BoolV_1.class);
      if($tmp588 != null)
      { 
        final boolean lifted_19120000 = $tmp588.get_1();
        if(lifted_19120000 == true)
        { 
          final boolean lifted_19070000 = false;
          final BoolV_1 lifted_19050000 = new BoolV_1(this.getSourceInfo(), lifted_19070000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29100 = store_221200;
          final A_V result_out29100 = lifted_19050000;
          return new R_default_V(result_out29100, store_out29100);
        }
        else
        { 
          if(lifted_19120000 == false)
          { 
            final boolean lifted_19130000 = true;
            final BoolV_1 lifted_19090000 = new BoolV_1(this.getSourceInfo(), lifted_19130000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29100 = store_221200;
            final A_V result_out29100 = lifted_19090000;
            return new R_default_V(result_out29100, store_out29100);
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