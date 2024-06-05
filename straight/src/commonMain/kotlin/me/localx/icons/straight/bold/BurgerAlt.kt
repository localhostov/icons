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

public val Icons.Bold.BurgerAlt: ImageVector
    get() {
        if (_burgerAlt != null) {
            return _burgerAlt!!
        }
        _burgerAlt = Builder(name = "BurgerAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(-1.5f)
                curveTo(1.0f, 4.51f, 5.73f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.99f, 4.51f, 11.0f, 10.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(4.15f, 9.0f)
                horizontalLineToRelative(15.71f)
                curveToRelative(-0.69f, -3.55f, -3.78f, -6.0f, -7.86f, -6.0f)
                reflectiveCurveToRelative(-7.15f, 2.49f, -7.85f, 6.0f)
                close()
                moveTo(23.0f, 14.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(3.0f)
                lineTo(23.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(23.0f, 19.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _burgerAlt!!
    }

private var _burgerAlt: ImageVector? = null
