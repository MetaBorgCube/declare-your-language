package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class write_2 extends A_write__Arrow 
{ 
  public int _1;

  @Child public A_V _2;

  public write_2 (INodeSource source, int _1, A_V _2) 
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
    final write_2 other = (write_2)obj;
    if(_1 != other._1)
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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in26400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28600 = _2;
    final A_This this_in25700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28600 = _4;
    final int loc40000000 = this._1;
    final A_V v1180000000 = this._2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127500 = l_string_class_in26400;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128800 = l_string_v_in28600;
    final A_This this_126400 = this_in25700;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S26000000 = l_int_v_in28600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> lifted_43540000 = new com.github.krukow.clj_lang.PersistentTreeMap<Integer, A_V>().plus(loc40000000, v1180000000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> lifted_43530000 = MapUtils.plus(S26000000, lifted_43540000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28500 = lifted_43530000;
    final A_V result_out56300 = v1180000000;
    return new R_default_V(result_out56300, l_int_v_out28500);
  }

  public int get_1()
  { 
    return this._1;
  }

  public A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("write", 2), TermUtils.termFromInt(_1, factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}