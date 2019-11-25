@echo 
docker pull drc-lib.deltaww.com:16890/drc-edgex/docker-analytics-wip:0.0.1
docker pull drc-lib.deltaww.com:16890/drc-edgex/docker-virtual-ppop:0.0.1

FOR /f "tokens=*" %%i IN (docker images -q -f 'dangling=true') DO docker  rmi %%i