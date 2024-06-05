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

public val Icons.Filled.BurgerGlass: ImageVector
    get() {
        if (_burgerGlass != null) {
            return _burgerGlass!!
        }
        _burgerGlass = Builder(name = "BurgerGlass", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
                moveTo(17.0f, 21.0f)
                lineToRelative(-3.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-3.0f, 2.0f)
                close()
                moveTo(0.18f, 5.0f)
                lineTo(17.81f, 5.0f)
                lineToRelative(0.17f, -1.66f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                reflectiveCurveToRelative(-1.38f, -1.0f, -2.24f, -1.0f)
                lineTo(3.0f, 0.0f)
                curveTo(2.15f, 0.01f, 1.33f, 0.38f, 0.76f, 1.01f)
                curveTo(0.19f, 1.65f, -0.08f, 2.5f, 0.02f, 3.34f)
                lineToRelative(0.17f, 1.66f)
                close()
                moveTo(0.38f, 7.0f)
                lineToRelative(1.71f, 17.0f)
                lineTo(7.54f, 24.0f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(5.31f)
                lineToRelative(0.3f, -3.0f)
                lineTo(0.39f, 7.0f)
                close()
            }
        }
        .build()
        return _burgerGlass!!
    }

private var _burgerGlass: ImageVector? = null
