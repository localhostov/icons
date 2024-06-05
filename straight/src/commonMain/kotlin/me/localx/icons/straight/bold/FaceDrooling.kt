package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.FaceDrooling: ImageVector
    get() {
        if (_faceDrooling != null) {
            return _faceDrooling!!
        }
        _faceDrooling = Builder(name = "FaceDrooling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.769f, 9.892f)
                curveToRelative(-0.828f, 0.561f, -1.923f, 2.511f, -1.923f, 2.511f)
                curveToRelative(-0.915f, -1.351f, -1.416f, -3.872f, 0.24f, -4.994f)
                curveToRelative(1.656f, -1.122f, 3.812f, 0.278f, 4.727f, 1.629f)
                curveToRelative(0.0f, 0.0f, -2.217f, 0.294f, -3.044f, 0.855f)
                close()
                moveTo(17.913f, 7.408f)
                curveToRelative(-1.656f, -1.122f, -3.812f, 0.278f, -4.727f, 1.629f)
                curveToRelative(0.0f, 0.0f, 2.217f, 0.294f, 3.044f, 0.855f)
                curveToRelative(0.828f, 0.561f, 1.923f, 2.511f, 1.923f, 2.511f)
                curveToRelative(0.915f, -1.351f, 1.416f, -3.872f, -0.24f, -4.994f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 5.58f, 3.833f, 10.268f, 9.0f, 11.605f)
                verticalLineToRelative(-3.13f)
                curveToRelative(-3.49f, -1.239f, -6.0f, -4.565f, -6.0f, -8.475f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                curveToRelative(0.0f, 1.479f, -0.365f, 2.872f, -1.0f, 4.104f)
                verticalLineToRelative(4.815f)
                curveToRelative(2.448f, -2.198f, 4.0f, -5.377f, 4.0f, -8.919f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-2.133f, 0.0f, -3.987f, -1.606f, -4.0f, -1.618f)
                lineToRelative(-1.999f, 2.236f)
                curveToRelative(0.098f, 0.088f, 2.194f, 1.926f, 5.0f, 2.308f)
                verticalLineToRelative(2.574f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.69f)
                curveToRelative(0.332f, -0.055f, 0.663f, -0.102f, 1.0f, -0.182f)
                verticalLineToRelative(4.872f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(18.001f, 13.398f)
                lineToRelative(-2.043f, 0.793f)
                curveToRelative(-1.362f, 0.529f, -2.73f, 0.809f, -3.957f, 0.809f)
                close()
            }
        }
        .build()
        return _faceDrooling!!
    }

private var _faceDrooling: ImageVector? = null
