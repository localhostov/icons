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

public val Icons.Bold.HockeyStickPuck: ImageVector
    get() {
        if (_hockeyStickPuck != null) {
            return _hockeyStickPuck!!
        }
        _hockeyStickPuck = Builder(name = "HockeyStickPuck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.196f, 0.171f)
                curveToRelative(-0.732f, -0.384f, -1.64f, -0.102f, -2.025f, 0.633f)
                lineToRelative(-7.96f, 15.196f)
                lineTo(4.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.475f)
                curveToRelative(2.427f, 0.0f, 4.633f, -1.335f, 5.758f, -3.483f)
                lineTo(23.829f, 2.196f)
                curveToRelative(0.384f, -0.733f, 0.101f, -1.64f, -0.633f, -2.024f)
                close()
                moveTo(11.574f, 19.125f)
                curveToRelative(-0.605f, 1.156f, -1.793f, 1.875f, -3.1f, 1.875f)
                horizontalLineToRelative(-4.475f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.64f)
                lineToRelative(-0.065f, 0.125f)
                close()
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hockeyStickPuck!!
    }

private var _hockeyStickPuck: ImageVector? = null
