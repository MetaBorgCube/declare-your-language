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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25700 = _3;
    final A_Expr e12800000 = this._1;
    final A_Expr e22700000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126300 = env_in25700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130800 = c_in25700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126300 = store_in25700;
      final R_default_V $tmp530 = e12800000.exec_default(env_126300, c_130800, store_126300);
      final A_V lifted_17980000 = $tmp530.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218900 = $tmp530.get_1();
      final NumV_1 $tmp531 = lifted_17980000.match(NumV_1.class);
      if($tmp531 != null)
      { 
        final int i4800000 = $tmp531.get_1();
        final R_default_V $tmp532 = e22700000.exec_default(env_126300, c_130800, store_218900);
        final A_V lifted_17990000 = $tmp532.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312200 = $tmp532.get_1();
        final NumV_1 $tmp533 = lifted_17990000.match(NumV_1.class);
        if($tmp533 != null)
        { 
          final int j3100000 = $tmp533.get_1();
          final int lifted_18000000 = ds.manual.interpreter.Natives.plusI_2(i4800000, j3100000);
          final NumV_1 lifted_17970000 = new NumV_1(this.getSourceInfo(), lifted_18000000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25700 = store_312200;
          final A_V result_out25700 = lifted_17970000;
          return new R_default_V(result_out25700, store_out25700);
        }
        else
        { }
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3);
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