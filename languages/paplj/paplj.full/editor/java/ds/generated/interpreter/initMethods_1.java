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

  public R_default_Map_String_Method_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25200 = _2;
    final A_This this_in21700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25200 = _4;
    final L_A_Method lifted_44380000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124000 = l_string_class_in23000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125500 = l_string_v_in25200;
      final A_This this_122600 = this_in21700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125500 = l_int_v_in25200;
      if(lifted_44380000 != null && lifted_44380000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_44370000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_44360000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Method>)lifted_44370000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25100 = l_int_v_125500;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out52900 = lifted_44360000;
        return new R_default_Map_String_Method_(result_out52900, l_int_v_out25100);
      }
      else
      { 
        if(lifted_44380000 != null && !lifted_44380000.isEmpty())
        { 
          final A_Method m174000000 = lifted_44380000.head();
          final L_A_Method ms231000000 = lifted_44380000.tail();
          final Method_4 $tmp1019 = m174000000.match(Method_4.class);
          if($tmp1019 != null)
          { 
            final A_Type lifted_43320000 = $tmp1019.get_1();
            final String name513000000 = $tmp1019.get_2();
            final L_A_Param lifted_43330000 = $tmp1019.get_3();
            final A_Block lifted_43340000 = $tmp1019.get_4();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_44410000 = new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Method>().plus(name513000000, m174000000);
            final initMethods_1 lifted_44420000 = new initMethods_1(this.getSourceInfo(), ms231000000);
            final R_default_Map_String_Method_ $tmp1020 = lifted_44420000.exec_default(l_string_class_124000, l_string_v_125500, this_122600, l_int_v_125500);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_4594000 = $tmp1020.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_218900 = $tmp1020.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_44390000 = MapUtils.plus(lifted_4594000, lifted_44410000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25100 = l_int_v_218900;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out52900 = lifted_44390000;
            return new R_default_Map_String_Method_(result_out52900, l_int_v_out25100);
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