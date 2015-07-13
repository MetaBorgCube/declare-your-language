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

  public R_default_Int exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in19800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27900 = _4;
    final A_Obj lifted_19380000 = this._1;
    final String c23700000 = this._2;
    final String f9100000 = this._3;
    { 
      final A_This this_120700 = this_in19800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_128400 = env_in27900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_133300 = c_in27900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_128400 = store_in27900;
      final ObjV_4 $tmp564 = lifted_19380000.match(ObjV_4.class);
      if($tmp564 != null)
      { 
        final String c17300000 = $tmp564.get_1();
        final A_Super sup6200000 = $tmp564.get_2();
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> fs5900000 = $tmp564.get_3();
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_18470000 = $tmp564.get_4();
        if(c17300000 != null && c17300000.equals(c23700000))
        { 
          final int lifted_19370000 = fs5900000.get(f9100000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27900 = store_128400;
          final int result_out27900 = lifted_19370000;
          return new R_default_Int(result_out27900, store_out27900);
        }
        else
        { 
          if(c17300000 != null && c17300000.equals(c23700000))
          { }
          else
          { 
            final Super_1 $tmp565 = sup6200000.match(Super_1.class);
            if($tmp565 != null)
            { 
              final A_Obj o9100000 = $tmp565.get_1();
              final lookupField_3 lifted_19390000 = new lookupField_3(this.getSourceInfo(), o9100000, c23700000, f9100000);
              final R_default_Int $tmp566 = lifted_19390000.exec_default(this_120700, env_128400, c_133300, store_128400);
              final int lifted_2111000 = $tmp566.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_220300 = $tmp566.get_1();
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27900 = store_220300;
              final int result_out27900 = lifted_2111000;
              return new R_default_Int(result_out27900, store_out27900);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("lookupField", 3), _1.toStrategoTerm(factory), factory.makeString(_2), factory.makeString(_3));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}