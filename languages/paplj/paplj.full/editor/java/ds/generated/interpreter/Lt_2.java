package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Lt_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Lt_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Lt_2 other = (Lt_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27100 = _2;
    final A_This this_in24100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27100 = _4;
    final A_Expr lifted_44030000 = this._1;
    final A_Expr lifted_44040000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126000 = l_string_class_in24900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127500 = l_string_v_in27100;
      final A_This this_124800 = this_in24100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127500 = l_int_v_in27100;
      final R_default_V $tmp1064 = lifted_44030000.exec_default(l_string_class_126000, l_string_v_127500, this_124800, l_int_v_127500);
      final A_V lifted_4574000 = $tmp1064.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220400 = $tmp1064.get_1();
      final NumV_1 $tmp1065 = lifted_4574000.match(NumV_1.class);
      if($tmp1065 != null)
      { 
        final int i511000000 = $tmp1065.get_1();
        final R_default_V $tmp1066 = lifted_44040000.exec_default(l_string_class_126000, l_string_v_127500, this_124800, l_int_v_220400);
        final A_V lifted_4573000 = $tmp1066.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312900 = $tmp1066.get_1();
        final NumV_1 $tmp1067 = lifted_4573000.match(NumV_1.class);
        if($tmp1067 != null)
        { 
          final int j263000000 = $tmp1067.get_1();
          final boolean lifted_44060000 = ds.manual.interpreter.Natives.gtI_2(j263000000, i511000000);
          final BoolV_1 lifted_44050000 = new BoolV_1(this.getSourceInfo(), lifted_44060000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27000 = l_int_v_312900;
          final A_V result_out54800 = lifted_44050000;
          return new R_default_V(result_out54800, l_int_v_out27000);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Lt", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}