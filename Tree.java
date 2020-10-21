class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;
  
  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";

  }
  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  // four mutators

  void setTreeName(String aTreeName) {
    treeName = aTreeName;
  }

  void setTreeType(String aTreeType) {
    treeType = aTreeType;
  }

  void setLeavesFall(boolean aLeavesFall){
    leavesFall = aLeavesFall;
  }

  void setLeafColor(String aLeafColor) {
    leafColor = aLeafColor;
  }

  // four accessors

  String getTreeName() {
    return treeName;
  }
  String getTreeType() {
    return treeType;
  }
  Boolean getLeavesFall() {
    return leavesFall;
  }
  String getLeafColor() {
    return leafColor;
  }

  void print() {
     
    System.out.println("This is a "+treeName+" tree. It is a "+treeType+" and its leaves are currently "+leafColor+". It "+ leavesFall+" lose its leaves for the winter");
  } 
}