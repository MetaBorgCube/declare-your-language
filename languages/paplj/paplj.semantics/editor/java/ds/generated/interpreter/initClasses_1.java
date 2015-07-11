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
    final A_This this_in1100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1100 = _4;
    final L_A_Class lifted_1300000 = this._1;
    { 
      final A_This this_11100 = this_in1100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11100 = env_in1100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_1000 = c_in1100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11100 = store_in1100;
      if(lifted_1300000 != null && lifted_1300000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_1290000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_1280000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Class>)lifted_1290000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1100 = store_11100;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out1100 = lifted_1280000;
        return new R_default_C(result_out1100, store_out1100);
      }
      else
      { 
        if(lifted_1300000 != null && !lifted_1300000.isEmpty())
        { 
          final A_Class c5000000 = lifted_1300000.head();
          final L_A_Class cs700000 = lifted_1300000.tail();
          final Class_4 $tmp0 = c5000000.match(Class_4.class);
          if($tmp0 != null)
          { 
            final String name1100000 = $tmp0.get_1();
            final A_Extends lifted_1111000 = $tmp0.get_2();
            final L_A_Field lifted_1211000 = $tmp0.get_3();
            final L_A_Method lifted_1311000 = $tmp0.get_4();
            final initClasses_1 lifted_1330000 = new initClasses_1(this.getSourceInfo(), cs700000);
            final R_default_C $tmp1 = lifted_1330000.exec_default(this_11100, env_11100, c_1000, store_11100);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_276000 = $tmp1.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2000 = $tmp1.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_1310000 = MapUtils.plus(lifted_276000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Class>().plus(name1100000, c5000000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1100 = store_2000;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out1100 = lifted_1310000;
            return new R_default_C(result_out1100, store_out1100);
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