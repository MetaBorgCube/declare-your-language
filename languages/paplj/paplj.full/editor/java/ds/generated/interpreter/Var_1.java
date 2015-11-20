package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Var_1 extends A_Expr 
{ 
  public String _1;

  public Var_1 (INodeSource source, String _1) 
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
    final Var_1 other = (Var_1)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27400 = _2;
    final A_This this_in24400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27400 = _4;
    final String x592000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126300 = l_string_class_in25200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127800 = l_string_v_in27400;
    final A_This this_125200 = this_in24400;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127800 = l_int_v_in27400;
    final readVar_1 lifted_43550000 = new readVar_1(this.getSourceInfo(), x592000000);
    final R_default_V $tmp1076 = lifted_43550000.exec_default(l_string_class_126300, l_string_v_127800, this_125200, l_int_v_127800);
    final A_V lifted_4539000 = $tmp1076.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220700 = $tmp1076.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27300 = l_int_v_220700;
    final A_V result_out55100 = lifted_4539000;
    return new R_default_V(result_out55100, l_int_v_out27300);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Var", 1), TermUtils.termFromString(_1, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}