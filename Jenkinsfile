pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2 -v /var/run/docker.sock:/var/run/docker.sock -v /usr/bin/docker:/usr/bin/docker'
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

        stage ('Building Images') {
            steps {
                echo 'Building site image'
                node {
                    def siteImage = docker.build("loja-site:latest", "./site/Dockerfile")
                }
                echo 'Finished building site image'

                echo 'Build admin image'
                node {
                    def adminImage = docker.build("loja-admin:latest", "./admin/Dockerfile")
                }
                echo 'Finished building admin image'

                echo 'Building api image'
                node {
                    def apiImage = docker.build("loja-api:latest", "./api/Dockerfile")
                }
                echo 'Finished building api image'
            }
        }

        stage ('Delivering images') {
            steps {
                echo 'TODO'
            }
        }
    }
    
}