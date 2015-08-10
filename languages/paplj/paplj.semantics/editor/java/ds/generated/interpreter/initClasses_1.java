package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initClasses_1 extends A_initClasses__Arrow 
{ 
  @Children public L_A_Class _1;

  public initClasses_1 (INodeSource source, L_A_Class _1) 
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
    final initClasses_1 other = (initClasses_1)obj;
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
        L_A_Class _1_list = _1;
        while(!_1_list.isEmpty())
        { 
          A_Class _1_elem = _1_list.head();
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

  public R_default_C exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24400 = _3;
    final L_A_Class lifted_17610000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_124800 = env_in24400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129100 = c_in24400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_124800 = store_in24400;
      if(lifted_17610000 != null && lifted_17610000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_17590000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_17580000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Class>)lifted_17590000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24400 = store_124800;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out24400 = lifted_17580000;
        return new R_default_C(result_out24400, store_out24400);
      }
      else
      { 
        if(lifted_17610000 != null && !lifted_17610000.isEmpty())
        { 
          final A_Class c13600000 = lifted_17610000.head();
          final L_A_Class cs2400000 = lifted_17610000.tail();
          final Class_4 $tmp498 = c13600000.match(Class_4.class);
          if($tmp498 != null)
          { 
            final String name3600000 = $tmp498.get_1();
            final A_Extends lifted_16910000 = $tmp498.get_2();
            final L_A_Field lifted_16920000 = $tmp498.get_3();
            final L_A_Method lifted_16930000 = $tmp498.get_4();
            final initClasses_1 lifted_17640000 = new initClasses_1(this.getSourceInfo(), cs2400000);
            final R_default_C $tmp499 = lifted_17640000.exec_default(env_124800, c_129100, store_124800);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_1838000 = $tmp499.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_217800 = $tmp499.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_17620000 = MapUtils.plus(lifted_1838000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Class>().plus(name3600000, c13600000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24400 = store_217800;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out24400 = lifted_17620000;
            return new R_default_C(result_out24400, store_out24400);
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

  public L_A_Class get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initClasses", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}