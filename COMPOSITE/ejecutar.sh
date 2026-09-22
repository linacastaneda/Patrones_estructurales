#!/usr/bin/env bash
set -eu
cd -- "$(dirname -- "$0")"
javac -encoding UTF-8 -d out src/com/grupo2/composite/*.java
java -cp out com.grupo2.composite.Main
