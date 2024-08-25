pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            bat 'cd Web_Frame1'
            bat 'mvn -B compile'
         }
      }
      stage('Test'){
          steps{
              bat 'cd Web_Frame1'
              bat 'mvn -B clean install'
              cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
              }
      }
      stage('Archive'){
          steps{
              archiveArtifacts 'Web_Frame1/target/*.jar'
          }
      }
   }
}
