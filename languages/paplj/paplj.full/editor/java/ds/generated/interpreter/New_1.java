package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class New_1 extends A_Expr 
{ 
  public String _1;

  public New_1 (INodeSource source, String _1) 
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
    final New_1 other = (New_1)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27900 = _2;
    final A_This this_in24900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27900 = _4;
    final String c1265000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126800 = l_string_class_in25700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128300 = l_string_v_in27900;
    final A_This this_125700 = this_in24900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128300 = l_int_v_in27900;
    final loadClass_1 lifted_43920000 = new loadClass_1(this.getSourceInfo(), c1265000000);
    final R_default_Class $tmp1099 = lifted_43920000.exec_default(l_string_class_126800, l_string_v_128300, this_125700, l_int_v_128300);
    final A_Class lifted_4563000 = $tmp1099.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221400 = $tmp1099.get_1();
    final initObject_1 lifted_43910000 = new initObject_1(this.getSourceInfo(), lifted_4563000);
    final R_default_Obj $tmp1100 = lifted_43910000.exec_default(l_string_class_126800, l_string_v_128300, this_125700, l_int_v_221400);
    final A_Obj lifted_4566000 = $tmp1100.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313900 = $tmp1100.get_1();
    final o2v_1 lifted_4565000 = new o2v_1(this.getSourceInfo(), lifted_4566000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27800 = l_int_v_313900;
    final A_V result_out55600 = lifted_4565000;
    return new R_default_V(result_out55600, l_int_v_out27800);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("New", 1), TermUtils.termFromString(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}