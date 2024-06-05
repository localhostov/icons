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

public val Icons.Filled.BurgerFries: ImageVector
    get() {
        if (_burgerFries != null) {
            return _burgerFries!!
        }
        _burgerFries = Builder(name = "BurgerFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.42f, 12.12f)
                curveToRelative(0.65f, -0.77f, 1.49f, -1.38f, 2.45f, -1.74f)
                lineToRelative(1.5f, -8.1f)
                lineToRelative(1.99f, 0.34f)
                lineToRelative(-1.26f, 7.37f)
                horizontalLineToRelative(5.88f)
                lineToRelative(1.41f, -5.18f)
                lineToRelative(-4.18f, -1.17f)
                lineToRelative(0.45f, -2.65f)
                lineTo(9.97f, 0.02f)
                lineTo(9.97f, -0.02f)
                reflectiveCurveToRelative(-0.11f, 0.02f, -0.11f, 0.02f)
                lineToRelative(-0.1f, -0.02f)
                lineTo(9.76f, 0.01f)
                reflectiveCurveTo(4.05f, 0.99f, 4.05f, 0.99f)
                lineToRelative(0.45f, 2.64f)
                lineTo(0.27f, 4.8f)
                lineToRelative(1.96f, 7.2f)
                lineTo(0.04f, 12.0f)
                lineToRelative(1.92f, 9.59f)
                curveToRelative(0.28f, 1.4f, 1.51f, 2.41f, 2.94f, 2.41f)
                horizontalLineToRelative(2.66f)
                curveToRelative(-0.97f, -1.07f, -1.56f, -2.46f, -1.56f, -4.01f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.47f, 0.53f, -2.82f, 1.42f, -3.87f)
                close()
                moveTo(2.73f, 6.2f)
                lineToRelative(2.11f, -0.59f)
                lineToRelative(1.09f, 6.39f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-1.58f, -5.8f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                close()
            }
        }
        .build()
        return _burgerFries!!
    }

private var _burgerFries: ImageVector? = null
