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
    final A_This this_in2800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2800 = _4;
    final L_A_Bind lifted_940000 = this._1;
    final A_Expr e3000000 = this._2;
    { 
      final A_This this_12900 = this_in2800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12900 = env_in2800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12810 = c_in2800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12900 = store_in2800;
      if(lifted_940000 != null && lifted_940000.equals(new NIL(this.getSourceInfo())))
      { 
        final R_default_V $tmp72 = e3000000.exec_default(this_12900, env_12900, c_12810, store_12900);
        final A_V v4300000 = $tmp72.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22300 = $tmp72.get_1();
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2800 = store_22300;
        final A_V result_out2800 = v4300000;
        return new R_default_V(result_out2800, store_out2800);
      }
      else
      { 
        if(lifted_940000 != null && !lifted_940000.isEmpty())
        { 
          final A_Bind lifted_950000 = lifted_940000.head();
          final L_A_Bind binds300000 = lifted_940000.tail();
          final Bind_3 $tmp73 = lifted_950000.match(Bind_3.class);
          if($tmp73 != null)
          { 
            final A_Type lifted_711000 = $tmp73.get_1();
            final String x2000000 = $tmp73.get_2();
            final A_Expr lifted_990000 = $tmp73.get_3();
            final R_default_V $tmp74 = lifted_990000.exec_default(this_12900, env_12900, c_12810, store_12900);
            final A_V v4400000 = $tmp74.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22400 = $tmp74.get_1();
            final bindVar_2 lifted_960000 = new bindVar_2(this.getSourceInfo(), x2000000, v4400000);
            final Let_2 lifted_970000 = new Let_2(this.getSourceInfo(), binds300000, e3000000);
            final R_default_Env $tmp75 = lifted_960000.exec_default(this_12900, env_12900, c_12810, store_22400);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_256000 = $tmp75.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31600 = $tmp75.get_1();
            final R_default_V $tmp76 = lifted_970000.exec_default(this_12900, lifted_256000, c_12810, store_31600);
            final A_V v_600000 = $tmp76.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_4200 = $tmp76.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2800 = store_4200;
            final A_V result_out2800 = v_600000;
            return new R_default_V(result_out2800, store_out2800);
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