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
    final A_This this_in21400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29400 = _4;
    final A_Expr lifted_19990000 = this._1;
    final A_Expr lifted_20010000 = this._2;
    { 
      final A_This this_122400 = this_in21400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129900 = env_in29400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_135100 = c_in29400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129900 = store_in29400;
      final R_default_V $tmp595 = lifted_19990000.exec_default(this_122400, env_129900, c_135100, store_129900);
      final A_V lifted_2146000 = $tmp595.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221500 = $tmp595.get_1();
      final NumV_1 $tmp596 = lifted_2146000.match(NumV_1.class);
      if($tmp596 != null)
      { 
        final int i6800000 = $tmp596.get_1();
        final R_default_V $tmp597 = lifted_20010000.exec_default(this_122400, env_129900, c_135100, store_221500);
        final A_V lifted_2145000 = $tmp597.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313600 = $tmp597.get_1();
        final NumV_1 $tmp598 = lifted_2145000.match(NumV_1.class);
        if($tmp598 != null)
        { 
          final int j4500000 = $tmp598.get_1();
          final boolean lifted_20030000 = ds.manual.interpreter.Natives.eqI_2(i6800000, j4500000);
          final BoolV_1 lifted_20020000 = new BoolV_1(this.getSourceInfo(), lifted_20030000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29400 = store_313600;
          final A_V result_out29400 = lifted_20020000;
          return new R_default_V(result_out29400, store_out29400);
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