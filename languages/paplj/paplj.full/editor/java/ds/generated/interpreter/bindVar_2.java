package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class bindVar_2 extends A_bindVar__Arrow 
{ 
  public String _1;

  @Child public A_V _2;

  public bindVar_2 (INodeSource source, String _1, A_V _2) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChild(_2);
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
    final bindVar_2 other = (bindVar_2)obj;
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
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_Map_String_V_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in26000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28200 = _2;
    final A_This this_in25300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28200 = _4;
    final String x596000000 = this._1;
    final A_V v1189000000 = this._2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127100 = l_string_class_in26000;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> E48000000 = l_string_v_in28200;
    final A_This this_125900 = this_in25300;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128600 = l_int_v_in28200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_45120000 = new com.github.krukow.clj_lang.PersistentTreeMap<String, A_V>().plus(x596000000, v1189000000);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_45110000 = MapUtils.plus(E48000000, lifted_45120000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28100 = l_int_v_128600;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out55900 = lifted_45110000;
    return new R_default_Map_String_V_(result_out55900, l_int_v_out28100);
  }

  public String get_1()
  { 
    return this._1;
  }

  public A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("bindVar", 2), TermUtils.termFromString(_1, factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}