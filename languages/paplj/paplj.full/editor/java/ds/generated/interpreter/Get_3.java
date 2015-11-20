package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Get_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Type _2;

  public String _3;

  public Get_3 (INodeSource source, A_Expr _1, A_Type _2, String _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
    this._3 = _3;
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
    final Get_3 other = (Get_3)obj;
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
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27600 = _2;
    final A_This this_in24600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27600 = _4;
    final A_Expr lifted_44670000 = this._1;
    final A_Type lifted_44680000 = this._2;
    final String f1204000000 = this._3;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126500 = l_string_class_in25400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128000 = l_string_v_in27600;
      final A_This this_125400 = this_in24600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128000 = l_int_v_in27600;
      final R_default_V $tmp1082 = lifted_44670000.exec_default(l_string_class_126500, l_string_v_128000, this_125400, l_int_v_128000);
      final A_V lifted_4604000 = $tmp1082.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221100 = $tmp1082.get_1();
      final o2v_1 $tmp1083 = lifted_4604000.match(o2v_1.class);
      if($tmp1083 != null)
      { 
        final A_Obj o606000000 = $tmp1083.get_1();
        final ClassT_1 $tmp1084 = lifted_44680000.match(ClassT_1.class);
        if($tmp1084 != null)
        { 
          final String c1275000000 = $tmp1084.get_1();
          final readField_3 lifted_44690000 = new readField_3(this.getSourceInfo(), o606000000, c1275000000, f1204000000);
          final R_default_V $tmp1085 = lifted_44690000.exec_default(l_string_class_126500, l_string_v_128000, this_125400, l_int_v_221100);
          final A_V lifted_4606000 = $tmp1085.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313600 = $tmp1085.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27500 = l_int_v_313600;
          final A_V result_out55300 = lifted_4606000;
          return new R_default_V(result_out55300, l_int_v_out27500);
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

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Get", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), TermUtils.termFromString(_3, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}