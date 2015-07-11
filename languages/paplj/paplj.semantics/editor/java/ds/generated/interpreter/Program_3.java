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

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in1110 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in1110 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in1110 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in1110 = _4;
    final String lifted_00000 = this._1;
    final L_A_Class cs600000 = this._2;
    final A_Expr e2800000 = this._3;
    final A_This this_11200 = this_in1110;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_11200 = env_in1110;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11110 = c_in1110;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_11200 = store_in1110;
    final initClasses_1 lifted_470000 = new initClasses_1(this.getSourceInfo(), cs600000);
    final R_default_C $tmp30 = lifted_470000.exec_default(this_11200, env_11200, c_11110, store_11200);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_228000 = $tmp30.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2900 = $tmp30.get_1();
    final R_default_V $tmp31 = e2800000.exec_default(this_11200, env_11200, lifted_228000, store_2900);
    final A_V v4200000 = $tmp31.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3500 = $tmp31.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out1110 = store_3500;
    final A_V result_out1110 = v4200000;
    return new R_default_V(result_out1110, store_out1110);
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