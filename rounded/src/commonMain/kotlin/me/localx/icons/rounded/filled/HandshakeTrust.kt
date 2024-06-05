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

public val Icons.Filled.HandshakeTrust: ImageVector
    get() {
        if (_handshakeTrust != null) {
            return _handshakeTrust!!
        }
        _handshakeTrust = Builder(name = "HandshakeTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.038f, 5.186f)
                verticalLineToRelative(-2.496f)
                curveToRelative(0.0f, -0.862f, 0.552f, -1.627f, 1.371f, -1.898f)
                lineTo(11.567f, 0.076f)
                curveToRelative(0.306f, -0.101f, 0.636f, -0.101f, 0.942f, 0.0f)
                lineToRelative(2.158f, 0.716f)
                curveToRelative(0.818f, 0.271f, 1.371f, 1.036f, 1.371f, 1.898f)
                verticalLineToRelative(2.496f)
                curveToRelative(0.0f, 2.287f, -1.775f, 3.801f, -3.027f, 4.559f)
                curveToRelative(-0.581f, 0.352f, -1.309f, 0.343f, -1.873f, -0.036f)
                curveToRelative(-1.256f, -0.843f, -3.1f, -2.47f, -3.1f, -4.523f)
                close()
                moveTo(23.0f, 11.0f)
                horizontalLineToRelative(-3.431f)
                curveToRelative(-0.742f, 0.0f, -1.476f, -0.134f, -2.166f, -0.406f)
                curveToRelative(-0.439f, -0.173f, -0.952f, -0.339f, -1.44f, -0.453f)
                curveToRelative(-1.13f, 1.099f, -2.426f, 1.709f, -3.03f, 1.952f)
                curveToRelative(-0.76f, 0.321f, -1.56f, 0.142f, -1.56f, 0.142f)
                lineToRelative(-2.031f, 1.99f)
                curveToRelative(-0.371f, 0.372f, -0.455f, 0.967f, -0.181f, 1.347f)
                curveToRelative(0.18f, 0.25f, 0.441f, 0.4f, 0.739f, 0.425f)
                curveToRelative(0.295f, 0.025f, 0.581f, -0.082f, 0.788f, -0.29f)
                lineToRelative(2.309f, -2.142f)
                lineToRelative(7.188f, 6.436f)
                horizontalLineToRelative(2.814f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.072f, 17.15f)
                curveToRelative(-0.535f, 0.538f, -1.292f, 0.85f, -2.084f, 0.85f)
                curveToRelative(-0.871f, -0.071f, -1.931f, -0.538f, -2.451f, -1.262f)
                curveToRelative(-0.843f, -1.167f, -0.678f, -2.857f, 0.389f, -3.926f)
                lineToRelative(1.644f, -1.605f)
                curveToRelative(-0.435f, -0.297f, -0.907f, -0.665f, -1.364f, -1.102f)
                curveToRelative(-0.481f, 0.107f, -0.994f, 0.279f, -1.447f, 0.46f)
                curveToRelative(-0.713f, 0.285f, -1.47f, 0.434f, -2.238f, 0.434f)
                lineTo(1.0f, 10.999f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.155f)
                curveToRelative(0.892f, 0.0f, 1.758f, 0.298f, 2.461f, 0.847f)
                lineToRelative(2.98f, 2.326f)
                curveToRelative(0.687f, 0.536f, 1.533f, 0.827f, 2.404f, 0.827f)
                reflectiveCurveToRelative(1.717f, -0.291f, 2.404f, -0.827f)
                lineToRelative(3.381f, -2.639f)
                lineToRelative(-4.778f, -4.279f)
                lineToRelative(-0.935f, 0.895f)
                close()
            }
        }
        .build()
        return _handshakeTrust!!
    }

private var _handshakeTrust: ImageVector? = null
