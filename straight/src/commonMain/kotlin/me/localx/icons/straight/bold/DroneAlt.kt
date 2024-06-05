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

public val Icons.Bold.DroneAlt: ImageVector
    get() {
        if (_droneAlt != null) {
            return _droneAlt!!
        }
        _droneAlt = Builder(name = "DroneAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.799f)
                curveToRelative(-1.774f, -1.154f, -3.858f, -1.799f, -6.0f, -1.799f)
                reflectiveCurveToRelative(-4.226f, 0.645f, -6.0f, 1.799f)
                verticalLineToRelative(-3.799f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.603f)
                lineToRelative(0.417f, 0.436f)
                curveToRelative(0.072f, 0.074f, 0.901f, 0.921f, 2.23f, 1.812f)
                lineToRelative(-1.648f, 3.295f)
                verticalLineToRelative(2.854f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.146f)
                lineToRelative(1.301f, -2.601f)
                curveToRelative(1.115f, 0.439f, 2.363f, 0.747f, 3.699f, 0.747f)
                reflectiveCurveToRelative(2.584f, -0.308f, 3.699f, -0.747f)
                lineToRelative(1.301f, 2.601f)
                verticalLineToRelative(2.146f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.854f)
                lineToRelative(-1.648f, -3.295f)
                curveToRelative(1.329f, -0.891f, 2.159f, -1.738f, 2.23f, -1.812f)
                lineToRelative(0.417f, -0.436f)
                verticalLineToRelative(-7.603f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(6.756f, 12.958f)
                curveToRelative(0.497f, -0.433f, 1.042f, -0.791f, 1.617f, -1.084f)
                lineToRelative(1.127f, 1.127f)
                horizontalLineToRelative(5.0f)
                lineToRelative(1.127f, -1.127f)
                curveToRelative(0.574f, 0.293f, 1.118f, 0.649f, 1.614f, 1.082f)
                curveToRelative(-1.182f, 0.887f, -3.122f, 2.045f, -5.241f, 2.045f)
                curveToRelative(-2.132f, 0.0f, -4.066f, -1.156f, -5.244f, -2.042f)
                close()
            }
        }
        .build()
        return _droneAlt!!
    }

private var _droneAlt: ImageVector? = null
