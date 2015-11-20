package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initSuper_1 extends A_initSuper__Arrow 
{ 
  @Child public A_Extends _1;

  public initSuper_1 (INodeSource source, A_Extends _1) 
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
    final initSuper_1 other = (initSuper_1)obj;
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

  public R_default_Super exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in22800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in25000 = _2;
    final A_This this_in21500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in25000 = _4;
    final A_Extends lifted_44270000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_123800 = l_string_class_in22800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_125300 = l_string_v_in25000;
      final A_This this_122400 = this_in21500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_125300 = l_int_v_in25000;
      final NoExtends_0 $tmp1011 = lifted_44270000.match(NoExtends_0.class);
      if($tmp1011 != null)
      { 
        final NoSuper_0 lifted_44260000 = new NoSuper_0(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out24900 = l_int_v_125300;
        final A_Super result_out52700 = lifted_44260000;
        return new R_default_Super(result_out52700, l_int_v_out24900);
      }
      else
      { 
        final Extends_1 $tmp1012 = lifted_44270000.match(Extends_1.class);
        if($tmp1012 != null)
        { 
          final String c1272000000 = $tmp1012.get_1();
          final loadClass_1 lifted_44290000 = new loadClass_1(this.getSourceInfo(), c1272000000);
          final R_default_Class $tmp1013 = lifted_44290000.exec_default(l_string_class_123800, l_string_v_125300, this_122400, l_int_v_125300);
          final A_Class lifted_4583000 = $tmp1013.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_218700 = $tmp1013.get_1();
          final initObject_1 lifted_44280000 = new initObject_1(this.getSourceInfo(), lifted_4583000);
          final R_default_Obj $tmp1014 = lifted_44280000.exec_default(l_string_class_123800, l_string_v_125300, this_122400, l_int_v_218700);
          final A_Obj lifted_4586000 = $tmp1014.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_311600 = $tmp1014.get_1();
          final Super_1 lifted_4585000 = new Super_1(this.getSourceInfo(), lifted_4586000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out24900 = l_int_v_311600;
          final A_Super result_out52700 = lifted_4585000;
          return new R_default_Super(result_out52700, l_int_v_out24900);
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Extends get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initSuper", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}