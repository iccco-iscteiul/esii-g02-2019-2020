# Source Image name
from openjdk:8
# Mainter Name
maintainer Docker Community
# Copy JAR file into java container
COPY SIDSH/SIDSH-0.0.1.jar /usr/SIDSH-0.0.1.jar
#EXPOSE 8080
RUN java -jar usr/SIDSH-0.0.1.jar
#CMD ["java", "SIDSH-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-jar", "SIDSH-0.0.1-SNAPSHOT.jar"]

