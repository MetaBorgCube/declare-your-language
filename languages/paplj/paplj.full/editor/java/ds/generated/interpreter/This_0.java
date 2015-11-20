package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class This_0 extends A_Expr 
{ 
  public This_0 (INodeSource source) 
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
    final This_0 other = (This_0)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28000 = _2;
    final A_This this_in25100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28000 = _4;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126900 = l_string_class_in25800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128400 = l_string_v_in28000;
      final A_This lifted_43580000 = this_in25100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128400 = l_int_v_in28000;
      final T_1 $tmp1101 = lifted_43580000.match(T_1.class);
      if($tmp1101 != null)
      { 
        final A_Obj o601000000 = $tmp1101.get_1();
        final o2v_1 lifted_4542000 = new o2v_1(this.getSourceInfo(), o601000000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27900 = l_int_v_128400;
        final A_V result_out55700 = lifted_4542000;
        return new R_default_V(result_out55700, l_int_v_out27900);
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("This", 0));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}