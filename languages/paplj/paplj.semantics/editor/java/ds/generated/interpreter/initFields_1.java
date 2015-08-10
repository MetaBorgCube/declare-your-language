package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initFields_1 extends A_initFields__Arrow 
{ 
  @Children public L_A_Field _1;

  public initFields_1 (INodeSource source, L_A_Field _1) 
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
    final initFields_1 other = (initFields_1)obj;
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
        L_A_Field _1_list = _1;
        while(!_1_list.isEmpty())
        { 
          A_Field _1_elem = _1_list.head();
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

  public R_default_FM exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24700 = _3;
    final L_A_Field lifted_17490000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125200 = env_in24700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129600 = c_in24700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125200 = store_in24700;
      if(lifted_17490000 != null && lifted_17490000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_17480000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_17470000 = (com.github.krukow.clj_ds.PersistentMap<String, Integer>)lifted_17480000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24700 = store_125200;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out24700 = lifted_17470000;
        return new R_default_FM(result_out24700, store_out24700);
      }
      else
      { 
        if(lifted_17490000 != null && !lifted_17490000.isEmpty())
        { 
          final A_Field lifted_17520000 = lifted_17490000.head();
          final L_A_Field fs4800000 = lifted_17490000.tail();
          final Field_2 $tmp508 = lifted_17520000.match(Field_2.class);
          if($tmp508 != null)
          { 
            final A_Type t1300000 = $tmp508.get_1();
            final String f6900000 = $tmp508.get_2();
            final defaultValue_1 lifted_17530000 = new defaultValue_1(this.getSourceInfo(), t1300000);
            final R_default_V $tmp509 = lifted_17530000.exec_default(env_125200, c_129600, store_125200);
            final A_V v11600000 = $tmp509.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218200 = $tmp509.get_1();
            final initFields_1 lifted_17550000 = new initFields_1(this.getSourceInfo(), fs4800000);
            final R_default_FM $tmp510 = lifted_17550000.exec_default(env_125200, c_129600, store_218200);
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> FM1200000 = $tmp510.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_311700 = $tmp510.get_1();
            final allocate_1 lifted_1840000 = new allocate_1(this.getSourceInfo(), v11600000);
            final R_default_Int $tmp511 = lifted_1840000.exec_default(env_125200, c_129600, store_311700);
            final int lifted_1836000 = $tmp511.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_42700 = $tmp511.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_17510000 = MapUtils.plus(FM1200000, new com.github.krukow.clj_lang.PersistentTreeMap<String, Integer>().plus(f6900000, lifted_1836000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24700 = store_42700;
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out24700 = lifted_17510000;
            return new R_default_FM(result_out24700, store_out24700);
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

  public L_A_Field get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initFields", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}