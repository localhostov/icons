package me.localx.icons.rounded.filled

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

public val Icons.Filled.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(-0.492f)
                curveToRelative(0.901f, -2.26f, 2.492f, -6.838f, 2.492f, -11.0f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 4.162f, 1.591f, 8.74f, 2.492f, 11.0f)
                horizontalLineToRelative(-0.492f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(7.469f, 24.0f)
                curveToRelative(0.99f, 0.0f, 1.719f, -0.923f, 1.488f, -1.885f)
                curveToRelative(-0.686f, -2.859f, -1.957f, -8.26f, -1.957f, -11.115f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.854f, -1.271f, 8.255f, -1.957f, 11.115f)
                curveToRelative(-0.231f, 0.963f, 0.498f, 1.885f, 1.488f, 1.885f)
                horizontalLineToRelative(4.469f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(5.736f, 7.886f)
                curveToRelative(-0.35f, 0.7f, -0.588f, 1.466f, -0.685f, 2.274f)
                curveToRelative(-0.059f, 0.484f, -0.48f, 0.84f, -0.967f, 0.84f)
                horizontalLineToRelative(-0.025f)
                curveToRelative(-0.599f, 0.0f, -1.062f, -0.524f, -0.989f, -1.114f)
                curveToRelative(0.127f, -1.023f, 0.427f, -1.993f, 0.87f, -2.881f)
                curveToRelative(0.269f, -0.54f, 0.967f, -0.706f, 1.458f, -0.355f)
                lineToRelative(0.026f, 0.018f)
                curveToRelative(0.387f, 0.276f, 0.527f, 0.792f, 0.314f, 1.217f)
                close()
                moveTo(11.0f, 3.271f)
                curveToRelative(0.0f, 0.443f, -0.285f, 0.842f, -0.709f, 0.949f)
                curveToRelative(-0.839f, 0.211f, -1.618f, 0.572f, -2.307f, 1.055f)
                curveToRelative(-0.333f, 0.234f, -0.784f, 0.207f, -1.115f, -0.03f)
                curveToRelative(-0.549f, -0.392f, -0.572f, -1.225f, -0.02f, -1.613f)
                curveToRelative(0.876f, -0.615f, 1.866f, -1.079f, 2.931f, -1.351f)
                curveToRelative(0.618f, -0.158f, 1.219f, 0.327f, 1.219f, 0.965f)
                verticalLineToRelative(0.024f)
                close()
                moveTo(17.131f, 5.245f)
                curveToRelative(-0.331f, 0.236f, -0.782f, 0.263f, -1.115f, 0.03f)
                curveToRelative(-0.688f, -0.483f, -1.468f, -0.845f, -2.307f, -1.055f)
                curveToRelative(-0.424f, -0.106f, -0.709f, -0.506f, -0.709f, -0.949f)
                verticalLineToRelative(-0.024f)
                curveToRelative(0.0f, -0.638f, 0.601f, -1.123f, 1.219f, -0.965f)
                curveToRelative(1.066f, 0.272f, 2.055f, 0.735f, 2.931f, 1.351f)
                curveToRelative(0.553f, 0.388f, 0.53f, 1.221f, -0.02f, 1.613f)
                close()
                moveTo(19.917f, 11.0f)
                curveToRelative(-0.487f, 0.0f, -0.909f, -0.356f, -0.967f, -0.84f)
                curveToRelative(-0.098f, -0.808f, -0.335f, -1.574f, -0.685f, -2.274f)
                curveToRelative(-0.213f, -0.425f, -0.073f, -0.94f, 0.314f, -1.217f)
                lineToRelative(0.026f, -0.018f)
                curveToRelative(0.491f, -0.351f, 1.189f, -0.186f, 1.458f, 0.355f)
                curveToRelative(0.442f, 0.888f, 0.742f, 1.858f, 0.87f, 2.881f)
                curveToRelative(0.073f, 0.589f, -0.39f, 1.114f, -0.989f, 1.114f)
                horizontalLineToRelative(-0.025f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
