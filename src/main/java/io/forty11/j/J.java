/*
 * Copyright 2008-2017 Wells Burke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.forty11.j;

import java.util.List;

import io.forty11.j.api.Lang;
import io.forty11.j.api.Strings;

/**
 * Collection of utility methods designed simplify Java programming.
 * simpler in the Java language.  This class is designed to be extended
 * or have methods statically imported into client classes.
 *
 * This class is automatically generated by <code>Gen</code>.
 *
 * @author Wells Burke
 */
public class J
{
   /*
   +------------------------------------------------------------------------------+
   | Start Genreated Code
   +------------------------------------------------------------------------------+
   */

   public static List<String> explode(String str, String delim){ try{return io.forty11.j.api.Strings.explode(str,delim);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.Object[] asArray(java.lang.Iterable arg0){ try{return io.forty11.j.api.Lang.asArray(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.Object[] asArray(java.util.Collection arg0){ try{return io.forty11.j.api.Lang.asArray(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List asList(java.lang.Iterable arg0){ try{return io.forty11.j.api.Lang.asList(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List asList(java.util.Iterator arg0){ try{return io.forty11.j.api.Lang.asList(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List asList(io.forty11.j.it.It arg0){ try{return io.forty11.j.api.Lang.asList(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List asList(java.lang.Object... arg0){ try{return io.forty11.j.api.Lang.asList(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static double atod(java.lang.String arg0){ try{return io.forty11.j.api.Lang.atod(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static float atof(java.lang.String arg0){ try{return io.forty11.j.api.Lang.atof(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static int atoi(java.lang.String arg0){ try{return io.forty11.j.api.Lang.atoi(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static long atol(java.lang.String arg0){ try{return io.forty11.j.api.Lang.atol(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List childElements(org.w3c.dom.Node arg0){ try{return io.forty11.j.api.Xml.childElements(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String chop(java.lang.String arg0, int arg1){ try{return io.forty11.j.api.Strings.chop(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String chunk(java.lang.String arg0, int arg1){ try{return io.forty11.j.api.Paths.chunk(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String[] chunks(java.lang.String arg0){ try{return io.forty11.j.api.Paths.chunks(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void close(java.lang.Object... arg0){ try{io.forty11.j.api.Lang.close(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void close(java.io.Closeable arg0){ try{io.forty11.j.api.Streams.close(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean contains(String string, String target){return Strings.contains(string, target);}
   public static void copy(java.io.File arg0, java.io.File arg1){ try{io.forty11.j.api.Files.copy(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean copy(java.io.File arg0, java.io.File arg1, java.io.File arg2){ try{return io.forty11.j.api.Files.copy(arg0, arg1, arg2);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void copyFields(java.lang.Object arg0, java.lang.Object arg1){ try{io.forty11.j.api.Lang.copyFields(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.io.File createTempFile(java.io.File arg0){ try{return io.forty11.j.api.Files.createTempFile(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.io.File createTempFile(java.lang.String arg0){ try{return io.forty11.j.api.Files.createTempFile(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.Date date(java.lang.String date, java.lang.String format){ try{return io.forty11.j.api.Lang.date(date, format);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.Date date(java.lang.String arg0){ try{return io.forty11.j.api.Lang.date(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean delete(java.io.File arg0){ try{return io.forty11.j.api.Files.delete(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean empty(java.lang.Object arg0){ try{return io.forty11.j.api.Lang.empty(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean equal(java.lang.Object arg0, java.lang.Object arg1){ try{return io.forty11.j.api.Lang.equal(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void err(java.lang.Object... arg0){ try{io.forty11.j.api.Streams.err(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.io.File file(java.lang.String arg0){ try{return io.forty11.j.api.Files.file(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.io.InputStream findInputStream(java.lang.String arg0){ try{return io.forty11.j.api.Streams.findInputStream(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void flush(java.io.Flushable arg0){ try{io.forty11.j.api.Streams.flush(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String forHTML(java.lang.String arg0){ try{return io.forty11.j.api.Strings.forHTML(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String forRegex(java.lang.String arg0){ try{return io.forty11.j.api.Strings.forRegex(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String forScriptTagsOnly(java.lang.String arg0){ try{return io.forty11.j.api.Strings.forScriptTagsOnly(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String forURL(java.lang.String arg0){ try{return io.forty11.j.api.Strings.forURL(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String forXML(java.lang.String arg0){ try{return io.forty11.j.api.Strings.forXML(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String formatDate(java.util.Date arg0){ try{return io.forty11.j.api.Lang.formatDate(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String formatDate(java.util.Date arg0,java.lang.String arg1){ try{return io.forty11.j.api.Lang.formatDate(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String fromCamelCase(java.lang.String arg0){ try{return io.forty11.j.api.Strings.fromCamelCase(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.Throwable getCause(java.lang.Throwable arg0){ try{return io.forty11.j.api.Lang.getCause(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.reflect.Field getField(java.lang.String arg0, java.lang.Class arg1){ try{return io.forty11.j.api.Lang.getField(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List<java.lang.reflect.Field> getFields(java.lang.Class arg0){ try{return io.forty11.j.api.Lang.getFields(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getLineSeparator(){ try{return io.forty11.j.api.Shell.getLineSeparator();}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.reflect.Method getMethod(java.lang.Class arg0, java.lang.String arg1){ try{return io.forty11.j.api.Lang.getMethod(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.reflect.Method getMethod(java.lang.Class arg0, java.lang.String arg1, java.lang.Class... arg2){ try{return io.forty11.j.api.Lang.getMethod(arg0, arg1, arg2);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List getMethods(java.lang.Class arg0, java.lang.String arg1){ try{return io.forty11.j.api.Lang.getMethods(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getPathSeparator(){ try{return io.forty11.j.api.Shell.getPathSeparator();}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.Object getProperty(java.lang.String arg0, java.lang.Object arg1){ try{return io.forty11.j.api.Lang.getProperty(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.Object getProperty(java.lang.String arg0, java.lang.Object arg1, java.lang.Object arg2){ try{return io.forty11.j.api.Lang.getProperty(arg0, arg1, arg2);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getShortCause(java.lang.Throwable arg0, int arg1){ try{return io.forty11.j.api.Lang.getShortCause(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getShortCause(java.lang.Throwable arg0){ try{return io.forty11.j.api.Lang.getShortCause(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.util.List getStackTraceLines(java.lang.Throwable arg0){ try{return io.forty11.j.api.Lang.getStackTraceLines(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getStackTraceString(java.lang.Thread arg0){ try{return io.forty11.j.api.Lang.getStackTraceString(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getStackTraceString(java.lang.Throwable arg0){ try{return io.forty11.j.api.Lang.getStackTraceString(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String getStackTraceString(java.lang.Thread arg0, java.lang.StackTraceElement[] arg1){ try{return io.forty11.j.api.Lang.getStackTraceString(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static int getTerminalWidth(){ try{return io.forty11.j.api.Shell.getTerminalWidth();}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static String hash(byte[] arg0, java.lang.String arg1){ try{return io.forty11.j.api.Strings.hash(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String in(){ try{return io.forty11.j.api.Streams.in();}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String indent(java.lang.String arg0, int arg1){ try{return io.forty11.j.api.Strings.indent(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean isLink(java.io.File arg0){ try{return io.forty11.j.api.Files.isLink(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean isWildcard(java.lang.String arg0){ try{return io.forty11.j.api.Strings.isWildcard(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String limitLines(java.lang.String arg0, int arg1){ try{return io.forty11.j.api.Lang.limitLines(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static io.forty11.j.it.It listFiles(java.io.File arg0){ try{return io.forty11.j.api.Files.listFiles(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static org.w3c.dom.Document loadXml(java.io.InputStream arg0){ try{return io.forty11.j.api.Xml.loadXml(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static org.w3c.dom.Document loadXml(java.lang.String arg0){ try{return io.forty11.j.api.Xml.loadXml(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void log(java.lang.Object... arg0){ try{io.forty11.j.api.Log.log(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static String md5(byte[] arg0){ try{return io.forty11.j.api.Strings.md5(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String nodePath(org.w3c.dom.Node arg0){ try{return io.forty11.j.api.Xml.nodePath(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void out(java.lang.Object... arg0){ try{io.forty11.j.api.Streams.out(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String pad(java.lang.String arg0, int arg1){ try{return io.forty11.j.api.Strings.pad(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String[] parseArgs(java.lang.String arg0){ try{return io.forty11.j.api.Strings.parseArgs(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String path(java.lang.Object arg0){ try{return io.forty11.j.api.Paths.path(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String path(java.io.File arg0){ try{return io.forty11.j.api.Paths.path(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String path(java.lang.String arg0){ try{return io.forty11.j.api.Paths.path(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static io.forty11.j.it.PathIt paths(java.lang.String arg0){ try{return io.forty11.j.api.Paths.paths(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static io.forty11.j.it.PathIt paths(java.util.zip.ZipFile arg0){ try{return io.forty11.j.api.Paths.paths(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static io.forty11.j.it.PathIt paths(java.io.File arg0){ try{return io.forty11.j.api.Paths.paths(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static io.forty11.j.it.PathIt paths(java.net.URL arg0){ try{return io.forty11.j.api.Paths.paths(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void pipe(java.io.InputStream arg0, java.io.OutputStream arg1){ try{io.forty11.j.api.Streams.pipe(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void pipe(java.io.Reader arg0, java.io.Writer arg1){ try{io.forty11.j.api.Streams.pipe(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String read(java.lang.String arg0){ try{return io.forty11.j.api.Streams.read(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String read(java.io.InputStream arg0){ try{return io.forty11.j.api.Streams.read(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String read(java.io.File arg0){ try{return io.forty11.j.api.Files.read(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean regexMatch(java.lang.String arg0, java.lang.String arg1){ try{return io.forty11.j.api.Strings.regexMatch(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String replace(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2){ try{return io.forty11.j.api.Strings.replace(arg0, arg1, arg2);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String replace(java.lang.String arg0, java.lang.String[][] arg1){ try{return io.forty11.j.api.Strings.replace(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String replaceAll(java.lang.String arg0, java.util.Map arg1){ try{return io.forty11.j.api.Strings.replaceAll(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void rethrow(java.lang.String arg0, java.lang.Throwable arg1){ try{io.forty11.j.api.Lang.rethrow(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void rethrow(java.lang.Throwable arg0){ try{io.forty11.j.api.Lang.rethrow(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String run(java.lang.String... arg0){ try{return io.forty11.j.api.Shell.run(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String run(java.lang.String arg0){ try{return io.forty11.j.api.Shell.run(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String run(java.util.List arg0){ try{return io.forty11.j.api.Shell.run(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void setField(java.lang.String arg0, java.lang.Object arg1, java.lang.Object arg2){ try{io.forty11.j.api.Lang.setField(arg0, arg1, arg2);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static String sha1(byte[] arg0){ try{return io.forty11.j.api.Strings.sha1(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void sleep(long arg0){ try{io.forty11.j.api.Lang.sleep(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String slugify(java.lang.String arg0){ try{return io.forty11.j.api.Strings.slugify(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String[] splitLines(java.lang.String arg0){ try{return io.forty11.j.api.Lang.splitLines(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String startLower(java.lang.String arg0){ try{return io.forty11.j.api.Strings.startLower(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String startUpper(java.lang.String arg0){ try{return io.forty11.j.api.Strings.startUpper(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String sterilizeFileName(java.lang.String arg0){ try{return io.forty11.j.api.Files.sterilizeFileName(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String substring(java.lang.String arg0, java.lang.String arg1, int arg2){ try{return io.forty11.j.api.Strings.substring(arg0, arg1, arg2);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String toDisableTags(java.lang.String arg0){ try{return io.forty11.j.api.Strings.toDisableTags(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static boolean wildcardMatch(java.lang.String arg0, java.lang.String arg1){ try{return io.forty11.j.api.Strings.wildcardMatch(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String wildcardToRegex(java.lang.String arg0){ try{return io.forty11.j.api.Strings.wildcardToRegex(arg0);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static java.lang.String wrap(java.lang.String arg0, int arg1){ try{return io.forty11.j.api.Strings.wrap(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void write(java.io.File arg0, java.lang.String arg1){ try{io.forty11.j.api.Files.write(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}
   public static void write(java.lang.String arg0, java.lang.String arg1){ try{io.forty11.j.api.Files.write(arg0, arg1);}catch(Exception ex){ throw ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex); }}

   public static String getMethodNameFromStackLine(String line) {return Lang.getMethodNameFromStackLine(line);}
   public static Class getClassFromStackLine(String line) {return Lang.getClassFromStackLine(line);}




   /*
   +------------------------------------------------------------------------------+
   | End Generated Code
   +------------------------------------------------------------------------------+
   */
}