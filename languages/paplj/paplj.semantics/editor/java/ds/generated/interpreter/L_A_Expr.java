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
      throw new InterpreterException("No such element exception");
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
      throw new InterpreterException("No such element exception");
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

  public R_default_List_V_ exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in420 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in420 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in420 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in420 = _4;
    final L_A_Expr lifted_1960000 = this;
    { 
      final A_This this_14200 = this_in420;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_14100 = env_in420;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_14200 = c_in420;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_14100 = store_in420;
      if(lifted_1960000 != null && lifted_1960000.equals(new NIL(this.getSourceInfo())))
      { 
        final L_A_V lifted_1950000 = (L_A_V)new L_A_V(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out420 = store_14100;
        final L_A_V result_out420 = lifted_1950000;
        return new R_default_List_V_(result_out420, store_out420);
      }
      else
      { 
        if(lifted_1960000 != null && !lifted_1960000.isEmpty())
        { 
          final A_Expr lifted_1980000 = lifted_1960000.head();
          final L_A_Expr es300000 = lifted_1960000.tail();
          final R_default_V $tmp99 = lifted_1980000.exec_default(this_14200, env_14100, c_14200, store_14100);
          final A_V v5100000 = $tmp99.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_23100 = $tmp99.get_1();
          final R_default_List_V_ $tmp100 = es300000.exec_default(this_14200, env_14100, c_14200, store_23100);
          final L_A_V vs1100000 = $tmp100.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_32100 = $tmp100.get_1();
          final L_A_V lifted_1970000 = new L_A_V(this.getSourceInfo(), v5100000, vs1100000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out420 = store_32100;
          final L_A_V result_out420 = lifted_1970000;
          return new R_default_List_V_(result_out420, store_out420);
        }
        else
        { }
      }
    }
    { 
      throw new InterpreterException("Rule failure");
    }
  }
}