rm -rf *.class

javac *.java

if [ $? -eq 0 ]; then
    java main
fi
