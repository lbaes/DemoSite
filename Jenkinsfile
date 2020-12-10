pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2'
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
                sh 'docker build -t loja-site:latest site/target/Dockerfile'
                echo 'Finished building site image'


                echo 'Build admin image'
                sh 'docker build -t loja-admin:latest admin/target/Dockerfile'
                echo 'Finished building admin image'

                echo 'Building api image'
                sh 'docker build -t loja-admin:latest api/target/Dockerfile'
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