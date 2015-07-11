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
    final A_This this_in3700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3700 = _4;
    final L_String lifted_1740000 = this._1;
    final L_A_V lifted_1750000 = this._2;
    { 
      final A_This this_13700 = this_in3700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13600 = env_in3700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13730 = c_in3700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13800 = store_in3700;
      if(lifted_1740000 != null && lifted_1740000.equals(new NIL(this.getSourceInfo())))
      { 
        if(lifted_1750000 != null && lifted_1750000.equals(new NIL(this.getSourceInfo())))
        { 
          final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_1730000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_1720000 = (com.github.krukow.clj_ds.PersistentMap<String, A_V>)lifted_1730000;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3700 = store_13800;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out3700 = lifted_1720000;
          return new R_default_Env(result_out3700, store_out3700);
        }
        else
        { }
      }
      else
      { 
        if(lifted_1740000 != null && !lifted_1740000.isEmpty())
        { 
          final String x2100000 = lifted_1740000.head();
          final L_String xs600000 = lifted_1740000.tail();
          if(lifted_1750000 != null && !lifted_1750000.isEmpty())
          { 
            final A_V v4800000 = lifted_1750000.head();
            final L_A_V vs1000000 = lifted_1750000.tail();
            final bindVars_2 lifted_1780000 = new bindVars_2(this.getSourceInfo(), xs600000, vs1000000);
            final R_default_Env $tmp97 = lifted_1780000.exec_default(this_13700, env_13600, c_13730, store_13800);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> E1000000 = $tmp97.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22900 = $tmp97.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_1760000 = MapUtils.plus(E1000000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_V>().plus(x2100000, v4800000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3700 = store_22900;
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out3700 = lifted_1760000;
            return new R_default_Env(result_out3700, store_out3700);
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