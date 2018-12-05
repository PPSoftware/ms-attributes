# ms-attributes
Microserviço para lidar com as requisições envolvendo os atributos

No application.yml vc encontra as configurações de portas e conexão com o banco de dados postgresql.

É necessário a instalação do POSTGRESQL versão 10+ e do PGADMIN versão 4+, criar o database ms_attributes sem adicionar nenhuma tabela, na configuração do application.yml há uma opção spring.jpa.hibernate.ddl-auto que está setado em create-drop, para persistir os dados e o banco quando vc descer a aplicação basta trocar para update.

JDK 1.8 - digite download jdk 1.8 no google.

Spring Tool Suite 4 - baixado pelo marketplace dentro do eclipse.

Há a necessidade de configurar o LOMBOK, para tal entre em https://projectlombok.org/ e baixe o .jar do lombok, vc precisara adicionar no eclipse.ini a seguinte linha no final -javaagent:C:\Path\to-you-file\eclipse\lombok.jar.

A versão do eclipse é a 09-2018 photon.
