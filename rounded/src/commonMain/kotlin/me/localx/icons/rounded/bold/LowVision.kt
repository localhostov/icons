package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LowVision: ImageVector
    get() {
        if (_lowVision != null) {
            return _lowVision!!
        }
        _lowVision = Builder(name = "LowVision", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.002f, 11.975f)
                lineToRelative(8.566f, 8.574f)
                curveToRelative(-3.684f, -0.967f, -6.117f, -3.383f, -7.599f, -5.491f)
                curveTo(0.321f, 14.136f, 0.0f, 13.056f, 0.002f, 11.975f)
                close()
                moveTo(0.969f, 8.916f)
                curveToRelative(-0.17f, 0.242f, -0.315f, 0.496f, -0.44f, 0.757f)
                lineToRelative(11.308f, 11.308f)
                curveToRelative(0.055f, 0.0f, 0.107f, 0.006f, 0.163f, 0.006f)
                curveToRelative(1.244f, 0.0f, 2.439f, -0.159f, 3.577f, -0.474f)
                lineTo(2.326f, 7.263f)
                curveToRelative(-0.477f, 0.514f, -0.936f, 1.055f, -1.357f, 1.654f)
                close()
                moveTo(23.56f, 23.56f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(3.804f, 3.804f)
                curveToRelative(1.726f, -0.825f, 3.617f, -1.243f, 5.635f, -1.243f)
                curveToRelative(5.672f, 0.0f, 9.129f, 3.224f, 11.031f, 5.929f)
                curveToRelative(1.291f, 1.837f, 1.291f, 4.305f, 0.0f, 6.142f)
                curveToRelative(-0.827f, 1.177f, -1.766f, 2.194f, -2.802f, 3.037f)
                lineToRelative(3.332f, 3.332f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
                moveTo(8.661f, 6.54f)
                lineToRelative(1.776f, 1.776f)
                curveToRelative(1.456f, -0.617f, 3.203f, -0.332f, 4.391f, 0.855f)
                reflectiveCurveToRelative(1.472f, 2.934f, 0.855f, 4.391f)
                lineToRelative(2.409f, 2.409f)
                curveToRelative(0.918f, -0.704f, 1.751f, -1.583f, 2.484f, -2.626f)
                curveToRelative(0.565f, -0.805f, 0.565f, -1.887f, 0.0f, -2.692f)
                curveToRelative(-1.492f, -2.123f, -4.192f, -4.654f, -8.576f, -4.654f)
                curveToRelative(-1.178f, 0.0f, -2.295f, 0.181f, -3.339f, 0.54f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
