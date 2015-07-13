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
    final A_This this_in21800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in29800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in29800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in29800 = _4;
    final A_Block lifted_2153000 = this._1;
    { 
      final A_This this_122800 = this_in21800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_130400 = env_in29800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_135900 = c_in29800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_130400 = store_in29800;
      final Do_1 $tmp608 = lifted_2153000.match(Do_1.class);
      if($tmp608 != null)
      { 
        final L_A_Seq lifted_20090000 = $tmp608.get_1();
        if(lifted_20090000 != null && lifted_20090000.equals(new NIL(this.getSourceInfo())))
        { 
          final U_0 lifted_20050000 = new U_0(this.getSourceInfo());
          final u2v_1 lifted_2148000 = new u2v_1(this.getSourceInfo(), lifted_20050000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29800 = store_130400;
          final A_V result_out29800 = lifted_2148000;
          return new R_default_V(result_out29800, store_out29800);
        }
        else
        { 
          if(lifted_20090000 != null && !lifted_20090000.isEmpty())
          { 
            final A_Seq lifted_20120000 = lifted_20090000.head();
            final L_A_Seq stats700000 = lifted_20090000.tail();
            final expr2seq_1 $tmp609 = lifted_20120000.match(expr2seq_1.class);
            if($tmp609 != null)
            { 
              final A_Expr lifted_2154000 = $tmp609.get_1();
              final R_default_V $tmp610 = lifted_2154000.exec_default(this_122800, env_130400, c_135900, store_130400);
              final A_V v15800000 = $tmp610.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_221900 = $tmp610.get_1();
              if(stats700000 != null && stats700000.equals(new NIL(this.getSourceInfo())))
              { 
                final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29800 = store_221900;
                final A_V result_out29800 = v15800000;
                return new R_default_V(result_out29800, store_out29800);
              }
              else
              { 
                if(stats700000 != null && !stats700000.isEmpty())
                { 
                  final A_Seq lifted_18580000 = stats700000.head();
                  final L_A_Seq lifted_18590000 = stats700000.tail();
                  final Do_1 lifted_20110000 = new Do_1(this.getSourceInfo(), stats700000);
                  final block2expr_1 lifted_2157000 = new block2expr_1(this.getSourceInfo(), lifted_20110000);
                  final R_default_V $tmp611 = lifted_2157000.exec_default(this_122800, env_130400, c_135900, store_221900);
                  final A_V lifted_2156000 = $tmp611.value;
                  final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_314100 = $tmp611.get_1();
                  final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out29800 = store_314100;
                  final A_V result_out29800 = lifted_2156000;
                  return new R_default_V(result_out29800, store_out29800);
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