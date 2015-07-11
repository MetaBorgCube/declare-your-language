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
    final A_This this_in900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in900 = _4;
    final A_Obj lifted_880000 = this._1;
    final String c21300000 = this._2;
    final String f2500000 = this._3;
    { 
      final A_This this_1900 = this_in900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_1900 = env_in900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_1800 = c_in900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_1900 = store_in900;
      final ObjV_4 $tmp23 = lifted_880000.match(ObjV_4.class);
      if($tmp23 != null)
      { 
        final String c11500000 = $tmp23.get_1();
        final A_Super sup1500000 = $tmp23.get_2();
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> fs1300000 = $tmp23.get_3();
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_611000 = $tmp23.get_4();
        if(c11500000 != null && c11500000.equals(c21300000))
        { 
          final int lifted_870000 = fs1300000.get(f2500000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out900 = store_1900;
          final int result_out900 = lifted_870000;
          return new R_default_Int(result_out900, store_out900);
        }
        else
        { 
          if(c11500000 != null && c11500000.equals(c21300000))
          { }
          else
          { 
            final Super_1 $tmp24 = sup1500000.match(Super_1.class);
            if($tmp24 != null)
            { 
              final A_Obj o2900000 = $tmp24.get_1();
              final lookupField_3 lifted_890000 = new lookupField_3(this.getSourceInfo(), o2900000, c21300000, f2500000);
              final R_default_Int $tmp25 = lifted_890000.exec_default(this_1900, env_1900, c_1800, store_1900);
              final int lifted_253000 = $tmp25.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2700 = $tmp25.get_1();
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out900 = store_2700;
              final int result_out900 = lifted_253000;
              return new R_default_Int(result_out900, store_out900);
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