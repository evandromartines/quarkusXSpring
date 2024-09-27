#!/bin/bash


echo "####################################################################################################################"
echo "#                                         POSTGRESQL                                                               #"
echo "####################################################################################################################"
#docker build --no-cache -t postgresql:stable -f dockers/Postgres/Dockerfile .

echo "####################################################################################################################"
echo "#                                         RED HAT VM:SPRING BOOT                                                   #"
echo "####################################################################################################################"
#docker build --no-cache -t springboot-imperative-redhat:jvm21 -f dockers/RedHat-VM/Dockerfile.springboot.imperative .
#docker build --no-cache -t springboot-reactive-redhat:jvm21 -f dockers/RedHat-VM/Dockerfile.springboot.reactive .

echo "####################################################################################################################"
echo "#                                         ADOPTIUM VM:SPRING BOOT                                                  #"
echo "####################################################################################################################"
#docker build --no-cache -t springboot-imperative-adoptium:jvm21 -f dockers/Adoptium-VM/Dockerfile.springboot.imperative .
#docker build --no-cache -t springboot-reactive-adoptium:jvm21 -f dockers/Adoptium-VM/Dockerfile.springboot.reactive .

echo "####################################################################################################################"
echo "#                                         LIBERICA VM: SPRING BOOT                                                 #"
echo "####################################################################################################################"
#docker build --no-cache -t springboot-imperative-liberica:jvm21 -f dockers/Liberica-VM/Dockerfile.springboot.imperative .
#docker build --no-cache -t springboot-reactive-liberica:jvm21 -f dockers/Liberica-VM/Dockerfile.springboot.reactive .

echo "####################################################################################################################"
echo "#                                         GRAAL VM: SPRING BOOT                                                    #"
echo "####################################################################################################################"
#docker build --no-cache -t springboot-imperative-graal:jvm21 -f dockers/Graal-VM/Dockerfile.springboot.imperative .
#docker build --no-cache -t springboot-reactive-graal:jvm21 -f dockers/Graal-VM/Dockerfile.springboot.reactive .


echo "####################################################################################################################"
echo "#                                         RED HAT VM:QUARKUS                                                       #"
echo "####################################################################################################################"
docker build --no-cache -t quarkus-imperative-redhat:jvm21 -f dockers/RedHat-VM/Dockerfile.quarkus.imperative .
#docker build --no-cache -t springboot-reactive-redhat:jvm21 -f dockers/RedHat-VM/Dockerfile.springboot.reactive .


