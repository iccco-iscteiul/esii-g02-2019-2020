# esii-g02-2019-2020

wpMonitoring
Ivo Carvalho, n.º 73422, Grupo 22
******************************
 Funcionalidades que não foram implementadas:
 
- some failure (unavailability) is detected, generate an email message to the WP-CMS Administrator, notifying and describing the failure;
- Record metrics of availability/uptime and downtime, accessible via a link in the WP-CMS Web Site Analytics section;


Neste complemento ao projecto (2. Setup and configure a monitoring tool for the WP-CMS continuous operations enforcement) foi entregue um DVD onde constam os seguintes ficheiros:
- mysql.tar
- phpmyadmin.tar
- wordpress.tar
- SIDSH_WPMonitoring.zip
- wp-site.zip

Instruções:
1. Descompactar wp-site.zip para C:\Users\<utilizador>\
2. Correr no Docker Toolbox o docker-compose.yml com o comando docker-compose up -d
3. Importar pelo phpmyadmin (http://192.168.99.100:8080/) o ficheiro C:\Users\<utilizador>\wp-site\db.sql
4. Executar a aplicação wpMonitoring C:\Users\<utilizador>\wp-site\wpMonitoring\wpMonitoring.bat
