package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Min_1 extends A_Expr 
{ 
  @Child public A_Expr _1;

  public Min_1 (INodeSource source, A_Expr _1) 
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
    final Min_1 other = (Min_1)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26000 = _2;
    final A_This this_in22700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26000 = _4;
    final A_Expr lifted_43990000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124900 = l_string_class_in23800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126400 = l_string_v_in26000;
      final A_This this_123600 = this_in22700;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126400 = l_int_v_in26000;
      final R_default_V $tmp1037 = lifted_43990000.exec_default(l_string_class_124900, l_string_v_126400, this_123600, l_int_v_126400);
      final A_V lifted_4572000 = $tmp1037.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219500 = $tmp1037.get_1();
      final NumV_1 $tmp1038 = lifted_4572000.match(NumV_1.class);
      if($tmp1038 != null)
      { 
        final int i510000000 = $tmp1038.get_1();
        final int lifted_44020000 = 0;
        final int lifted_44010000 = ds.manual.interpreter.Natives.minusI_2(lifted_44020000, i510000000);
        final NumV_1 lifted_44001000 = new NumV_1(this.getSourceInfo(), lifted_44010000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25900 = l_int_v_219500;
        final A_V result_out53700 = lifted_44001000;
        return new R_default_V(result_out53700, l_int_v_out25900);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Min", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}