package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class lookupMethod_2 extends A_lookupMethod__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public lookupMethod_2 (INodeSource source, A_Obj _1, String _2) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
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
    final lookupMethod_2 other = (lookupMethod_2)obj;
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
      hasSpecialized = true;
    }
  }

  public R_default_Method exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in23500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25700 = _2;
    final A_This this_in22400 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25700 = _4;
    final A_Obj lifted_44070000 = this._1;
    final String name512000000 = this._2;
    { 
      { 
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124500 = l_string_class_in23500;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126000 = l_string_v_in25700;
        final A_This this_123200 = this_in22400;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126000 = l_int_v_in25700;
        final ObjV_4 $tmp1031 = lifted_44070000.match(ObjV_4.class);
        if($tmp1031 != null)
        { 
          final String c1266000000 = $tmp1031.get_1();
          final A_Super sup228000000 = $tmp1031.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_43270000 = $tmp1031.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms228000000 = $tmp1031.get_4();
          final A_Method m172000000 = ms228000000.get(name512000000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25600 = l_int_v_126000;
          final A_Method result_out53400 = m172000000;
          return new R_default_Method(result_out53400, l_int_v_out25600);
        }
        else
        { }
      }
      { 
        final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_124600 = l_string_class_in23500;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_126100 = l_string_v_in25700;
        final A_This this_123300 = this_in22400;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_126100 = l_int_v_in25700;
        final ObjV_4 $tmp1032 = lifted_44070000.match(ObjV_4.class);
        if($tmp1032 != null)
        { 
          final String c1267000000 = $tmp1032.get_1();
          final A_Super sup229000000 = $tmp1032.get_2();
          final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_43280000 = $tmp1032.get_3();
          final com.github.krukow.clj_ds.PersistentMap<String, A_Method> ms229000000 = $tmp1032.get_4();
          final Super_1 $tmp1033 = sup229000000.match(Super_1.class);
          if($tmp1033 != null)
          { 
            final A_Obj o604000000 = $tmp1033.get_1();
            final lookupMethod_2 lifted_44090000 = new lookupMethod_2(this.getSourceInfo(), o604000000, name512000000);
            final R_default_Method $tmp1034 = lifted_44090000.exec_default(l_string_class_124600, l_string_v_126100, this_123300, l_int_v_126100);
            final A_Method lifted_4575000 = $tmp1034.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_219300 = $tmp1034.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out25600 = l_int_v_219300;
            final A_Method result_out53400 = lifted_4575000;
            return new R_default_Method(result_out53400, l_int_v_out25600);
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

  public A_Obj get_1()
  { 
    return this._1;
  }

  public String get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("lookupMethod", 2), _1.toStrategoTerm(factory), TermUtils.termFromString(_2, factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}