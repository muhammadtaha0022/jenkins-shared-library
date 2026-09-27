def call(String imageTag , string DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${imageTag} ."
