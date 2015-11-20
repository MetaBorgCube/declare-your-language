package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class L_A_Expr  implements INodeList
{ 
  public INodeSource source;

  public L_A_Expr (INodeSource source) 
  { 
    this(source, null, null);
  }

  public L_A_Expr (INodeSource source, A_Expr head, L_A_Expr tail) 
  { 
    this.source = source;
    this.head = head;
    this.tail = tail;
    this.size = (head == null ? 0 : 1) + (tail == null ? 0 : tail.size());
  }

  @Child public A_Expr head;

  @Children public L_A_Expr tail;

  public final int size;

  @Override public void setSourceInfo(INodeSource source)
  { 
    this.source = source;
  }

  @Override public INodeSource getSourceInfo()
  { 
    return source;
  }

  @Override public A_Expr head()
  { 
    if(head == null)
    { 
      throw new InterpreterException("No such element exception", null, this);
    }
    return head;
  }

  @Override public void replaceHead(Object newHead)
  { 
    this.head = (A_Expr)newHead;
  }

  @Override public L_A_Expr tail()
  { 
    if(tail == null)
    { 
      throw new InterpreterException("No such element exception", null, this);
    }
    return tail;
  }

  @Override public int size()
  { 
    return size;
  }

  @Override public boolean isEmpty()
  { 
    return head == null;
  }

  @Override public int hashCode()
  { 
    return ListUtils.hashCode(this);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return ListUtils.toStrategoTerm(this, factory);
  }

  @Override public boolean equals(Object obj)
  { 
    return ListUtils.equals(this, obj);
  }

  @Override public String toString()
  { 
    return ListUtils.toString(this);
  }

  private boolean hasSpecialized;

  public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      if(head instanceof IGenericNode)
      { 
        ((IGenericNode)head).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  @Override public L_A_Expr fromStrategoTerm(IStrategoTerm alist)
  { 
    L_A_Expr list = new L_A_Expr(NodeSource.fromStrategoTerm(alist));
    for(int l = alist.getSubtermCount() - 1; l >= 0; l--)
    { 
      final INodeSource source = NodeSource.fromStrategoTerm(alist.getSubterm(l));
      list = new L_A_Expr(NodeSource.fromStrategoTerm(alist), new Generic_A_Expr(source, alist.getSubterm(l)), list);
    }
    return list;
  }

  public R_default_List_V_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in2660 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in2880 = _2;
    final A_This this_in2590 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in2880 = _4;
    final L_A_Expr lifted_45270000 = this;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127800 = l_string_class_in2660;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_129100 = l_string_v_in2880;
      final A_This this_126700 = this_in2590;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_129100 = l_int_v_in2880;
      if(lifted_45270000 != null && lifted_45270000.equals(new NIL(this.getSourceInfo())))
      { 
        final L_A_V lifted_45260000 = (L_A_V)new L_A_V(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out2870 = l_int_v_129100;
        final L_A_V result_out5650 = lifted_45260000;
        return new R_default_List_V_(result_out5650, l_int_v_out2870);
      }
      else
      { 
        if(lifted_45270000 != null && !lifted_45270000.isEmpty())
        { 
          final A_Expr lifted_45290000 = lifted_45270000.head();
          final L_A_Expr es61000000 = lifted_45270000.tail();
          final R_default_V $tmp1104 = lifted_45290000.exec_default(l_string_class_127800, l_string_v_129100, this_126700, l_int_v_129100);
          final A_V v1191000000 = $tmp1104.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221700 = $tmp1104.get_1();
          final R_default_List_V_ $tmp1105 = es61000000.exec_default(l_string_class_127800, l_string_v_129100, this_126700, l_int_v_221700);
          final L_A_V vs151000000 = $tmp1105.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_314200 = $tmp1105.get_1();
          final L_A_V lifted_45280000 = new L_A_V(this.getSourceInfo(), v1191000000, vs151000000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out2870 = l_int_v_314200;
          final L_A_V result_out5650 = lifted_45280000;
          return new R_default_List_V_(result_out5650, l_int_v_out2870);
        }
        else
        { }
      }
    }
    { 
      throw new InterpreterException("Rule failure", "default", this);
    }
  }
}