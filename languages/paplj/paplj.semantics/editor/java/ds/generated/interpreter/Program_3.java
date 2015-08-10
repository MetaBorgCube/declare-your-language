package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Program_3 extends A_Program 
{ 
  public String _1;

  @Children public L_A_Class _2;

  @Child public A_Expr _3;

  public Program_3 (INodeSource source, String _1, L_A_Class _2, A_Expr _3) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChildren(_2);
    this._3 = adoptChild(_3);
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
    final Program_3 other = (Program_3)obj;
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
      { 
        L_A_Class _2_list = _2;
        while(!_2_list.isEmpty())
        { 
          A_Class _2_elem = _2_list.head();
          if(_2_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_2_elem).specialize(depth);
          }
          _2_list = _2_list.tail();
        }
      }
      if(_3 instanceof IGenericNode)
      { 
        ((IGenericNode)_3).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in25500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in25500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in25500 = _3;
    final String lifted_16830000 = this._1;
    final L_A_Class cs2300000 = this._2;
    final A_Expr e5400000 = this._3;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126100 = env_in25500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_130600 = c_in25500;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_126100 = store_in25500;
    final initClasses_1 lifted_17120000 = new initClasses_1(this.getSourceInfo(), cs2300000);
    final R_default_C $tmp528 = lifted_17120000.exec_default(env_126100, c_130600, store_126100);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_1816000 = $tmp528.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218800 = $tmp528.get_1();
    final R_default_V $tmp529 = e5400000.exec_default(env_126100, lifted_1816000, store_218800);
    final A_V v11500000 = $tmp529.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312100 = $tmp529.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out25500 = store_312100;
    final A_V result_out25500 = v11500000;
    return new R_default_V(result_out25500, store_out25500);
  }

  public String get_1()
  { 
    return this._1;
  }

  public L_A_Class get_2()
  { 
    return this._2;
  }

  public A_Expr get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Program", 3), factory.makeString(_1), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}