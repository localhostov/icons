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

public val Icons.Bold.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.059f, 3.11f)
                reflectiveCurveTo(14.126f, 0.4f, 14.126f, 0.4f)
                curveToRelative(-1.371f, -0.536f, -2.881f, -0.536f, -4.252f, 0.0f)
                lineTo(2.955f, 3.103f)
                curveToRelative(-0.576f, 0.225f, -0.955f, 0.78f, -0.955f, 1.397f)
                reflectiveCurveToRelative(0.379f, 1.172f, 0.954f, 1.397f)
                lineToRelative(3.046f, 1.19f)
                verticalLineToRelative(1.898f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-1.898f)
                lineToRelative(1.0f, -0.391f)
                verticalLineToRelative(3.804f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.0f, -0.817f, -1.34f, -0.941f, -1.39f)
                close()
                moveTo(10.965f, 3.195f)
                curveToRelative(0.667f, -0.261f, 1.402f, -0.261f, 2.07f, 0.0f)
                lineToRelative(3.341f, 1.305f)
                lineToRelative(-3.342f, 1.305f)
                curveToRelative(-0.668f, 0.26f, -1.403f, 0.26f, -2.07f, 0.0f)
                lineToRelative(-3.341f, -1.305f)
                lineToRelative(3.341f, -1.305f)
                close()
                moveTo(15.0f, 8.984f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.726f)
                lineToRelative(0.873f, 0.341f)
                curveToRelative(0.686f, 0.268f, 1.406f, 0.401f, 2.126f, 0.401f)
                reflectiveCurveToRelative(1.441f, -0.134f, 2.126f, -0.401f)
                lineToRelative(0.875f, -0.341f)
                verticalLineToRelative(0.726f)
                close()
                moveTo(19.979f, 21.844f)
                curveToRelative(0.383f, 0.735f, 0.098f, 1.641f, -0.636f, 2.024f)
                curveToRelative(-0.222f, 0.115f, -0.459f, 0.17f, -0.692f, 0.17f)
                curveToRelative(-0.542f, 0.0f, -1.064f, -0.294f, -1.332f, -0.807f)
                curveToRelative(-1.04f, -1.994f, -3.078f, -3.232f, -5.319f, -3.232f)
                reflectiveCurveToRelative(-4.28f, 1.239f, -5.319f, 3.232f)
                curveToRelative(-0.383f, 0.734f, -1.287f, 1.018f, -2.024f, 0.636f)
                curveToRelative(-0.734f, -0.383f, -1.019f, -1.289f, -0.636f, -2.024f)
                curveToRelative(1.559f, -2.988f, 4.616f, -4.845f, 7.979f, -4.845f)
                reflectiveCurveToRelative(6.421f, 1.856f, 7.979f, 4.845f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
