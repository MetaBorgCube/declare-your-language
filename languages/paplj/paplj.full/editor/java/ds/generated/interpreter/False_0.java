package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class False_0 extends A_Expr 
{ 
  public False_0 (INodeSource source) 
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
    final False_0 other = (False_0)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26500 = _2;
    final A_This this_in23400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26500 = _4;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125400 = l_string_class_in24300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126900 = l_string_v_in26500;
    final A_This this_124200 = this_in23400;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126900 = l_int_v_in26500;
    final boolean lifted_44710000 = false;
    final BoolV_1 lifted_44700000 = new BoolV_1(this.getSourceInfo(), lifted_44710000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26400 = l_int_v_126900;
    final A_V result_out54200 = lifted_44700000;
    return new R_default_V(result_out54200, l_int_v_out26400);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("False", 0));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}