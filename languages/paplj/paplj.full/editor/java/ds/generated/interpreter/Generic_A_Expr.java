package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_Expr extends A_Expr implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Expr (INodeSource source, IStrategoTerm term) 
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

  @Override public A_Expr specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Expr)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("Num") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Num_1(source, Tools.asJavaString(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Min") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Min_1(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Add") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Add_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Sub") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Sub_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Mul") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Mul_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("True") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new True_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("False") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new False_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Not") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Not_1(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("And") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new And_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Or") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Or_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Eq") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Eq_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Neq") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Neq_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Lt") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Lt_2(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("If") && term.getSubtermCount() == 3)
      { 
        A_Expr replacement = replace(new If_3(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Var") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Var_1(source, Tools.asJavaString(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Let") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Let_2(source, new L_A_Bind(NodeSource.fromStrategoTerm(term.getSubterm(0))).fromStrategoTerm(term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Get") && term.getSubtermCount() == 3)
      { 
        A_Expr replacement = replace(new Get_3(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Type(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), Tools.asJavaString(term.getSubterm(2))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Set") && term.getSubtermCount() == 4)
      { 
        A_Expr replacement = replace(new Set_4(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Type(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), Tools.asJavaString(term.getSubterm(2)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(3)), term.getSubterm(3))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Call") && term.getSubtermCount() == 3)
      { 
        A_Expr replacement = replace(new Call_3(source, new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), Tools.asJavaString(term.getSubterm(1)), new L_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(2))).fromStrategoTerm(term.getSubterm(2))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("New") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new New_1(source, Tools.asJavaString(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("This") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new This_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Null") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Null_1(source, Tools.asJavaString(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Cast") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Cast_2(source, Tools.asJavaString(term.getSubterm(0)), new Generic_A_Expr(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
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
      replacement = new Generic_A_Block(getSourceInfo(), aterm);
      return replace(new block2expr_1(getSourceInfo(), (A_Block)replacement.specialize(1)));
    }
    catch(RewritingException o_111703)
    { }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    return specialize(1).exec_default(_1, _2, _3, _4);
  }
}