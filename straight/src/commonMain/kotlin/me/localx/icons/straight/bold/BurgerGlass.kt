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

public val Icons.Bold.BurgerGlass: ImageVector
    get() {
        if (_burgerGlass != null) {
            return _burgerGlass!!
        }
        _burgerGlass = Builder(name = "BurgerGlass", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 10.0f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(0.58f, -5.98f)
                curveToRelative(0.19f, -0.98f, -0.06f, -1.98f, -0.69f, -2.76f)
                curveToRelative(-0.64f, -0.8f, -1.59f, -1.25f, -2.62f, -1.25f)
                lineTo(3.37f, 0.01f)
                curveTo(2.35f, 0.0f, 1.39f, 0.46f, 0.75f, 1.25f)
                curveTo(0.12f, 2.03f, -0.13f, 3.04f, 0.06f, 4.02f)
                lineToRelative(1.95f, 19.98f)
                lineTo(19.5f, 24.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(21.0f, 14.5f)
                verticalLineToRelative(0.5f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(3.09f, 3.14f)
                curveToRelative(0.05f, -0.06f, 0.14f, -0.14f, 0.28f, -0.14f)
                lineTo(14.63f, 3.0f)
                curveToRelative(0.14f, 0.0f, 0.23f, 0.07f, 0.28f, 0.14f)
                curveToRelative(0.04f, 0.06f, 0.12f, 0.17f, 0.08f, 0.34f)
                lineToRelative(-0.15f, 1.52f)
                lineTo(3.17f, 5.0f)
                lineToRelative(-0.13f, -1.35f)
                lineToRelative(-0.03f, -0.17f)
                curveToRelative(-0.04f, -0.17f, 0.03f, -0.28f, 0.08f, -0.34f)
                close()
                moveTo(3.46f, 8.0f)
                lineTo(14.54f, 8.0f)
                lineToRelative(-0.2f, 2.0f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.53f, 0.11f, 1.03f, 0.28f, 1.5f)
                horizontalLineToRelative(-3.55f)
                lineToRelative(-1.27f, -13.0f)
                close()
                moveTo(19.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.93f)
                lineToRelative(2.57f, 2.0f)
                lineToRelative(2.47f, -2.0f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _burgerGlass!!
    }

private var _burgerGlass: ImageVector? = null
