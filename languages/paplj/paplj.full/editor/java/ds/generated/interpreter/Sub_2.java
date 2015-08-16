package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Sub_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Sub_2 (INodeSource source, A_Expr _1, A_Expr _2) 
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
    final Sub_2 other = (Sub_2)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in24000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in26200 = _2;
    final A_This this_in22900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in26200 = _4;
    final A_Expr lifted_43590000 = this._1;
    final A_Expr lifted_43600000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_125100 = l_string_class_in24000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126600 = l_string_v_in26200;
      final A_This this_123800 = this_in22900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126600 = l_int_v_in26200;
      final R_default_V $tmp1043 = lifted_43590000.exec_default(l_string_class_125100, l_string_v_126600, this_123800, l_int_v_126600);
      final A_V lifted_4545000 = $tmp1043.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219700 = $tmp1043.get_1();
      final NumV_1 $tmp1044 = lifted_4545000.match(NumV_1.class);
      if($tmp1044 != null)
      { 
        final int i507000000 = $tmp1044.get_1();
        final R_default_V $tmp1045 = lifted_43600000.exec_default(l_string_class_125100, l_string_v_126600, this_123800, l_int_v_219700);
        final A_V lifted_4544000 = $tmp1045.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312400 = $tmp1045.get_1();
        final NumV_1 $tmp1046 = lifted_4544000.match(NumV_1.class);
        if($tmp1046 != null)
        { 
          final int j261000000 = $tmp1046.get_1();
          final int lifted_43620000 = ds.manual.interpreter.Natives.minusI_2(i507000000, j261000000);
          final NumV_1 lifted_43610000 = new NumV_1(this.getSourceInfo(), lifted_43620000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out26100 = l_int_v_312400;
          final A_V result_out53900 = lifted_43610000;
          return new R_default_V(result_out53900, l_int_v_out26100);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Sub", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}