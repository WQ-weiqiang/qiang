call shutdown.bat
call updateImages.bat
docker-compose up -d volume
docker-compose up -d consul
timeout 1 > NUL
docker-compose up -d config-seed
docker-compose up -d mongo
timeout 3 > NUL
docker-compose up -d logging
timeout 1 > NUL
docker-compose up -d notifications
docker-compose up -d metadata
docker-compose up -d data
docker-compose up -d command
docker-compose up -d export-client
docker-compose up -d export-distro
docker-compose up -d ui
docker-compose up -d scheduler
docker-compose up -d rulesengine
docker-compose up -d device-modbus
docker-compose up -d virtual-ppop
docker-compose up -d portainer
docker-compose up -d device-opc-ua
docker-compose up -d drc-wip
rem docker-compose up  drc-wip