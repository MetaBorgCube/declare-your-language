package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class writeField_4 extends A_writeField__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public String _3;

  @Child public A_V _4;

  public writeField_4 (INodeSource source, A_Obj _1, String _2, String _3, A_V _4) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
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
    final writeField_4 other = (writeField_4)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25500 = _2;
    final A_This this_in22200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25500 = _4;
    final A_Obj o600000000 = this._1;
    final String c1262000000 = this._2;
    final String f1198000000 = this._3;
    final A_V v1179000000 = this._4;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124300 = l_string_class_in23300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125800 = l_string_v_in25500;
    final A_This this_122900 = this_in22200;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125800 = l_int_v_in25500;
    final lookupField_3 lifted_43510000 = new lookupField_3(this.getSourceInfo(), o600000000, c1262000000, f1198000000);
    final R_default_Int $tmp1026 = lifted_43510000.exec_default(l_string_class_124300, l_string_v_125800, this_122900, l_int_v_125800);
    final int lifted_4535000 = $tmp1026.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219100 = $tmp1026.get_1();
    final write_2 lifted_43500000 = new write_2(this.getSourceInfo(), lifted_4535000, v1179000000);
    final R_default_V $tmp1027 = lifted_43500000.exec_default(l_string_class_124300, l_string_v_125800, this_122900, l_int_v_219100);
    final A_V lifted_4537000 = $tmp1027.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_311900 = $tmp1027.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25400 = l_int_v_311900;
    final A_V result_out53200 = lifted_4537000;
    return new R_default_V(result_out53200, l_int_v_out25400);
  }

  public A_Obj get_1()
  { 
    return this._1;
  }

  public String get_2()
  { 
    return this._2;
  }

  public String get_3()
  { 
    return this._3;
  }

  public A_V get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("writeField", 4), _1.toStrategoTerm(factory), TermUtils.termFromString(_2, factory), TermUtils.termFromString(_3, factory), _4.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}