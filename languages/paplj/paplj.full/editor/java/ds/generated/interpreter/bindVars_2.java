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

  public R_default_Env exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in23100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in31200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in31200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in31200 = _4;
    final L_String lifted_20340000 = this._1;
    final L_A_V lifted_20350000 = this._2;
    { 
      final A_This this_123900 = this_in23100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_131500 = env_in31200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_137700 = c_in31200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_131700 = store_in31200;
      if(lifted_20340000 != null && lifted_20340000.equals(new NIL(this.getSourceInfo())))
      { 
        if(lifted_20350000 != null && lifted_20350000.equals(new NIL(this.getSourceInfo())))
        { 
          final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_20330000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_20320000 = (com.github.krukow.clj_ds.PersistentMap<String, A_V>)lifted_20330000;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out31200 = store_131700;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out31200 = lifted_20320000;
          return new R_default_Env(result_out31200, store_out31200);
        }
        else
        { }
      }
      else
      { 
        if(lifted_20340000 != null && !lifted_20340000.isEmpty())
        { 
          final String x51400000 = lifted_20340000.head();
          final L_String xs2900000 = lifted_20340000.tail();
          if(lifted_20350000 != null && !lifted_20350000.isEmpty())
          { 
            final A_V v15900000 = lifted_20350000.head();
            final L_A_V vs2900000 = lifted_20350000.tail();
            final bindVars_2 lifted_20380000 = new bindVars_2(this.getSourceInfo(), xs2900000, vs2900000);
            final R_default_Env $tmp638 = lifted_20380000.exec_default(this_123900, env_131500, c_137700, store_131700);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> E4500000 = $tmp638.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222800 = $tmp638.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_20360000 = MapUtils.plus(E4500000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_V>().plus(x51400000, v15900000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out31200 = store_222800;
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out31200 = lifted_20360000;
            return new R_default_Env(result_out31200, store_out31200);
          }
          else
          { }
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
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