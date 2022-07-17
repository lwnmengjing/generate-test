package com.test.test.controller;

import com.test.test.model.EmailServiceGrpc;
import com.test.test.model.MailRequestDTO;
import com.test.test.model.MailResponseDTO;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import net.devh.boot.grpc.server.service.GrpcService;

@Log4j2
@GrpcService
public class testController extends EmailServiceGrpc.EmailServiceImplBase {

  @Override
  public void sendFormattedMail(MailRequestDTO request,
      StreamObserver<MailResponseDTO> responseObserver) {
    responseObserver.onNext(MailResponseDTO.newBuilder().setResponse("ok").build());
    responseObserver.onCompleted();
  }
}
