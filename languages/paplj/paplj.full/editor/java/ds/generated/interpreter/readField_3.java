package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class readField_3 extends A_readField__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public String _3;

  public readField_3 (INodeSource source, A_Obj _1, String _2, String _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
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
    final readField_3 other = (readField_3)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25400 = _2;
    final A_This this_in21900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25400 = _4;
    final A_Obj o603000000 = this._1;
    final String c1264000000 = this._2;
    final String f1200000000 = this._3;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124200 = l_string_class_in23200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125700 = l_string_v_in25400;
    final A_This this_122800 = this_in21900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125700 = l_int_v_in25400;
    final lookupField_3 lifted_43700000 = new lookupField_3(this.getSourceInfo(), o603000000, c1264000000, f1200000000);
    final R_default_Int $tmp1024 = lifted_43700000.exec_default(l_string_class_124200, l_string_v_125700, this_122800, l_int_v_125700);
    final int lifted_4551000 = $tmp1024.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219000 = $tmp1024.get_1();
    final read_1 lifted_43690000 = new read_1(this.getSourceInfo(), lifted_4551000);
    final R_default_V $tmp1025 = lifted_43690000.exec_default(l_string_class_124200, l_string_v_125700, this_122800, l_int_v_219000);
    final A_V lifted_4553000 = $tmp1025.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_311800 = $tmp1025.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25300 = l_int_v_311800;
    final A_V result_out53100 = lifted_4553000;
    return new R_default_V(result_out53100, l_int_v_out25300);
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

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("readField", 3), _1.toStrategoTerm(factory), TermUtils.termFromString(_2, factory), TermUtils.termFromString(_3, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}