package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.9f, 14.7236f)
                    curveTo(17.0875f, 14.9111f, 17.3418f, 15.0164f, 17.607f, 15.0164f)
                    curveTo(17.8722f, 15.0164f, 18.1265f, 14.9111f, 18.314f, 14.7236f)
                    lineTo(23.263f, 9.7736f)
                    curveTo(23.4952f, 9.5415f, 23.6794f, 9.2658f, 23.8051f, 8.9625f)
                    curveTo(23.9308f, 8.6591f, 23.9955f, 8.334f, 23.9955f, 8.0056f)
                    curveTo(23.9955f, 7.6772f, 23.9308f, 7.3521f, 23.8051f, 7.0487f)
                    curveTo(23.6794f, 6.7454f, 23.4952f, 6.4698f, 23.263f, 6.2376f)
                    lineTo(18.313f, 1.2886f)
                    curveTo(18.1228f, 1.1162f, 17.8736f, 1.0235f, 17.617f, 1.0297f)
                    curveTo(17.3604f, 1.0359f, 17.116f, 1.1406f, 16.9344f, 1.3221f)
                    curveTo(16.7529f, 1.5035f, 16.648f, 1.7478f, 16.6416f, 2.0045f)
                    curveTo(16.6352f, 2.2611f, 16.7277f, 2.5103f, 16.9f, 2.7006f)
                    lineTo(21.2f, 7.0006f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6739f, 7.0006f, 2.4021f, 7.5274f, 1.4645f, 8.4651f)
                    curveTo(0.5268f, 9.4028f, 0.0f, 10.6745f, 0.0f, 12.0006f)
                    lineTo(0.0f, 19.0006f)
                    curveTo(0.0016f, 20.3262f, 0.5289f, 21.5971f, 1.4662f, 22.5344f)
                    curveTo(2.4036f, 23.4717f, 3.6744f, 23.999f, 5.0f, 24.0006f)
                    horizontalLineTo(19.0f)
                    curveTo(19.2652f, 24.0006f, 19.5196f, 23.8953f, 19.7071f, 23.7077f)
                    curveTo(19.8946f, 23.5202f, 20.0f, 23.2658f, 20.0f, 23.0006f)
                    curveTo(20.0f, 22.7354f, 19.8946f, 22.481f, 19.7071f, 22.2935f)
                    curveTo(19.5196f, 22.106f, 19.2652f, 22.0006f, 19.0f, 22.0006f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 22.0006f, 3.4413f, 21.6845f, 2.8787f, 21.1219f)
                    curveTo(2.3161f, 20.5593f, 2.0f, 19.7963f, 2.0f, 19.0006f)
                    verticalLineTo(12.0006f)
                    curveTo(2.0f, 11.205f, 2.3161f, 10.4419f, 2.8787f, 9.8793f)
                    curveTo(3.4413f, 9.3167f, 4.2043f, 9.0006f, 5.0f, 9.0006f)
                    horizontalLineTo(21.212f)
                    lineTo(16.9f, 13.3096f)
                    curveTo(16.7125f, 13.4971f, 16.6072f, 13.7514f, 16.6072f, 14.0166f)
                    curveTo(16.6072f, 14.2818f, 16.7125f, 14.5361f, 16.9f, 14.7236f)
                    close()
                }
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
