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
    final A_This this_in22300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30300 = _4;
    final A_Expr lifted_18820000 = this._1;
    final A_Type lifted_18830000 = this._2;
    final String f8700000 = this._3;
    final A_Expr lifted_18840000 = this._4;
    { 
      final A_This this_123300 = this_in22300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130800 = env_in30300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_136400 = c_in30300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130800 = store_in30300;
      final R_default_V $tmp622 = lifted_18820000.exec_default(this_123300, env_130800, c_136400, store_130800);
      final A_V lifted_2079000 = $tmp622.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222500 = $tmp622.get_1();
      final o2v_1 $tmp623 = lifted_2079000.match(o2v_1.class);
      if($tmp623 != null)
      { 
        final A_Obj o8700000 = $tmp623.get_1();
        final ClassT_1 $tmp624 = lifted_18830000.match(ClassT_1.class);
        if($tmp624 != null)
        { 
          final String c16600000 = $tmp624.get_1();
          final R_default_V $tmp625 = lifted_18840000.exec_default(this_123300, env_130800, c_136400, store_222500);
          final A_V v15200000 = $tmp625.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_314400 = $tmp625.get_1();
          final writeField_4 lifted_18850000 = new writeField_4(this.getSourceInfo(), o8700000, c16600000, f8700000, v15200000);
          final R_default_V $tmp626 = lifted_18850000.exec_default(this_123300, env_130800, c_136400, store_314400);
          final A_V lifted_2081000 = $tmp626.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_43200 = $tmp626.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30300 = store_43200;
          final A_V result_out30300 = lifted_2081000;
          return new R_default_V(result_out30300, store_out30300);
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