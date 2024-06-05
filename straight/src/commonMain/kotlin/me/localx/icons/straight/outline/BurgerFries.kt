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

public val Icons.Outline.BurgerFries: ImageVector
    get() {
        if (_burgerFries != null) {
            return _burgerFries!!
        }
        _burgerFries = Builder(name = "BurgerFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.99f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(1.96f, -7.18f)
                lineToRelative(-4.18f, -1.17f)
                lineToRelative(0.45f, -2.65f)
                lineTo(9.5f, -0.02f)
                lineTo(4.05f, 0.99f)
                lineToRelative(0.45f, 2.64f)
                lineTo(0.27f, 4.8f)
                lineToRelative(1.96f, 7.2f)
                lineTo(0.04f, 12.0f)
                lineToRelative(1.92f, 9.59f)
                curveToRelative(0.28f, 1.4f, 1.51f, 2.41f, 2.94f, 2.41f)
                horizontalLineToRelative(15.1f)
                curveToRelative(2.21f, -0.01f, 4.0f, -1.8f, 4.0f, -4.01f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 15.99f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 16.99f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.03f, 0.78f, -1.88f, 1.78f, -1.99f)
                horizontalLineToRelative(8.22f)
                curveToRelative(1.1f, -0.01f, 2.0f, 0.88f, 2.0f, 1.99f)
                close()
                moveTo(16.94f, 6.2f)
                lineToRelative(-1.58f, 5.79f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(1.09f, -6.37f)
                lineToRelative(2.07f, 0.58f)
                close()
                moveTo(13.36f, 2.63f)
                lineToRelative(-1.6f, 9.37f)
                reflectiveCurveToRelative(-2.18f, 0.0f, -2.18f, 0.0f)
                lineToRelative(1.8f, -9.72f)
                lineToRelative(1.99f, 0.34f)
                close()
                moveTo(8.34f, 2.29f)
                lineToRelative(0.48f, 2.8f)
                lineToRelative(-1.06f, 5.72f)
                lineTo(6.36f, 2.62f)
                lineToRelative(1.97f, -0.34f)
                close()
                moveTo(2.73f, 6.2f)
                lineToRelative(2.11f, -0.59f)
                lineToRelative(1.09f, 6.39f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-1.58f, -5.8f)
                close()
                moveTo(2.48f, 14.0f)
                horizontalLineToRelative(6.05f)
                curveToRelative(-0.34f, 0.59f, -0.53f, 1.26f, -0.53f, 1.99f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.74f, 0.2f, 1.44f, 0.56f, 2.04f)
                horizontalLineToRelative(-3.66f)
                curveToRelative(-0.48f, 0.0f, -0.89f, -0.34f, -0.98f, -0.8f)
                lineToRelative(-1.44f, -7.22f)
                close()
                moveTo(20.0f, 21.99f)
                lineTo(12.0f, 21.99f)
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
        return _burgerFries!!
    }

private var _burgerFries: ImageVector? = null
