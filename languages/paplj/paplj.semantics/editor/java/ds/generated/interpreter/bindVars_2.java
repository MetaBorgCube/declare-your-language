package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class bindVars_2 extends A_bindVars__Arrow 
{ 
  public L_String _1;

  @Children public L_A_V _2;

  public bindVars_2 (INodeSource source, L_String _1, L_A_V _2) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChildren(_2);
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
    final bindVars_2 other = (bindVars_2)obj;
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
      { 
        L_A_V _2_list = _2;
        while(!_2_list.isEmpty())
        { 
          A_V _2_elem = _2_list.head();
          if(_2_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_2_elem).specialize(depth);
          }
          _2_list = _2_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public R_default_Env exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26400 = _3;
    final L_String lifted_17790000 = this._1;
    final L_A_V lifted_17810000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126700 = env_in26400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131600 = c_in26400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126900 = store_in26400;
      if(lifted_17790000 != null && lifted_17790000.equals(new NIL(this.getSourceInfo())))
      { 
        if(lifted_17810000 != null && lifted_17810000.equals(new NIL(this.getSourceInfo())))
        { 
          final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_17780000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_17770000 = (com.github.krukow.clj_ds.PersistentMap<String, A_V>)lifted_17780000;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26400 = store_126900;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out26400 = lifted_17770000;
          return new R_default_Env(result_out26400, store_out26400);
        }
        else
        { }
      }
      else
      { 
        if(lifted_17790000 != null && !lifted_17790000.isEmpty())
        { 
          final String x39100000 = lifted_17790000.head();
          final L_String xs2300000 = lifted_17790000.tail();
          if(lifted_17810000 != null && !lifted_17810000.isEmpty())
          { 
            final A_V v11700000 = lifted_17810000.head();
            final L_A_V vs2100000 = lifted_17810000.tail();
            final bindVars_2 lifted_17840000 = new bindVars_2(this.getSourceInfo(), xs2300000, vs2100000);
            final R_default_Env $tmp537 = lifted_17840000.exec_default(env_126700, c_131600, store_126900);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> E3500000 = $tmp537.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219200 = $tmp537.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_17820000 = MapUtils.plus(E3500000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_V>().plus(x39100000, v11700000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26400 = store_219200;
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out26400 = lifted_17820000;
            return new R_default_Env(result_out26400, store_out26400);
          }
          else
          { }
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3);
    }
  }

  public L_String get_1()
  { 
    return this._1;
  }

  public L_A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("bindVars", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}