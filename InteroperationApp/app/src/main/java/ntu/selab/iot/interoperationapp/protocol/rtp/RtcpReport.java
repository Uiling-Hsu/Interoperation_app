/*******************************************************************************
 * Software Name : RCS IMS Stack
 *
 * Copyright (C) 2010 France Telecom S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ntu.selab.iot.interoperationapp.protocol.rtp;

/**
 * RTCP report
 * 
 * @author jexa7410
 */
public class RtcpReport {
        public int ssrc;
        public int fractionlost;
        public int packetslost;
        public long lastseq;
        public int jitter;
        public long lsr;
        public long dlsr;
        public long receiptTime;

        public long getDLSR() {
                return dlsr;
        }

        public int getFractionLost() {
                return fractionlost;
        }

        public long getJitter() {
                return (long) jitter;
        }

        public long getLSR() {
                return lsr;
        }

        public long getNumLost() {
                return (long) packetslost;
        }

        public long getSSRC() {
                return (long) ssrc;
        }

        public long getXtndSeqNum() {
                return lastseq;
        }
}