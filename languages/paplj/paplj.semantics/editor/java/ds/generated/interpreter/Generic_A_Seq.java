package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_Seq extends A_Seq implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Seq (INodeSource source, IStrategoTerm term) 
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

  @Override public A_Seq specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Seq)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("Skip") && term.getSubtermCount() == 0)
      { 
        A_Seq replacement = replace(new Skip_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    IGenericNode replacement = null;
    try
    { 
      if(replacement != null)
      { 
        replacement.replace(this);
      }
      replacement = new Generic_A_Expr(getSourceInfo(), aterm);
      return replace(new expr2seq_1(getSourceInfo(), (A_Expr)replacement.specialize(1)));
    }
    catch(RewritingException y_101533)
    { }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}