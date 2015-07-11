package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class ObjV_4 extends A_Obj 
{ 
  public String _1;

  @Child public A_Super _2;

  public com.github.krukow.clj_ds.PersistentMap<String, Integer> _3;

  public com.github.krukow.clj_ds.PersistentMap<String, A_Method> _4;

  public ObjV_4 (INodeSource source, String _1, A_Super _2, com.github.krukow.clj_ds.PersistentMap<String, Integer> _3, com.github.krukow.clj_ds.PersistentMap<String, A_Method> _4) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChild(_2);
    this._3 = _3;
    this._4 = _4;
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
    final ObjV_4 other = (ObjV_4)obj;
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
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public String get_1()
  { 
    return this._1;
  }

  public A_Super get_2()
  { 
    return this._2;
  }

  public com.github.krukow.clj_ds.PersistentMap<String, Integer> get_3()
  { 
    return this._3;
  }

  public com.github.krukow.clj_ds.PersistentMap<String, A_Method> get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("ObjV", 4), factory.makeString(_1), _2.toStrategoTerm(factory), AutoMapUtils.toStrategoTerm_FM(_3, factory), AutoMapUtils.toStrategoTerm_MM(_4, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}