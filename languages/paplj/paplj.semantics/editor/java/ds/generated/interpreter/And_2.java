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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26100 = _3;
    final A_Expr e12700000 = this._1;
    final A_Expr e22600000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126600 = env_in26100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131300 = c_in26100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126600 = store_in26100;
      final R_default_V $tmp534 = e12700000.exec_default(env_126600, c_131300, store_126600);
      final A_V lifted_17920000 = $tmp534.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219100 = $tmp534.get_1();
      final BoolV_1 $tmp535 = lifted_17920000.match(BoolV_1.class);
      if($tmp535 != null)
      { 
        final boolean lifted_17940000 = $tmp535.get_1();
        if(lifted_17940000 == false)
        { 
          final boolean lifted_17900000 = false;
          final BoolV_1 lifted_17880000 = new BoolV_1(this.getSourceInfo(), lifted_17900000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26100 = store_219100;
          final A_V result_out26100 = lifted_17880000;
          return new R_default_V(result_out26100, store_out26100);
        }
        else
        { 
          if(lifted_17940000 == true)
          { 
            final R_default_V $tmp536 = e22600000.exec_default(env_126600, c_131300, store_219100);
            final A_V v11900000 = $tmp536.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312300 = $tmp536.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26100 = store_312300;
            final A_V result_out26100 = v11900000;
            return new R_default_V(result_out26100, store_out26100);
          }
          else
          { }
        }
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("And", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}