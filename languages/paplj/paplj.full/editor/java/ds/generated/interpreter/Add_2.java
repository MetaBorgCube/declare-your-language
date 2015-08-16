package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Add_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Add_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Add_2 other = (Add_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26100 = _2;
    final A_This this_in22800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26100 = _4;
    final A_Expr lifted_45210000 = this._1;
    final A_Expr lifted_45220000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125000 = l_string_class_in23900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126500 = l_string_v_in26100;
      final A_This this_123700 = this_in22800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126500 = l_int_v_in26100;
      final R_default_V $tmp1039 = lifted_45210000.exec_default(l_string_class_125000, l_string_v_126500, this_123700, l_int_v_126500);
      final A_V lifted_4638000 = $tmp1039.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219600 = $tmp1039.get_1();
      final NumV_1 $tmp1040 = lifted_4638000.match(NumV_1.class);
      if($tmp1040 != null)
      { 
        final int i513000000 = $tmp1040.get_1();
        final R_default_V $tmp1041 = lifted_45220000.exec_default(l_string_class_125000, l_string_v_126500, this_123700, l_int_v_219600);
        final A_V lifted_4637000 = $tmp1041.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312300 = $tmp1041.get_1();
        final NumV_1 $tmp1042 = lifted_4637000.match(NumV_1.class);
        if($tmp1042 != null)
        { 
          final int j265000000 = $tmp1042.get_1();
          final int lifted_45240000 = ds.manual.interpreter.Natives.plusI_2(i513000000, j265000000);
          final NumV_1 lifted_45230000 = new NumV_1(this.getSourceInfo(), lifted_45240000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26000 = l_int_v_312300;
          final A_V result_out53800 = lifted_45230000;
          return new R_default_V(result_out53800, l_int_v_out26000);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Add", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}