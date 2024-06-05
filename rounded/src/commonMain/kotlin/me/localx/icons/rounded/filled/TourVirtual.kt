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

public val Icons.Filled.TourVirtual: ImageVector
    get() {
        if (_tourVirtual != null) {
            return _tourVirtual!!
        }
        _tourVirtual = Builder(name = "TourVirtual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.047f, 0.0f, 0.0f, 2.523f, 0.0f, 6.0f)
                verticalLineToRelative(13.548f)
                curveToRelative(0.0f, 1.574f, 1.055f, 3.057f, 2.971f, 4.175f)
                curveToRelative(0.315f, 0.184f, 0.668f, 0.275f, 1.021f, 0.275f)
                curveToRelative(0.348f, 0.0f, 0.696f, -0.09f, 1.006f, -0.268f)
                curveToRelative(0.626f, -0.36f, 1.001f, -1.007f, 1.001f, -1.729f)
                verticalLineToRelative(-10.678f)
                curveToRelative(0.0f, -1.12f, -0.628f, -2.143f, -1.639f, -2.667f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.5f, -0.777f, -2.36f, -1.745f, -2.36f, -2.656f)
                curveToRelative(0.0f, -1.932f, 4.018f, -4.0f, 10.0f, -4.0f)
                reflectiveCurveToRelative(10.0f, 2.068f, 10.0f, 4.0f)
                curveToRelative(0.0f, 0.911f, -0.86f, 1.879f, -2.36f, 2.656f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.011f, 0.524f, -1.639f, 1.547f, -1.639f, 2.667f)
                verticalLineToRelative(10.678f)
                curveToRelative(0.0f, 0.723f, 0.375f, 1.369f, 1.001f, 1.729f)
                curveToRelative(0.311f, 0.178f, 0.658f, 0.268f, 1.006f, 0.268f)
                curveToRelative(0.353f, 0.0f, 0.707f, -0.092f, 1.021f, -0.275f)
                curveToRelative(1.916f, -1.118f, 2.971f, -2.601f, 2.971f, -4.175f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -3.477f, -5.047f, -6.0f, -12.0f, -6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.883f, 0.391f, 1.67f, 1.0f, 2.22f)
                verticalLineToRelative(3.78f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.78f)
                curveToRelative(0.609f, -0.549f, 1.0f, -1.337f, 1.0f, -2.22f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _tourVirtual!!
    }

private var _tourVirtual: ImageVector? = null
