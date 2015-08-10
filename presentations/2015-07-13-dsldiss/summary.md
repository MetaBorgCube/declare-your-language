# Declare Your Language

Language workbenches are tools aiming to reduce the gap between the design and implementation of (external domain-specific) programming languages. Given high-level descriptions of the syntax and semantics of a language, a workbench generates an implementation of an IDE and/or execution engine. There are many different approaches to realising these goals. In this session I will demonstrate and discuss the state of declarative language definition in the Spoofax Language Workbench.

In the first part of the session I give a hands-on tutorial of the development of language front-ends with Spoofax. We will explore syntax definition in SDF3, name binding and scope rules in NaBL, and type constraints in TS. Participants are expected to bring a (decently equipped) laptop with Eclipse/Spoofax and the exercise projects pre-installed according to the instructions provided at http://declare-your-language.metaborg.org/. (Instructions under construction)

In the second part I will present recent research in expanding declarative language definition. (1) In our ESOP15 paper we develop a theory of name resolution to provide a generalisation and post-hoc semantics of the concepts of the NaBL name binding language. I will present the scope graph model, its resolution calculus, and the application of scope graphs to model name binding patterns in existing languages. (2) Language workbenches typically employ code generation to give semantics to languages.  This often leads to questions about the exact source-level semantics of the language. We are working on DynSem, a DSL for the specification of dynamic semantics aimed at rapid prototyping, generation of interpreters, and (eventually) verification of soundness properties. DynSem is based on the work of implicitly modular operational semantics of Peter Mosses. I will discuss the current state of the design of the language.








