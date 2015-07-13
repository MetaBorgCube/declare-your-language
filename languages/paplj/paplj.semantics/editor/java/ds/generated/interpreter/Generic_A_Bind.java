package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_Bind extends A_Bind implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Bind (INodeSource source, IStrategoTerm term) 
  { 
    this.setSourceInfo(source);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize(1).match(clazz);
  }

  @Override public void specializeChildren(int depth)
  { 
    throw new InterpreterException("Operation not supported", "aterm specializer", this);
  }

  @Override public A_Bind specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Bind)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("Bind") && term.getSubtermCount() == 3)
      { 
        A_Bind replacement = replace(new Bind_3(source, new Generic_A_Type(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), Tools.asJavaString(term.getSubterm(1)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    IGenericNode replacement = null;
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}