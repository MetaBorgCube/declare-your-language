package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class block2expr_1 extends A_Expr 
{ 
  @Child public A_Block _1;

  public block2expr_1 (INodeSource source, A_Block _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final block2expr_1 other = (block2expr_1)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in2600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2600 = _4;
    final A_Block lifted_298000 = this._1;
    { 
      final A_This this_12700 = this_in2600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12700 = env_in2600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12600 = c_in2600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12700 = store_in2600;
      final Do_1 $tmp67 = lifted_298000.match(Do_1.class);
      if($tmp67 != null)
      { 
        final L_A_Seq lifted_1520000 = $tmp67.get_1();
        if(lifted_1520000 != null && lifted_1520000.equals(new NIL(this.getSourceInfo())))
        { 
          final U_0 lifted_1480000 = new U_0(this.getSourceInfo());
          final u2v_1 lifted_293000 = new u2v_1(this.getSourceInfo(), lifted_1480000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2600 = store_12700;
          final A_V result_out2600 = lifted_293000;
          return new R_default_V(result_out2600, store_out2600);
        }
        else
        { 
          if(lifted_1520000 != null && !lifted_1520000.isEmpty())
          { 
            final A_Seq lifted_1540000 = lifted_1520000.head();
            final L_A_Seq stats300000 = lifted_1520000.tail();
            final expr2seq_1 $tmp68 = lifted_1540000.match(expr2seq_1.class);
            if($tmp68 != null)
            { 
              final A_Expr lifted_299000 = $tmp68.get_1();
              final R_default_V $tmp69 = lifted_299000.exec_default(this_12700, env_12700, c_12600, store_12700);
              final A_V v4700000 = $tmp69.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22110 = $tmp69.get_1();
              if(stats300000 != null && stats300000.equals(new NIL(this.getSourceInfo())))
              { 
                final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2600 = store_22110;
                final A_V result_out2600 = v4700000;
                return new R_default_V(result_out2600, store_out2600);
              }
              else
              { 
                if(stats300000 != null && !stats300000.isEmpty())
                { 
                  final A_Seq lifted_1610000 = stats300000.head();
                  final L_A_Seq lifted_1710000 = stats300000.tail();
                  final Do_1 lifted_1530000 = new Do_1(this.getSourceInfo(), stats300000);
                  final block2expr_1 lifted_303000 = new block2expr_1(this.getSourceInfo(), lifted_1530000);
                  final R_default_V $tmp70 = lifted_303000.exec_default(this_12700, env_12700, c_12600, store_22110);
                  final A_V lifted_302000 = $tmp70.value;
                  final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31500 = $tmp70.get_1();
                  final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2600 = store_31500;
                  final A_V result_out2600 = lifted_302000;
                  return new R_default_V(result_out2600, store_out2600);
                }
                else
                { }
              }
            }
            else
            { }
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

  public A_Block get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("block2expr", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}