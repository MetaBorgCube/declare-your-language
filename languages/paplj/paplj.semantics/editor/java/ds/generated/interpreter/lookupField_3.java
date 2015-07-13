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

  public R_default_Int exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25300 = _3;
    final A_Obj lifted_17230000 = this._1;
    final String c23100000 = this._2;
    final String f6800000 = this._3;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125700 = env_in25300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130300 = c_in25300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125700 = store_in25300;
      final ObjV_4 $tmp521 = lifted_17230000.match(ObjV_4.class);
      if($tmp521 != null)
      { 
        final String c13200000 = $tmp521.get_1();
        final A_Super sup4800000 = $tmp521.get_2();
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> fs4600000 = $tmp521.get_3();
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_16870000 = $tmp521.get_4();
        if(c13200000 != null && c13200000.equals(c23100000))
        { 
          final int lifted_17220000 = fs4600000.get(f6800000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25300 = store_125700;
          final int result_out25300 = lifted_17220000;
          return new R_default_Int(result_out25300, store_out25300);
        }
        else
        { 
          if(c13200000 != null && c13200000.equals(c23100000))
          { }
          else
          { 
            final Super_1 $tmp522 = sup4800000.match(Super_1.class);
            if($tmp522 != null)
            { 
              final A_Obj o6700000 = $tmp522.get_1();
              final lookupField_3 lifted_17240000 = new lookupField_3(this.getSourceInfo(), o6700000, c23100000, f6800000);
              final R_default_Int $tmp523 = lifted_17240000.exec_default(env_125700, c_130300, store_125700);
              final int lifted_1820000 = $tmp523.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218600 = $tmp523.get_1();
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25300 = store_218600;
              final int result_out25300 = lifted_1820000;
              return new R_default_Int(result_out25300, store_out25300);
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
      return super.exec_default(_1, _2, _3);
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