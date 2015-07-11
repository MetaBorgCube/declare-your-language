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

  public R_default_FM exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in410 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in410 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in410 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in410 = _4;
    final L_A_Field lifted_1200000 = this._1;
    { 
      final A_This this_1450 = this_in410;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_1440 = env_in410;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13100 = c_in410;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_1440 = store_in410;
      if(lifted_1200000 != null && lifted_1200000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_1190000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_1180000 = (com.github.krukow.clj_ds.PersistentMap<String, Integer>)lifted_1190000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out410 = store_1440;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out410 = lifted_1180000;
        return new R_default_FM(result_out410, store_out410);
      }
      else
      { 
        if(lifted_1200000 != null && !lifted_1200000.isEmpty())
        { 
          final A_Field lifted_1220000 = lifted_1200000.head();
          final L_A_Field fs1500000 = lifted_1200000.tail();
          final Field_2 $tmp10 = lifted_1220000.match(Field_2.class);
          if($tmp10 != null)
          { 
            final A_Type t500000 = $tmp10.get_1();
            final String f2600000 = $tmp10.get_2();
            final defaultValue_1 lifted_1230000 = new defaultValue_1(this.getSourceInfo(), t500000);
            final R_default_V $tmp11 = lifted_1230000.exec_default(this_1450, env_1440, c_13100, store_1440);
            final A_V v4500000 = $tmp11.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2330 = $tmp11.get_1();
            final initFields_1 lifted_1250000 = new initFields_1(this.getSourceInfo(), fs1500000);
            final R_default_FM $tmp12 = lifted_1250000.exec_default(this_1450, env_1440, c_13100, store_2330);
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> FM300000 = $tmp12.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3220 = $tmp12.get_1();
            final allocate_1 lifted_326000 = new allocate_1(this.getSourceInfo(), v4500000);
            final R_default_Int $tmp13 = lifted_326000.exec_default(this_1450, env_1440, c_13100, store_3220);
            final int lifted_274000 = $tmp13.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_4100 = $tmp13.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_1210000 = MapUtils.plus(FM300000, new com.github.krukow.clj_lang.PersistentTreeMap<String, Integer>().plus(f2600000, lifted_274000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out410 = store_4100;
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out410 = lifted_1210000;
            return new R_default_FM(result_out410, store_out410);
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