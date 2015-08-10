package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class Let_2 extends A_Expr 
{ 
  @Children public L_A_Bind _1;

  @Child public A_Expr _2;

  public Let_2 (INodeSource source, L_A_Bind _1, A_Expr _2) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChildren(_1);
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
    final Let_2 other = (Let_2)obj;
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
      { 
        L_A_Bind _1_list = _1;
        while(!_1_list.isEmpty())
        { 
          A_Bind _1_elem = _1_list.head();
          if(_1_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_1_elem).specialize(depth);
          }
          _1_list = _1_list.tail();
        }
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
    final A_This this_in22100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30100 = _4;
    final L_A_Bind lifted_19450000 = this._1;
    final A_Expr e7200000 = this._2;
    { 
      final A_This this_123100 = this_in22100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130600 = env_in30100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_136200 = c_in30100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130600 = store_in30100;
      if(lifted_19450000 != null && lifted_19450000.equals(new NIL(this.getSourceInfo())))
      { 
        final R_default_V $tmp613 = e7200000.exec_default(this_123100, env_130600, c_136200, store_130600);
        final A_V v15400000 = $tmp613.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222200 = $tmp613.get_1();
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30100 = store_222200;
        final A_V result_out30100 = v15400000;
        return new R_default_V(result_out30100, store_out30100);
      }
      else
      { 
        if(lifted_19450000 != null && !lifted_19450000.isEmpty())
        { 
          final A_Bind lifted_19460000 = lifted_19450000.head();
          final L_A_Bind binds700000 = lifted_19450000.tail();
          final Bind_3 $tmp614 = lifted_19460000.match(Bind_3.class);
          if($tmp614 != null)
          { 
            final A_Type lifted_18480000 = $tmp614.get_1();
            final String x51300000 = $tmp614.get_2();
            final A_Expr lifted_19510000 = $tmp614.get_3();
            final R_default_V $tmp615 = lifted_19510000.exec_default(this_123100, env_130600, c_136200, store_130600);
            final A_V v15500000 = $tmp615.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222300 = $tmp615.get_1();
            final bindVar_2 lifted_19470000 = new bindVar_2(this.getSourceInfo(), x51300000, v15500000);
            final Let_2 lifted_19480000 = new Let_2(this.getSourceInfo(), binds700000, e7200000);
            final R_default_Env $tmp616 = lifted_19470000.exec_default(this_123100, env_130600, c_136200, store_222300);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_2114000 = $tmp616.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_314200 = $tmp616.get_1();
            final R_default_V $tmp617 = lifted_19480000.exec_default(this_123100, lifted_2114000, c_136200, store_314200);
            final A_V v_1400000 = $tmp617.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_43100 = $tmp617.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30100 = store_43100;
            final A_V result_out30100 = v_1400000;
            return new R_default_V(result_out30100, store_out30100);
          }
          else
          { }
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public L_A_Bind get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Let", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}