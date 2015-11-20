package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initObject_1 extends A_initObject__Arrow 
{ 
  @Child public A_Class _1;

  public initObject_1 (INodeSource source, A_Class _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final initObject_1 other = (initObject_1)obj;
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_Obj exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in22700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in24900 = _2;
    final A_This this_in21400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in24900 = _4;
    final A_Class lifted_44300000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_123700 = l_string_class_in22700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125200 = l_string_v_in24900;
      final A_This this_122300 = this_in21400;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125200 = l_int_v_in24900;
      final Class_4 $tmp1007 = lifted_44300000.match(Class_4.class);
      if($tmp1007 != null)
      { 
        final String c1273000000 = $tmp1007.get_1();
        final A_Extends ext56000000 = $tmp1007.get_2();
        final L_A_Field fs226000000 = $tmp1007.get_3();
        final L_A_Method ms230000000 = $tmp1007.get_4();
        final initSuper_1 lifted_44320000 = new initSuper_1(this.getSourceInfo(), ext56000000);
        final initFields_1 lifted_44330000 = new initFields_1(this.getSourceInfo(), fs226000000);
        final initMethods_1 lifted_44340000 = new initMethods_1(this.getSourceInfo(), ms230000000);
        final R_default_Super $tmp1008 = lifted_44320000.exec_default(l_string_class_123700, l_string_v_125200, this_122300, l_int_v_125200);
        final A_Super lifted_4588000 = $tmp1008.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_218600 = $tmp1008.get_1();
        final R_default_Map_String_Int_ $tmp1009 = lifted_44330000.exec_default(l_string_class_123700, l_string_v_125200, this_122300, l_int_v_218600);
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_4589000 = $tmp1009.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_311500 = $tmp1009.get_1();
        final R_default_Map_String_Method_ $tmp1010 = lifted_44340000.exec_default(l_string_class_123700, l_string_v_125200, this_122300, l_int_v_311500);
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_4590000 = $tmp1010.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_42600 = $tmp1010.get_1();
        final ObjV_4 lifted_44310000 = new ObjV_4(this.getSourceInfo(), c1273000000, lifted_4588000, lifted_4589000, lifted_4590000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out24800 = l_int_v_42600;
        final A_Obj result_out52600 = lifted_44310000;
        return new R_default_Obj(result_out52600, l_int_v_out24800);
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Class get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initObject", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}