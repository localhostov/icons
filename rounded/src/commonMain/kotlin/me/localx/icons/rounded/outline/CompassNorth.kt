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

public val Icons.Outline.CompassNorth: ImageVector
    get() {
        if (_compassNorth != null) {
            return _compassNorth!!
        }
        _compassNorth = Builder(name = "CompassNorth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(14.337f, 6.944f)
                curveToRelative(-0.447f, -0.88f, -1.351f, -1.444f, -2.337f, -1.444f)
                curveToRelative(-0.989f, 0.003f, -1.874f, 0.573f, -2.306f, 1.437f)
                curveToRelative(0.0f, 0.0f, -3.396f, 6.394f, -3.404f, 6.413f)
                curveToRelative(-0.443f, 0.97f, -0.24f, 2.099f, 0.525f, 2.884f)
                curveToRelative(0.725f, 0.728f, 1.819f, 0.966f, 2.787f, 0.561f)
                curveToRelative(0.124f, -0.063f, 1.622f, -0.829f, 2.396f, -1.225f)
                curveToRelative(0.932f, 0.48f, 2.035f, 1.054f, 2.255f, 1.179f)
                curveToRelative(0.35f, 0.167f, 0.728f, 0.251f, 1.105f, 0.251f)
                curveToRelative(0.354f, 0.0f, 0.71f, -0.073f, 1.042f, -0.22f)
                curveToRelative(0.632f, -0.279f, 1.116f, -0.788f, 1.365f, -1.432f)
                curveToRelative(0.248f, -0.645f, 0.23f, -1.349f, -0.047f, -1.975f)
                curveToRelative(-0.626f, -1.447f, -3.286f, -6.256f, -3.383f, -6.429f)
                close()
                moveTo(15.9f, 14.629f)
                curveToRelative(-0.057f, 0.145f, -0.165f, 0.259f, -0.307f, 0.321f)
                curveToRelative(-0.152f, 0.067f, -0.327f, 0.068f, -0.399f, 0.036f)
                curveToRelative(-0.297f, -0.175f, -2.332f, -1.222f, -2.737f, -1.43f)
                curveToRelative(-0.144f, -0.074f, -0.3f, -0.11f, -0.457f, -0.11f)
                curveToRelative(-0.156f, 0.0f, -0.312f, 0.037f, -0.455f, 0.11f)
                curveToRelative(0.0f, 0.0f, -2.677f, 1.37f, -2.777f, 1.423f)
                curveToRelative(-0.106f, 0.045f, -0.353f, 0.026f, -0.527f, -0.148f)
                curveToRelative(-0.177f, -0.182f, -0.229f, -0.436f, -0.132f, -0.649f)
                curveToRelative(0.183f, -0.339f, 0.839f, -1.575f, 3.363f, -6.327f)
                curveToRelative(0.151f, -0.302f, 0.428f, -0.336f, 0.54f, -0.336f)
                curveToRelative(0.135f, 0.018f, 0.39f, 0.03f, 0.559f, 0.363f)
                curveToRelative(0.027f, 0.049f, 2.727f, 4.927f, 3.317f, 6.292f)
                curveToRelative(0.064f, 0.146f, 0.068f, 0.308f, 0.013f, 0.455f)
                close()
            }
        }
        .build()
        return _compassNorth!!
    }

private var _compassNorth: ImageVector? = null
