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

public val Icons.Outline.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0003f, 23.97f)
                    curveTo(8.0909f, 23.97f, 5.3007f, 22.8143f, 3.2434f, 20.757f)
                    curveTo(1.1861f, 18.6997f, 0.0303f, 15.9095f, 0.0303f, 13.0f)
                    curveTo(0.0303f, 10.0906f, 1.1861f, 7.3003f, 3.2434f, 5.2431f)
                    curveTo(5.3007f, 3.1858f, 8.0909f, 2.03f, 11.0003f, 2.03f)
                    horizontalLineTo(12.0003f)
                    lineTo(12.0133f, 3.03f)
                    lineTo(12.0003f, 12.0f)
                    horizontalLineTo(21.9703f)
                    verticalLineTo(13.0f)
                    curveTo(21.9672f, 15.9085f, 20.8104f, 18.6969f, 18.7538f, 20.7535f)
                    curveTo(16.6972f, 22.8101f, 13.9088f, 23.9669f, 11.0003f, 23.97f)
                    close()
                    moveTo(10.0123f, 4.085f)
                    curveTo(8.3333f, 4.2713f, 6.741f, 4.9279f, 5.4187f, 5.9792f)
                    curveTo(4.0964f, 7.0306f, 3.0979f, 8.434f, 2.538f, 10.0279f)
                    curveTo(1.9782f, 11.6217f, 1.8799f, 13.3413f, 2.2543f, 14.9886f)
                    curveTo(2.6288f, 16.6359f, 3.4608f, 18.144f, 4.6546f, 19.3393f)
                    curveTo(5.8484f, 20.5345f, 7.3555f, 21.3684f, 9.0024f, 21.7448f)
                    curveTo(10.6492f, 22.1213f, 12.3689f, 22.025f, 13.9635f, 21.4671f)
                    curveTo(15.558f, 20.9092f, 16.9626f, 19.9124f, 18.0156f, 18.5914f)
                    curveTo(19.0685f, 17.2704f, 19.7271f, 15.6788f, 19.9153f, 14.0f)
                    horizontalLineTo(10.0003f)
                    lineTo(10.0123f, 4.085f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0187f, 2.2882f)
                    curveTo(17.3924f, 2.6476f, 18.6456f, 3.366f, 19.6498f, 4.3699f)
                    curveTo(20.654f, 5.3737f, 21.3729f, 6.6267f, 21.7327f, 8.0002f)
                    horizontalLineTo(16.0187f)
                    verticalLineTo(2.2882f)
                    close()
                    moveTo(14.0187f, 0.0342f)
                    verticalLineTo(10.0002f)
                    horizontalLineTo(23.9867f)
                    curveTo(23.9739f, 7.3607f, 22.9195f, 4.8329f, 21.0528f, 2.9667f)
                    curveTo(19.1862f, 1.1004f, 16.6583f, 0.0465f, 14.0187f, 0.0342f)
                    close()
                }
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
