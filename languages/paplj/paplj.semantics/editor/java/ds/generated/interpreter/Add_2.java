package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Add_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Add_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Add_2 other = (Add_2)obj;
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
    final A_This this_in1400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1400 = _4;
    final A_Expr lifted_1900000 = this._1;
    final A_Expr lifted_1911000 = this._2;
    { 
      final A_This this_11500 = this_in1400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11500 = env_in1400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11400 = c_in1400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11500 = store_in1400;
      final R_default_V $tmp34 = lifted_1900000.exec_default(this_11500, env_11500, c_11400, store_11500);
      final A_V lifted_324000 = $tmp34.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21110 = $tmp34.get_1();
      final NumV_1 $tmp35 = lifted_324000.match(NumV_1.class);
      if($tmp35 != null)
      { 
        final int i2700000 = $tmp35.get_1();
        final R_default_V $tmp36 = lifted_1911000.exec_default(this_11500, env_11500, c_11400, store_21110);
        final A_V lifted_323000 = $tmp36.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3600 = $tmp36.get_1();
        final NumV_1 $tmp37 = lifted_323000.match(NumV_1.class);
        if($tmp37 != null)
        { 
          final int j1900000 = $tmp37.get_1();
          final int lifted_1930000 = ds.manual.interpreter.Natives.plusI_2(i2700000, j1900000);
          final NumV_1 lifted_1920000 = new NumV_1(this.getSourceInfo(), lifted_1930000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1400 = store_3600;
          final A_V result_out1400 = lifted_1920000;
          return new R_default_V(result_out1400, store_out1400);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Add", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}