package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Eq_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Eq_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Eq_2 other = (Eq_2)obj;
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
    final A_This this_in2200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2200 = _4;
    final A_Expr lifted_1430000 = this._1;
    final A_Expr lifted_1440000 = this._2;
    { 
      final A_This this_12300 = this_in2200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12300 = env_in2200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12200 = c_in2200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12300 = store_in2200;
      final R_default_V $tmp54 = lifted_1430000.exec_default(this_12300, env_12300, c_12200, store_12300);
      final A_V lifted_291000 = $tmp54.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21700 = $tmp54.get_1();
      final NumV_1 $tmp55 = lifted_291000.match(NumV_1.class);
      if($tmp55 != null)
      { 
        final int i2600000 = $tmp55.get_1();
        final R_default_V $tmp56 = lifted_1440000.exec_default(this_12300, env_12300, c_12200, store_21700);
        final A_V lifted_289000 = $tmp56.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31110 = $tmp56.get_1();
        final NumV_1 $tmp57 = lifted_289000.match(NumV_1.class);
        if($tmp57 != null)
        { 
          final int j1800000 = $tmp57.get_1();
          final boolean lifted_1460000 = ds.manual.interpreter.Natives.eqI_2(i2600000, j1800000);
          final BoolV_1 lifted_1450000 = new BoolV_1(this.getSourceInfo(), lifted_1460000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2200 = store_31110;
          final A_V result_out2200 = lifted_1450000;
          return new R_default_V(result_out2200, store_out2200);
        }
        else
        { }
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Eq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}