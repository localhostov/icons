package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 20.0f)
                    curveTo(14.1208f, 19.9976f, 16.1543f, 19.154f, 17.654f, 17.6542f)
                    curveTo(19.1538f, 16.1544f, 19.9974f, 14.121f, 19.9998f, 12.0f)
                    verticalLineTo(8.0f)
                    curveTo(19.9998f, 5.8783f, 19.157f, 3.8434f, 17.6567f, 2.3431f)
                    curveTo(16.1564f, 0.8429f, 14.1215f, 0.0f, 11.9998f, 0.0f)
                    curveTo(9.8781f, 0.0f, 7.8432f, 0.8429f, 6.343f, 2.3431f)
                    curveTo(4.8427f, 3.8434f, 3.9998f, 5.8783f, 3.9998f, 8.0f)
                    verticalLineTo(12.0f)
                    curveTo(4.0022f, 14.121f, 4.8458f, 16.1544f, 6.3456f, 17.6542f)
                    curveTo(7.8454f, 19.154f, 9.8788f, 19.9976f, 11.9998f, 20.0f)
                    close()
                    moveTo(5.9998f, 9.0f)
                    horizontalLineTo(9.9998f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(6.0898f)
                    curveTo(6.3249f, 5.6025f, 7.0475f, 4.3335f, 8.1295f, 3.4183f)
                    curveTo(9.2114f, 2.5031f, 10.5827f, 2.001f, 11.9998f, 2.001f)
                    curveTo(13.4169f, 2.001f, 14.7882f, 2.5031f, 15.8702f, 3.4183f)
                    curveTo(16.9521f, 4.3335f, 17.6748f, 5.6025f, 17.9098f, 7.0f)
                    horizontalLineTo(13.9998f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(17.9998f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(13.9998f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(17.9098f)
                    curveTo(17.6748f, 14.3975f, 16.9521f, 15.6665f, 15.8702f, 16.5817f)
                    curveTo(14.7882f, 17.4969f, 13.4169f, 17.999f, 11.9998f, 17.999f)
                    curveTo(10.5827f, 17.999f, 9.2114f, 17.4969f, 8.1295f, 16.5817f)
                    curveTo(7.0475f, 15.6665f, 6.3249f, 14.3975f, 6.0898f, 13.0f)
                    horizontalLineTo(9.9998f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(5.9998f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 13.0003f)
                    curveTo(21.9974f, 15.3864f, 21.0483f, 17.6741f, 19.361f, 19.3613f)
                    curveTo(17.6738f, 21.0486f, 15.3861f, 21.9976f, 13.0f, 22.0003f)
                    horizontalLineTo(11.0f)
                    curveTo(8.6139f, 21.9974f, 6.3264f, 21.0482f, 4.6392f, 19.361f)
                    curveTo(2.9521f, 17.6738f, 2.0029f, 15.3864f, 2.0f, 13.0003f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0034f, 15.9166f, 1.1635f, 18.7125f, 3.2256f, 20.7747f)
                    curveTo(5.2878f, 22.8368f, 8.0837f, 23.9969f, 11.0f, 24.0003f)
                    horizontalLineTo(13.0f)
                    curveTo(15.9163f, 23.9969f, 18.7122f, 22.8368f, 20.7744f, 20.7747f)
                    curveTo(22.8365f, 18.7125f, 23.9966f, 15.9166f, 24.0f, 13.0003f)
                    horizontalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
