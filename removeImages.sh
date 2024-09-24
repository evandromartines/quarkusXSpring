#!/bin/bash
for image in $(docker images --format "{{.ID}} {{.Repository}}:{{.Tag}}" | grep -E "^.* springboot-imperative|^.* springboot-reactive" | awk '{print $1}'); do
    echo "Removendo imagem e suas dependências: $image"
    docker rmi "$image" --force
done