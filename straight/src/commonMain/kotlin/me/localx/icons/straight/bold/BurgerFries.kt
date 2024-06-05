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

public val Icons.Bold.BurgerFries: ImageVector
    get() {
        if (_burgerFries != null) {
            return _burgerFries!!
        }
        _burgerFries = Builder(name = "BurgerFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.47f, 9.97f)
                horizontalLineToRelative(-2.9f)
                lineToRelative(1.39f, -4.45f)
                lineToRelative(-2.86f, -0.89f)
                lineToRelative(-1.67f, 5.34f)
                horizontalLineToRelative(-1.12f)
                lineTo(13.98f, 0.56f)
                lineTo(11.03f, 0.03f)
                lineToRelative(-1.77f, 9.94f)
                horizontalLineToRelative(-0.03f)
                lineTo(7.46f, 0.03f)
                lineToRelative(-2.95f, 0.53f)
                lineToRelative(1.67f, 9.41f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-1.73f, -5.53f)
                lineTo(0.44f, 5.33f)
                lineToRelative(1.45f, 4.64f)
                lineTo(0.03f, 9.97f)
                lineToRelative(2.27f, 11.2f)
                curveToRelative(0.33f, 1.62f, 1.77f, 2.8f, 3.43f, 2.8f)
                horizontalLineToRelative(13.73f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.47f, 12.97f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(10.97f, 14.97f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(5.25f, 20.57f)
                lineToRelative(-1.54f, -7.6f)
                horizontalLineToRelative(4.52f)
                curveToRelative(-0.17f, 0.47f, -0.26f, 0.97f, -0.26f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.53f, 0.09f, 1.03f, 0.26f, 1.5f)
                horizontalLineToRelative(-2.49f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.17f, -0.49f, -0.4f)
                close()
                moveTo(19.47f, 20.97f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _burgerFries!!
    }

private var _burgerFries: ImageVector? = null
