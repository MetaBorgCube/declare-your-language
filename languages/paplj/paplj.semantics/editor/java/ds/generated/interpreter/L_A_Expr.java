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

  public R_default_List_V_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    throw new InterpreterException("Rule failure", "default", this);
  }
}