docker-compose down
#docker rmi $(docker images -qf dangling=true)
docker rm $(docker ps -aq )
docker-compose build django
docker-compose up django
