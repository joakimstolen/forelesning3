
#!/bin/bash
docker build . --tag forelesning4_docker_2 --build-arg JAR_FILE=./target/forelesning3-0.0.1-SNAPSHOT.jar
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker tag forelesning4_docker_2  joakimstolen/forelesning4_docker_2
docker push joakimstolen/forelesning4_docker_2