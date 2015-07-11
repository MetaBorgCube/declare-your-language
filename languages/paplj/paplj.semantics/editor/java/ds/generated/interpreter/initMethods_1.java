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
    final A_This this_in500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in500 = _4;
    final L_A_Method lifted_1130000 = this._1;
    { 
      final A_This this_1500 = this_in500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_1500 = env_in500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_1450 = c_in500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_1500 = store_in500;
      if(lifted_1130000 != null && lifted_1130000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_1120000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_1110000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Method>)lifted_1120000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out500 = store_1500;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out500 = lifted_1110000;
        return new R_default_MM(result_out500, store_out500);
      }
      else
      { 
        if(lifted_1130000 != null && !lifted_1130000.isEmpty())
        { 
          final A_Method m1400000 = lifted_1130000.head();
          final L_A_Method ms1500000 = lifted_1130000.tail();
          final Method_4 $tmp14 = m1400000.match(Method_4.class);
          if($tmp14 != null)
          { 
            final A_Type lifted_811000 = $tmp14.get_1();
            final String name1000000 = $tmp14.get_2();
            final L_A_Param lifted_911000 = $tmp14.get_3();
            final A_Block lifted_1011000 = $tmp14.get_4();
            final initMethods_1 lifted_1160000 = new initMethods_1(this.getSourceInfo(), ms1500000);
            final R_default_MM $tmp15 = lifted_1160000.exec_default(this_1500, env_1500, c_1450, store_1500);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_272000 = $tmp15.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2400 = $tmp15.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_1140000 = MapUtils.plus(lifted_272000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Method>().plus(name1000000, m1400000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out500 = store_2400;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out500 = lifted_1140000;
            return new R_default_MM(result_out500, store_out500);
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