<template>
	<view>
		<uni-list-chat v-for="item in userList" :title="item.username" :avatar="'http://localhost:8888'+item.image"
			:note="item.username+'\n'+item.password+'\n'+item.age+'\n'+item.sex" time="2020-02-02 20:20"
			badge-positon="left">
		</uni-list-chat>

		<!-- 添加按钮 :content="content"-->
		<uni-fab ref="fab" :pattern="pattern" :horizontal="horizontal" :vertical="vertical" :direction="direction"
			@trigger="trigger" @fabClick="fabClick" />
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'uni-fab',
				horizontal: 'right',
				vertical: 'bottom',
				direction: 'horizontal',
				pattern: {
					color: '#7A7E83',
					backgroundColor: '#fff',
					selectedColor: '#007AFF',
					buttonColor: '#007AFF',
					iconColor: '#fff'
				},

				userList: [{
						id: 1,
						username: "张三",
						password: "123",
						age: 12,
						sex: "男",
						phone: "10000",
						image: "static"
					},
					{
						id: 2,
						username: "李四",
						password: "123",
						age: 12,
						sex: "男",
						phone: "10000",
						image: "123"
					},
				]
			}
		},
		onLoad() {
			this.getUsers(); //启动页面时候调用函数
		},
		onPullDownRefresh() {
			console.log('在刷新数据');
			var that = this;
			setTimeout(function() {
				uni.request({
					url: "/api/getUsers",
					type: "get",
					success: res => {
						console.log(88);
						console.log(res.data);
						res.data[0].username=res.data[0].username+new Date().getTime();
						console.log(that.userList);
						that.userList = [...res.data,...that.userList];
					}
				})
				uni.stopPullDownRefresh(); //终止下拉刷新
			}, 2000);
		},
		onReachBottom(){//下拉操作
			console.log('我已经到底部了');
			var that = this;
			uni.request({
				url: "/api/getUsers",
				type: "get",
				success: res => {
					console.log(88);
					console.log(res.data);
					res.data[0].sex=res.data[0].sex+new Date().getTime();
					console.log(that.userList);
					that.userList = [...that.userList,...res.data];
				}
			})
		},
		methods: {
			fabClick() {
				/* uni.showToast({
					title: '点击了悬浮按钮',
					icon: 'none'
				}); */
				//跳转路由
				uni.navigateTo({
					url: "/pages/User/addUser"
				})
			},
			getUsers() {
				uni.request({
					url: "/api/getUsers",
					type: "get",
					success: res => {
						console.log(88);
						console.log(res.data);
						this.userList = res.data;
					}
				})
			}

		}
	}
</script>

<style>

</style>