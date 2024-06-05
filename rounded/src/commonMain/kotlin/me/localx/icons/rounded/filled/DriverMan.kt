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

public val Icons.Filled.DriverMan: ImageVector
    get() {
        if (_driverMan != null) {
            return _driverMan!!
        }
        _driverMan = Builder(name = "DriverMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(8.691f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-5.103f, 0.0f, -9.375f, 3.822f, -9.936f, 8.89f)
                curveToRelative(-0.031f, 0.283f, 0.06f, 0.565f, 0.249f, 0.777f)
                curveToRelative(0.19f, 0.212f, 0.461f, 0.333f, 0.745f, 0.333f)
                horizontalLineToRelative(2.941f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                horizontalLineToRelative(2.941f)
                curveToRelative(0.284f, 0.0f, 0.555f, -0.121f, 0.745f, -0.333f)
                curveToRelative(0.189f, -0.212f, 0.28f, -0.494f, 0.249f, -0.777f)
                curveToRelative(-0.561f, -5.068f, -4.833f, -8.89f, -9.936f, -8.89f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _driverMan!!
    }

private var _driverMan: ImageVector? = null
