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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25200 = _3;
    final A_Obj o6400000 = this._1;
    final String c11900000 = this._2;
    final String f6500000 = this._3;
    final A_V v11300000 = this._4;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125600 = env_in25200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130200 = c_in25200;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125600 = store_in25200;
    final lookupField_3 lifted_17010000 = new lookupField_3(this.getSourceInfo(), o6400000, c11900000, f6500000);
    final R_default_Int $tmp519 = lifted_17010000.exec_default(env_125600, c_130200, store_125600);
    final int lifted_1806000 = $tmp519.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218500 = $tmp519.get_1();
    final write_2 lifted_17000000 = new write_2(this.getSourceInfo(), lifted_1806000, v11300000);
    final R_default_V $tmp520 = lifted_17000000.exec_default(env_125600, c_130200, store_218500);
    final A_V lifted_1808000 = $tmp520.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_311900 = $tmp520.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25200 = store_311900;
    final A_V result_out25200 = lifted_1808000;
    return new R_default_V(result_out25200, store_out25200);
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