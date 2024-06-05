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

public val Icons.Bold.AlarmPlus: ImageVector
    get() {
        if (_alarmPlus != null) {
            return _alarmPlus!!
        }
        _alarmPlus = Builder(name = "AlarmPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 11.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(19.677f, 19.398f)
                lineToRelative(2.417f, 2.576f)
                lineToRelative(-2.188f, 2.053f)
                lineToRelative(-2.477f, -2.64f)
                curveToRelative(-1.565f, 1.017f, -3.427f, 1.614f, -5.429f, 1.614f)
                reflectiveCurveToRelative(-3.864f, -0.597f, -5.429f, -1.614f)
                lineToRelative(-2.477f, 2.64f)
                lineToRelative(-2.188f, -2.053f)
                lineToRelative(2.417f, -2.576f)
                curveToRelative(-1.449f, -1.735f, -2.323f, -3.966f, -2.323f, -6.398f)
                curveTo(2.0f, 7.997f, 5.697f, 3.852f, 10.5f, 3.125f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 3.125f)
                curveToRelative(4.803f, 0.727f, 8.5f, 4.872f, 8.5f, 9.875f)
                curveToRelative(0.0f, 2.432f, -0.875f, 4.663f, -2.323f, 6.398f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(6.054f, 2.586f)
                lineTo(4.456f, 0.056f)
                curveTo(2.726f, 1.068f, 1.219f, 2.419f, 0.017f, 4.011f)
                lineToRelative(2.494f, 1.662f)
                curveToRelative(0.965f, -1.248f, 2.167f, -2.3f, 3.543f, -3.088f)
                close()
                moveTo(21.489f, 5.674f)
                lineToRelative(2.494f, -1.662f)
                curveToRelative(-1.202f, -1.593f, -2.709f, -2.943f, -4.439f, -3.955f)
                lineToRelative(-1.598f, 2.53f)
                curveToRelative(1.377f, 0.788f, 2.578f, 1.84f, 3.543f, 3.088f)
                close()
            }
        }
        .build()
        return _alarmPlus!!
    }

private var _alarmPlus: ImageVector? = null
