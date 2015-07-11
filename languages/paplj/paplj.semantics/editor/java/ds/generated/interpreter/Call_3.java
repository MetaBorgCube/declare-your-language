package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Call_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  public String _2;

  @Children public L_A_Expr _3;

  public Call_3 (INodeSource source, A_Expr _1, String _2, L_A_Expr _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
    this._3 = adoptChildren(_3);
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
    final Call_3 other = (Call_3)obj;
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
      { 
        L_A_Expr _3_list = _3;
        while(!_3_list.isEmpty())
        { 
          A_Expr _3_elem = _3_list.head();
          if(_3_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_3_elem).specialize(depth);
          }
          _3_list = _3_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3110 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3110 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3110 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3110 = _4;
    final A_Expr lifted_1640000 = this._1;
    final String m1500000 = this._2;
    final L_A_Expr lifted_1650000 = this._3;
    { 
      final A_This this_13200 = this_in3110;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13200 = env_in3110;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13110 = c_in3110;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13200 = store_in3110;
      final R_default_V $tmp86 = lifted_1640000.exec_default(this_13200, env_13200, c_13110, store_13200);
      final A_V lifted_316000 = $tmp86.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22700 = $tmp86.get_1();
      final o2v_1 $tmp87 = lifted_316000.match(o2v_1.class);
      if($tmp87 != null)
      { 
        final A_Obj o3100000 = $tmp87.get_1();
        final R_default_List_V_ $tmp88 = lifted_1650000.exec_default(this_13200, env_13200, c_13110, store_22700);
        final L_A_V vs900000 = $tmp88.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31900 = $tmp88.get_1();
        final lookupMethod_2 lifted_1660000 = new lookupMethod_2(this.getSourceInfo(), o3100000, m1500000);
        final R_default_Method $tmp89 = lifted_1660000.exec_default(this_13200, env_13200, c_13110, store_31900);
        final A_Method lifted_1670000 = $tmp89.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_4400 = $tmp89.get_1();
        final Method_4 $tmp90 = lifted_1670000.match(Method_4.class);
        if($tmp90 != null)
        { 
          final A_Type lifted_1910000 = $tmp90.get_1();
          final String lifted_204000 = $tmp90.get_2();
          final L_A_Param params600000 = $tmp90.get_3();
          final A_Block e3300000 = $tmp90.get_4();
          final R_default_List_String_ $tmp91 = params600000.exec_default(this_13200, env_13200, c_13110, store_4400);
          final L_String lifted_313000 = $tmp91.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_5000 = $tmp91.get_1();
          final bindVars_2 lifted_1680000 = new bindVars_2(this.getSourceInfo(), lifted_313000, vs900000);
          final T_1 lifted_305000 = new T_1(this.getSourceInfo(), o3100000);
          final R_default_Env $tmp92 = lifted_1680000.exec_default(this_13200, env_13200, c_13110, store_5000);
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_306000 = $tmp92.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_6000 = $tmp92.get_1();
          final block2expr_1 lifted_307000 = new block2expr_1(this.getSourceInfo(), e3300000);
          final R_default_V $tmp93 = lifted_307000.exec_default(lifted_305000, lifted_306000, c_13110, store_6000);
          final A_V v_700000 = $tmp93.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_7000 = $tmp93.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3110 = store_7000;
          final A_V result_out3110 = v_700000;
          return new R_default_V(result_out3110, store_out3110);
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

  public String get_2()
  { 
    return this._2;
  }

  public L_A_Expr get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Call", 3), _1.toStrategoTerm(factory), factory.makeString(_2), _3.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}