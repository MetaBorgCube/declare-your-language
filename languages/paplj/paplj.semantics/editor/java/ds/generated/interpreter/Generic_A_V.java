package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_V extends A_V implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_V (INodeSource source, IStrategoTerm term) 
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
    throw new InterpreterException("Operation not supported");
  }

  @Override public A_V specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_V)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("NumV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new NumV_1(source, Tools.asJavaInt(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("BoolV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new BoolV_1(source, TermUtils.boolFromTerm(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("NullV") && term.getSubtermCount() == 0)
      { 
        A_V replacement = replace(new NullV_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("ExceptionV") && term.getSubtermCount() == 0)
      { 
        A_V replacement = replace(new ExceptionV_0(source));
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
      replacement = new Generic_A_Obj(getSourceInfo(), aterm);
      return replace(new o2v_1(getSourceInfo(), (A_Obj)replacement.specialize(1)));
    }
    catch(RewritingException v_108)
    { 
      try
      { 
        if(replacement != null)
        { 
          replacement.replace(this);
        }
        replacement = new Generic_A_Unit(getSourceInfo(), aterm);
        return replace(new u2v_1(getSourceInfo(), (A_Unit)replacement.specialize(1)));
      }
      catch(RewritingException u_108)
      { }
    }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}