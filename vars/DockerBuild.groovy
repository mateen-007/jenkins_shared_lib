def call(string project, string ImageTag, string hubuser){
  sh ''' docker build -t ${hubuser}/${project} .
  docker image tag ${hubuser}/${project} ${hubuser}/${project}:${ImageTag}
  '''
}
