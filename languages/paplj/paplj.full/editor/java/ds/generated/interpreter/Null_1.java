package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Null_1 extends A_Expr 
{ 
  public String _1;

  public Null_1 (INodeSource source, String _1) 
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
    final Null_1 other = (Null_1)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28100 = _2;
    final A_This this_in25200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28100 = _4;
    final String lifted_43260000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127000 = l_string_class_in25900;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128500 = l_string_v_in28100;
    final A_This this_125800 = this_in25200;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128500 = l_int_v_in28100;
    final NullV_0 lifted_43820000 = new NullV_0(this.getSourceInfo());
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28000 = l_int_v_128500;
    final A_V result_out55800 = lifted_43820000;
    return new R_default_V(result_out55800, l_int_v_out28000);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Null", 1), TermUtils.termFromString(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}