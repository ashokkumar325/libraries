def newgit(repo)
{
  git "${repo}"
}

def newmaven()
{
   sh 'mvn package'
}

def newdeploy(jobname,ip,contextpath)
{
  sh label: '', script: "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}

def runselenum(jobname)
{
  sh label: '', script: "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar" 
}
