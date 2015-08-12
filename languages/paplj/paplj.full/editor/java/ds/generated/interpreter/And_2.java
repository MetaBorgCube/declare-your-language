package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class And_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public And_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final And_2 other = (And_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26700 = _2;
    final A_This this_in23600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26700 = _4;
    final A_Expr lifted_45170000 = this._1;
    final A_Expr e532000000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125600 = l_string_class_in24500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127100 = l_string_v_in26700;
      final A_This this_124400 = this_in23600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127100 = l_int_v_in26700;
      final R_default_V $tmp1053 = lifted_45170000.exec_default(l_string_class_125600, l_string_v_127100, this_124400, l_int_v_127100);
      final A_V lifted_4634000 = $tmp1053.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220000 = $tmp1053.get_1();
      final BoolV_1 $tmp1054 = lifted_4634000.match(BoolV_1.class);
      if($tmp1054 != null)
      { 
        final boolean lifted_45180000 = $tmp1054.get_1();
        if(lifted_45180000 == false)
        { 
          final boolean lifted_45160000 = false;
          final BoolV_1 lifted_45140000 = new BoolV_1(this.getSourceInfo(), lifted_45160000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26600 = l_int_v_220000;
          final A_V result_out54400 = lifted_45140000;
          return new R_default_V(result_out54400, l_int_v_out26600);
        }
        else
        { 
          if(lifted_45180000 == true)
          { 
            final R_default_V $tmp1055 = e532000000.exec_default(l_string_class_125600, l_string_v_127100, this_124400, l_int_v_220000);
            final A_V lifted_4635000 = $tmp1055.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312600 = $tmp1055.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26600 = l_int_v_312600;
            final A_V result_out54400 = lifted_4635000;
            return new R_default_V(result_out54400, l_int_v_out26600);
          }
          else
          { }
        }
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("And", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}