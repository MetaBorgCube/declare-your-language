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
    final A_This this_in20400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28500 = _4;
    final A_Expr lifted_20520000 = this._1;
    final A_Expr lifted_20530000 = this._2;
    { 
      final A_This this_121500 = this_in20400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129100 = env_in28500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134100 = c_in28500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129100 = store_in28500;
      final R_default_V $tmp575 = lifted_20520000.exec_default(this_121500, env_129100, c_134100, store_129100);
      final A_V lifted_2177000 = $tmp575.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_220700 = $tmp575.get_1();
      final NumV_1 $tmp576 = lifted_2177000.match(NumV_1.class);
      if($tmp576 != null)
      { 
        final int i6900000 = $tmp576.get_1();
        final R_default_V $tmp577 = lifted_20530000.exec_default(this_121500, env_129100, c_134100, store_220700);
        final A_V lifted_2176000 = $tmp577.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313100 = $tmp577.get_1();
        final NumV_1 $tmp578 = lifted_2176000.match(NumV_1.class);
        if($tmp578 != null)
        { 
          final int j4600000 = $tmp578.get_1();
          final int lifted_20550000 = ds.manual.interpreter.Natives.plusI_2(i6900000, j4600000);
          final NumV_1 lifted_20540000 = new NumV_1(this.getSourceInfo(), lifted_20550000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28500 = store_313100;
          final A_V result_out28500 = lifted_20540000;
          return new R_default_V(result_out28500, store_out28500);
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