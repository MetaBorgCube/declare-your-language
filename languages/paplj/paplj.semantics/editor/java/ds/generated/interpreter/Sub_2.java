package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Sub_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Sub_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Sub_2 other = (Sub_2)obj;
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
    final A_This this_in1500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1500 = _4;
    final A_Expr lifted_340000 = this._1;
    final A_Expr lifted_350000 = this._2;
    { 
      final A_This this_11600 = this_in1500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11600 = env_in1500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11500 = c_in1500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11600 = store_in1500;
      final R_default_V $tmp38 = lifted_340000.exec_default(this_11600, env_11600, c_11500, store_11600);
      final A_V lifted_217000 = $tmp38.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21200 = $tmp38.get_1();
      final NumV_1 $tmp39 = lifted_217000.match(NumV_1.class);
      if($tmp39 != null)
      { 
        final int i2100000 = $tmp39.get_1();
        final R_default_V $tmp40 = lifted_350000.exec_default(this_11600, env_11600, c_11500, store_21200);
        final A_V lifted_216000 = $tmp40.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3700 = $tmp40.get_1();
        final NumV_1 $tmp41 = lifted_216000.match(NumV_1.class);
        if($tmp41 != null)
        { 
          final int j1500000 = $tmp41.get_1();
          final int lifted_370000 = ds.manual.interpreter.Natives.minusI_2(i2100000, j1500000);
          final NumV_1 lifted_360000 = new NumV_1(this.getSourceInfo(), lifted_370000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1500 = store_3700;
          final A_V result_out1500 = lifted_360000;
          return new R_default_V(result_out1500, store_out1500);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Sub", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}