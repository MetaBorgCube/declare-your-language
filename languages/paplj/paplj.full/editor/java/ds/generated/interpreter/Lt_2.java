package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Lt_2 extends A_Expr 
{ 
  @Child public A_Expr _1;

  @Child public A_Expr _2;

  public Lt_2 (INodeSource source, A_Expr _1, A_Expr _2) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = adoptChild(_2);
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
    final Lt_2 other = (Lt_2)obj;
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
    final A_This this_in21600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29600 = _4;
    final A_Expr lifted_19270000 = this._1;
    final A_Expr lifted_19280000 = this._2;
    { 
      final A_This this_122600 = this_in21600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130200 = env_in29600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_135300 = c_in29600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130200 = store_in29600;
      final R_default_V $tmp600 = lifted_19270000.exec_default(this_122600, env_130200, c_135300, store_130200);
      final A_V lifted_2108000 = $tmp600.value;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221700 = $tmp600.get_1();
      final NumV_1 $tmp601 = lifted_2108000.match(NumV_1.class);
      if($tmp601 != null)
      { 
        final int i6700000 = $tmp601.get_1();
        final R_default_V $tmp602 = lifted_19280000.exec_default(this_122600, env_130200, c_135300, store_221700);
        final A_V lifted_2107000 = $tmp602.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_313700 = $tmp602.get_1();
        final NumV_1 $tmp603 = lifted_2107000.match(NumV_1.class);
        if($tmp603 != null)
        { 
          final int j4400000 = $tmp603.get_1();
          final boolean lifted_19310000 = ds.manual.interpreter.Natives.gtI_2(j4400000, i6700000);
          final BoolV_1 lifted_19290000 = new BoolV_1(this.getSourceInfo(), lifted_19310000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29600 = store_313700;
          final A_V result_out29600 = lifted_19290000;
          return new R_default_V(result_out29600, store_out29600);
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

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Lt", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}