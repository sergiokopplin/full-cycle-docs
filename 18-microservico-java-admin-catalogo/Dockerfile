FROM openjdk:11-alpine

RUN useradd -rm -d /home/gradle -s /bin/bash -g root -G sudo -u 1000 gradle
USER gradle
VOLUME "/home/gradle/.gradle"

WORKDIR /home/gradle
