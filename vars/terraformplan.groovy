def call(){
    echo "Planing the infra..."
    sh 'terraform init'
    sh 'terraform validate'
    sh 'terraform plan'
}