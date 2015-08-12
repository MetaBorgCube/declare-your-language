package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Neq_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Neq_2 (INodeSource source, A_Expr _1, A_Expr _2) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
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
    final Neq_2 other = (Neq_2)obj;
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
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27000 = _2;
    final A_This this_in23900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27000 = _4;
    final A_Expr e1180000000 = this._1;
    final A_Expr e2139000000 = this._2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125900 = l_string_class_in24800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127400 = l_string_v_in27000;
    final A_This this_124700 = this_in23900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127400 = l_int_v_in27000;
    final Eq_2 lifted_43940000 = new Eq_2(this.getSourceInfo(), e1180000000, e2139000000);
    final Not_1 lifted_43930000 = new Not_1(this.getSourceInfo(), lifted_43940000);
    final R_default_V $tmp1063 = lifted_43930000.exec_default(l_string_class_125900, l_string_v_127400, this_124700, l_int_v_127400);
    final A_V lifted_4568000 = $tmp1063.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220300 = $tmp1063.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26900 = l_int_v_220300;
    final A_V result_out54700 = lifted_4568000;
    return new R_default_V(result_out54700, l_int_v_out26900);
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Neq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}