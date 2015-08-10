We would like thank the reviewers for their thoughtful and enthusiastic reviews. In this response we provide clarifications on a few points raised in the reviews, and indicate improvements we would make in the final version of the paper.

# Validation

> First, the theory has not yet been connected fully to any implementation of a meta-level tool or any full-scale object language.

We certainly agree that this is an initial design that requires validation and probably refinement. Our previous experiments with applying NaBL give us some confidence in the design of the resolution calculus in the paper, but we still need to validate the calculus by using it as the basis for a re-implementation of NaBL.

# Encoding & Scope

> To improve the paper, it would be better to clarify upfront that the model is mostly aimed at describing a broad range of lexically-scoped languages

We will add text to clarify the range of languages that we aspire to model.

> On page 4, you write that the binding pattern of classic lambdas is simple, 

Rather than characterising classic lambdas as ‘simple’, we observe that ‘the scope of the bound variable is the subtree dominated by the binding construct’, i.e. the scope is contiguous, whereas this is not the case for the pattern Let(x1, value1, Let(x2, value2, body)), since x1 is not in scope in value1.

> The reason is that there is a limitation baked in the definition of scope graphs (Fig 1), which assumes only one parent. Why insist on this restriction? In particular, it forces the treatment of inheritance to be quite simplistic, ignoring multiple inheritance.

Currently we assume that the parent relation is in fact a function, which models the common case of a single enclosing lexical environment. But it could be generalized to an arbitrary acyclic relation, without losing the well-foundedness of the calculus. 

However, we actually do not use the parent relation to model inheritance anyway; rather, we use imports. On page 16 we write ’We import declarations from the corresponding named scope transitively into class bodies.’ We will try to clarify this example in the text. Multiple inheritance is naturally expressed as a class with multiple imports, just as a regular module can import multiple other modules; we will make this point explicit in the text. 

> The discussion of inheritance also misses super and field shadowing, which seem relevant to assess the applicability of the calculus in this context.

Field shadowing is covered by specificity ordering on the import path; i.e. a field from a ‘closer’ class shadows a field with the same name in a ‘further’ class (with a longer import path).  We will make this point explicit in the text.
A ’super’ method is an implicit declaration in a class that aliases the constructor of the super class; this requires interaction of resolution and types, which is not in the scope of this paper (but which is addressed in NaBL).

# Variation

> this is a fairly "opinionated" design, in that sense that one particular regime of binding, imports, etc. is hardcoded into the formalism.
> Do you imagine a future NaBL exposing a way to tweak the definitions of the well-formed-path and path-specifity relations, in the style you demonstrate in the paper to shape the semantics of name resolution?

While the lexical scoping regime is indeed hardcoded into the formalism, the calculus is parameterized by the well-formedness predicate and specificity ordering on paths. These parameters support tuning the formalism to represent different policies, such as for example transitive vs non-transitive imports. Such policies can even be combined by means of flags to the import nodes (as indicated in Section 2.5). We could indeed expose such variants in the NaBL formalism, for example by providing a ‘imports transitively’ vs a ‘imports’ (non-transitive) declaration.  






