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

  public R_default_C exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in18900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27100 = _4;
    final L_A_Class lifted_19850000 = this._1;
    { 
      final A_This this_119800 = this_in18900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127500 = env_in27100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132300 = c_in27100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127500 = store_in27100;
      if(lifted_19850000 != null && lifted_19850000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_19840000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_19830000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Class>)lifted_19840000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27100 = store_127500;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out27100 = lifted_19830000;
        return new R_default_C(result_out27100, store_out27100);
      }
      else
      { 
        if(lifted_19850000 != null && !lifted_19850000.isEmpty())
        { 
          final A_Class c17700000 = lifted_19850000.head();
          final L_A_Class cs3100000 = lifted_19850000.tail();
          final Class_4 $tmp541 = c17700000.match(Class_4.class);
          if($tmp541 != null)
          { 
            final String name4600000 = $tmp541.get_1();
            final A_Extends lifted_18530000 = $tmp541.get_2();
            final L_A_Field lifted_18540000 = $tmp541.get_3();
            final L_A_Method lifted_18550000 = $tmp541.get_4();
            final initClasses_1 lifted_19880000 = new initClasses_1(this.getSourceInfo(), cs3100000);
            final R_default_C $tmp542 = lifted_19880000.exec_default(this_119800, env_127500, c_132300, store_127500);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_2132000 = $tmp542.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219500 = $tmp542.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_19860000 = MapUtils.plus(lifted_2132000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Class>().plus(name4600000, c17700000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27100 = store_219500;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out27100 = lifted_19860000;
            return new R_default_C(result_out27100, store_out27100);
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