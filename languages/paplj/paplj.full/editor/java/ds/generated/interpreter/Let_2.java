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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in25300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in27500 = _2;
    final A_This this_in24500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in27500 = _4;
    final L_A_Bind lifted_44190000 = this._1;
    final A_Expr e528000000 = this._2;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_126400 = l_string_class_in25300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_127900 = l_string_v_in27500;
      final A_This this_125300 = this_in24500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_127900 = l_int_v_in27500;
      if(lifted_44190000 != null && lifted_44190000.equals(new NIL(this.getSourceInfo())))
      { 
        final R_default_V $tmp1077 = e528000000.exec_default(l_string_class_126400, l_string_v_127900, this_125300, l_int_v_127900);
        final A_V v1183000000 = $tmp1077.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220800 = $tmp1077.get_1();
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27400 = l_int_v_220800;
        final A_V result_out55200 = v1183000000;
        return new R_default_V(result_out55200, l_int_v_out27400);
      }
      else
      { 
        if(lifted_44190000 != null && !lifted_44190000.isEmpty())
        { 
          final A_Bind lifted_44200000 = lifted_44190000.head();
          final L_A_Bind binds61000000 = lifted_44190000.tail();
          final Bind_3 $tmp1078 = lifted_44200000.match(Bind_3.class);
          if($tmp1078 != null)
          { 
            final A_Type lifted_43310000 = $tmp1078.get_1();
            final String x594000000 = $tmp1078.get_2();
            final A_Expr lifted_44240000 = $tmp1078.get_3();
            final R_default_V $tmp1079 = lifted_44240000.exec_default(l_string_class_126400, l_string_v_127900, this_125300, l_int_v_127900);
            final A_V v1184000000 = $tmp1079.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_220900 = $tmp1079.get_1();
            final bindVar_2 lifted_44210000 = new bindVar_2(this.getSourceInfo(), x594000000, v1184000000);
            final Let_2 lifted_44220000 = new Let_2(this.getSourceInfo(), binds61000000, e528000000);
            final R_default_Map_String_V_ $tmp1080 = lifted_44210000.exec_default(l_string_class_126400, l_string_v_127900, this_125300, l_int_v_220900);
            final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_4580000 = $tmp1080.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_313500 = $tmp1080.get_1();
            final R_default_V $tmp1081 = lifted_44220000.exec_default(l_string_class_126400, lifted_4580000, this_125300, l_int_v_313500);
            final A_V v_122000000 = $tmp1081.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_42800 = $tmp1081.get_1();
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out27400 = l_int_v_42800;
            final A_V result_out55200 = v_122000000;
            return new R_default_V(result_out55200, l_int_v_out27400);
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