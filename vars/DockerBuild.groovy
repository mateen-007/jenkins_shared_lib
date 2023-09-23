def call(){
  sh ''' docker build -t mateen007/java-app .
  docker image tag mateen007/java-app mateen007/java-app:v1
  '''
}
