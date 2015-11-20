package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class bindVars_2 extends A_bindVars__Arrow 
{ 
  public L_String _1;

  @Children public L_A_V _2;

  public bindVars_2 (INodeSource source, L_String _1, L_A_V _2) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChildren(_2);
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
    final bindVars_2 other = (bindVars_2)obj;
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
        L_A_V _2_list = _2;
        while(!_2_list.isEmpty())
        { 
          A_V _2_elem = _2_list.head();
          if(_2_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_2_elem).specialize(depth);
          }
          _2_list = _2_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public R_default_Map_String_V_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in26200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28400 = _2;
    final A_This this_in25500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28400 = _4;
    final L_String lifted_45030000 = this._1;
    final L_A_V lifted_45040000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127300 = l_string_class_in26200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128600 = l_string_v_in28400;
      final A_This this_126200 = this_in25500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128800 = l_int_v_in28400;
      if(lifted_45030000 != null && lifted_45030000.equals(new NIL(this.getSourceInfo())))
      { 
        if(lifted_45040000 != null && lifted_45040000.equals(new NIL(this.getSourceInfo())))
        { 
          final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_45020000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_45010000 = (com.github.krukow.clj_ds.PersistentMap<String, A_V>)lifted_45020000;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28300 = l_int_v_128800;
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out56100 = lifted_45010000;
          return new R_default_Map_String_V_(result_out56100, l_int_v_out28300);
        }
        else
        { }
      }
      else
      { 
        if(lifted_45030000 != null && !lifted_45030000.isEmpty())
        { 
          final String x595000000 = lifted_45030000.head();
          final L_String xs187000000 = lifted_45030000.tail();
          if(lifted_45040000 != null && !lifted_45040000.isEmpty())
          { 
            final A_V v1188000000 = lifted_45040000.head();
            final L_A_V vs150000000 = lifted_45040000.tail();
            final bindVars_2 lifted_45070000 = new bindVars_2(this.getSourceInfo(), xs187000000, vs150000000);
            final R_default_Map_String_V_ $tmp1102 = lifted_45070000.exec_default(l_string_class_127300, l_string_v_128600, this_126200, l_int_v_128800);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> E47000000 = $tmp1102.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221500 = $tmp1102.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_45090000 = new com.github.krukow.clj_lang.PersistentTreeMap<String, A_V>().plus(x595000000, v1188000000);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_45050000 = MapUtils.plus(E47000000, lifted_45090000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28300 = l_int_v_221500;
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out56100 = lifted_45050000;
            return new R_default_Map_String_V_(result_out56100, l_int_v_out28300);
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

  public L_String get_1()
  { 
    return this._1;
  }

  public L_A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("bindVars", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}