package me.localx.icons.straight.filled

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

public val Icons.Filled.Rent: ImageVector
    get() {
        if (_rent != null) {
            return _rent!!
        }
        _rent = Builder(name = "Rent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.427f, 6.513f)
                curveToRelative(-0.486f, -3.67f, -3.627f, -6.513f, -7.427f, -6.513f)
                curveToRelative(-3.652f, 0.0f, -6.699f, 2.625f, -7.362f, 6.087f)
                curveToRelative(-2.349f, 0.41f, -4.138f, 2.447f, -4.138f, 4.913f)
                curveToRelative(0.0f, 2.05f, 1.234f, 3.812f, 3.0f, 4.584f)
                verticalLineToRelative(0.431f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(2.001f, 2.0f)
                lineToRelative(1.999f, -2.0f)
                verticalLineToRelative(-6.431f)
                curveToRelative(1.766f, -0.772f, 3.0f, -2.533f, 3.0f, -4.584f)
                curveToRelative(0.0f, -2.355f, -1.634f, -4.317f, -3.826f, -4.847f)
                curveToRelative(0.603f, -2.382f, 2.759f, -4.153f, 5.326f, -4.153f)
                curveToRelative(2.745f, 0.0f, 5.021f, 2.025f, 5.429f, 4.657f)
                lineToRelative(-4.429f, 4.429f)
                verticalLineToRelative(12.914f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-12.914f)
                lineToRelative(-4.573f, -4.573f)
                close()
                moveTo(5.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _rent!!
    }

private var _rent: ImageVector? = null
