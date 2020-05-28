# Source Image name
from openjdk:7
# Mainter Name
maintainer Docker Community
# Copy JAR file into java container
COPY "C:\Program Files (x86)\Jenkins\workspace\Package\SIDSH\target\SIDSH-0.0.1-SNAPSHOT.jar" /usr/app
WORKDIR /usr/app
#EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SIDSH-0.0.1-SNAPSHOT.jar"]