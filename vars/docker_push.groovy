def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(
        credentialsId: 'dockerhubcred',
        passwordVariable: 'DockerHubPassword',
        usernameVariable: 'dockerHubuser'
    )]) {
        sh "docker login -u ${dockerHubuser} -p ${DockerHubPassword}"
    }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
