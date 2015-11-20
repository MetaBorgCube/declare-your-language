package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Not_1 extends A_Expr 
{ 
  @Child public A_Expr _1;

  public Not_1 (INodeSource source, A_Expr _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final Not_1 other = (Not_1)obj;
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26600 = _2;
    final A_This this_in23500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26600 = _4;
    final A_Expr lifted_43870000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125500 = l_string_class_in24400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127000 = l_string_v_in26600;
      final A_This this_124300 = this_in23500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127000 = l_int_v_in26600;
      final R_default_V $tmp1051 = lifted_43870000.exec_default(l_string_class_125500, l_string_v_127000, this_124300, l_int_v_127000);
      final A_V lifted_4562000 = $tmp1051.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219900 = $tmp1051.get_1();
      final BoolV_1 $tmp1052 = lifted_4562000.match(BoolV_1.class);
      if($tmp1052 != null)
      { 
        final boolean lifted_43890000 = $tmp1052.get_1();
        if(lifted_43890000 == true)
        { 
          final boolean lifted_43860000 = false;
          final BoolV_1 lifted_43840000 = new BoolV_1(this.getSourceInfo(), lifted_43860000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26500 = l_int_v_219900;
          final A_V result_out54300 = lifted_43840000;
          return new R_default_V(result_out54300, l_int_v_out26500);
        }
        else
        { 
          if(lifted_43890000 == false)
          { 
            final boolean lifted_43900000 = true;
            final BoolV_1 lifted_43880000 = new BoolV_1(this.getSourceInfo(), lifted_43900000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26500 = l_int_v_219900;
            final A_V result_out54300 = lifted_43880000;
            return new R_default_V(result_out54300, l_int_v_out26500);
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

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Not", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}