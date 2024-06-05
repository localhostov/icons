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

public val Icons.Outline.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-6.317f, -6.317f)
                lineToRelative(2.105f, -3.43f)
                curveToRelative(0.606f, -0.894f, 0.668f, -2.041f, 0.163f, -2.995f)
                curveToRelative(-0.506f, -0.954f, -1.491f, -1.547f, -2.569f, -1.547f)
                lineToRelative(-3.833f, -0.003f)
                lineToRelative(1.205f, -5.227f)
                curveToRelative(0.309f, -1.078f, -0.139f, -2.172f, -1.064f, -2.6f)
                curveToRelative(-0.88f, -0.407f, -1.865f, -0.086f, -2.473f, 0.826f)
                lineToRelative(-3.236f, 5.273f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(12.548f, 2.177f)
                curveToRelative(-0.005f, 0.029f, -0.013f, 0.062f, -0.023f, 0.099f)
                lineToRelative(-1.5f, 6.5f)
                curveToRelative(-0.068f, 0.297f, 0.002f, 0.608f, 0.192f, 0.847f)
                reflectiveCurveToRelative(0.478f, 0.378f, 0.782f, 0.378f)
                lineToRelative(5.089f, 0.004f)
                curveToRelative(0.494f, 0.0f, 0.726f, 0.338f, 0.803f, 0.483f)
                curveToRelative(0.077f, 0.145f, 0.226f, 0.527f, -0.076f, 0.974f)
                lineToRelative(-1.88f, 3.061f)
                lineToRelative(-6.794f, -6.794f)
                lineToRelative(3.406f, -5.551f)
                close()
                moveTo(14.904f, 20.024f)
                lineToRelative(-1.83f, 2.979f)
                curveToRelative(-0.432f, 0.65f, -1.057f, 1.0f, -1.699f, 1.0f)
                curveToRelative(-0.259f, 0.0f, -0.521f, -0.057f, -0.773f, -0.174f)
                curveToRelative(-0.925f, -0.428f, -1.373f, -1.521f, -1.064f, -2.6f)
                lineToRelative(1.025f, -4.454f)
                curveToRelative(0.125f, -0.539f, 0.663f, -0.875f, 1.199f, -0.75f)
                curveToRelative(0.538f, 0.124f, 0.874f, 0.661f, 0.75f, 1.199f)
                lineToRelative(-1.039f, 4.504f)
                curveToRelative(-0.01f, 0.036f, -0.018f, 0.068f, -0.023f, 0.098f)
                lineToRelative(1.749f, -2.85f)
                curveToRelative(0.288f, -0.472f, 0.903f, -0.617f, 1.375f, -0.329f)
                curveToRelative(0.471f, 0.289f, 0.618f, 0.905f, 0.329f, 1.376f)
                close()
                moveTo(10.0f, 16.004f)
                horizontalLineToRelative(-3.088f)
                curveToRelative(-1.08f, 0.0f, -2.064f, -0.593f, -2.57f, -1.547f)
                curveToRelative(-0.506f, -0.954f, -0.443f, -2.103f, 0.163f, -2.996f)
                lineToRelative(0.603f, -0.984f)
                curveToRelative(0.289f, -0.47f, 0.906f, -0.616f, 1.375f, -0.329f)
                curveToRelative(0.471f, 0.289f, 0.618f, 0.905f, 0.33f, 1.376f)
                lineToRelative(-0.627f, 1.022f)
                curveToRelative(-0.302f, 0.446f, -0.153f, 0.829f, -0.076f, 0.975f)
                curveToRelative(0.077f, 0.146f, 0.309f, 0.483f, 0.803f, 0.483f)
                horizontalLineToRelative(3.088f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
