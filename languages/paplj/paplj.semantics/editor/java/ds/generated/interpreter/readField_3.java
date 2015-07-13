package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class readField_3 extends A_readField__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public String _3;

  public readField_3 (INodeSource source, A_Obj _1, String _2, String _3) 
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
    final readField_3 other = (readField_3)obj;
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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25100 = _3;
    final A_Obj o6500000 = this._1;
    final String c12400000 = this._2;
    final String f6600000 = this._3;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125500 = env_in25100;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129900 = c_in25100;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125500 = store_in25100;
    final lookupField_3 lifted_17090000 = new lookupField_3(this.getSourceInfo(), o6500000, c12400000, f6600000);
    final R_default_Int $tmp517 = lifted_17090000.exec_default(env_125500, c_129900, store_125500);
    final int lifted_1812000 = $tmp517.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218400 = $tmp517.get_1();
    final read_1 lifted_17080000 = new read_1(this.getSourceInfo(), lifted_1812000);
    final R_default_V $tmp518 = lifted_17080000.exec_default(env_125500, c_129900, store_218400);
    final A_V lifted_1814000 = $tmp518.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_311800 = $tmp518.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25100 = store_311800;
    final A_V result_out25100 = lifted_1814000;
    return new R_default_V(result_out25100, store_out25100);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("readField", 3), _1.toStrategoTerm(factory), factory.makeString(_2), factory.makeString(_3));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}