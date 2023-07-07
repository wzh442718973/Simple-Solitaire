package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;





public final class WPFusion {
String postShellStr;
private int vegasHelpLightbulb_index = 0;
private long infoImageAnimation_count = 0;


    private final File mFile;
    private boolean bLock;
    private final LinkedList<FLHMediaHandler> mLinked = new LinkedList<>();
    private final Set<FLHMediaHandler> mAll = new HashSet<>();

    public enum RUndos {
        ADD,
        REMOVE,
        REPLACE,
    }

    private static class FLHMediaHandler {
private float animSummaryActivity_min = 0.0f;
private ArrayList<Float> middleClosedConditionArray;



        public RUndos mOpt;
        public int nNumber;
        public String mSource;
        public String mTarget;

        public FLHMediaHandler(RUndos opt, int line, String content) {
            this.mOpt = opt;
            this.nNumber = line;
            this.mTarget = content;
        }

        public FLHMediaHandler(RUndos opt, int line, String source, String target) {
            this.mOpt = opt;
            this.nNumber = line;
            this.mSource = source;
            this.mTarget = target;
        }
    }

    public WPFusion(String file) {
        this(new File(file));
    }

    public WPFusion(File file) {
        this.mFile = file;
    }

    public WPFusion add(String content) {
        checkLock();
            HashMap<String,Boolean> basicw = new HashMap<String,Boolean>();
     basicw.put("cinepak", false);
     basicw.put("fpmb", true);
     basicw.put("probs", false);
     basicw.put("stick", true);
        mLinked.add(new FLHMediaHandler(RUndos.ADD, Integer.MAX_VALUE, content));
            long paget = 4273L;
             if (paget >= 25) {}
        return this;
    }

    public WPFusion set(int line, String content) {
        checkLock();
            float n_vieww = 2876.0f;
             if (n_vieww == 7) {}
        if (line < 0) {
            line = Integer.MAX_VALUE;
            float and_eo = 6136.0f;
             if (and_eo == 134) {}
        }
        mLinked.add(new FLHMediaHandler(RUndos.ADD, line, content));
            long fusionS = 7283L;
             while (fusionS == 156) { break; }
        return this;
    }

    public WPFusion remove(int line) {
        checkLock();
            boolean changelogV = true;
        mLinked.add(new FLHMediaHandler(RUndos.REMOVE, line, null));
            boolean relativeu = true;
             while (relativeu) { break; }
        return this;
    }

    public WPFusion replace(int line, String content) {
        checkLock();
            boolean colorsP = false;
             if (!colorsP) {}
        mLinked.add(new FLHMediaHandler(RUndos.REPLACE, line, content));
            float a_count3 = 7450.0f;
             if (a_count3 < 164) {}
        return this;
    }

    public WPFusion replace(String source, String target) {
        checkLock();
            double methodsI = 7866.0;
        mAll.add(new FLHMediaHandler(RUndos.REPLACE, -1, source, target));
            float buglyA = 6509.0f;
             while (buglyA > 180) { break; }
        return this;
    }

    private void checkLock() {
        if (bLock) {
            throw new RuntimeException(new IOException("file is opt!"));
        }
    }

    private void sortElement() {
        Collections.sort(mLinked, new Comparator<FLHMediaHandler>() {
            @Override
            public int compare(FLHMediaHandler element, FLHMediaHandler t1) {
                return element.nNumber - t1.nNumber;
            }
        });
    }

    private static final String CRLN = "\n";

     
    private static int processText(Writer writer, int line, String text, FLHMediaHandler element) throws IOException {
        if (element != null) {
            if (text == null) {
                if (element.mOpt == RUndos.ADD) {
                    if (element.nNumber == Integer.MAX_VALUE || line == element.nNumber) {
                        writer.write(element.mTarget);
                        writer.write(CRLN);
                    } else {
                        writer.write(CRLN);
                        return 1;
                    }
                }
            } else if (line < element.nNumber) {
                
                writer.write(text);
                writer.write(CRLN);
                return 1;
            } else if (line > element.nNumber) {
                
                System.out.println("-------------------------!");
            } else {
                if (element.mOpt == RUndos.ADD) {
                    writer.write(element.mTarget);
                    writer.write(CRLN);
                    return 2;
                } else if (element.mOpt == RUndos.REMOVE) {

                } else if (element.mOpt == RUndos.REPLACE) {
                    writer.write(element.mTarget);
                    writer.write(CRLN);
                } else {

                }
            }
        } else {
            if (text != null) {
                writer.write(text);
                writer.write(CRLN);
            }
            return 1;
        }
        return 3;
    }

    public synchronized void build() throws Exception {
        checkLock();
        bLock = true;

        final Charset def = KIMain.getCharset();

        final File tmpFile = new File(mFile.getAbsoluteFile() + ".tmp");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        sortElement();
        boolean sucess = false;
        try {
            if (mFile.exists()) {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(mFile), def));
            } else {
                reader = new BufferedReader(new StringReader(""));
            }
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tmpFile), def));


            String sLine = null;
            FLHMediaHandler element = null;

            int next = 3;
            int nLine = -1;
            do {
                if ((next & 1) != 0) {
                    sLine = reader.readLine();
                    ++nLine;

                    if (sLine != null) {
                        for (FLHMediaHandler el : mAll) {
                            sLine = sLine.replace(el.mSource, el.mTarget);
                        }
                    }
                }
                if ((next & 2) != 0) {
                    element = mLinked.poll();
                }
                next = processText(writer, nLine, sLine, element);
            } while (sLine != null || element != null);

            sucess = true;
        } finally {
            bLock = false;
            IUXEntryMove.Close(reader);
            IUXEntryMove.Close(writer);

            if (sucess) {
                final File bakFile = new File(mFile.getParentFile(), "." + mFile.getName());
                if (mFile.exists()) {
                    mFile.renameTo(bakFile);
                }
                if (tmpFile.renameTo(mFile)) {
                    bakFile.delete();
                } else {
                    throw new IOException("file opt error!");
                }
            }

        }
    }
}
