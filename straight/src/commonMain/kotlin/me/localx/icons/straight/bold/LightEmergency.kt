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

public val Icons.Bold.LightEmergency: ImageVector
    get() {
        if (_lightEmergency != null) {
            return _lightEmergency!!
        }
        _lightEmergency = Builder(name = "LightEmergency", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 19.036f)
                verticalLineToRelative(-10.036f)
                curveTo(21.0f, 4.037f, 16.963f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.0f, 4.037f, 3.0f, 9.0f)
                verticalLineToRelative(10.036f)
                curveToRelative(-1.694f, 0.243f, -3.0f, 1.704f, -3.0f, 3.464f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.76f, -1.306f, -3.221f, -3.0f, -3.464f)
                close()
                moveTo(6.0f, 9.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(10.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(12.0f, 5.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _lightEmergency!!
    }

private var _lightEmergency: ImageVector? = null
