PROJ = org.example
MANIFEST = AndroidManifest.xml

RES = $(shell find res -type f)
AIDLS = $(shell find src -type f -name '*.aidl')
SRCS = $(shell find src -type f -name '*.java')
JAVALIBS = $(shell find lib -type f -name '*.jar' | tr '\n' ':')

include Makefile.comm
