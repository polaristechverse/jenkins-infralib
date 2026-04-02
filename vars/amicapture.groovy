def call() {  
  sh '''
  AMI_ID=$(jq -r '.builds[-1].artifact_id' manifest.json | cut -d ':' -f2)
  echo "Extracted AMI: $AMI_ID"
  sed -i "s/^ami *= *.*/ami = \\"$AMI_ID\\"/" terraform.tfvars
  echo "Updated terraform.tfvars:"
  cat terraform.tfvars
  '''
}