def call(){
  echo 'Cloning commonbuild steps to workspace.'
  
  def organization = getComponentParts()['organization']
  def branch = env['library.nivscommonbuild.version']  
  commonbuildDir = syncRepo("https://github.com/$organization/commonbuild", branch)
  return commonbuildDir
}
