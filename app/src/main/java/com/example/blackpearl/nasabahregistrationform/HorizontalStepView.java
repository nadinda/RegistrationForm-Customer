//package com.example.blackpearl.nasabahregistrationform;
//
//import android.support.v4.content.ContextCompat;
//
//import com.baoyachi.stepview.bean.StepBean;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Black Pearl on 22/03/2018.
// */
//
//public class HorizontalStepView {
//
//    HorizontalStepView setpview5 = (HorizontalStepView) mView.findViewById(R.id.step_view5);
//    List<StepBean> stepsBeanList = new ArrayList<>();
//    StepBean stepBean0 = new StepBean("接单",1);
//    StepBean stepBean1 = new StepBean("打包",1);
//    StepBean stepBean2 = new StepBean("出发",1);
//    StepBean stepBean3 = new StepBean("送单",0);
//    StepBean stepBean4 = new StepBean("完成",-1);
//        stepsBeanList.add(stepBean0);
//        stepsBeanList.add(stepBean1);
//        stepsBeanList.add(stepBean2);
//        stepsBeanList.add(stepBean3);
//        stepsBeanList.add(stepBean4);
//
//
//        setpview5
//                .setStepViewTexts(stepsBeanList)//总步骤
//            .setTextSize(12)//set textSize
//            .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(getActivity(), android.R.color.white))              //StepsViewIndicator
//            .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(getActivity(), R.color.uncompleted_text_color))   //StepsViewIndicator
//            .setStepViewComplectedTextColor(ContextCompat.getColor(getActivity(), android.R.color.white))                       //StepsView text
//            .setStepViewUnComplectedTextColor(ContextCompat.getColor(getActivity(), R.color.uncompleted_text_color))            //StepsView text
//            .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getActivity(), R.drawable.complted))                   //StepsViewIndicator CompleteIcon
//            .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getActivity(), R.drawable.default_icon))                //StepsViewIndicator DefaultIcon
//            .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getActivity(), R.drawable.attention));                //StepsViewIndicator AttentionIcon
//}
