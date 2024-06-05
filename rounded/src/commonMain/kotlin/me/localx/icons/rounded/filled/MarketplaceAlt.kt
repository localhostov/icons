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

public val Icons.Filled.MarketplaceAlt: ImageVector
    get() {
        if (_marketplaceAlt != null) {
            return _marketplaceAlt!!
        }
        _marketplaceAlt = Builder(name = "MarketplaceAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(19.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(0.316f)
                curveToRelative(0.488f, 0.0f, 0.903f, 0.349f, 0.986f, 0.83f)
                lineToRelative(0.637f, 3.681f)
                curveToRelative(0.248f, 1.443f, 1.491f, 2.49f, 2.956f, 2.49f)
                horizontalLineToRelative(4.429f)
                curveToRelative(1.319f, 0.0f, 2.47f, -0.845f, 2.862f, -2.102f)
                lineToRelative(0.722f, -2.299f)
                curveToRelative(0.192f, -0.614f, 0.085f, -1.264f, -0.296f, -1.783f)
                curveToRelative(-0.381f, -0.519f, -0.969f, -0.816f, -1.612f, -0.816f)
                horizontalLineToRelative(-7.854f)
                curveToRelative(-0.416f, -1.184f, -1.537f, -2.0f, -2.83f, -2.0f)
                horizontalLineToRelative(-0.316f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(20.5f, 15.0f)
                curveToRelative(-1.28f, 0.0f, -2.39f, -0.698f, -3.0f, -1.726f)
                curveToRelative(-0.61f, 1.028f, -1.72f, 1.726f, -3.0f, 1.726f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.935f, 0.374f, -1.781f, 0.974f, -2.41f)
                curveToRelative(-0.501f, -0.636f, -0.861f, -1.394f, -1.006f, -2.241f)
                lineToRelative(-0.501f, -2.896f)
                curveToRelative(-1.066f, -0.193f, -1.935f, -0.952f, -2.291f, -1.953f)
                horizontalLineToRelative(-3.175f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _marketplaceAlt!!
    }

private var _marketplaceAlt: ImageVector? = null
