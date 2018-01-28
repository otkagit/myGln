pipeline {
  agent any
  stages {
    stage('testChrome') {
      steps {
        sh 'mvn test -Pt_cr'
      }
    }
  }
}