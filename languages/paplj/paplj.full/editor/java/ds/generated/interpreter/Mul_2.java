package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Mul_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Mul_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Mul_2 other = (Mul_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26300 = _2;
    final A_This this_in23200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26300 = _4;
    final A_Expr lifted_43950000 = this._1;
    final A_Expr lifted_43960000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125200 = l_string_class_in24100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126700 = l_string_v_in26300;
      final A_This this_123900 = this_in23200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126700 = l_int_v_in26300;
      final R_default_V $tmp1047 = lifted_43950000.exec_default(l_string_class_125200, l_string_v_126700, this_123900, l_int_v_126700);
      final A_V lifted_4571000 = $tmp1047.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219800 = $tmp1047.get_1();
      final NumV_1 $tmp1048 = lifted_4571000.match(NumV_1.class);
      if($tmp1048 != null)
      { 
        final int i509000000 = $tmp1048.get_1();
        final R_default_V $tmp1049 = lifted_43960000.exec_default(l_string_class_125200, l_string_v_126700, this_123900, l_int_v_219800);
        final A_V lifted_4570000 = $tmp1049.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312500 = $tmp1049.get_1();
        final NumV_1 $tmp1050 = lifted_4570000.match(NumV_1.class);
        if($tmp1050 != null)
        { 
          final int j262000000 = $tmp1050.get_1();
          final int lifted_43980000 = ds.manual.interpreter.Natives.timesI_2(i509000000, j262000000);
          final NumV_1 lifted_43970000 = new NumV_1(this.getSourceInfo(), lifted_43980000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26200 = l_int_v_312500;
          final A_V result_out54000 = lifted_43970000;
          return new R_default_V(result_out54000, l_int_v_out26200);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Mul", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}