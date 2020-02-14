package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(encryption.actions.DecryptString.class);
    registrator.registerUserAction(encryption.actions.EncryptString.class);
    registrator.registerUserAction(encryption.actions.GeneratePGPKeyRing.class);
    registrator.registerUserAction(encryption.actions.PGPDecryptDocument.class);
    registrator.registerUserAction(encryption.actions.PGPEncryptDocument.class);
    registrator.registerUserAction(encryption.actions.ValidatePrivateKeyRing.class);
    registrator.registerUserAction(kafka.actions.GetMessagesFromOffset.class);
    registrator.registerUserAction(kafka.actions.GetPartitionOffsets.class);
    registrator.registerUserAction(kafka.actions.GetPosition.class);
    registrator.registerUserAction(kafka.actions.InitializeKafka.class);
    registrator.registerUserAction(kafka.actions.ListTopics.class);
    registrator.registerUserAction(kafka.actions.SendAsynchronous.class);
    registrator.registerUserAction(kafka.actions.SendSynchronous.class);
    registrator.registerUserAction(kafka.actions.StartConsumer.class);
    registrator.registerUserAction(kafka.actions.StartFilteredProcessor.class);
    registrator.registerUserAction(kafka.actions.StartProcessor.class);
    registrator.registerUserAction(kafka.actions.StartProducer.class);
    registrator.registerUserAction(kafka.actions.StopAll.class);
    registrator.registerUserAction(kafka.actions.StopProcessor.class);
    registrator.registerUserAction(kafka.actions.StopProducer.class);
    registrator.registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
    registrator.registerUserAction(mxmodelreflection.actions.SyncObjects.class);
    registrator.registerUserAction(mxmodelreflection.actions.TestThePattern.class);
    registrator.registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
