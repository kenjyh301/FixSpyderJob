package minh.project.FixJobSpyder.Service;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.Data;

import lombok.NoArgsConstructor;
import minh.project.message.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@Data
@NoArgsConstructor
public class StatusSCHService {
    private ManagedChannel spyderChannel;
    private String sourceName;
    private SpyderNotifyToWeaponMessage.msgIdentify msgId;
    private SpyderNotifySourceId schId;
    private double time;
    private SpyderSchStatus status;
    @Value("192.168.205.46")
    String channelName;
    @Value("32523")
    int channelPort;

//    public StatusSCHService(){
//        spyderChannel= ManagedChannelBuilder.forAddress(channelName,channelPort).usePlaintext().build();
//        this.setSourceName("d61-Spyder");
//        this.setMsgId(SpyderNotifyToWeaponMessage.msgIdentify.STATUS_SCH);
//        this.setSchId(SpyderNotifySourceId.newBuilder().setSic(0).setSac(0).build());
//        LocalTime now = LocalTime.now(); // LocalTime = 14:42:43.062
//        this.setTime(now.toSecondOfDay());
//        this.setStatus(SpyderSchStatus.newBuilder().setCentralStatus(1)
//                .setStateFightReady(StateFightReady.newBuilder().
//                        setLevel(StateFightReady.FIGHT_LEVEL.FIGHT_LEVEL1).
//                        setState(StateFightReady.STATE_FIGHT_READY.INTENSIFY)).build()
//        );
//    }


//    public void SendStatusSCH(){
//        LocalTime now = LocalTime.now(); // LocalTime = 14:42:43.062
//        this.setTime(now.toSecondOfDay());
//        SpyderNotificationServiceGrpc.SpyderNotificationServiceBlockingStub stub= SpyderNotificationServiceGrpc.newBlockingStub(spyderChannel);
//        SpyderNotifyToWeaponMessage message= SpyderNotifyToWeaponMessage.newBuilder().setSourceName(sourceName)
//                                                .setMsgId(msgId).setSchId(schId).setTime(time).setSchStatus(status).build();
//        stub.sendNotificationToSpyderMessage(message);
//    }
}
