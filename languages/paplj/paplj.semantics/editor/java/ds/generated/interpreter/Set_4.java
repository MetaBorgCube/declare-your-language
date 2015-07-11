package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Set_4 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Type _2;

  public String _3;

  @Child public A_Expr _4;

  public Set_4 (INodeSource source, A_Expr _1, A_Type _2, String _3, A_Expr _4) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
    this._3 = _3;
    this._4 = adoptChild(_4);
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
    final Set_4 other = (Set_4)obj;
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
    if(_4 == null)
    { 
      if(other._4 != null)
      { 
        return false;
      }
    }
    else
      if(!_4.equals(other._4))
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
      if(_4 instanceof IGenericNode)
      { 
        ((IGenericNode)_4).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3000 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3000 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3000 = _4;
    final A_Expr lifted_380000 = this._1;
    final A_Type lifted_390000 = this._2;
    final String f2200000 = this._3;
    final A_Expr lifted_400000 = this._4;
    { 
      final A_This this_13110 = this_in3000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13110 = env_in3000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13000 = c_in3000;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13110 = store_in3000;
      final R_default_V $tmp81 = lifted_380000.exec_default(this_13110, env_13110, c_13000, store_13110);
      final A_V lifted_219000 = $tmp81.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22600 = $tmp81.get_1();
      final o2v_1 $tmp82 = lifted_219000.match(o2v_1.class);
      if($tmp82 != null)
      { 
        final A_Obj o2600000 = $tmp82.get_1();
        final ClassT_1 $tmp83 = lifted_390000.match(ClassT_1.class);
        if($tmp83 != null)
        { 
          final String c4200000 = $tmp83.get_1();
          final R_default_V $tmp84 = lifted_400000.exec_default(this_13110, env_13110, c_13000, store_22600);
          final A_V v4100000 = $tmp84.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31800 = $tmp84.get_1();
          final writeField_4 lifted_410000 = new writeField_4(this.getSourceInfo(), o2600000, c4200000, f2200000, v4100000);
          final R_default_V $tmp85 = lifted_410000.exec_default(this_13110, env_13110, c_13000, store_31800);
          final A_V lifted_222000 = $tmp85.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_4300 = $tmp85.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3000 = store_4300;
          final A_V result_out3000 = lifted_222000;
          return new R_default_V(result_out3000, store_out3000);
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

  public A_Expr get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Set", 4), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), factory.makeString(_3), _4.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}