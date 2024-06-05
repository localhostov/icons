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

public val Icons.Filled.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) {
            return _coffeeBean!!
        }
        _coffeeBean = Builder(name = "CoffeeBean", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.65f, 19.535f)
                curveToRelative(-2.874f, 2.874f, -6.532f, 4.362f, -9.931f, 4.362f)
                curveToRelative(-2.397f, 0.0f, -4.664f, -0.744f, -6.438f, -2.26f)
                curveToRelative(0.119f, -0.861f, 1.174f, -6.318f, 9.039f, -8.776f)
                curveToRelative(6.907f, -2.157f, 9.26f, -6.463f, 10.053f, -8.881f)
                curveToRelative(2.925f, 4.339f, 1.881f, 10.951f, -2.723f, 15.554f)
                close()
                moveTo(11.724f, 10.953f)
                curveToRelative(7.864f, -2.457f, 8.919f, -7.914f, 9.039f, -8.776f)
                curveTo(16.473f, -1.49f, 9.294f, -0.622f, 4.394f, 4.28f)
                curveTo(-0.21f, 8.883f, -1.254f, 15.495f, 1.671f, 19.834f)
                curveToRelative(0.793f, -2.417f, 3.146f, -6.723f, 10.053f, -8.881f)
                close()
            }
        }
        .build()
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
