pipeline {
  agent any
  stages {
    stage('ssh into the build server') {
      steps {
        sh 'ssh 34.66.169.153'
      }
    }
    stage('run command inside the build server') {
      steps {
        sh 'ls -ltrh'
      }
    }
  }
}