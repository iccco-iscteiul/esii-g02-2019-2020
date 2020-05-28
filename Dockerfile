# Source Image name
from openjdk:8
# Mainter Name
maintainer Docker Community
# Copy JAR file into java container
COPY SIDSH/SIDSH-0.0.1.jar /usr/SIDSH-0.0.1.jar
#EXPOSE 8080
#Correr o jar assim que o container correr a image
RUN java -jar usr/SIDSH-0.0.1.jar

