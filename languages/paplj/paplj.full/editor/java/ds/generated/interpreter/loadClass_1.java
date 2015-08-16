package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class loadClass_1 extends A_loadClass__Arrow 
{ 
  public String _1;

  public loadClass_1 (INodeSource source, String _1) 
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
    final loadClass_1 other = (loadClass_1)obj;
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

  public R_default_Class exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in22500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in24700 = _2;
    final A_This this_in20800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in24700 = _4;
    final String c1271000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> C56000000 = l_string_class_in22500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125000 = l_string_v_in24700;
    final A_This this_122100 = this_in20800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125000 = l_int_v_in24700;
    final A_Class lifted_44160000 = C56000000.get(c1271000000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out24600 = l_int_v_125000;
    final A_Class result_out52400 = lifted_44160000;
    return new R_default_Class(result_out52400, l_int_v_out24600);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("loadClass", 1), TermUtils.termFromString(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}