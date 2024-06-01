package me.localx.icons.straight.bold

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

public val Icons.Bold.ChartHistogram: ImageVector
    get() {
        if (_chartHistogram != null) {
            return _chartHistogram!!
        }
        _chartHistogram = Builder(name = "ChartHistogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.9999f, 9.0f)
                    horizontalLineTo(6.9998f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(9.9999f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 12.0f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 7.9999f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(17.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.1281f, 8.033f)
                    curveTo(15.5279f, 8.0329f, 14.9524f, 7.7944f, 14.5281f, 7.37f)
                    lineTo(10.3721f, 3.218f)
                    lineTo(8.3001f, 5.3f)
                    lineTo(6.1741f, 3.174f)
                    lineTo(8.7691f, 0.579f)
                    curveTo(9.2008f, 0.1661f, 9.7752f, -0.0643f, 10.3726f, -0.0643f)
                    curveTo(10.97f, -0.0643f, 11.5443f, 0.1661f, 11.9761f, 0.579f)
                    lineTo(16.1281f, 4.73f)
                    lineTo(20.4391f, 0.419f)
                    lineTo(22.5611f, 2.541f)
                    lineTo(17.7311f, 7.37f)
                    curveTo(17.5207f, 7.5807f, 17.2708f, 7.7477f, 16.9957f, 7.8615f)
                    curveTo(16.7206f, 7.9753f, 16.4258f, 8.0336f, 16.1281f, 8.033f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 24.0f, 1.6815f, 23.6313f, 1.0251f, 22.9749f)
                    curveTo(0.3687f, 22.3185f, 0.0f, 21.4283f, 0.0f, 20.5f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(20.5f)
                    curveTo(3.0f, 20.6326f, 3.0527f, 20.7598f, 3.1465f, 20.8536f)
                    curveTo(3.2402f, 20.9473f, 3.3674f, 21.0f, 3.5f, 21.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    close()
                }
            }
        }
        .build()
        return _chartHistogram!!
    }

private var _chartHistogram: ImageVector? = null
