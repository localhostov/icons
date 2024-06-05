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

public val Icons.Filled.BurgerAlt: ImageVector
    get() {
        if (_burgerAlt != null) {
            return _burgerAlt!!
        }
        _burgerAlt = Builder(name = "BurgerAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(23.0f, 14.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(1.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                close()
                moveTo(23.0f, 12.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                curveTo(1.0f, 4.93f, 5.93f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.98f, 4.83f, 11.0f, 11.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _burgerAlt!!
    }

private var _burgerAlt: ImageVector? = null
