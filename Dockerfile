# Source Image name
from openjdk:7
# Mainter Name
maintainer Docker Community
# Copy JAR file into java container
COPY Package/SIDSH/target/SIDSH-0.0.1-SNAPSHOT.jar /SIDSH-0.0.1-SNAPSHOT.jar
#EXPOSE 8080
#RUN javac Main.java
#CMD ["java", "SIDSH-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-jar", "SIDSH-0.0.1-SNAPSHOT.jar"]


