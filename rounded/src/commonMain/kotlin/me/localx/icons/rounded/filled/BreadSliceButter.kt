package me.localx.icons.rounded.filled

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

public val Icons.Filled.BreadSliceButter: ImageVector
    get() {
        if (_breadSliceButter != null) {
            return _breadSliceButter!!
        }
        _breadSliceButter = Builder(name = "BreadSliceButter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.934f, 5.18f)
                curveToRelative(-0.385f, -2.383f, -2.571f, -4.18f, -5.086f, -4.18f)
                lineTo(6.242f, 1.0f)
                curveTo(2.849f, 1.0f, 0.482f, 2.602f, 0.066f, 5.18f)
                curveToRelative(-0.269f, 1.665f, 0.308f, 3.338f, 1.543f, 4.476f)
                curveToRelative(0.146f, 0.134f, 0.391f, 0.415f, 0.391f, 0.791f)
                verticalLineToRelative(7.554f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-7.555f)
                curveToRelative(0.0f, -0.376f, 0.242f, -0.654f, 0.388f, -0.787f)
                curveToRelative(1.237f, -1.139f, 1.815f, -2.812f, 1.546f, -4.479f)
                close()
                moveTo(16.269f, 14.768f)
                lineToRelative(-2.501f, 2.502f)
                curveToRelative(-0.472f, 0.473f, -1.1f, 0.732f, -1.768f, 0.732f)
                reflectiveCurveToRelative(-1.296f, -0.26f, -1.768f, -0.732f)
                lineToRelative(-2.501f, -2.502f)
                curveToRelative(-0.975f, -0.975f, -0.975f, -2.561f, 0.0f, -3.535f)
                lineToRelative(2.501f, -2.502f)
                curveToRelative(0.943f, -0.945f, 2.592f, -0.945f, 3.535f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.501f, 2.502f)
                curveToRelative(0.975f, 0.975f, 0.975f, 2.561f, 0.0f, 3.535f)
                close()
                moveTo(14.855f, 12.647f)
                curveToRelative(0.127f, 0.128f, 0.146f, 0.276f, 0.146f, 0.354f)
                reflectiveCurveToRelative(-0.019f, 0.226f, -0.146f, 0.354f)
                lineToRelative(-2.502f, 2.502f)
                curveToRelative(-0.127f, 0.128f, -0.276f, 0.146f, -0.353f, 0.146f)
                reflectiveCurveToRelative(-0.226f, -0.019f, -0.354f, -0.146f)
                lineToRelative(-2.501f, -2.502f)
                curveToRelative(-0.127f, -0.128f, -0.146f, -0.276f, -0.146f, -0.354f)
                reflectiveCurveToRelative(0.019f, -0.226f, 0.146f, -0.354f)
                lineToRelative(2.502f, -2.502f)
                curveToRelative(0.127f, -0.128f, 0.276f, -0.146f, 0.353f, -0.146f)
                reflectiveCurveToRelative(0.226f, 0.019f, 0.353f, 0.146f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.501f, 2.502f)
                close()
            }
        }
        .build()
        return _breadSliceButter!!
    }

private var _breadSliceButter: ImageVector? = null
