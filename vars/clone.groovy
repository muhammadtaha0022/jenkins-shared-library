def call(string url , string branch){
                echo 'code pull started'
                git url: "${url}", branch: "${branch}"
                echo "code clone successfully"
}
