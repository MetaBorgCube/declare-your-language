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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25800 = _2;
    final A_This this_in22500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25800 = _4;
    final String lifted_43240000 = this._1;
    final L_A_Class cs320000000 = this._2;
    final A_Expr e526000000 = this._3;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124700 = l_string_class_in23600;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126200 = l_string_v_in25800;
    final A_This this_123400 = this_in22500;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126200 = l_int_v_in25800;
    final initClasses_1 lifted_43720000 = new initClasses_1(this.getSourceInfo(), cs320000000);
    final R_default_Map_String_Class_ $tmp1035 = lifted_43720000.exec_default(l_string_class_124700, l_string_v_126200, this_123400, l_int_v_126200);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> lifted_4555000 = $tmp1035.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219400 = $tmp1035.get_1();
    final R_default_V $tmp1036 = e526000000.exec_default(lifted_4555000, l_string_v_126200, this_123400, l_int_v_219400);
    final A_V v1182000000 = $tmp1036.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_312200 = $tmp1036.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25700 = l_int_v_312200;
    final A_V result_out53500 = v1182000000;
    return new R_default_V(result_out53500, l_int_v_out25700);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Program", 3), TermUtils.termFromString(_1, factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}