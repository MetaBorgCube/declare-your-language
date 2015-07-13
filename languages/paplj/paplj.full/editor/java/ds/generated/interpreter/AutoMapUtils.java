package ds.generated.interpreter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.spoofax.interpreter.terms.*;
import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.interpreter.framework.*;
import com.github.krukow.clj_ds.PersistentMap;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class AutoMapUtils  
{ 
  public static IStrategoTerm toStrategoTerm_C(PersistentMap<String, A_Class> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    kids[0] = factory.makeString("C");
    int idx = 1;
    for(Entry<String, A_Class> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, factory.makeString(entry.getKey()), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static PersistentMap<String, A_Class> to_C(IStrategoTerm term)
  { 
    final String mapName = "C";
    final Map<String, A_Class> result = new TreeMap<String, A_Class>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        IStrategoTerm kid0 = term.getSubterm(0);
        if(Tools.isTermString(kid0) && Tools.asJavaString(kid0).equals(mapName))
        { 
          for(int idx = 1; idx < term.getSubtermCount(); idx++)
          { 
            IStrategoTerm kid = term.getSubterm(idx);
            if(Tools.isTermAppl(kid))
            { 
              IStrategoAppl bindAppl = (IStrategoAppl)kid;
              if(Tools.hasConstructor(bindAppl, "Bind", 2))
              { 
                result.put(Tools.asJavaString(bindAppl.getSubterm(0)), new Generic_A_Class(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)));
              }
            }
          }
          return PersistentTreeMap.create(result);
        }
      }
    }
    throw new RuntimeException("Malformed map for " + mapName);
  }

  public static IStrategoTerm toStrategoTerm_FM(PersistentMap<String, Integer> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    kids[0] = factory.makeString("FM");
    int idx = 1;
    for(Entry<String, Integer> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, factory.makeString(entry.getKey()), factory.makeInt(entry.getValue()));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static PersistentMap<String, Integer> to_FM(IStrategoTerm term)
  { 
    final String mapName = "FM";
    final Map<String, Integer> result = new TreeMap<String, Integer>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        IStrategoTerm kid0 = term.getSubterm(0);
        if(Tools.isTermString(kid0) && Tools.asJavaString(kid0).equals(mapName))
        { 
          for(int idx = 1; idx < term.getSubtermCount(); idx++)
          { 
            IStrategoTerm kid = term.getSubterm(idx);
            if(Tools.isTermAppl(kid))
            { 
              IStrategoAppl bindAppl = (IStrategoAppl)kid;
              if(Tools.hasConstructor(bindAppl, "Bind", 2))
              { 
                result.put(Tools.asJavaString(bindAppl.getSubterm(0)), Tools.asJavaInt(bindAppl.getSubterm(1)));
              }
            }
          }
          return PersistentTreeMap.create(result);
        }
      }
    }
    throw new RuntimeException("Malformed map for " + mapName);
  }

  public static IStrategoTerm toStrategoTerm_MM(PersistentMap<String, A_Method> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    kids[0] = factory.makeString("MM");
    int idx = 1;
    for(Entry<String, A_Method> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, factory.makeString(entry.getKey()), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static PersistentMap<String, A_Method> to_MM(IStrategoTerm term)
  { 
    final String mapName = "MM";
    final Map<String, A_Method> result = new TreeMap<String, A_Method>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        IStrategoTerm kid0 = term.getSubterm(0);
        if(Tools.isTermString(kid0) && Tools.asJavaString(kid0).equals(mapName))
        { 
          for(int idx = 1; idx < term.getSubtermCount(); idx++)
          { 
            IStrategoTerm kid = term.getSubterm(idx);
            if(Tools.isTermAppl(kid))
            { 
              IStrategoAppl bindAppl = (IStrategoAppl)kid;
              if(Tools.hasConstructor(bindAppl, "Bind", 2))
              { 
                result.put(Tools.asJavaString(bindAppl.getSubterm(0)), new Generic_A_Method(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)));
              }
            }
          }
          return PersistentTreeMap.create(result);
        }
      }
    }
    throw new RuntimeException("Malformed map for " + mapName);
  }

  public static IStrategoTerm toStrategoTerm_Env(PersistentMap<String, A_V> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    kids[0] = factory.makeString("Env");
    int idx = 1;
    for(Entry<String, A_V> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, factory.makeString(entry.getKey()), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static PersistentMap<String, A_V> to_Env(IStrategoTerm term)
  { 
    final String mapName = "Env";
    final Map<String, A_V> result = new TreeMap<String, A_V>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        IStrategoTerm kid0 = term.getSubterm(0);
        if(Tools.isTermString(kid0) && Tools.asJavaString(kid0).equals(mapName))
        { 
          for(int idx = 1; idx < term.getSubtermCount(); idx++)
          { 
            IStrategoTerm kid = term.getSubterm(idx);
            if(Tools.isTermAppl(kid))
            { 
              IStrategoAppl bindAppl = (IStrategoAppl)kid;
              if(Tools.hasConstructor(bindAppl, "Bind", 2))
              { 
                result.put(Tools.asJavaString(bindAppl.getSubterm(0)), new Generic_A_V(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)));
              }
            }
          }
          return PersistentTreeMap.create(result);
        }
      }
    }
    throw new RuntimeException("Malformed map for " + mapName);
  }

  public static IStrategoTerm toStrategoTerm_Store(PersistentMap<Integer, A_V> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    kids[0] = factory.makeString("Store");
    int idx = 1;
    for(Entry<Integer, A_V> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, factory.makeInt(entry.getKey()), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static PersistentMap<Integer, A_V> to_Store(IStrategoTerm term)
  { 
    final String mapName = "Store";
    final Map<Integer, A_V> result = new TreeMap<Integer, A_V>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        IStrategoTerm kid0 = term.getSubterm(0);
        if(Tools.isTermString(kid0) && Tools.asJavaString(kid0).equals(mapName))
        { 
          for(int idx = 1; idx < term.getSubtermCount(); idx++)
          { 
            IStrategoTerm kid = term.getSubterm(idx);
            if(Tools.isTermAppl(kid))
            { 
              IStrategoAppl bindAppl = (IStrategoAppl)kid;
              if(Tools.hasConstructor(bindAppl, "Bind", 2))
              { 
                result.put(Tools.asJavaInt(bindAppl.getSubterm(0)), new Generic_A_V(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)));
              }
            }
          }
          return PersistentTreeMap.create(result);
        }
      }
    }
    throw new RuntimeException("Malformed map for " + mapName);
  }
}