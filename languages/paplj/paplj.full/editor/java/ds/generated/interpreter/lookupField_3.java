package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class lookupField_3 extends A_lookupField__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public String _3;

  public lookupField_3 (INodeSource source, A_Obj _1, String _2, String _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
    this._3 = _3;
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
    final lookupField_3 other = (lookupField_3)obj;
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
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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

  public R_default_Int exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25600 = _2;
    final A_This this_in22300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25600 = _4;
    final A_Obj lifted_44130000 = this._1;
    final String c2115000000 = this._2;
    final String f1202000000 = this._3;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124400 = l_string_class_in23400;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125900 = l_string_v_in25600;
      final A_This this_123100 = this_in22300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125900 = l_int_v_in25600;
      final ObjV_4 $tmp1028 = lifted_44130000.match(ObjV_4.class);
      if($tmp1028 != null)
      { 
        final String c1269000000 = $tmp1028.get_1();
        final A_Super sup231000000 = $tmp1028.get_2();
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> fs225000000 = $tmp1028.get_3();
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_43300000 = $tmp1028.get_4();
        if(c1269000000 != null && c1269000000.equals(c2115000000))
        { 
          final int lifted_44120000 = fs225000000.get(f1202000000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25500 = l_int_v_125900;
          final int result_out53300 = lifted_44120000;
          return new R_default_Int(result_out53300, l_int_v_out25500);
        }
        else
        { 
          if(c1269000000 != null && c1269000000.equals(c2115000000))
          { }
          else
          { 
            final Super_1 $tmp1029 = sup231000000.match(Super_1.class);
            if($tmp1029 != null)
            { 
              final A_Obj o605000000 = $tmp1029.get_1();
              final lookupField_3 lifted_44140000 = new lookupField_3(this.getSourceInfo(), o605000000, c2115000000, f1202000000);
              final R_default_Int $tmp1030 = lifted_44140000.exec_default(l_string_class_124400, l_string_v_125900, this_123100, l_int_v_125900);
              final int lifted_4577000 = $tmp1030.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219200 = $tmp1030.get_1();
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25500 = l_int_v_219200;
              final int result_out53300 = lifted_4577000;
              return new R_default_Int(result_out53300, l_int_v_out25500);
            }
            else
            { }
          }
        }
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Obj get_1()
  { 
    return this._1;
  }

  public String get_2()
  { 
    return this._2;
  }

  public String get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("lookupField", 3), _1.toStrategoTerm(factory), TermUtils.termFromString(_2, factory), TermUtils.termFromString(_3, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}