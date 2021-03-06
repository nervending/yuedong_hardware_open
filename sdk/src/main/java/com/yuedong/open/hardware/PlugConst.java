package com.yuedong.open.hardware;

import android.net.Uri;

/**
 * Created by virl on 16/1/19.
 */
public class PlugConst {
    //    用户信息 json对应key
    public static final String kKeyUserId = "uid";  //对应string
    public static final String kKeyGender = "gender";   //对应性别
    public static final int kGenderMale = 1;
    public static final int kGenderFemale = 0;
    public static final String kKeyNickname = "nickname";   //昵称 string
    public static final String kKeyBirthday = "birthday"; //年龄 long 单位秒
    public static final String kKeyAvatarPath = "avatar_path";  //头像文件路径
    public static final String kKeyHeight = "height";   // int 身高cm
    public static final String kKeyWeight = "weight_g";   // int 身高cm

    //    插件收到注册的Action intent中Action的key
    public static final String kActionKey = "action";   //对应String 如下

//    开始运动
    public static final String kActionStartSport = "sport_start";
//    结束运动
    public static final String kActionFinishSport = "sport_finish";
//    运动数据更新
    public static final String kActionSportDataUpdate = "sport_data_update";
//    暂停跑步
    public static final String kActionPauseSport = "sport_pause";
//    继续跑步
    public static final String kActionRestartSport = "sport_restart";

    //  下面两个Action用于插件发送广播触发跑步暂停继续结束
    public static final String kBroadCastActionPauseSport = "com.yuedong.sport_pause";
    public static final String kBroadCastActionRestartSport = "com.yuedong.sport_restart";

    //    action 唤醒插件 应用会在启动或定时发送该action 插件收到该action后 从硬件读取数据
    public static final String kActionWakeUp = "wake_up";
    //    应用会定时发送该action 保持插件service长时间存活
    public static final String kActionKeepAlive = "keep_alive";
    //    应用会在蓝牙设备状态发生变化后广播该Action
    public static final String kActionBluetoothStatusChanged = "bluetooth_status_changed";
    //    应用请求插件暂时释放蓝牙资源
    public static final String kActionReleaseBluetooth = "release_bluetooth";
    //    蓝牙状态改变时 intent中的另一个key 对应一个boolean 表示蓝牙是否可用
    public static final String kBluetoothStatus = "bluetooth_status";   //对应 boolean

//    public static final String kPlugServicePkg = "com.yuedong.open.hardware";

    public static final String kActionPhoneNewCallIn = "new_call";
    public static final String kActionPhoneNewSMS = "new_sms";
    public static final String kActionNewNotification = "new_notification";
    public static final String kKeyNotificationPkgName = "package_name";
    public static final String kKeyExtras = "extras";
    public static final String kKeyNotificationTickerText = "ticker_text";
    public static final String kKeySmsContent = "content";
    public static final String kKeySmsSender = "sender";

    //    执行绑定操作等对应的Service
    public static final String kPlugServiceName = "com.yuedong.yue.open.hardware.YDHardwarePlugService";
    //  TODO 只有测试demo使用该值
    public static final String kPlugServicePkg = "com.yuedong.sport";
//    kActionStartSport，kActionFinishSport，kActionSportDataUpdate
    public static final String kKeySportType = "sport_type";    //string 对应run/riding分别为跑步骑行
    public static final String kKeySportDistanceM = "sport_distance"; //运动距离 float 米
    public static final String kKeySportTimeOfDuration = "sport_time_of_duration"; //运动持续时间 long 单位s
    public static final String kKeySportSpeed = "sport_speed"; //当前速度m/s

    //    contentProvider对应数据表
    //    天气
    public static final String kTableWeather = "weather";
//    手环计步数据
    public static final String kTableSteps = "step_calculation_table_name";
    //    睡眠质量
    public static final String kTableSleep = "sleep_table_name";
    //    心率数据表
    public static final String kTableHeartRate = "heart_rate_table_name";
    //    智能体重称
    public static final String kTableIntelligentScale = "intelligent_scale_table_name";
    //    实时步数 使用update, 即设置当天实时, query 查讯最后一次设置的, 如果不是同一天或没有数据 则cursor没有数据返回 即cursor.getCount() = 0
    public static final String kTableRealTimeStep = "real_time_step_table";

