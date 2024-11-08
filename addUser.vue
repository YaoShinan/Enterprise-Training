<template>
	<view>
		<uni-section title="用户信息" type="line">
			<view class="example">
				<!-- 基础用法，不包含校验规则 -->
				<uni-forms ref="valiForm" :rules="rules" :modelValue="user">
					<uni-forms-item label="账号" required name="username">
						<uni-easyinput v-model="user.username" placeholder="请输入账号" />
					</uni-forms-item>
					<uni-forms-item label="密码" required name="password">
						<uni-easyinput v-model="user.password" placeholder="请输入密码" />
					</uni-forms-item>
					<uni-forms-item label="用户\n类型" required name="userType">
						<uni-data-checkbox v-model="user.userType" :localdata="types" />
					</uni-forms-item>
					<uni-forms-item label="年龄" required name="age">
						<uni-easyinput v-model="user.age" placeholder="请输入年龄" />
					</uni-forms-item>
					<uni-forms-item label="性别" required name="sex">
						<uni-data-checkbox v-model="user.sex" :localdata="sexs" />
					</uni-forms-item>
					<uni-forms-item label="电话\n号码" required name="phone">
						<uni-easyinput v-model="user.phone" placeholder="请输入电话号码" />
					</uni-forms-item>
					<uni-forms-item label="头像" required name="image">
						<view class="example-body">
							<uni-file-picker limit="1" title="请选择头像" 
							@select="uploadFile" ></uni-file-picker>
						</view>
					</uni-forms-item>
					<uni-forms-item label="日期时间">
						<uni-datetime-picker type="datetime" return-type="timestamp" v-model="user.datetimesingle" />
					</uni-forms-item>

					<button type="primary" @click="submit('valiForm')">提交</button>
				</uni-forms>
			</view>
		</uni-section>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				// 基础表单数据
				user: {
					username: '',
					password: '',
					userType: '管理员',
					age: '',
					sex: '男',
					phone: '',
					datetimesingle: 1627529992399
				},
				// 表单数据
				alignmentFormData: {
					username: '',
					password: '',
					age: '',
				},
				// 单选数据源
				sexs: [{
						text: '男',
						value: '男'
					},
					{
						text: '女',
						value: '女'
					},
					{
						text: '保密',
						value: '保密'
					}
				],
				types: [{
						text: '管理员',
						value: '管理员'
					},
					{
						text: '普通用户',
						value: '普通用户'
					}
				],
				// 分段器数据
				current: 0,
				// 校验表单数据
				valiFormData: {
					username: '',
					password: '',
					userType: '管理员',
					age: '',
					sex: '男',
					phone: ''
				},
				imageUrl:'',
				// 校验规则
				rules: {
					username: {
						rules: [{
							required: true,
							errorMessage: '账号不能为空'
						}]
					},
					password: {
						rules: [{
							required: true,
							errorMessage: '密码不能为空'
						}]
					},
					age: {
						rules: [{
							required: true,
							errorMessage: '年龄不能为空'
						}, {
							format: 'number',
							errorMessage: '年龄只能输入数字'
						}]
					}
					
				}
			}
		},
		computed: {},
		onLoad() {},
		onReady() {
			// 设置自定义表单校验规则，必须在节点渲染完毕后执行
			//this.$refs.customForm.setRules(this.customRules)
		},
		methods: {
			onClickItem(e) {
				console.log(e);
				this.current = e.currentIndex
			},
			add() {},
			del(id) {},
			submit(ref) {
				var that = this;
				this.$refs[ref].validate().then(res => {
					console.log('success', res);
					/* uni.showToast({
						title: `校验通过`
					}) */
					res.image = that.imageUrl;
					console.log(res);
					uni.request({
						url: "/api/addUser",
						method: "POST",
						data: JSON.stringify(res),
						header: {
							"contentType": "application/json"
						},
						success: function(data) {
							console.log(777);
							console.log(data);
							uni.showToast({
								title: `添加成功`
							});
							that.user = {}
						}
					})
				}).catch(err => {
					console.log('err', err);
				})
			},
			uploadFile(e) {
				var that=this;
				console.log(55);
				console.log(e);
				uni.uploadFile({
					url: "/api/uploadFile",
					filePath:e.tempFilePaths[0],
					name:"file",
					success:function(data){
						console.log(555);
						console.log(JSON.parse(data.data).src);
						that.imageUrl=JSON.parse(data.data).src;
					}
				})
			}
		}
	}
</script>

<style>
	.example {
		padding: 15px;
		background-color: #fff;
	}

	.segmented-control {
		margin-bottom: 15px;
	}

	.button-group {
		margin-top: 15px;
		display: flex;
		justify-content: space-around;
	}

	.form-item {
		display: flex;
		align-items: center;
	}

	.button {
		display: flex;
		align-items: center;
		height: 35px;
		margin-left: 10px;
	}
</style>