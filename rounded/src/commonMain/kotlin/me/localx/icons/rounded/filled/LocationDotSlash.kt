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

public val Icons.Filled.LocationDotSlash: ImageVector
    get() {
        if (_locationDotSlash != null) {
            return _locationDotSlash!!
        }
        _locationDotSlash = Builder(name = "LocationDotSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 22.293f)
                lineToRelative(-3.732f, -3.732f)
                curveToRelative(4.081f, -4.304f, 4.022f, -11.12f, -0.197f, -15.339f)
                curveTo(17.7f, 1.145f, 14.938f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.84f, 0.0f, -5.509f, 1.078f, -7.561f, 3.025f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.981f, -0.356f, 1.895f, -0.976f, 2.61f)
                lineToRelative(-1.429f, -1.429f)
                curveToRelative(0.251f, -0.338f, 0.404f, -0.743f, 0.404f, -1.182f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.432f, 0.0f, -0.849f, 0.142f, -1.19f, 0.396f)
                lineToRelative(-1.408f, -1.408f)
                curveToRelative(0.722f, -0.621f, 1.636f, -0.987f, 2.599f, -0.987f)
                close()
                moveTo(16.319f, 20.56f)
                curveToRelative(0.192f, 0.192f, 0.298f, 0.455f, 0.293f, 0.728f)
                curveToRelative(-0.006f, 0.271f, -0.122f, 0.53f, -0.322f, 0.715f)
                lineToRelative(-0.505f, 0.466f)
                curveToRelative(-1.001f, 0.98f, -2.354f, 1.532f, -3.786f, 1.532f)
                reflectiveCurveToRelative(-2.784f, -0.552f, -3.807f, -1.553f)
                lineToRelative(-3.942f, -3.642f)
                curveTo(1.348f, 15.904f, 0.297f, 11.697f, 1.479f, 7.8f)
                curveToRelative(0.102f, -0.337f, 0.373f, -0.595f, 0.714f, -0.68f)
                curveToRelative(0.341f, -0.087f, 0.702f, 0.015f, 0.95f, 0.263f)
                lineToRelative(13.176f, 13.177f)
                close()
            }
        }
        .build()
        return _locationDotSlash!!
    }

private var _locationDotSlash: ImageVector? = null
