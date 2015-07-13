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
    final A_This this_in19300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27400 = _4;
    final L_A_Field lifted_19740000 = this._1;
    { 
      final A_This this_120200 = this_in19300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127800 = env_in27400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132600 = c_in27400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127800 = store_in27400;
      if(lifted_19740000 != null && lifted_19740000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_19730000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_19720000 = (com.github.krukow.clj_ds.PersistentMap<String, Integer>)lifted_19730000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27400 = store_127800;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out27400 = lifted_19720000;
        return new R_default_FM(result_out27400, store_out27400);
      }
      else
      { 
        if(lifted_19740000 != null && !lifted_19740000.isEmpty())
        { 
          final A_Field lifted_19760000 = lifted_19740000.head();
          final L_A_Field fs6200000 = lifted_19740000.tail();
          final Field_2 $tmp551 = lifted_19760000.match(Field_2.class);
          if($tmp551 != null)
          { 
            final A_Type t1600000 = $tmp551.get_1();
            final String f9200000 = $tmp551.get_2();
            final defaultValue_1 lifted_19770000 = new defaultValue_1(this.getSourceInfo(), t1600000);
            final R_default_V $tmp552 = lifted_19770000.exec_default(this_120200, env_127800, c_132600, store_127800);
            final A_V v15600000 = $tmp552.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219800 = $tmp552.get_1();
            final initFields_1 lifted_19790000 = new initFields_1(this.getSourceInfo(), fs6200000);
            final R_default_FM $tmp553 = lifted_19790000.exec_default(this_120200, env_127800, c_132600, store_219800);
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> FM1500000 = $tmp553.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312600 = $tmp553.get_1();
            final allocate_1 lifted_2179000 = new allocate_1(this.getSourceInfo(), v15600000);
            final R_default_Int $tmp554 = lifted_2179000.exec_default(this_120200, env_127800, c_132600, store_312600);
            final int lifted_2130000 = $tmp554.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_42900 = $tmp554.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_19750000 = MapUtils.plus(FM1500000, new com.github.krukow.clj_lang.PersistentTreeMap<String, Integer>().plus(f9200000, lifted_2130000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27400 = store_42900;
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out27400 = lifted_19750000;
            return new R_default_FM(result_out27400, store_out27400);
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