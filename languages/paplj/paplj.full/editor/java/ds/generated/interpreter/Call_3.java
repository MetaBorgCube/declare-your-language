package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Call_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  public String _2;

  @Children public L_A_Expr _3;

  public Call_3 (INodeSource source, A_Expr _1, String _2, L_A_Expr _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
    this._3 = adoptChildren(_3);
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
    final Call_3 other = (Call_3)obj;
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
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
      { 
        return false;
      }
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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
      { 
        L_A_Expr _3_list = _3;
        while(!_3_list.isEmpty())
        { 
          A_Expr _3_elem = _3_list.head();
          if(_3_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_3_elem).specialize(depth);
          }
          _3_list = _3_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27800 = _2;
    final A_This this_in24800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27800 = _4;
    final A_Expr lifted_44930000 = this._1;
    final String m175000000 = this._2;
    final L_A_Expr lifted_44940000 = this._3;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126700 = l_string_class_in25600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128200 = l_string_v_in27800;
      final A_This this_125600 = this_in24800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128200 = l_int_v_in27800;
      final R_default_V $tmp1091 = lifted_44930000.exec_default(l_string_class_126700, l_string_v_128200, this_125600, l_int_v_128200);
      final A_V lifted_4631000 = $tmp1091.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221300 = $tmp1091.get_1();
      final o2v_1 $tmp1092 = lifted_4631000.match(o2v_1.class);
      if($tmp1092 != null)
      { 
        final A_Obj o607000000 = $tmp1092.get_1();
        final R_default_List_V_ $tmp1093 = lifted_44940000.exec_default(l_string_class_126700, l_string_v_128200, this_125600, l_int_v_221300);
        final L_A_V vs149000000 = $tmp1093.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313800 = $tmp1093.get_1();
        final lookupMethod_2 lifted_44950000 = new lookupMethod_2(this.getSourceInfo(), o607000000, m175000000);
        final R_default_Method $tmp1094 = lifted_44950000.exec_default(l_string_class_126700, l_string_v_128200, this_125600, l_int_v_313800);
        final A_Method lifted_44960000 = $tmp1094.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_43100 = $tmp1094.get_1();
        final Method_4 $tmp1095 = lifted_44960000.match(Method_4.class);
        if($tmp1095 != null)
        { 
          final A_Type lifted_43430000 = $tmp1095.get_1();
          final String lifted_43440000 = $tmp1095.get_2();
          final L_A_Param params185000000 = $tmp1095.get_3();
          final A_Block e531000000 = $tmp1095.get_4();
          final R_default_List_String_ $tmp1096 = params185000000.exec_default(l_string_class_126700, l_string_v_128200, this_125600, l_int_v_43100);
          final L_String lifted_4628000 = $tmp1096.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_5400 = $tmp1096.get_1();
          final bindVars_2 lifted_44970000 = new bindVars_2(this.getSourceInfo(), lifted_4628000, vs149000000);
          final T_1 lifted_4622000 = new T_1(this.getSourceInfo(), o607000000);
          final R_default_Map_String_V_ $tmp1097 = lifted_44970000.exec_default(l_string_class_126700, l_string_v_128200, this_125600, l_int_v_5400);
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_4623000 = $tmp1097.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_6400 = $tmp1097.get_1();
          final block2expr_1 lifted_4624000 = new block2expr_1(this.getSourceInfo(), e531000000);
          final R_default_V $tmp1098 = lifted_4624000.exec_default(l_string_class_126700, lifted_4623000, lifted_4622000, l_int_v_6400);
          final A_V v_123000000 = $tmp1098.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_7400 = $tmp1098.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27700 = l_int_v_7400;
          final A_V result_out55500 = v_123000000;
          return new R_default_V(result_out55500, l_int_v_out27700);
        }
        else
        { }
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public String get_2()
  { 
    return this._2;
  }

  public L_A_Expr get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Call", 3), _1.toStrategoTerm(factory), TermUtils.termFromString(_2, factory), _3.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}