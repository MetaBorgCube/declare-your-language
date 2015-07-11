package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Get_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Type _2;

  public String _3;

  public Get_3 (INodeSource source, A_Expr _1, A_Type _2, String _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
    this._3 = _3;
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
    final Get_3 other = (Get_3)obj;
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
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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
    final A_This this_in2900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2900 = _4;
    final A_Expr lifted_1380000 = this._1;
    final A_Type lifted_1390000 = this._2;
    final String f2700000 = this._3;
    { 
      final A_This this_13000 = this_in2900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13000 = env_in2900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12900 = c_in2900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13000 = store_in2900;
      final R_default_V $tmp77 = lifted_1380000.exec_default(this_13000, env_13000, c_12900, store_13000);
      final A_V lifted_285000 = $tmp77.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22500 = $tmp77.get_1();
      final o2v_1 $tmp78 = lifted_285000.match(o2v_1.class);
      if($tmp78 != null)
      { 
        final A_Obj o3000000 = $tmp78.get_1();
        final ClassT_1 $tmp79 = lifted_1390000.match(ClassT_1.class);
        if($tmp79 != null)
        { 
          final String c5100000 = $tmp79.get_1();
          final readField_3 lifted_1400000 = new readField_3(this.getSourceInfo(), o3000000, c5100000, f2700000);
          final R_default_V $tmp80 = lifted_1400000.exec_default(this_13000, env_13000, c_12900, store_22500);
          final A_V lifted_287000 = $tmp80.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31700 = $tmp80.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2900 = store_31700;
          final A_V result_out2900 = lifted_287000;
          return new R_default_V(result_out2900, store_out2900);
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

  public A_Type get_2()
  { 
    return this._2;
  }

  public String get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Get", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), factory.makeString(_3));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}