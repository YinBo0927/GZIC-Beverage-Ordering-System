package com.example.storage.bean;

import com.example.storage.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int xuhao; // 序号1
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 图的保存路径
    public String pic_path; // 图的保存路径
    public int thumb; // 图的资源编号
    public int pic; // 图的资源编号
    public int type;

    public GoodsInfo() {
        rowid = 0L;
        xuhao = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        type = 0;
    }

    // 声明一个商品的名称数组
    private static String[] mNameArray = {
            "书亦烧仙草", "杨枝甘露烧仙草", "四季春燕麦奶茶", "牛魔王黑砖奶茶", "金桔柠檬", "葡萄柚益菌多", "抹茶红豆拿铁", "超级水果茶", "台湾四季春茶", "茉莉清茶", "焦糖珍奶", "芝士蜜香红玉"
    };
    // 声明一个商品类型的数组
    private static int[] mTypeArray = {
            2, 1, 2, 2, 1, 1, 2, 1, 3, 3, 2, 1
    };
    // 声明一个商品的描述数组
    private static String[] mDescArray = {
            "书亦烧仙草\n\n仙草冻、椰果、红豆、珍珠、花生、葡萄干，六种配料，加上定制红茶与甄选牛奶，完满衬托出配料的自然幽香，一口尽是层次丰厚的满足感。\n" +
                    "夏日，一杯冰凉的烧仙草就能迅速的赶走所有燥热，寒冬热吃，又能疾速遣散寒气。丰厚的配料，是对质量的考究，纯粹的滋味，是对生活的谋求。",
            "杨枝甘露烧仙草\n\n现切芒果打成绵密果浆，再混合芒果与西柚的果肉粒，慢慢倒入仙草冻打底的杯中，每一口都是果汁与果肉糅合的苦涩。浓烈与甜美的搭配，是永远品不腻的滋味。\n" +
                    "似乎电影般色彩的分层，镜头中只有一副旭日西下的水墨画，视野能望到的止境，天地融合，是繁忙后最想看到的风景。",
            "四季春燕麦奶茶\n\n对本人最初级的宠溺，就是谋求嘴巴的满足，又同时达到身材的自律。低糖燕麦与四季春茶的微妙碰撞，面目一新的味觉冲击。\n" +
                    "低脂果腹又能满足味蕾，辛劳一天的你，值得最初级的享用。",
            "牛魔王黑砖奶茶\n\n焦糖味的果冻搭配经典混合茶，交融了数种下等茶叶，淡淡的佛手柑芳香，奶和茶完满的配比，无奈诉说的口感，却让人浮想联翩。",
            "金桔柠檬\n\n大片橙肉，颗颗丰满，粒粒新颖，青桔香气浓烈，酸甜过度，幽香满溢，再退出淡淡的绿茶，满杯清新，似乎夏日雨后的温馨，一口就能让人迅速失陷。",
            "葡萄柚益菌多\n\n新颖葡萄柚与益菌多的相遇，少了酸爽香甜的霸气，却多了清甜浓香的小确幸，酸酸甜甜的味道在唇齿间流转，青春的气味迎面扑来。\n" +
                    "一杯葡萄柚，是一夏天的活力力气，是满满的粉红少女心。",
            "抹茶红豆拿铁\n\n红豆和抹茶几乎就是最治愈的色调搭配，抹茶和拿铁的青涩与红豆的软糯苦涩在舌尖开展一场巅峰比赛，\n" +
                    "最终化为满满的幽香和回味，治愈系的一抹绿，不喝会惦记，喝了会怀念。",
            "超级水果茶\n\n好果配好茶，七种水果，满满的维C，超丰厚的味觉体验，四季春茶的幽香齐全不会掩盖水果的滋味，浅闻花果香气浓烈，饮时鲜甜之味，霎时沁入心间。\n" +
                    "一口茶一口水果，每一丝都是喜悦的滋味，解暑新技艺GET。",
            "台湾四季春茶\n\n四季春茶加冰，极致的简略能力凸显原料的新颖，源于自然的素香浓艳，弥散在炎炎夏日，彷徨在唇齿之间，适宜喜欢少糖的健康主义。",
            "茉莉清茶\n\n茉莉清茶味道温润醇和，如齿间划过的凉风，清爽浓艳，没有多余的增加，复原了茶叶未加润饰和润色的本来魅力.\n" +
                    "冰块沉没其中，凝固了茶叶的醇香，在清爽中平添了一份冷冽和俗气，一杯茉莉清茶，不落俗尘自有热闹。",
            "焦糖珍奶\n\n百分百木薯圆珍珠，全发酵红茶，浓烈焦糖风味，口感舒润醇厚，纵然天生绝配的焦糖+奶茶，也难以回绝Q弹珍珠的退出，每一杯逾越味觉的探究都会让人上瘾。",
            "芝士蜜香红玉\n\n咸芝士奶盖茶里的当红小生，第一口感触前段芝士的浓烈细腻，第二口品味后段红茶馥郁的茶香和略带花香的回甘。\n" +
                    "浓烈但不清淡，幽香又不寡淡，全新的味觉享用。"
    };
    // 声明一个商品的价格数组
    private static float[] mPriceArray = {10, 15, 12, 13, 10, 15, 13, 20, 8, 8, 10, 9};
    // 声明一个商品的小图数组
    private static int[] mThumbArray = {
            R.mipmap.shuyi, R.mipmap.yangzhiganlu, R.mipmap.yanmais,
            R.mipmap.niumowangs, R.mipmap.jinjus, R.mipmap.putaos, R.mipmap.mochas, R.mipmap.shuiguos, R.mipmap.sijichuns, R.mipmap.molis, R.mipmap.jiaotangs, R.mipmap.zhishis
    };
    // 声明一个商品的大图数组
    private static int[] mPicArray = {
            R.mipmap.shuyis, R.mipmap.yangzhiganlus, R.mipmap.yanmai,
            R.mipmap.niumowang, R.mipmap.jinju, R.mipmap.putao, R.mipmap.mocha, R.mipmap.shuiguo, R.mipmap.sijichun, R.mipmap.moli, R.mipmap.jiaotang, R.mipmap.zhishi
    };

    // 获取默认的信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            info.type = mTypeArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }

}
