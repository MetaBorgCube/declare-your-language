package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Or_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Or_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Or_2 other = (Or_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26800 = _2;
    final A_This this_in23700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26800 = _4;
    final A_Expr lifted_43780000 = this._1;
    final A_Expr e527000000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125700 = l_string_class_in24600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127200 = l_string_v_in26800;
      final A_This this_124500 = this_in23700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127200 = l_int_v_in26800;
      final R_default_V $tmp1056 = lifted_43780000.exec_default(l_string_class_125700, l_string_v_127200, this_124500, l_int_v_127200);
      final A_V lifted_4558000 = $tmp1056.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220100 = $tmp1056.get_1();
      final BoolV_1 $tmp1057 = lifted_4558000.match(BoolV_1.class);
      if($tmp1057 != null)
      { 
        final boolean lifted_43790000 = $tmp1057.get_1();
        if(lifted_43790000 == true)
        { 
          final boolean lifted_43770000 = true;
          final BoolV_1 lifted_43750000 = new BoolV_1(this.getSourceInfo(), lifted_43770000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26700 = l_int_v_220100;
          final A_V result_out54500 = lifted_43750000;
          return new R_default_V(result_out54500, l_int_v_out26700);
        }
        else
        { 
          if(lifted_43790000 == false)
          { 
            final R_default_V $tmp1058 = e527000000.exec_default(l_string_class_125700, l_string_v_127200, this_124500, l_int_v_220100);
            final A_V lifted_4559000 = $tmp1058.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312700 = $tmp1058.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26700 = l_int_v_312700;
            final A_V result_out54500 = lifted_4559000;
            return new R_default_V(result_out54500, l_int_v_out26700);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Or", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}