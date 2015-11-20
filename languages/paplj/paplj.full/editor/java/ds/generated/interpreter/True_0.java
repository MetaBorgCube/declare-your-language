package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class True_0 extends A_Expr 
{ 
  public True_0 (INodeSource source) 
  { 
    this.setSourceInfo(source);
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
    final True_0 other = (True_0)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26400 = _2;
    final A_This this_in23300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26400 = _4;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125300 = l_string_class_in24200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126800 = l_string_v_in26400;
    final A_This this_124100 = this_in23300;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126800 = l_int_v_in26400;
    final boolean lifted_43570000 = true;
    final BoolV_1 lifted_43560000 = new BoolV_1(this.getSourceInfo(), lifted_43570000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26300 = l_int_v_126800;
    final A_V result_out54100 = lifted_43560000;
    return new R_default_V(result_out54100, l_int_v_out26300);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("True", 0));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}