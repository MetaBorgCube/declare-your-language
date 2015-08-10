package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class writeField_4 extends A_writeField__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public String _3;

  @Child public A_V _4;

  public writeField_4 (INodeSource source, A_Obj _1, String _2, String _3, A_V _4) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
    this._3 = _3;
    this._4 = adoptChild(_4);
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
    final writeField_4 other = (writeField_4)obj;
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
    if(_4 == null)
    { 
      if(other._4 != null)
      { 
        return false;
      }
    }
    else
      if(!_4.equals(other._4))
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
      if(_4 instanceof IGenericNode)
      { 
        ((IGenericNode)_4).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in19700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27800 = _4;
    final A_Obj o8500000 = this._1;
    final String c16500000 = this._2;
    final String f8600000 = this._3;
    final A_V v14900000 = this._4;
    final A_This this_120600 = this_in19700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_128300 = env_in27800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_133200 = c_in27800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_128300 = store_in27800;
    final lookupField_3 lifted_18710000 = new lookupField_3(this.getSourceInfo(), o8500000, c16500000, f8600000);
    final R_default_Int $tmp562 = lifted_18710000.exec_default(this_120600, env_128300, c_133200, store_128300);
    final int lifted_2066000 = $tmp562.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_220200 = $tmp562.get_1();
    final write_2 lifted_18690000 = new write_2(this.getSourceInfo(), lifted_2066000, v14900000);
    final R_default_V $tmp563 = lifted_18690000.exec_default(this_120600, env_128300, c_133200, store_220200);
    final A_V lifted_2068000 = $tmp563.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312800 = $tmp563.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27800 = store_312800;
    final A_V result_out27800 = lifted_2068000;
    return new R_default_V(result_out27800, store_out27800);
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

  public A_V get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("writeField", 4), _1.toStrategoTerm(factory), factory.makeString(_2), factory.makeString(_3), _4.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}