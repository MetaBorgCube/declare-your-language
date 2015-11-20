package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class If_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  @Child public A_Expr _3;

  public If_3 (INodeSource source, A_Expr _1, A_Expr _2, A_Expr _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
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
    final If_3 other = (If_3)obj;
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
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27200 = _2;
    final A_This this_in24200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27200 = _4;
    final A_Expr lifted_44650000 = this._1;
    final A_Expr lifted_43390000 = this._2;
    final A_Expr e530000000 = this._3;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126100 = l_string_class_in25000;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127600 = l_string_v_in27200;
      final A_This this_124900 = this_in24200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127600 = l_int_v_in27200;
      final R_default_V $tmp1068 = lifted_44650000.exec_default(l_string_class_126100, l_string_v_127600, this_124900, l_int_v_127600);
      final A_V lifted_4601000 = $tmp1068.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220500 = $tmp1068.get_1();
      final BoolV_1 $tmp1069 = lifted_4601000.match(BoolV_1.class);
      if($tmp1069 != null)
      { 
        final boolean lifted_44660000 = $tmp1069.get_1();
        if(lifted_44660000 == true)
        { 
          final R_default_V $tmp1070 = lifted_43390000.exec_default(l_string_class_126100, l_string_v_127600, this_124900, l_int_v_220500);
          final A_V lifted_4599000 = $tmp1070.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313200 = $tmp1070.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27100 = l_int_v_313200;
          final A_V result_out54900 = lifted_4599000;
          return new R_default_V(result_out54900, l_int_v_out27100);
        }
        else
        { 
          if(lifted_44660000 == false)
          { 
            final R_default_V $tmp1071 = e530000000.exec_default(l_string_class_126100, l_string_v_127600, this_124900, l_int_v_220500);
            final A_V lifted_4602000 = $tmp1071.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313300 = $tmp1071.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27100 = l_int_v_313300;
            final A_V result_out54900 = lifted_4602000;
            return new R_default_V(result_out54900, l_int_v_out27100);
          }
          else
          { }
        }
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  public A_Expr get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("If", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}