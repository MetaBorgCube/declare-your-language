package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;
import java.util.Objects;

@SuppressWarnings("unused") public class Generic_A_Super extends A_Super implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Super (INodeSource source, IStrategoTerm term) 
  { 
    Objects.requireNonNull(term);
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

  @Override public A_Super specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Super)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("NoSuper") && term.getSubtermCount() == 0)
      { 
        A_Super replacement = replace(new NoSuper_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Super") && term.getSubtermCount() == 1)
      { 
        A_Super replacement = replace(new Super_1(source, new Generic_A_Obj(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)).specialize(1)));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    try
    { 
      return replace(new Super_1(getSourceInfo(), new Generic_A_Obj(NodeSource.fromStrategoTerm(aterm), aterm).specialize(1)));
    }
    catch(RewritingException g_353500)
    { }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}