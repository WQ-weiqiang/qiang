@echo 
docker-compose down

FOR /f "tokens=*" %%i IN ('docker volume ls -q -f "dangling=true"') DO docker volume rm %%i
