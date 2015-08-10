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

  public R_default_Method exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25400 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25400 = _3;
    final A_Obj lifted_17160000 = this._1;
    final String name3400000 = this._2;
    { 
      { 
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125800 = env_in25400;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130400 = c_in25400;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125800 = store_in25400;
        final ObjV_4 $tmp524 = lifted_17160000.match(ObjV_4.class);
        if($tmp524 != null)
        { 
          final String c12500000 = $tmp524.get_1();
          final A_Super sup4500000 = $tmp524.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_16840000 = $tmp524.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms4500000 = $tmp524.get_4();
          final A_Method m3800000 = ms4500000.get(name3400000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25400 = store_125800;
          final A_Method result_out25400 = m3800000;
          return new R_default_Method(result_out25400, store_out25400);
        }
        else
        { }
      }
      { 
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125900 = env_in25400;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130500 = c_in25400;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125900 = store_in25400;
        final ObjV_4 $tmp525 = lifted_17160000.match(ObjV_4.class);
        if($tmp525 != null)
        { 
          final String c13000000 = $tmp525.get_1();
          final A_Super sup4600000 = $tmp525.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_16850000 = $tmp525.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms4600000 = $tmp525.get_4();
          final Super_1 $tmp526 = sup4600000.match(Super_1.class);
          if($tmp526 != null)
          { 
            final A_Obj o6600000 = $tmp526.get_1();
            final lookupMethod_2 lifted_17180000 = new lookupMethod_2(this.getSourceInfo(), o6600000, name3400000);
            final R_default_Method $tmp527 = lifted_17180000.exec_default(env_125900, c_130500, store_125900);
            final A_Method lifted_1818000 = $tmp527.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218700 = $tmp527.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25400 = store_218700;
            final A_Method result_out25400 = lifted_1818000;
            return new R_default_Method(result_out25400, store_out25400);
          }
          else
          { }
        }
        else
        { }
      }
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