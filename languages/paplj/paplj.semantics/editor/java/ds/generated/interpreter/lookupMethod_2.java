package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class lookupMethod_2 extends A_lookupMethod__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public lookupMethod_2 (INodeSource source, A_Obj _1, String _2) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
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
    final lookupMethod_2 other = (lookupMethod_2)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_Method exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in1000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1000 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1000 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1000 = _4;
    final A_Obj lifted_820000 = this._1;
    final String name900000 = this._2;
    { 
      { 
        final A_This this_11000 = this_in1000;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11000 = env_in1000;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_1900 = c_in1000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11000 = store_in1000;
        final ObjV_4 $tmp26 = lifted_820000.match(ObjV_4.class);
        if($tmp26 != null)
        { 
          final String c4500000 = $tmp26.get_1();
          final A_Super sup1200000 = $tmp26.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_311000 = $tmp26.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms1200000 = $tmp26.get_4();
          final A_Method m1200000 = ms1200000.get(name900000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1000 = store_11000;
          final A_Method result_out1000 = m1200000;
          return new R_default_Method(result_out1000, store_out1000);
        }
        else
        { }
      }
      { 
        final A_This this_11110 = this_in1000;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11110 = env_in1000;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11010 = c_in1000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11110 = store_in1000;
        final ObjV_4 $tmp27 = lifted_820000.match(ObjV_4.class);
        if($tmp27 != null)
        { 
          final String c4600000 = $tmp27.get_1();
          final A_Super sup1300000 = $tmp27.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_411000 = $tmp27.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms1300000 = $tmp27.get_4();
          final Super_1 $tmp28 = sup1300000.match(Super_1.class);
          if($tmp28 != null)
          { 
            final A_Obj o2800000 = $tmp28.get_1();
            final lookupMethod_2 lifted_840000 = new lookupMethod_2(this.getSourceInfo(), o2800000, name900000);
            final R_default_Method $tmp29 = lifted_840000.exec_default(this_11110, env_11110, c_11010, store_11110);
            final A_Method lifted_251000 = $tmp29.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2800 = $tmp29.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1000 = store_2800;
            final A_Method result_out1000 = lifted_251000;
            return new R_default_Method(result_out1000, store_out1000);
          }
          else
          { }
        }
        else
        { }
      }
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

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("lookupMethod", 2), _1.toStrategoTerm(factory), factory.makeString(_2));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}