def dockeruser = "dockerivodocker"
def imagename = "openjdk:7"
def container = "java"
node {
   echo 'Building Apache Docker Image'

stage('teste') { 
   powershell "cd 'C:\Program Files (x86)'"
  }   
   
stage('Git Checkout') {
    git 'https://github.com/iccco-iscteiul/esii-g02-2019-2020'
    }
    
stage('Build Docker Image'){
     powershell "docker build -t  ${imagename} ."
    }

stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }

stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/${imagename}"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerpasswd', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${dockerpasswd}"
    }
    powershell "docker push ${dockeruser}/${imagename}"
    }

}
