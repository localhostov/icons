package me.localx.icons.straight.outline

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

public val Icons.Outline.Customize: ImageVector
    get() {
        if (_customize != null) {
            return _customize!!
        }
        _customize = Builder(name = "Customize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 14.0f)
                horizontalLineToRelative(4.242f)
                lineToRelative(8.879f, -8.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                reflectiveCurveToRelative(-3.072f, -1.17f, -4.242f, 0.0f)
                lineToRelative(-8.879f, 8.879f)
                verticalLineToRelative(4.242f)
                close()
                moveTo(20.293f, 2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-0.896f, 0.896f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(0.896f, -0.896f)
                close()
                moveTo(12.0f, 10.586f)
                lineToRelative(5.983f, -5.983f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.983f, 5.983f)
                horizontalLineToRelative(-1.414f)
                verticalLineToRelative(-1.414f)
                close()
                moveTo(20.847f, 13.625f)
                lineToRelative(3.052f, 1.756f)
                lineToRelative(-2.991f, 5.201f)
                lineToRelative(-3.051f, -1.754f)
                curveToRelative(-0.841f, 0.721f, -1.81f, 1.279f, -2.856f, 1.649f)
                verticalLineToRelative(3.522f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.522f)
                curveToRelative(-1.047f, -0.37f, -2.016f, -0.929f, -2.856f, -1.649f)
                lineToRelative(-3.051f, 1.754f)
                lineTo(0.102f, 15.381f)
                lineToRelative(3.052f, -1.755f)
                curveToRelative(-0.102f, -0.544f, -0.153f, -1.088f, -0.153f, -1.626f)
                reflectiveCurveToRelative(0.052f, -1.082f, 0.153f, -1.626f)
                lineTo(0.102f, 8.619f)
                lineTo(3.093f, 3.418f)
                lineToRelative(3.051f, 1.754f)
                curveToRelative(0.841f, -0.721f, 1.81f, -1.279f, 2.856f, -1.649f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.93f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-1.93f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.036f)
                lineToRelative(-0.75f, 0.193f)
                curveToRelative(-1.237f, 0.32f, -2.361f, 0.969f, -3.25f, 1.877f)
                lineToRelative(-0.542f, 0.554f)
                lineToRelative(-2.629f, -1.512f)
                lineToRelative(-0.997f, 1.734f)
                lineToRelative(2.632f, 1.514f)
                lineToRelative(-0.206f, 0.746f)
                curveToRelative(-0.171f, 0.621f, -0.258f, 1.246f, -0.258f, 1.857f)
                reflectiveCurveToRelative(0.087f, 1.236f, 0.258f, 1.857f)
                lineToRelative(0.206f, 0.746f)
                lineToRelative(-2.632f, 1.514f)
                lineToRelative(0.997f, 1.734f)
                lineToRelative(2.629f, -1.512f)
                lineToRelative(0.542f, 0.554f)
                curveToRelative(0.889f, 0.908f, 2.013f, 1.557f, 3.25f, 1.877f)
                lineToRelative(0.75f, 0.193f)
                verticalLineToRelative(3.036f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.036f)
                lineToRelative(0.75f, -0.193f)
                curveToRelative(1.237f, -0.32f, 2.361f, -0.969f, 3.25f, -1.877f)
                lineToRelative(0.542f, -0.554f)
                lineToRelative(2.629f, 1.512f)
                lineToRelative(0.997f, -1.734f)
                lineToRelative(-0.643f, -0.369f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.99f, -1.144f, -1.99f, -1.144f)
                lineToRelative(0.206f, -0.747f)
                curveToRelative(0.164f, -0.596f, 0.246f, -1.194f, 0.253f, -1.782f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.102f, 0.544f, 0.176f, 1.216f, 0.176f, 1.754f)
                reflectiveCurveToRelative(-0.052f, 1.082f, -0.153f, 1.625f)
                close()
            }
        }
        .build()
        return _customize!!
    }

private var _customize: ImageVector? = null
