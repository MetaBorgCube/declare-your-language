package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Mul_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Mul_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Mul_2 other = (Mul_2)obj;
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
    final A_This this_in1600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1600 = _4;
    final A_Expr lifted_700000 = this._1;
    final A_Expr lifted_710000 = this._2;
    { 
      final A_This this_11700 = this_in1600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11700 = env_in1600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11600 = c_in1600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11700 = store_in1600;
      final R_default_V $tmp42 = lifted_700000.exec_default(this_11700, env_11700, c_11600, store_11700);
      final A_V lifted_246000 = $tmp42.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21300 = $tmp42.get_1();
      final NumV_1 $tmp43 = lifted_246000.match(NumV_1.class);
      if($tmp43 != null)
      { 
        final int i2300000 = $tmp43.get_1();
        final R_default_V $tmp44 = lifted_710000.exec_default(this_11700, env_11700, c_11600, store_21300);
        final A_V lifted_245000 = $tmp44.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3800 = $tmp44.get_1();
        final NumV_1 $tmp45 = lifted_245000.match(NumV_1.class);
        if($tmp45 != null)
        { 
          final int j1600000 = $tmp45.get_1();
          final int lifted_730000 = ds.manual.interpreter.Natives.timesI_2(i2300000, j1600000);
          final NumV_1 lifted_720000 = new NumV_1(this.getSourceInfo(), lifted_730000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1600 = store_3800;
          final A_V result_out1600 = lifted_720000;
          return new R_default_V(result_out1600, store_out1600);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Mul", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}