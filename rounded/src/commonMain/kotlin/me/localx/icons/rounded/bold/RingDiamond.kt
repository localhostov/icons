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

public val Icons.Bold.RingDiamond: ImageVector
    get() {
        if (_ringDiamond != null) {
            return _ringDiamond!!
        }
        _ringDiamond = Builder(name = "RingDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.476f, 6.699f)
                lineToRelative(1.203f, -1.604f)
                curveToRelative(0.742f, -0.989f, 0.643f, -2.394f, -0.232f, -3.269f)
                lineToRelative(-1.094f, -1.094f)
                curveToRelative(-0.472f, -0.472f, -1.1f, -0.732f, -1.768f, -0.732f)
                horizontalLineToRelative(-3.172f)
                curveToRelative(-0.667f, 0.0f, -1.295f, 0.26f, -1.768f, 0.732f)
                lineToRelative(-1.094f, 1.094f)
                curveToRelative(-0.875f, 0.875f, -0.974f, 2.28f, -0.232f, 3.268f)
                lineToRelative(1.204f, 1.605f)
                curveToRelative(-3.242f, 1.363f, -5.524f, 4.57f, -5.524f, 8.301f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -3.731f, -2.282f, -6.939f, -5.524f, -8.301f)
                close()
                moveTo(9.98f, 3.641f)
                lineToRelative(0.641f, -0.641f)
                horizontalLineToRelative(2.758f)
                lineToRelative(0.641f, 0.641f)
                lineToRelative(-1.772f, 2.363f)
                curveToRelative(-0.082f, -0.002f, -0.165f, -0.004f, -0.247f, -0.004f)
                reflectiveCurveToRelative(-0.165f, 0.001f, -0.247f, 0.004f)
                lineToRelative(-1.772f, -2.363f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _ringDiamond!!
    }

private var _ringDiamond: ImageVector? = null
