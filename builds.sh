#!/bin/bash

#RED HAT VM
docker build --no-cache -t springboot-imperative-redhat:jvm21 -f dockers/RedHat-VM/Dockerfile.springboot.imperative .
docker build --no-cache -t springboot-reactive-redhat:jvm21 -f dockers/RedHat-VM/Dockerfile.springboot.reactive .

#ADOPTIUM ECLIPSE VM
docker build --no-cache -t springboot-imperative-adoptium:jvm21 -f dockers/Adoptium-VM/Dockerfile.springboot.imperative .
docker build --no-cache -t springboot-reactive-adoptium:jvm21 -f dockers/Adoptium-VM/Dockerfile.springboot.reactive .


