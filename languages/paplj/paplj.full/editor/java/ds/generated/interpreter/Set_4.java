package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Set_4 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Type _2;

  public String _3;

  @Child public A_Expr _4;

  public Set_4 (INodeSource source, A_Expr _1, A_Type _2, String _3, A_Expr _4) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
    this._3 = _3;
    this._4 = adoptChild(_4);
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
    final Set_4 other = (Set_4)obj;
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
    if(_4 == null)
    { 
      if(other._4 != null)
      { 
        return false;
      }
    }
    else
      if(!_4.equals(other._4))
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
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      if(_4 instanceof IGenericNode)
      { 
        ((IGenericNode)_4).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27700 = _2;
    final A_This this_in24700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27700 = _4;
    final A_Expr lifted_43630000 = this._1;
    final A_Type lifted_43640000 = this._2;
    final String f1199000000 = this._3;
    final A_Expr lifted_43650000 = this._4;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126600 = l_string_class_in25500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128100 = l_string_v_in27700;
      final A_This this_125500 = this_in24700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128100 = l_int_v_in27700;
      final R_default_V $tmp1086 = lifted_43630000.exec_default(l_string_class_126600, l_string_v_128100, this_125500, l_int_v_128100);
      final A_V lifted_4547000 = $tmp1086.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221200 = $tmp1086.get_1();
      final o2v_1 $tmp1087 = lifted_4547000.match(o2v_1.class);
      if($tmp1087 != null)
      { 
        final A_Obj o602000000 = $tmp1087.get_1();
        final ClassT_1 $tmp1088 = lifted_43640000.match(ClassT_1.class);
        if($tmp1088 != null)
        { 
          final String c1263000000 = $tmp1088.get_1();
          final R_default_V $tmp1089 = lifted_43650000.exec_default(l_string_class_126600, l_string_v_128100, this_125500, l_int_v_221200);
          final A_V v1181000000 = $tmp1089.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313700 = $tmp1089.get_1();
          final writeField_4 lifted_43660000 = new writeField_4(this.getSourceInfo(), o602000000, c1263000000, f1199000000, v1181000000);
          final R_default_V $tmp1090 = lifted_43660000.exec_default(l_string_class_126600, l_string_v_128100, this_125500, l_int_v_313700);
          final A_V lifted_4549000 = $tmp1090.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_42900 = $tmp1090.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27600 = l_int_v_42900;
          final A_V result_out55400 = lifted_4549000;
          return new R_default_V(result_out55400, l_int_v_out27600);
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

  public A_Type get_2()
  { 
    return this._2;
  }

  public String get_3()
  { 
    return this._3;
  }

  public A_Expr get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Set", 4), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), TermUtils.termFromString(_3, factory), _4.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}