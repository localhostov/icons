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

public val Icons.Outline.CircleBookOpen: ImageVector
    get() {
        if (_circleBookOpen != null) {
            return _circleBookOpen!!
        }
        _circleBookOpen = Builder(name = "CircleBookOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.912f, 6.548f)
                curveToRelative(-0.691f, -0.52f, -1.563f, -0.679f, -2.396f, -0.439f)
                lineToRelative(-1.316f, 0.381f)
                curveToRelative(-0.456f, 0.132f, -0.863f, 0.367f, -1.2f, 0.674f)
                curveToRelative(-0.337f, -0.307f, -0.744f, -0.542f, -1.2f, -0.674f)
                lineToRelative(-1.316f, -0.381f)
                curveToRelative(-0.833f, -0.239f, -1.704f, -0.081f, -2.396f, 0.439f)
                curveToRelative(-0.691f, 0.52f, -1.088f, 1.313f, -1.088f, 2.179f)
                verticalLineToRelative(5.509f)
                curveToRelative(0.0f, 1.332f, 0.895f, 2.518f, 2.174f, 2.883f)
                lineToRelative(2.348f, 0.674f)
                curveToRelative(0.483f, 0.139f, 0.981f, 0.209f, 1.479f, 0.209f)
                reflectiveCurveToRelative(0.994f, -0.07f, 1.478f, -0.209f)
                lineToRelative(2.348f, -0.673f)
                curveToRelative(1.28f, -0.366f, 2.175f, -1.552f, 2.175f, -2.884f)
                verticalLineToRelative(-5.509f)
                curveToRelative(0.0f, -0.865f, -0.396f, -1.659f, -1.088f, -2.179f)
                close()
                moveTo(11.0f, 15.849f)
                lineToRelative(-2.276f, -0.653f)
                curveToRelative(-0.426f, -0.121f, -0.724f, -0.517f, -0.724f, -0.96f)
                verticalLineToRelative(-5.509f)
                curveToRelative(0.0f, -0.23f, 0.105f, -0.442f, 0.29f, -0.58f)
                curveToRelative(0.128f, -0.096f, 0.279f, -0.146f, 0.434f, -0.146f)
                curveToRelative(0.067f, 0.0f, 1.52f, 0.41f, 1.52f, 0.41f)
                curveToRelative(0.445f, 0.129f, 0.757f, 0.543f, 0.757f, 1.006f)
                verticalLineToRelative(6.432f)
                close()
                moveTo(16.0f, 14.236f)
                curveToRelative(0.0f, 0.443f, -0.298f, 0.839f, -0.725f, 0.961f)
                lineToRelative(-2.275f, 0.652f)
                verticalLineToRelative(-6.432f)
                curveToRelative(0.0f, -0.463f, 0.312f, -0.877f, 0.757f, -1.006f)
                lineToRelative(1.316f, -0.381f)
                curveToRelative(0.221f, -0.064f, 0.453f, -0.021f, 0.637f, 0.117f)
                curveToRelative(0.185f, 0.138f, 0.29f, 0.35f, 0.29f, 0.58f)
                verticalLineToRelative(5.509f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _circleBookOpen!!
    }

private var _circleBookOpen: ImageVector? = null
