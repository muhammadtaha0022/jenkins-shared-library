def call(String url, String branch) {
    echo 'code pull started'
    git url: "${url}", branch: "${branch}"
    echo "code clone successfully"
}
