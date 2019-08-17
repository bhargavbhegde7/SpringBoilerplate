pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('create docker image') {
      steps {
        echo 'building the docker image now since build went well'
      }
    }
  }
}