# Source Image name
from openjdk:8
# Mainter Name
maintainer Docker Community
# Copy JAR file from Jenkins workspace SIDSH projecto into java 8 container
COPY SIDSH/SIDSH-0.0.1.jar /usr/SIDSH-0.0.1.jar
