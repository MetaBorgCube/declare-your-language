package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Eq_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Eq_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Eq_2 other = (Eq_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26900 = _2;
    final A_This this_in23800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26900 = _4;
    final A_Expr lifted_44720000 = this._1;
    final A_Expr lifted_44730000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125800 = l_string_class_in24700;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127300 = l_string_v_in26900;
      final A_This this_124600 = this_in23800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127300 = l_int_v_in26900;
      final R_default_V $tmp1059 = lifted_44720000.exec_default(l_string_class_125800, l_string_v_127300, this_124600, l_int_v_127300);
      final A_V lifted_4609000 = $tmp1059.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220200 = $tmp1059.get_1();
      final NumV_1 $tmp1060 = lifted_4609000.match(NumV_1.class);
      if($tmp1060 != null)
      { 
        final int i512000000 = $tmp1060.get_1();
        final R_default_V $tmp1061 = lifted_44730000.exec_default(l_string_class_125800, l_string_v_127300, this_124600, l_int_v_220200);
        final A_V lifted_4608000 = $tmp1061.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312800 = $tmp1061.get_1();
        final NumV_1 $tmp1062 = lifted_4608000.match(NumV_1.class);
        if($tmp1062 != null)
        { 
          final int j264000000 = $tmp1062.get_1();
          final boolean lifted_44750000 = ds.manual.interpreter.Natives.eqI_2(i512000000, j264000000);
          final BoolV_1 lifted_44740000 = new BoolV_1(this.getSourceInfo(), lifted_44750000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26800 = l_int_v_312800;
          final A_V result_out54600 = lifted_44740000;
          return new R_default_V(result_out54600, l_int_v_out26800);
        }
        else
        { }
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Eq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}