#!/usr/bin/env bash

# Error early
set -eu

# Exit on interruption
function terminate() { exit $?; }
trap terminate SIGINT

rm -rf paplj-spoofax
rm -rf paplj-spoofax.zip
mkdir -p paplj-spoofax

cp -a paplj-examples paplj-exercises paplj-exercises-names paplj-exercises-semantics paplj-exercises-transformation paplj-exercises-types paplj.analysis paplj.full paplj.semantics paplj.syntax paplj.transformation paplj-spoofax
zip -q -r -y paplj-spoofax.zip paplj-spoofax
rm -rf paplj-spoofax
