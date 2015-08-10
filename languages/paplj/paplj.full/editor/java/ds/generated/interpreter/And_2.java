package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class And_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public And_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final And_2 other = (And_2)obj;
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
    final A_This this_in21200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29200 = _4;
    final A_Expr lifted_20470000 = this._1;
    final A_Expr e7600000 = this._2;
    { 
      final A_This this_122200 = this_in21200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_129700 = env_in29200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_134800 = c_in29200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_129700 = store_in29200;
      final R_default_V $tmp589 = lifted_20470000.exec_default(this_122200, env_129700, c_134800, store_129700);
      final A_V lifted_2173000 = $tmp589.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221300 = $tmp589.get_1();
      final BoolV_1 $tmp590 = lifted_2173000.match(BoolV_1.class);
      if($tmp590 != null)
      { 
        final boolean lifted_20480000 = $tmp590.get_1();
        if(lifted_20480000 == false)
        { 
          final boolean lifted_20460000 = false;
          final BoolV_1 lifted_20440000 = new BoolV_1(this.getSourceInfo(), lifted_20460000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29200 = store_221300;
          final A_V result_out29200 = lifted_20440000;
          return new R_default_V(result_out29200, store_out29200);
        }
        else
        { 
          if(lifted_20480000 == true)
          { 
            final R_default_V $tmp591 = e7600000.exec_default(this_122200, env_129700, c_134800, store_221300);
            final A_V lifted_2174000 = $tmp591.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313400 = $tmp591.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29200 = store_313400;
            final A_V result_out29200 = lifted_2174000;
            return new R_default_V(result_out29200, store_out29200);
          }
          else
          { }
        }
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("And", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}