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

  public R_default_Map_String_Class_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in22600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in24800 = _2;
    final A_This this_in20900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in24800 = _4;
    final L_A_Class lifted_44580000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_123600 = l_string_class_in22600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125100 = l_string_v_in24800;
      final A_This this_122200 = this_in20900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125100 = l_int_v_in24800;
      if(lifted_44580000 != null && lifted_44580000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_44570000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_44560000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Class>)lifted_44570000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out24700 = l_int_v_125100;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out52500 = lifted_44560000;
        return new R_default_Map_String_Class_(result_out52500, l_int_v_out24700);
      }
      else
      { 
        if(lifted_44580000 != null && !lifted_44580000.isEmpty())
        { 
          final A_Class c1274000000 = lifted_44580000.head();
          final L_A_Class cs321000000 = lifted_44580000.tail();
          final Class_4 $tmp1005 = c1274000000.match(Class_4.class);
          if($tmp1005 != null)
          { 
            final String name514000000 = $tmp1005.get_1();
            final A_Extends lifted_43350000 = $tmp1005.get_2();
            final L_A_Field lifted_43360000 = $tmp1005.get_3();
            final L_A_Method lifted_43370000 = $tmp1005.get_4();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_44610000 = new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Class>().plus(name514000000, c1274000000);
            final initClasses_1 lifted_44620000 = new initClasses_1(this.getSourceInfo(), cs321000000);
            final R_default_Map_String_Class_ $tmp1006 = lifted_44620000.exec_default(l_string_class_123600, l_string_v_125100, this_122200, l_int_v_125100);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_4596000 = $tmp1006.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_218500 = $tmp1006.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_44590000 = MapUtils.plus(lifted_4596000, lifted_44610000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out24700 = l_int_v_218500;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Class> result_out52500 = lifted_44590000;
            return new R_default_Map_String_Class_(result_out52500, l_int_v_out24700);
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