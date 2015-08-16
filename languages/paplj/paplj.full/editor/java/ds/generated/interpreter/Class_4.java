package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Class_4 extends A_Class 
{ 
  public String _1;

  @Child public A_Extends _2;

  @Children public L_A_Field _3;

  @Children public L_A_Method _4;

  public Class_4 (INodeSource source, String _1, A_Extends _2, L_A_Field _3, L_A_Method _4) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChild(_2);
    this._3 = adoptChildren(_3);
    this._4 = adoptChildren(_4);
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
    final Class_4 other = (Class_4)obj;
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
      { 
        L_A_Field _3_list = _3;
        while(!_3_list.isEmpty())
        { 
          A_Field _3_elem = _3_list.head();
          if(_3_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_3_elem).specialize(depth);
          }
          _3_list = _3_list.tail();
        }
      }
      { 
        L_A_Method _4_list = _4;
        while(!_4_list.isEmpty())
        { 
          A_Method _4_elem = _4_list.head();
          if(_4_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_4_elem).specialize(depth);
          }
          _4_list = _4_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public String get_1()
  { 
    return this._1;
  }

  public A_Extends get_2()
  { 
    return this._2;
  }

  public L_A_Field get_3()
  { 
    return this._3;
  }

  public L_A_Method get_4()
  { 
    return this._4;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Class", 4), TermUtils.termFromString(_1, factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory), _4.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}