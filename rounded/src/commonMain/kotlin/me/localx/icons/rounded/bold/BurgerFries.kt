package me.localx.icons.rounded.bold

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
                moveTo(18.5f, 10.0f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(1.49f, -3.97f)
                curveToRelative(0.29f, -0.78f, -0.1f, -1.64f, -0.88f, -1.93f)
                curveToRelative(-0.78f, -0.29f, -1.64f, 0.1f, -1.93f, 0.88f)
                lineToRelative(-1.89f, 5.03f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(0.88f, -8.34f)
                curveToRelative(0.09f, -0.82f, -0.51f, -1.56f, -1.33f, -1.65f)
                curveToRelative(-0.82f, -0.07f, -1.56f, 0.51f, -1.65f, 1.33f)
                lineToRelative(-0.87f, 8.27f)
                lineTo(7.49f, 1.29f)
                curveTo(7.37f, 0.47f, 6.61f, -0.1f, 5.79f, 0.01f)
                curveToRelative(-0.82f, 0.11f, -1.39f, 0.87f, -1.28f, 1.69f)
                lineToRelative(1.15f, 8.29f)
                horizontalLineToRelative(-0.82f)
                lineToRelative(-1.94f, -5.04f)
                curveToRelative(-0.3f, -0.77f, -1.17f, -1.16f, -1.94f, -0.86f)
                curveTo(0.19f, 4.4f, -0.2f, 5.27f, 0.1f, 6.04f)
                lineToRelative(1.7f, 4.4f)
                curveToRelative(-0.37f, 0.21f, -0.7f, 0.48f, -0.98f, 0.82f)
                curveToRelative(-0.67f, 0.8f, -0.94f, 1.84f, -0.76f, 2.87f)
                lineToRelative(0.97f, 5.36f)
                curveToRelative(0.48f, 2.62f, 2.75f, 4.52f, 5.41f, 4.52f)
                horizontalLineToRelative(12.06f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20.95f, 15.0f)
                lineTo(12.05f, 15.0f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2.0f, 2.45f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.21f, 0.0f, 2.22f, 0.86f, 2.45f, 2.0f)
                close()
                moveTo(3.98f, 18.95f)
                lineToRelative(-0.97f, -5.36f)
                curveToRelative(-0.04f, -0.2f, 0.05f, -0.34f, 0.11f, -0.41f)
                curveToRelative(0.06f, -0.07f, 0.18f, -0.18f, 0.38f, -0.18f)
                horizontalLineToRelative(6.1f)
                curveToRelative(-0.38f, 0.75f, -0.6f, 1.6f, -0.6f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.9f, 0.22f, 1.75f, 0.6f, 2.5f)
                horizontalLineToRelative(-3.16f)
                curveToRelative(-1.21f, 0.0f, -2.24f, -0.86f, -2.46f, -2.05f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.6f)
                lineToRelative(2.66f, 1.78f)
                curveToRelative(0.22f, 0.15f, 0.48f, 0.22f, 0.74f, 0.22f)
                reflectiveCurveToRelative(0.52f, -0.07f, 0.74f, -0.22f)
                lineToRelative(2.66f, -1.78f)
                horizontalLineToRelative(0.6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _burgerFries!!
    }

private var _burgerFries: ImageVector? = null
