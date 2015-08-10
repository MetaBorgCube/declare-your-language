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
    final A_This this_in20500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28600 = _4;
    final A_Expr lifted_18780000 = this._1;
    final A_Expr lifted_18790000 = this._2;
    { 
      final A_This this_121600 = this_in20500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129200 = env_in28600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134200 = c_in28600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129200 = store_in28600;
      final R_default_V $tmp579 = lifted_18780000.exec_default(this_121600, env_129200, c_134200, store_129200);
      final A_V lifted_2077000 = $tmp579.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_220800 = $tmp579.get_1();
      final NumV_1 $tmp580 = lifted_2077000.match(NumV_1.class);
      if($tmp580 != null)
      { 
        final int i6300000 = $tmp580.get_1();
        final R_default_V $tmp581 = lifted_18790000.exec_default(this_121600, env_129200, c_134200, store_220800);
        final A_V lifted_2076000 = $tmp581.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313200 = $tmp581.get_1();
        final NumV_1 $tmp582 = lifted_2076000.match(NumV_1.class);
        if($tmp582 != null)
        { 
          final int j4200000 = $tmp582.get_1();
          final int lifted_18810000 = ds.manual.interpreter.Natives.minusI_2(i6300000, j4200000);
          final NumV_1 lifted_18800000 = new NumV_1(this.getSourceInfo(), lifted_18810000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28600 = store_313200;
          final A_V result_out28600 = lifted_18800000;
          return new R_default_V(result_out28600, store_out28600);
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