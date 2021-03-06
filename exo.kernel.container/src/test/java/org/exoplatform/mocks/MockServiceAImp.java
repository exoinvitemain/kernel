/*
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
/**
 * Created by The eXo Platform SAS
 * Author : Mestrallet Benjamin
 *          benjmestrallet@users.sourceforge.net
 * Date: Sep 15, 2003
 * Time: 2:33:02 PM
 */
package org.exoplatform.mocks;

public class MockServiceAImp implements MockServiceA
{

   MockServiceB service;

   public MockServiceAImp(MockServiceB service)
   {
      System.out.println("MockServiceAImp constructor");
      this.service = service;
   }

   public void methodServiceA()
   {
      System.out.println("Method service A");
      service.methodServiceB();
   }

   public void testArguments(String test, int num)
   {
      System.out.println("testArguments, test = " + test + ", num = " + num);
   }
}
