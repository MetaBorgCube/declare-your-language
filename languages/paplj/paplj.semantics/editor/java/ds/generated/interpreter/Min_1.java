package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Min_1 extends A_Expr 
{ 
  @Child public A_Expr _1;

  public Min_1 (INodeSource source, A_Expr _1) 
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
    final Min_1 other = (Min_1)obj;
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
    final A_This this_in1300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1300 = _4;
    final A_Expr lifted_740000 = this._1;
    { 
      final A_This this_11400 = this_in1300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11400 = env_in1300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11300 = c_in1300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11400 = store_in1300;
      final R_default_V $tmp32 = lifted_740000.exec_default(this_11400, env_11400, c_11300, store_11400);
      final A_V lifted_247000 = $tmp32.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21000 = $tmp32.get_1();
      final NumV_1 $tmp33 = lifted_247000.match(NumV_1.class);
      if($tmp33 != null)
      { 
        final int i2400000 = $tmp33.get_1();
        final int lifted_770000 = 0;
        final int lifted_760000 = ds.manual.interpreter.Natives.minusI_2(lifted_770000, i2400000);
        final NumV_1 lifted_750000 = new NumV_1(this.getSourceInfo(), lifted_760000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1300 = store_21000;
        final A_V result_out1300 = lifted_750000;
        return new R_default_V(result_out1300, store_out1300);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Min", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}