const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot5c14p7m0/",
            name: "springboot5c14p7m0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot5c14p7m0/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的大学生就业管理系统设计与实现"
        } 
    }
}
export default base
