pipeline {
    environment {
        registryCredential = 'dockerHub'
    }
    agent {
        docker {
            image 'maven:3.6.3-openjdk-11' 
            args '--user root -v /root/.m2:/root/.m2 -v /var/run/docker.sock:/var/run/docker.sock -v /usr/bin/docker:/usr/bin/docker'
        }
    }
    stages {
        stage('Build') { 
            steps {
                echo 'Starting application build'
                sh 'mvn -B -DskipTests clean package' 
            }
        }

        stage ('Test') {
            steps {
                echo 'Running tests'
                sh 'mvn test'
            }
        }

        stage ('Building tagging and pushing to DockerHub') {
            steps {
                echo 'build and push site image'
                script {
                    def siteImage = docker.build("lbaes/loja:site", "./site")
                    docker.withRegistry( '', registryCredential ) {
                        siteImage.push()
                    }
                }
                echo 'site finished'

                echo 'build and push admin image'
                script {
                    def adminImage = docker.build("lbaes/loja:admin", "./admin")
                    docker.withRegistry( '', registryCredential ) {
                        adminImage.push()
                    }
                }
                echo 'admin finished'

                echo 'build and push api image'
                script {
                    def apiImage = docker.build("lbaes/loja:api", "./api")
                    docker.withRegistry( '', registryCredential ) {
                        apiImage.push()
                    }
                }
                echo 'api finished'
            }
        }
    }
    
}