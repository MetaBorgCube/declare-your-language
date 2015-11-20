package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class readVar_1 extends A_readVar__Arrow 
{ 
  public String _1;

  public readVar_1 (INodeSource source, String _1) 
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
    final readVar_1 other = (readVar_1)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in26100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28300 = _2;
    final A_This this_in25400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28300 = _4;
    final String x593000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127200 = l_string_class_in26100;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> E46000000 = l_string_v_in28300;
    final A_This this_126100 = this_in25400;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128700 = l_int_v_in28300;
    final A_V lifted_43670000 = E46000000.get(x593000000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28200 = l_int_v_128700;
    final A_V result_out56000 = lifted_43670000;
    return new R_default_V(result_out56000, l_int_v_out28200);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("readVar", 1), TermUtils.termFromString(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}