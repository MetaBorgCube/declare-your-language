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

  public R_default_Map_String_Int_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in22900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25100 = _2;
    final A_This this_in21600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25100 = _4;
    final L_A_Field lifted_44460000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_123900 = l_string_class_in22900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125400 = l_string_v_in25100;
      final A_This this_122500 = this_in21600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125400 = l_int_v_in25100;
      if(lifted_44460000 != null && lifted_44460000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_44450000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_44440000 = (com.github.krukow.clj_ds.PersistentMap<String, Integer>)lifted_44450000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25000 = l_int_v_125400;
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out52800 = lifted_44440000;
        return new R_default_Map_String_Int_(result_out52800, l_int_v_out25000);
      }
      else
      { 
        if(lifted_44460000 != null && !lifted_44460000.isEmpty())
        { 
          final A_Field lifted_44480000 = lifted_44460000.head();
          final L_A_Field fs227000000 = lifted_44460000.tail();
          final Field_2 $tmp1015 = lifted_44480000.match(Field_2.class);
          if($tmp1015 != null)
          { 
            final A_Type t1271000000 = $tmp1015.get_1();
            final String f1203000000 = $tmp1015.get_2();
            final defaultValue_1 lifted_44490000 = new defaultValue_1(this.getSourceInfo(), t1271000000);
            final R_default_V $tmp1016 = lifted_44490000.exec_default(l_string_class_123900, l_string_v_125400, this_122500, l_int_v_125400);
            final A_V v1185000000 = $tmp1016.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_218800 = $tmp1016.get_1();
            final initFields_1 lifted_44510000 = new initFields_1(this.getSourceInfo(), fs227000000);
            final R_default_Map_String_Int_ $tmp1017 = lifted_44510000.exec_default(l_string_class_123900, l_string_v_125400, this_122500, l_int_v_218800);
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> FM56000000 = $tmp1017.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_311700 = $tmp1017.get_1();
            final allocate_1 lifted_44530000 = new allocate_1(this.getSourceInfo(), v1185000000);
            final R_default_Int $tmp1018 = lifted_44530000.exec_default(l_string_class_123900, l_string_v_125400, this_122500, l_int_v_311700);
            final int addr39000000 = $tmp1018.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_42700 = $tmp1018.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_44540000 = new com.github.krukow.clj_lang.PersistentTreeMap<String, Integer>().plus(f1203000000, addr39000000);
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_44470000 = MapUtils.plus(FM56000000, lifted_44540000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25000 = l_int_v_42700;
            final com.github.krukow.clj_ds.PersistentMap<String, Integer> result_out52800 = lifted_44470000;
            return new R_default_Map_String_Int_(result_out52800, l_int_v_out25000);
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