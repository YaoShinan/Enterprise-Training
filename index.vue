<template>
	<view class="">
		<!-- <image class="logo" src="/static/logo.png"></image>
		<view class="text-area">
			<text class="title">{{title}}</text>
		</view> -->
		<view class="uni-margin-wrap">
			<swiper class="swiper" circular :indicator-dots="indicatorDots" :autoplay="autoplay" :interval="interval"
				:duration="duration">
				<swiper-item>
					<!-- <view class="swiper-item uni-bg-red" style="background-color: red;">A</view> -->
					<image src="../../static/1.png"></image>
				</swiper-item>
				<swiper-item>
					<image src="../../static/2.jpg"></image>
				</swiper-item>
				<swiper-item>
					<image src="../../static/3.jpg"></image>
				</swiper-item>
			</swiper>
		</view>
		
		

		<!--九宫格-->
		<uni-section title="同学们模块矩阵" type="line" padding>
			<uni-grid :column="3" :square="false" :highlight="false" @change="change">
				<uni-grid-item v-for="(item, index) in list" :index="index" :key="index">
					<view class="grid-item-box">
						<image :src="item.url" class="image" mode="aspectFill" />
						<text class="text">{{ item.text }}</text>
					</view>
				</uni-grid-item>
			</uni-grid>
		</uni-section>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				background: ['color1', 'color2', 'color3'],
				indicatorDots: true,
				autoplay: true,
				interval: 2000,
				duration: 500,
				list: [
					{url: '/static/logo.png',text: 'A同学',badge: '0',type: "primary"},
					{url: '/static/logo.png',text: 'B同学',badge: '1',type: "success"},
					{url: '/static/logo.png',text: 'C同学',badge: '99',type: "warning"},
					{url: '/static/logo.png',text: 'D同学',badge: '2',type: "error"},
					{url: '/static/logo.png',text: 'Grid 5'},
					{url: '/static/logo.png',text: 'Grid 6'},
					{url: '/static/logo.png',text: 'Grid 7'},
					{url: '/static/logo.png',text: 'Grid 8'},
					{url: '/static/logo.png',text: 'Grid 9'}
				]
			}
		},
	onLoad() {

		},
		methods: {
			changeIndicatorDots(e) {
				this.indicatorDots = !this.indicatorDots
			},
			changeAutoplay(e) {
				this.autoplay = !this.autoplay
			},
			intervalChange(e) {
				this.interval = e.target.value
			},
			durationChange(e) {
				this.duration = e.target.value
			}
		}
	}
</script>

<style>
	.content {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}

	.logo {
		height: 200rpx;
		width: 200rpx;
		margin-top: 200rpx;
		margin-left: auto;
		margin-right: auto;
		margin-bottom: 50rpx;
	}

	.text-area {
		display: flex;
		justify-content: center;
	}

	.title {
		font-size: 36rpx;
		color: #8f8f94;
	}

	.uni-margin-wrap {
		width: 690rpx;
		width: 100%;
	}

	.swiper {
		height: 300rpx;
	}

	.swiper-item {
		display: block;
		height: 300rpx;
		line-height: 300rpx;
		text-align: center;
	}

	.swiper-list {
		margin-top: 40rpx;
		margin-bottom: 0;
	}

	.uni-common-mt {
		margin-top: 60rpx;
		position: relative;
	}

	.info {
		position: absolute;
		right: 20rpx;
	}

	.uni-padding-wrap {
		width: 550rpx;
		padding: 0 100rpx;
	}
	
	/*九宫格的样式*/
		.image {
				width: 25px;
				height: 25px;
			}

		.text {
			font-size: 14px;
			margin-top: 5px;
		}
	
		.example-body {
			/* #ifndef APP-NVUE */
			// display: block;
			/* #endif */
		}
	
		.grid-dynamic-box {
			margin-bottom: 15px;
		}
	
		.grid-item-box {
			flex: 1;
			// position: relative;
			/* #ifndef APP-NVUE */
			display: flex;
			/* #endif */
			flex-direction: column;
			align-items: center;
			justify-content: center;
			padding: 15px 0;
		}
	
		.grid-item-box-row {
			flex: 1;
			// position: relative;
			/* #ifndef APP-NVUE */
			display: flex;
			/* #endif */
			flex-direction: row;
			align-items: center;
			justify-content: center;
			padding: 15px 0;
		}
	
		.grid-dot {
			position: absolute;
			top: 5px;
			right: 15px;
		}
		/* #ifdef H5 */
		@media screen and (min-width: 768px) and (max-width: 1425px) {
			.swiper {
				height: 630px;
			}
		}
	
		@media screen and (min-width: 1425px) {
			.swiper {
				height: 830px;
			}
		}
	
		/* #endif */
</style>