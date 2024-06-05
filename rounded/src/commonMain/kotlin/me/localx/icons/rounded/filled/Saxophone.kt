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

public val Icons.Filled.Saxophone: ImageVector
    get() {
        if (_saxophone != null) {
            return _saxophone!!
        }
        _saxophone = Builder(name = "Saxophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 24.0f)
                curveToRelative(0.041f, 0.0f, -0.041f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(23.0f, 0.0f)
                horizontalLineToRelative(-1.024f)
                curveToRelative(-1.323f, 0.0f, -2.476f, 0.849f, -2.865f, 2.113f)
                curveToRelative(-0.072f, 0.234f, -0.152f, 0.496f, -0.239f, 0.782f)
                curveToRelative(0.0f, 0.0f, -0.996f, -0.308f, -1.243f, -0.392f)
                curveToRelative(-0.523f, -0.179f, -1.091f, 0.1f, -1.27f, 0.624f)
                curveToRelative(-0.179f, 0.522f, 0.101f, 1.091f, 0.623f, 1.269f)
                curveToRelative(0.261f, 0.089f, 1.319f, 0.417f, 1.319f, 0.417f)
                curveToRelative(-0.228f, 0.774f, -0.476f, 1.622f, -0.734f, 2.508f)
                curveToRelative(0.0f, 0.0f, -1.162f, -0.36f, -1.415f, -0.445f)
                curveToRelative(-0.524f, -0.176f, -1.091f, 0.103f, -1.269f, 0.625f)
                curveToRelative(-0.177f, 0.523f, 0.104f, 1.091f, 0.626f, 1.268f)
                curveToRelative(0.265f, 0.09f, 1.498f, 0.472f, 1.498f, 0.472f)
                curveToRelative(-0.259f, 0.889f, -0.519f, 1.783f, -0.773f, 2.651f)
                curveToRelative(-0.834f, 2.366f, -2.229f, 5.109f, -3.759f, 5.109f)
                curveToRelative(-1.318f, 0.0f, -1.472f, -1.049f, -1.476f, -1.5f)
                verticalLineToRelative(-3.488f)
                curveToRelative(0.012f, -0.461f, 0.189f, -1.012f, 0.976f, -1.012f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(0.976f)
                curveTo(0.423f, 9.0f, -0.024f, 9.448f, -0.024f, 10.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.351f, 0.0f, 0.606f, 0.079f, 0.761f, 0.235f)
                curveToRelative(0.221f, 0.223f, 0.266f, 0.609f, 0.264f, 0.765f)
                verticalLineToRelative(4.332f)
                curveToRelative(0.0f, 2.976f, 1.223f, 5.406f, 3.354f, 6.666f)
                curveToRelative(1.078f, 0.636f, 2.364f, 0.983f, 3.646f, 1.003f)
                curveToRelative(3.188f, 0.0f, 6.146f, -1.937f, 7.102f, -4.745f)
                curveToRelative(0.383f, -1.124f, 1.158f, -3.74f, 2.012f, -6.662f)
                curveToRelative(0.407f, -1.161f, 2.443f, -8.388f, 2.907f, -9.89f)
                curveToRelative(0.13f, -0.42f, 0.514f, -0.703f, 0.955f, -0.703f)
                horizontalLineToRelative(1.024f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _saxophone!!
    }

private var _saxophone: ImageVector? = null
