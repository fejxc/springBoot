webpackJsonp([1],{"2UKF":function(t,e){},"7inU":function(t,e){},"8n34":function(t,e){},CKvp:function(t,e){},ENXK:function(t,e){},MHZv:function(t,e){},NHnr:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s=n("7+uW"),r={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"app"}},[this._m(0),this._v(" "),e("router-view")],1)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("ul",{staticClass:"nav nav-link navbar-dark"},[e("li",{staticClass:"active",attrs:{role:"presentation"}},[e("a",{attrs:{href:"#/home"}},[this._v("主页")])]),this._v(" "),e("li",{attrs:{role:"presentation"}},[e("a",{attrs:{href:"#/user"}},[this._v("用户管理")])]),this._v(" "),e("li",{attrs:{role:"presentation"}},[e("a",{attrs:{href:"#/student"}},[this._v("学生管理")])])])}]};var a=n("VU/8")({name:"App"},r,!1,function(t){n("7inU")},null,null).exports,i=n("/ocq"),o={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",[e("div",{staticClass:"jumbotron"},[e("h1",[this._v("欢迎访问管理系统")])])])}]};var u=n("VU/8")({name:"Home"},o,!1,function(t){n("8n34")},"data-v-42b8b2d6",null).exports,l={name:"User",data:function(){return{users:[]}},methods:{findAll:function(){var t=this;this.$http.get("http://localhost:8989/vue/user/findAll?page=1&rows=4").then(function(e){console.log(e.data),t.users=e.data.results})},delRow:function(t){var e=this;console.log(t),this.$http.get("http://localhost:8989/vue/user/delete?id="+t).then(function(t){console.log(t),t.data.success&&(alert("确定查询所有吗？"),e.findAll())})}},components:{},created:function(){this.findAll()},watch:{$route:{handler:function(t,e){console.log(t),"/user"==t.path&&this.findAll()},deep:!0}}},c={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("h3",[t._v("用户列表")]),t._v(" "),n("a",{staticClass:"btn btn-info",attrs:{href:"#/user/userAdd"}},[t._v("添加用户")]),t._v(" "),n("table",{staticClass:"table table-striped table-bordered",staticStyle:{"margin-top":"30px"}},[t._m(0),t._v(" "),t._l(t.users,function(e){return n("tr",[n("td",[t._v(t._s(e.id))]),t._v(" "),n("td",[t._v(t._s(e.name))]),t._v(" "),n("td",[t._v(t._s(e.age))]),t._v(" "),n("td",[t._v(t._s(e.bir))]),t._v(" "),n("td",[n("a",{attrs:{href:"javascript:;"},on:{click:function(n){return t.delRow(e.id)}}},[t._v("删除")]),t._v(" "),n("a",{attrs:{href:"#/user/userEdit?id="+e.id}},[t._v("修改")])])])})],2),t._v(" "),n("router-view")],1)},staticRenderFns:[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("tr",[n("th",[t._v("学号")]),t._v(" "),n("th",[t._v("姓名")]),t._v(" "),n("th",[t._v("年龄")]),t._v(" "),n("th",[t._v("生日")]),t._v(" "),n("th",[t._v("操作")])])}]};var v=n("VU/8")(l,c,!1,function(t){n("CKvp")},"data-v-4533df21",null).exports,d={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",[e("h3",[this._v("学生管理")])])}]};var p=n("VU/8")({name:"Student"},d,!1,function(t){n("2UKF")},"data-v-7380db72",null).exports,h={name:"UserAdd",data:function(){return{user:{}}},methods:{saveUserInfo:function(){var t=this;console.log(this.user),this.$http.post("http://localhost:8989/vue/user/add",this.user).then(function(e){console.log(e),e.data.success&&t.$router.push("/user")})}}},m={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("h2",[t._v("添加用户信息")]),t._v(" "),n("div",{staticClass:"container-fluid",staticStyle:{"margin-top":"30px"}},[n("div",{staticClass:"row"},[n("div",{staticClass:"col-md-4 "},[n("form",[n("div",{staticClass:"form-group"},[n("label",{attrs:{for:"exampleInputEmail1"}},[t._v("用户名")]),t._v(" "),n("input",{directives:[{name:"model",rawName:"v-model",value:t.user.name,expression:"user.name"}],staticClass:"form-control",attrs:{type:"text",id:"exampleInputEmail1",placeholder:"用户名"},domProps:{value:t.user.name},on:{input:function(e){e.target.composing||t.$set(t.user,"name",e.target.value)}}})]),t._v(" "),n("div",{staticClass:"form-group"},[n("label",{attrs:{for:"exampleInputPassword1"}},[t._v("年龄")]),t._v(" "),n("input",{directives:[{name:"model",rawName:"v-model",value:t.user.age,expression:"user.age"}],staticClass:"form-control",attrs:{type:"text",id:"exampleInputPassword1",placeholder:"年龄"},domProps:{value:t.user.age},on:{input:function(e){e.target.composing||t.$set(t.user,"age",e.target.value)}}})]),t._v(" "),n("div",{staticClass:"form-group"},[n("label",{attrs:{for:"exampleInputFile"}},[t._v("生日")]),t._v(" "),n("input",{directives:[{name:"model",rawName:"v-model",value:t.user.bir,expression:"user.bir"}],staticClass:"form-control",attrs:{type:"text",id:"exampleInputFile",placeholder:"xxxx-xx-xx"},domProps:{value:t.user.bir},on:{input:function(e){e.target.composing||t.$set(t.user,"bir",e.target.value)}}})]),t._v(" "),n("button",{staticClass:"btn btn-info",attrs:{type:"submit"},on:{click:t.saveUserInfo}},[t._v("提交")])])])])])])},staticRenderFns:[]};var f=n("VU/8")(h,m,!1,function(t){n("ENXK")},"data-v-0b541763",null).exports,_={name:"UserEdit",data:function(){return{user:{id:""}}},methods:{findOne:function(){var t=this;this.$http.get("http://localhost:8989/vue/user/findOne?id="+this.$route.query.id).then(function(e){console.log(e),console.log(e.data),t.user=e.data})},editUSerInfo:function(){var t=this;this.$http.post("http://localhost:8989/vue/user/update",this.user).then(function(e){console.log(e),e.data.success&&t.$router.push("/user")})}},created:function(){console.log("修改组件中获取的id"+this.$route.query.id),this.user.id=this.$route.query.id,this.findOne()}},g={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("h2",[t._v("编辑用户信息")]),t._v(" "),n("form",{attrs:{action:""}},[t._v("\n    用户名："),n("input",{directives:[{name:"model",rawName:"v-model",value:t.user.name,expression:"user.name"}],attrs:{type:"text"},domProps:{value:t.user.name},on:{input:function(e){e.target.composing||t.$set(t.user,"name",e.target.value)}}}),n("br"),t._v("\n    年龄："),n("input",{directives:[{name:"model",rawName:"v-model",value:t.user.age,expression:"user.age"}],attrs:{type:"text"},domProps:{value:t.user.age},on:{input:function(e){e.target.composing||t.$set(t.user,"age",e.target.value)}}}),n("br"),t._v("\n    生日："),n("input",{directives:[{name:"model",rawName:"v-model",value:t.user.bir,expression:"user.bir"}],attrs:{type:"text"},domProps:{value:t.user.bir},on:{input:function(e){e.target.composing||t.$set(t.user,"bir",e.target.value)}}}),n("br"),t._v(" "),n("input",{attrs:{type:"button",value:"修改用户信息"},on:{click:t.editUSerInfo}})])])},staticRenderFns:[]};var b=n("VU/8")(_,g,!1,function(t){n("MHZv")},"data-v-1c5ae1b6",null).exports;s.a.use(i.a);var x=new i.a({routes:[{path:"/",redirect:"/home"},{path:"/home",component:u},{path:"/user",component:v,children:[{path:"userAdd",component:f},{path:"userEdit",component:b}]},{path:"/student",component:p}]}),$=n("mtWM"),w=n.n($);n("qb6w");s.a.prototype.$http=w.a,s.a.config.productionTip=!1,new s.a({el:"#app",router:x,components:{App:a},template:"<App/>"})},qb6w:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.d55cc96c7d77c50cc350.js.map