package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Get_3 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Type _2;

  public String _3;

  public Get_3 (INodeSource source, A_Expr _1, A_Type _2, String _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
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
    final Get_3 other = (Get_3)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in22200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30200 = _4;
    final A_Expr lifted_19940000 = this._1;
    final A_Type lifted_19950000 = this._2;
    final String f9300000 = this._3;
    { 
      final A_This this_123200 = this_in22200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130700 = env_in30200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_136300 = c_in30200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130700 = store_in30200;
      final R_default_V $tmp618 = lifted_19940000.exec_default(this_123200, env_130700, c_136300, store_130700);
      final A_V lifted_2141000 = $tmp618.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222400 = $tmp618.get_1();
      final o2v_1 $tmp619 = lifted_2141000.match(o2v_1.class);
      if($tmp619 != null)
      { 
        final A_Obj o9200000 = $tmp619.get_1();
        final ClassT_1 $tmp620 = lifted_19950000.match(ClassT_1.class);
        if($tmp620 != null)
        { 
          final String c17800000 = $tmp620.get_1();
          final readField_3 lifted_19960000 = new readField_3(this.getSourceInfo(), o9200000, c17800000, f9300000);
          final R_default_V $tmp621 = lifted_19960000.exec_default(this_123200, env_130700, c_136300, store_222400);
          final A_V lifted_2143000 = $tmp621.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_314300 = $tmp621.get_1();
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30200 = store_314300;
          final A_V result_out30200 = lifted_2143000;
          return new R_default_V(result_out30200, store_out30200);
        }
        else
        { }
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

  public A_Type get_2()
  { 
    return this._2;
  }

  public String get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Get", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), factory.makeString(_3));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}