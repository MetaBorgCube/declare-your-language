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
    final A_This this_in22400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30400 = _4;
    final A_Expr lifted_20230000 = this._1;
    final String m5400000 = this._2;
    final L_A_Expr lifted_20240000 = this._3;
    { 
      final A_This this_123400 = this_in22400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130900 = env_in30400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_136500 = c_in30400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130900 = store_in30400;
      final R_default_V $tmp627 = lifted_20230000.exec_default(this_123400, env_130900, c_136500, store_130900);
      final A_V lifted_2169000 = $tmp627.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222600 = $tmp627.get_1();
      final o2v_1 $tmp628 = lifted_2169000.match(o2v_1.class);
      if($tmp628 != null)
      { 
        final A_Obj o9300000 = $tmp628.get_1();
        final R_default_List_V_ $tmp629 = lifted_20240000.exec_default(this_123400, env_130900, c_136500, store_222600);
        final L_A_V vs2800000 = $tmp629.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_314500 = $tmp629.get_1();
        final lookupMethod_2 lifted_20250000 = new lookupMethod_2(this.getSourceInfo(), o9300000, m5400000);
        final R_default_Method $tmp630 = lifted_20250000.exec_default(this_123400, env_130900, c_136500, store_314500);
        final A_Method lifted_20260000 = $tmp630.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_43300 = $tmp630.get_1();
        final Method_4 $tmp631 = lifted_20260000.match(Method_4.class);
        if($tmp631 != null)
        { 
          final A_Type lifted_18620000 = $tmp631.get_1();
          final String lifted_18630000 = $tmp631.get_2();
          final L_A_Param params2200000 = $tmp631.get_3();
          final A_Block e7500000 = $tmp631.get_4();
          final R_default_List_String_ $tmp632 = params2200000.exec_default(this_123400, env_130900, c_136500, store_43300);
          final L_String lifted_2166000 = $tmp632.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_5400 = $tmp632.get_1();
          final bindVars_2 lifted_20270000 = new bindVars_2(this.getSourceInfo(), lifted_2166000, vs2800000);
          final T_1 lifted_2159000 = new T_1(this.getSourceInfo(), o9300000);
          final R_default_Env $tmp633 = lifted_20270000.exec_default(this_123400, env_130900, c_136500, store_5400);
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_2161000 = $tmp633.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_6400 = $tmp633.get_1();
          final block2expr_1 lifted_2162000 = new block2expr_1(this.getSourceInfo(), e7500000);
          final R_default_V $tmp634 = lifted_2162000.exec_default(lifted_2159000, lifted_2161000, c_136500, store_6400);
          final A_V v_1500000 = $tmp634.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_7400 = $tmp634.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30400 = store_7400;
          final A_V result_out30400 = v_1500000;
          return new R_default_V(result_out30400, store_out30400);
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