    //    用户今日目标获取 现在只有步数
    public static final String kTableUserSportTarget = "user_sport_target";

    //     用户信息
    public static final String kTableUserInfo = "user_info";

    //    每个table对应cols
    public static final String kColId = "_id";       //
    public static final String kColDeviceIdentify = "device_identify";  //应用分配的设备标志 string
    public static final String kColExtra = "extra";                 //string json格式字符串 额外信息 插件可自定义存储
    public static final String kColStepCount = "step_count";    // int
    public static final String kColDistanceM = "dis_m";    // float
    public static final String kColCalorie = "calorie";         // int 小卡
    public static final String kColStartTSec = "start_time_sec";    //long
    public static final String kColEndTSec = "end_time_sec";        //long
    public static final String kColSleepSection = "sleep_section";
    //int 睡眠阶段 1234 分别对应非快眼动睡眠的四个阶段 5 对应快眼动睡眠，0对应清醒
    //I、II期称“浅睡眠”，III、IV期称为“深睡眠
    public static final String kColHeartRate = "heart_rate";    //心率 每分钟 int
    public static final String kColTimeSec = "time_sec";        // long
    public static final String kColWeightG = "weight_g";        // int
    public static final String kColBodyFatPercentage = "body_fat_per";   // float 0 ~ 100
    public static final String kColBodyMusclePercentage = "body_muscle_per"; // float 0~100
    public static final String kColBodyMassIndex = "body_mass_index"; // float 0~100
    public static final String kColBasalMetabolismRate = "basal_metabolism_rate"; //float
    public static final String kColBodyWaterPercentage = "body_water_percentage"; //float
    public static final String kColUserInfoHeightCm = "height_cm"; //int

    public static final String kColUserInfoGender = "gender"; // 1 男性 0女性
    public static final String kColUserInfoBirthday = "birthday"; // long 出生时间 单位秒
    public static final String kColUserInfoWeightG = "weight_g";

    public static final String kColWeather = "weather"; // string '晴','雨','阴','云','雪','雾','雷','沙'
    public static final String kColTemperatureC = "temperature"; // 温度 摄氏度
    public static final String kColPM25 = "pm25"; //pm2.5

    /*
    计步
    kColId,kColDeviceIdentify,kColStepCount,kColStartTSec,kColEndTSec,kColDistanceM, kColCalorie

    实时步数
    kColDeviceIdentify, kColStepCount, kColDistanceM, kColCalorie

    睡眠部分
    kColId,kColDeviceIdentify,kColStartTSec,kColEndTSec, kColSleepSection

    心率
    kColId,kColDeviceIdentify,kColHeartRate,kColTimeSec

    智能秤
    kColId,kColDeviceIdentify,kColTimeSec, kColWeightG,
    kColBodyFatPercentage, kColBodyMusclePercentage, kColBodyMassIndex
    kColBasalMetabolismRate,kColBodyWaterPercentage, kColExtra

    用户信息
    kColUserInfoHeightCm, kColUserInfoGender, kColUserInfoBirthday kColUserInfoWeightG
    用户运动目标
    kColStepCount

    按需使用设置哪个更新哪个
     */

    //    contentProvider相关
    public static final String AUTOHORITY = "com.yuedong.sport.yue.open.hardware";

    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.yuedong.hardware";
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.yuedong.hardware";

    public static final Uri STEP_CALCULATION_URI = Uri.parse("content://" + AUTOHORITY + "/"+ kTableSteps);
    public static final Uri SLEEP_URI = Uri.parse("content://" + AUTOHORITY + "/"+ kTableSleep);
    public static final Uri HEART_RATE_URI = Uri.parse("content://" + AUTOHORITY + "/"+ kTableHeartRate);
    public static final Uri INTELLIGENT_SCALE_URI = Uri.parse("content://" + AUTOHORITY + "/"+ kTableIntelligentScale);
    public static final Uri URI_WEATHER = Uri.parse("content://" + AUTOHORITY + "/"+ kTableWeather);

    public static final int kTestUid = 2267576;
}
