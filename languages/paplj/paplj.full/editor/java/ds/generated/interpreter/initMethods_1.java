package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initMethods_1 extends A_initMethods__Arrow 
{ 
  @Children public L_A_Method _1;

  public initMethods_1 (INodeSource source, L_A_Method _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChildren(_1);
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
    final initMethods_1 other = (initMethods_1)obj;
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
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      { 
        L_A_Method _1_list = _1;
        while(!_1_list.isEmpty())
        { 
          A_Method _1_elem = _1_list.head();
          if(_1_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_1_elem).specialize(depth);
          }
          _1_list = _1_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public R_default_MM exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in19400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27500 = _4;
    final L_A_Method lifted_19660000 = this._1;
    { 
      final A_This this_120300 = this_in19400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127900 = env_in27500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132800 = c_in27500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127900 = store_in27500;
      if(lifted_19660000 != null && lifted_19660000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_19650000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_19640000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Method>)lifted_19650000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27500 = store_127900;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out27500 = lifted_19640000;
        return new R_default_MM(result_out27500, store_out27500);
      }
      else
      { 
        if(lifted_19660000 != null && !lifted_19660000.isEmpty())
        { 
          final A_Method m5300000 = lifted_19660000.head();
          final L_A_Method ms6200000 = lifted_19660000.tail();
          final Method_4 $tmp555 = m5300000.match(Method_4.class);
          if($tmp555 != null)
          { 
            final A_Type lifted_18490000 = $tmp555.get_1();
            final String name4500000 = $tmp555.get_2();
            final L_A_Param lifted_18510000 = $tmp555.get_3();
            final A_Block lifted_18520000 = $tmp555.get_4();
            final initMethods_1 lifted_19690000 = new initMethods_1(this.getSourceInfo(), ms6200000);
            final R_default_MM $tmp556 = lifted_19690000.exec_default(this_120300, env_127900, c_132800, store_127900);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_2128000 = $tmp556.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219900 = $tmp556.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_19670000 = MapUtils.plus(lifted_2128000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Method>().plus(name4500000, m5300000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27500 = store_219900;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out27500 = lifted_19670000;
            return new R_default_MM(result_out27500, store_out27500);
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

  public L_A_Method get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initMethods", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}