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
    final A_This this_in19900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in28100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in28100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in28100 = _4;
    final A_Obj lifted_19320000 = this._1;
    final String name4400000 = this._2;
    { 
      { 
        final A_This this_120800 = this_in19900;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_128500 = env_in28100;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_133400 = c_in28100;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_128500 = store_in28100;
        final ObjV_4 $tmp567 = lifted_19320000.match(ObjV_4.class);
        if($tmp567 != null)
        { 
          final String c16900000 = $tmp567.get_1();
          final A_Super sup5800000 = $tmp567.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_18440000 = $tmp567.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms5800000 = $tmp567.get_4();
          final A_Method m5100000 = ms5800000.get(name4400000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28100 = store_128500;
          final A_Method result_out28100 = m5100000;
          return new R_default_Method(result_out28100, store_out28100);
        }
        else
        { }
      }
      { 
        final A_This this_120900 = this_in19900;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_128600 = env_in28100;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_133500 = c_in28100;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_128600 = store_in28100;
        final ObjV_4 $tmp568 = lifted_19320000.match(ObjV_4.class);
        if($tmp568 != null)
        { 
          final String c17100000 = $tmp568.get_1();
          final A_Super sup5900000 = $tmp568.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_18450000 = $tmp568.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms5900000 = $tmp568.get_4();
          final Super_1 $tmp569 = sup5900000.match(Super_1.class);
          if($tmp569 != null)
          { 
            final A_Obj o8900000 = $tmp569.get_1();
            final lookupMethod_2 lifted_19340000 = new lookupMethod_2(this.getSourceInfo(), o8900000, name4400000);
            final R_default_Method $tmp570 = lifted_19340000.exec_default(this_120900, env_128600, c_133500, store_128600);
            final A_Method lifted_2109000 = $tmp570.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_220400 = $tmp570.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out28100 = store_220400;
            final A_Method result_out28100 = lifted_2109000;
            return new R_default_Method(result_out28100, store_out28100);
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