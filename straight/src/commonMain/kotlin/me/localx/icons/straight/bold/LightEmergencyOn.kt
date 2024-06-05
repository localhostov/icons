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

public val Icons.Bold.LightEmergencyOn: ImageVector
    get() {
        if (_lightEmergencyOn != null) {
            return _lightEmergencyOn!!
        }
        _lightEmergencyOn = Builder(name = "LightEmergencyOn", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 19.036f)
                verticalLineToRelative(-5.036f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 9.037f, 3.0f, 14.0f)
                verticalLineToRelative(5.036f)
                curveToRelative(-1.694f, 0.243f, -3.0f, 1.704f, -3.0f, 3.464f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.76f, -1.306f, -3.221f, -3.0f, -3.464f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(2.418f, 7.322f)
                lineTo(0.043f, 5.047f)
                lineToRelative(2.076f, -2.166f)
                lineToRelative(2.375f, 2.275f)
                lineToRelative(-2.076f, 2.166f)
                close()
                moveTo(5.92f, 4.091f)
                lineToRelative(-1.218f, -2.841f)
                lineTo(7.46f, 0.068f)
                lineToRelative(1.218f, 2.841f)
                lineToRelative(-2.758f, 1.182f)
                close()
                moveTo(21.663f, 7.359f)
                lineToRelative(-2.076f, -2.166f)
                lineToRelative(2.375f, -2.275f)
                lineToRelative(2.076f, 2.166f)
                lineToRelative(-2.375f, 2.275f)
                close()
                moveTo(18.161f, 4.128f)
                lineToRelative(-2.758f, -1.182f)
                lineTo(16.621f, 0.104f)
                lineToRelative(2.758f, 1.182f)
                lineToRelative(-1.218f, 2.841f)
                close()
                moveTo(11.0f, 14.001f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _lightEmergencyOn!!
    }

private var _lightEmergencyOn: ImageVector? = null
