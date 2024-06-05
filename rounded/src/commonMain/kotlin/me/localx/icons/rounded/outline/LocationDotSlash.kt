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

public val Icons.Outline.LocationDotSlash: ImageVector
    get() {
        if (_locationDotSlash != null) {
            return _locationDotSlash!!
        }
        _locationDotSlash = Builder(name = "LocationDotSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.635f, 20.321f)
                curveToRelative(0.375f, 0.406f, 0.35f, 1.039f, -0.056f, 1.413f)
                lineToRelative(-0.793f, 0.732f)
                curveToRelative(-1.003f, 0.981f, -2.355f, 1.533f, -3.787f, 1.533f)
                reflectiveCurveToRelative(-2.783f, -0.552f, -3.807f, -1.553f)
                lineToRelative(-3.943f, -3.642f)
                curveTo(1.315f, 15.871f, 0.273f, 11.626f, 1.504f, 7.701f)
                curveToRelative(0.165f, -0.527f, 0.727f, -0.821f, 1.253f, -0.655f)
                curveToRelative(0.527f, 0.165f, 0.82f, 0.727f, 0.655f, 1.253f)
                curveToRelative(-1.007f, 3.213f, -0.155f, 6.687f, 2.224f, 9.065f)
                lineToRelative(3.935f, 3.634f)
                curveToRelative(1.337f, 1.307f, 3.542f, 1.287f, 4.837f, 0.02f)
                lineToRelative(0.813f, -0.752f)
                curveToRelative(0.407f, -0.375f, 1.041f, -0.348f, 1.413f, 0.056f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.725f, 2.725f)
                curveTo(6.484f, 1.07f, 9.16f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.938f, 0.0f, 5.7f, 1.145f, 7.778f, 3.222f)
                curveToRelative(4.22f, 4.22f, 4.288f, 11.043f, 0.204f, 15.347f)
                lineToRelative(3.725f, 3.725f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(5.846f, 4.432f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.722f, -0.622f, 1.65f, -0.972f, 2.614f, -0.972f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.982f, -0.35f, 1.9f, -0.971f, 2.615f)
                lineToRelative(3.539f, 3.539f)
                curveToRelative(3.303f, -3.497f, 3.244f, -9.07f, -0.205f, -12.519f)
                curveToRelative(-1.7f, -1.699f, -3.96f, -2.636f, -6.364f, -2.636f)
                curveToRelative(-2.306f, 0.0f, -4.479f, 0.862f, -6.154f, 2.432f)
                close()
                moveTo(13.607f, 12.193f)
                curveToRelative(0.252f, -0.339f, 0.393f, -0.753f, 0.393f, -1.193f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.432f, 0.0f, -0.85f, 0.141f, -1.191f, 0.395f)
                lineToRelative(2.799f, 2.799f)
                close()
            }
        }
        .build()
        return _locationDotSlash!!
    }

private var _locationDotSlash: ImageVector? = null
