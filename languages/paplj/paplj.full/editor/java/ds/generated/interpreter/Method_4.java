package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Method_4 extends A_Method 
{ 
  @Child public A_Type _1;

  public String _2;

  @Children public L_A_Param _3;

  @Child public A_Block _4;

  public Method_4 (INodeSource source, A_Type _1, String _2, L_A_Param _3, A_Block _4) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
    this._3 = adoptChildren(_3);
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
    final Method_4 other = (Method_4)obj;
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
      { 
        L_A_Param _3_list = _3;
        while(!_3_list.isEmpty())
        { 
          A_Param _3_elem = _3_list.head();
          if(_3_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_3_elem).specialize(depth);
          }
          _3_list = _3_list.tail();
        }
      }
      if(_4 instanceof IGenericNode)
      { 
        ((IGenericNode)_4).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public A_Type get_1()
  { 
    return this._1;
  }

  public String get_2()
  { 
    return this._2;
  }

  public L_A_Param get_3()
  { 
    return this._3;
  }

  public A_Block get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Method", 4), _1.toStrategoTerm(factory), factory.makeString(_2), _3.toStrategoTerm(factory), _4.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}