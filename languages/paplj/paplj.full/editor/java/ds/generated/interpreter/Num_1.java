package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Num_1 extends A_Expr 
{ 
  public String _1;

  public Num_1 (INodeSource source, String _1) 
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
    final Num_1 other = (Num_1)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25900 = _2;
    final A_This this_in22600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25900 = _4;
    final String i508000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124800 = l_string_class_in23700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126300 = l_string_v_in25900;
    final A_This this_123500 = this_in22600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126300 = l_int_v_in25900;
    final int lifted_43810000 = ds.manual.interpreter.Natives.str2int_1(i508000000);
    final NumV_1 lifted_43800000 = new NumV_1(this.getSourceInfo(), lifted_43810000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25800 = l_int_v_126300;
    final A_V result_out53600 = lifted_43800000;
    return new R_default_V(result_out53600, l_int_v_out25800);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Num", 1), TermUtils.termFromString(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}