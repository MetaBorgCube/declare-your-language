package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class defaultValue_1 extends A_defaultValue__Arrow 
{ 
  @Child public A_Type _1;

  public defaultValue_1 (INodeSource source, A_Type _1) 
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
    final defaultValue_1 other = (defaultValue_1)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25300 = _2;
    final A_This this_in21800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25300 = _4;
    final A_Type lifted_44910000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124100 = l_string_class_in23100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125600 = l_string_v_in25300;
      final A_This this_122700 = this_in21800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125600 = l_int_v_in25300;
      final NumT_0 $tmp1021 = lifted_44910000.match(NumT_0.class);
      if($tmp1021 != null)
      { 
        final int lifted_44870000 = 0;
        final NumV_1 lifted_44860000 = new NumV_1(this.getSourceInfo(), lifted_44870000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25200 = l_int_v_125600;
        final A_V result_out53000 = lifted_44860000;
        return new R_default_V(result_out53000, l_int_v_out25200);
      }
      else
      { 
        final BoolT_0 $tmp1022 = lifted_44910000.match(BoolT_0.class);
        if($tmp1022 != null)
        { 
          final boolean lifted_44900000 = false;
          final BoolV_1 lifted_44890000 = new BoolV_1(this.getSourceInfo(), lifted_44900000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25200 = l_int_v_125600;
          final A_V result_out53000 = lifted_44890000;
          return new R_default_V(result_out53000, l_int_v_out25200);
        }
        else
        { 
          final ClassT_1 $tmp1023 = lifted_44910000.match(ClassT_1.class);
          if($tmp1023 != null)
          { 
            final String lifted_43420000 = $tmp1023.get_1();
            final NullV_0 lifted_44920000 = new NullV_0(this.getSourceInfo());
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25200 = l_int_v_125600;
            final A_V result_out53000 = lifted_44920000;
            return new R_default_V(result_out53000, l_int_v_out25200);
          }
          else
          { }
        }
      }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Type get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("defaultValue", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}