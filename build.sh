
# Limpa a pasta bin
rm -rf bin
# Recria a pasta bin
mkdir bin

# navega para a pasta src
cd src
# Compilar as classes e configura os arquivos gerados para a pasta bin
javac -d ../bin io/github/marcoswitcel/Main.java
# volta para a raíz
cd ..
# Executa o programa recém criado
java -classpath bin io.github.marcoswitcel.Main