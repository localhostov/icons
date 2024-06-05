package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.InternetSpeedWifi: ImageVector
    get() {
        if (_internetSpeedWifi != null) {
            return _internetSpeedWifi!!
        }
        _internetSpeedWifi = Builder(name = "InternetSpeedWifi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(-1.87f, 0.0f, -3.627f, 0.728f, -4.95f, 2.05f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(1.889f, -1.889f, 4.4f, -2.929f, 7.071f, -2.929f)
                curveToRelative(1.456f, 0.0f, 2.859f, 0.319f, 4.145f, 0.905f)
                lineToRelative(-2.337f, 2.337f)
                curveToRelative(-0.583f, -0.155f, -1.188f, -0.242f, -1.808f, -0.242f)
                close()
                moveTo(18.374f, 7.676f)
                lineToRelative(2.185f, -2.185f)
                curveToRelative(-2.537f, -1.614f, -5.478f, -2.491f, -8.559f, -2.491f)
                curveTo(7.727f, 3.0f, 3.708f, 4.665f, 0.687f, 7.687f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(2.456f, -2.455f, 5.72f, -3.808f, 9.192f, -3.808f)
                curveToRelative(2.272f, 0.0f, 4.449f, 0.589f, 6.374f, 1.676f)
                close()
                moveTo(24.008f, 9.113f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-9.119f, 9.119f)
                curveToRelative(-0.246f, -0.065f, -0.5f, -0.112f, -0.767f, -0.112f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.267f, -0.046f, -0.521f, -0.112f, -0.767f)
                lineToRelative(9.119f, -9.119f)
                close()
            }
        }
        .build()
        return _internetSpeedWifi!!
    }

private var _internetSpeedWifi: ImageVector? = null
