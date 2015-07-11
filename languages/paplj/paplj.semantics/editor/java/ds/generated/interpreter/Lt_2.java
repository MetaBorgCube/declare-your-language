package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Lt_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Lt_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Lt_2 other = (Lt_2)obj;
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
    final A_This this_in2400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2400 = _4;
    final A_Expr lifted_780000 = this._1;
    final A_Expr lifted_790000 = this._2;
    { 
      final A_This this_12500 = this_in2400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12500 = env_in2400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12400 = c_in2400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12500 = store_in2400;
      final R_default_V $tmp59 = lifted_780000.exec_default(this_12500, env_12500, c_12400, store_12500);
      final A_V lifted_249000 = $tmp59.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21900 = $tmp59.get_1();
      final NumV_1 $tmp60 = lifted_249000.match(NumV_1.class);
      if($tmp60 != null)
      { 
        final int i2500000 = $tmp60.get_1();
        final R_default_V $tmp61 = lifted_790000.exec_default(this_12500, env_12500, c_12400, store_21900);
        final A_V lifted_248000 = $tmp61.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31200 = $tmp61.get_1();
        final NumV_1 $tmp62 = lifted_248000.match(NumV_1.class);
        if($tmp62 != null)
        { 
          final int j1700000 = $tmp62.get_1();
          final boolean lifted_810000 = ds.manual.interpreter.Natives.gtI_2(j1700000, i2500000);
          final BoolV_1 lifted_800000 = new BoolV_1(this.getSourceInfo(), lifted_810000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2400 = store_31200;
          final A_V result_out2400 = lifted_800000;
          return new R_default_V(result_out2400, store_out2400);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Lt", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}