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

public val Icons.Filled.PlantWilt: ImageVector
    get() {
        if (_plantWilt != null) {
            return _plantWilt!!
        }
        _plantWilt = Builder(name = "PlantWilt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.994f, 12.125f)
                curveToRelative(-0.137f, -4.512f, -2.749f, -6.125f, -4.994f, -6.125f)
                curveToRelative(-1.012f, 0.0f, -2.099f, 0.328f, -3.0f, 1.102f)
                verticalLineToRelative(-0.602f)
                curveTo(13.0f, 1.702f, 10.307f, 0.0f, 8.0f, 0.0f)
                curveTo(5.755f, 0.0f, 3.143f, 1.614f, 3.006f, 6.125f)
                curveToRelative(-1.726f, 0.443f, -3.006f, 2.012f, -3.006f, 3.875f)
                curveToRelative(0.0f, 1.742f, 1.107f, 3.804f, 2.055f, 5.04f)
                curveToRelative(0.468f, 0.61f, 1.177f, 0.96f, 1.945f, 0.96f)
                reflectiveCurveToRelative(1.478f, -0.35f, 1.945f, -0.96f)
                curveToRelative(0.948f, -1.236f, 2.055f, -3.298f, 2.055f, -5.04f)
                curveToRelative(0.0f, -1.858f, -1.274f, -3.424f, -2.994f, -3.872f)
                curveToRelative(0.133f, -3.823f, 2.312f, -4.128f, 2.994f, -4.128f)
                curveToRelative(0.704f, 0.0f, 3.0f, 0.325f, 3.0f, 4.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -4.175f, 2.296f, -4.5f, 3.0f, -4.5f)
                curveToRelative(0.682f, 0.0f, 2.861f, 0.305f, 2.994f, 4.128f)
                curveToRelative(-1.72f, 0.447f, -2.994f, 2.014f, -2.994f, 3.872f)
                curveToRelative(0.0f, 1.742f, 1.107f, 3.804f, 2.055f, 5.04f)
                curveToRelative(0.468f, 0.61f, 1.177f, 0.96f, 1.945f, 0.96f)
                reflectiveCurveToRelative(1.478f, -0.35f, 1.945f, -0.96f)
                curveToRelative(0.948f, -1.236f, 2.055f, -3.298f, 2.055f, -5.04f)
                curveToRelative(0.0f, -1.863f, -1.28f, -3.432f, -3.006f, -3.875f)
                close()
            }
        }
        .build()
        return _plantWilt!!
    }

private var _plantWilt: ImageVector? = null
