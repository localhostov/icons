package me.localx.icons.straight.outline

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

public val Icons.Outline.BurgerGlass: ImageVector
    get() {
        if (_burgerGlass != null) {
            return _burgerGlass!!
        }
        _burgerGlass = Builder(name = "BurgerGlass", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineToRelative(-2.89f)
                lineToRelative(0.87f, -8.66f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                reflectiveCurveToRelative(-1.38f, -1.0f, -2.24f, -1.0f)
                lineTo(3.0f, 0.0f)
                curveTo(2.15f, 0.01f, 1.33f, 0.38f, 0.76f, 1.01f)
                curveTo(0.19f, 1.65f, -0.08f, 2.5f, 0.02f, 3.34f)
                lineTo(2.1f, 24.0f)
                lineTo(20.0f, 24.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(2.25f, 2.35f)
                curveToRelative(0.19f, -0.22f, 0.46f, -0.33f, 0.75f, -0.33f)
                lineTo(15.0f, 2.02f)
                curveToRelative(0.29f, -0.01f, 0.55f, 0.11f, 0.75f, 0.32f)
                curveToRelative(0.19f, 0.21f, 0.28f, 0.49f, 0.25f, 0.79f)
                lineToRelative(-0.29f, 2.87f)
                lineTo(2.3f, 6.0f)
                lineToRelative(-0.29f, -2.88f)
                curveToRelative(-0.03f, -0.29f, 0.06f, -0.56f, 0.25f, -0.78f)
                close()
                moveTo(2.49f, 8.0f)
                lineTo(15.5f, 8.0f)
                lineToRelative(-0.4f, 4.0f)
                horizontalLineToRelative(-3.1f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.74f, 0.21f, 1.42f, 0.56f, 2.01f)
                lineTo(3.9f, 22.01f)
                reflectiveCurveToRelative(-1.41f, -14.01f, -1.41f, -14.01f)
                close()
                moveTo(19.99f, 22.0f)
                lineTo(12.0f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _burgerGlass!!
    }

private var _burgerGlass: ImageVector? = null
