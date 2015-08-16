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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27300 = _2;
    final A_This this_in24300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27300 = _4;
    final A_Block lifted_4616000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126200 = l_string_class_in25100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127700 = l_string_v_in27300;
      final A_This this_125100 = this_in24300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127700 = l_int_v_in27300;
      final Do_1 $tmp1072 = lifted_4616000.match(Do_1.class);
      if($tmp1072 != null)
      { 
        final L_A_Seq lifted_44810000 = $tmp1072.get_1();
        if(lifted_44810000 != null && lifted_44810000.equals(new NIL(this.getSourceInfo())))
        { 
          final U_0 lifted_44770000 = new U_0(this.getSourceInfo());
          final u2v_1 lifted_4611000 = new u2v_1(this.getSourceInfo(), lifted_44770000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27200 = l_int_v_127700;
          final A_V result_out55000 = lifted_4611000;
          return new R_default_V(result_out55000, l_int_v_out27200);
        }
        else
        { 
          if(lifted_44810000 != null && !lifted_44810000.isEmpty())
          { 
            final A_Seq lifted_44830000 = lifted_44810000.head();
            final L_A_Seq stats61000000 = lifted_44810000.tail();
            final expr2seq_1 $tmp1073 = lifted_44830000.match(expr2seq_1.class);
            if($tmp1073 != null)
            { 
              final A_Expr lifted_4617000 = $tmp1073.get_1();
              final R_default_V $tmp1074 = lifted_4617000.exec_default(l_string_class_126200, l_string_v_127700, this_125100, l_int_v_127700);
              final A_V v1187000000 = $tmp1074.value;
              final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220600 = $tmp1074.get_1();
              if(stats61000000 != null && stats61000000.equals(new NIL(this.getSourceInfo())))
              { 
                final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27200 = l_int_v_220600;
                final A_V result_out55000 = v1187000000;
                return new R_default_V(result_out55000, l_int_v_out27200);
              }
              else
              { 
                if(stats61000000 != null && !stats61000000.isEmpty())
                { 
                  final A_Seq lifted_43400000 = stats61000000.head();
                  final L_A_Seq lifted_43410000 = stats61000000.tail();
                  final Do_1 lifted_44820000 = new Do_1(this.getSourceInfo(), stats61000000);
                  final block2expr_1 lifted_4620000 = new block2expr_1(this.getSourceInfo(), lifted_44820000);
                  final R_default_V $tmp1075 = lifted_4620000.exec_default(l_string_class_126200, l_string_v_127700, this_125100, l_int_v_220600);
                  final A_V lifted_4619000 = $tmp1075.value;
                  final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313400 = $tmp1075.get_1();
                  final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27200 = l_int_v_313400;
                  final A_V result_out55000 = lifted_4619000;
                  return new R_default_V(result_out55000, l_int_v_out27200);
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