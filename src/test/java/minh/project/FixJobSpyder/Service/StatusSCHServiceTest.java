package minh.project.FixJobSpyder.Service;

import com.google.protobuf.InvalidProtocolBufferException;
import minh.project.message.SpyderNotifySourceId;
import minh.project.message.SpyderNotifyToWeaponMessage;
import minh.project.message.SpyderSchStatus;
import minh.project.message.StateFightReady;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
class StatusSCHServiceTest {

    @Autowired
    StatusSCHService service;
    @Test
    void sendStatusSCH() throws InvalidProtocolBufferException {
//        StatusSCHService service= new StatusSCHService();
        service.setSourceName("d61-Spyder");
        service.setMsgId(SpyderNotifyToWeaponMessage.msgIdentify.STATUS_SCH);
        service.setSchId(SpyderNotifySourceId.newBuilder().setSic(0).setSac(0).build());
        LocalTime now = LocalTime.now(); // LocalTime = 14:42:43.062
        service.setTime(now.toSecondOfDay());
        service.setStatus(SpyderSchStatus.newBuilder().setCentralStatus(1)
                .setStateFightReady(StateFightReady.newBuilder().
                        setLevel(StateFightReady.FIGHT_LEVEL.FIGHT_LEVEL1).
                        setState(StateFightReady.STATE_FIGHT_READY.INTENSIFY)).build()
                );
//        service.SendStatusSCH();
    }
}