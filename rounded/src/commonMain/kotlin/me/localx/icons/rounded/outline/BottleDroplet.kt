package me.localx.icons.rounded.outline

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

public val Icons.Outline.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.856f, 8.065f)
                lineToRelative(-1.856f, -0.742f)
                lineTo(15.0f, 2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(5.323f)
                lineToRelative(-1.856f, 0.742f)
                curveToRelative(-1.91f, 0.764f, -3.144f, 2.586f, -3.144f, 4.643f)
                verticalLineToRelative(6.292f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.292f)
                curveToRelative(0.0f, -2.057f, -1.233f, -3.879f, -3.144f, -4.643f)
                close()
                moveTo(18.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.292f)
                curveToRelative(0.0f, -1.233f, 0.74f, -2.327f, 1.886f, -2.785f)
                lineToRelative(2.485f, -0.994f)
                curveToRelative(0.38f, -0.152f, 0.629f, -0.52f, 0.629f, -0.929f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.409f, 0.249f, 0.776f, 0.629f, 0.929f)
                lineToRelative(2.485f, 0.994f)
                curveToRelative(1.146f, 0.458f, 1.886f, 1.552f, 1.886f, 2.785f)
                verticalLineToRelative(6.292f)
                close()
                moveTo(10.357f, 12.781f)
                curveToRelative(-1.232f, 1.427f, -1.857f, 2.678f, -1.857f, 3.719f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.041f, -0.625f, -2.292f, -1.857f, -3.72f)
                curveToRelative(-0.828f, -0.955f, -2.457f, -0.956f, -3.285f, 0.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.193f, 0.099f, -0.939f, 1.371f, -2.411f)
                curveToRelative(0.043f, -0.05f, 0.094f, -0.061f, 0.129f, -0.061f)
                reflectiveCurveToRelative(0.086f, 0.011f, 0.129f, 0.06f)
                curveToRelative(1.272f, 1.473f, 1.371f, 2.219f, 1.371f, 2.412f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
