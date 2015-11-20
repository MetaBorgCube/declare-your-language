package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class read_1 extends A_read__Arrow 
{ 
  public int _1;

  public read_1 (INodeSource source, int _1) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
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
    final read_1 other = (read_1)obj;
    if(_1 != other._1)
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
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in26500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28700 = _2;
    final A_This this_in25800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28700 = _4;
    final int loc41000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127600 = l_string_class_in26500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128900 = l_string_v_in28700;
    final A_This this_126500 = this_in25800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S27000000 = l_int_v_in28700;
    final A_V lifted_43710000 = S27000000.get(loc41000000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28600 = S27000000;
    final A_V result_out56400 = lifted_43710000;
    return new R_default_V(result_out56400, l_int_v_out28600);
  }

  public int get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("read", 1), TermUtils.termFromInt(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}