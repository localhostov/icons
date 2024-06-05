package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.HoodCloak: ImageVector
    get() {
        if (_hoodCloak != null) {
            return _hoodCloak!!
        }
        _hoodCloak = Builder(name = "HoodCloak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.974f, 11.339f)
                horizontalLineToRelative(-0.018f)
                curveToRelative(-0.106f, -2.019f, -0.597f, -3.733f, -1.458f, -5.097f)
                curveToRelative(-0.337f, -0.535f, -0.515f, -1.087f, -0.499f, -1.555f)
                curveToRelative(0.052f, -1.544f, 0.947f, -3.126f, 0.957f, -3.141f)
                lineToRelative(1.044f, -1.546f)
                lineToRelative(-10.749f, 0.006f)
                curveToRelative(-0.727f, 0.006f, -1.366f, 0.011f, -1.854f, 0.035f)
                curveTo(5.345f, 0.338f, 0.356f, 5.301f, 0.042f, 11.339f)
                curveToRelative(-0.205f, 3.953f, 0.608f, 7.147f, 2.771f, 10.637f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.852f)
                lineToRelative(-0.472f, -0.373f)
                curveToRelative(-0.261f, -0.206f, -6.38f, -5.105f, -6.38f, -10.603f)
                curveToRelative(0.0f, -3.86f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 5.498f, -6.119f, 10.397f, -6.38f, 10.603f)
                lineToRelative(-0.472f, 0.373f)
                horizontalLineToRelative(11.852f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.798f)
                curveToRelative(2.163f, -3.489f, 2.977f, -6.684f, 2.771f, -10.637f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 13.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 3.609f, 3.538f, 7.178f, 5.0f, 8.499f)
                curveToRelative(1.462f, -1.321f, 5.0f, -4.89f, 5.0f, -8.499f)
                close()
            }
        }
        .build()
        return _hoodCloak!!
    }

private var _hoodCloak: ImageVector? = null
