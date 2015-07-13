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
    final A_This this_in20600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28700 = _4;
    final A_Expr lifted_19180000 = this._1;
    final A_Expr lifted_19190000 = this._2;
    { 
      final A_This this_121700 = this_in20600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129300 = env_in28700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134300 = c_in28700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129300 = store_in28700;
      final R_default_V $tmp583 = lifted_19180000.exec_default(this_121700, env_129300, c_134300, store_129300);
      final A_V lifted_2105000 = $tmp583.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_220900 = $tmp583.get_1();
      final NumV_1 $tmp584 = lifted_2105000.match(NumV_1.class);
      if($tmp584 != null)
      { 
        final int i6500000 = $tmp584.get_1();
        final R_default_V $tmp585 = lifted_19190000.exec_default(this_121700, env_129300, c_134300, store_220900);
        final A_V lifted_2104000 = $tmp585.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313300 = $tmp585.get_1();
        final NumV_1 $tmp586 = lifted_2104000.match(NumV_1.class);
        if($tmp586 != null)
        { 
          final int j4300000 = $tmp586.get_1();
          final int lifted_19220000 = ds.manual.interpreter.Natives.timesI_2(i6500000, j4300000);
          final NumV_1 lifted_19210000 = new NumV_1(this.getSourceInfo(), lifted_19220000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28700 = store_313300;
          final A_V result_out28700 = lifted_19210000;
          return new R_default_V(result_out28700, store_out28700);
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