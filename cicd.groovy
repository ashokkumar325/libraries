def newgit(repo)
{
  git "$(repo)"
}

def newmaven()
{
   sh 'mvn package'
}
