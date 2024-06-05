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
                moveTo(24.0f, 16.5f)
                verticalLineToRelative(0.5f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.49f, 2.01f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.49f, 0.0f, 4.5f, 2.01f, 4.5f, 4.5f)
                close()
                moveTo(18.2f, 20.83f)
                curveToRelative(-0.17f, 0.11f, -0.36f, 0.17f, -0.55f, 0.17f)
                reflectiveCurveToRelative(-0.39f, -0.06f, -0.55f, -0.17f)
                lineToRelative(-2.75f, -1.83f)
                horizontalLineToRelative(-5.34f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.49f, 0.0f, 4.5f, -2.01f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.05f)
                lineToRelative(-2.75f, 1.83f)
                close()
                moveTo(7.0f, 19.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.02f, 0.93f, -3.83f, 2.39f, -5.03f)
                lineToRelative(1.6f, -8.65f)
                curveToRelative(0.1f, -0.54f, 0.62f, -0.89f, 1.18f, -0.8f)
                curveToRelative(0.26f, 0.04f, 0.49f, 0.19f, 0.65f, 0.41f)
                curveToRelative(0.15f, 0.22f, 0.21f, 0.48f, 0.17f, 0.74f)
                lineToRelative(-1.29f, 7.1f)
                curveToRelative(0.57f, -0.17f, 1.18f, -0.26f, 1.8f, -0.26f)
                horizontalLineToRelative(3.84f)
                lineToRelative(0.54f, -1.93f)
                curveToRelative(0.46f, -1.7f, -0.54f, -3.48f, -2.24f, -3.95f)
                curveToRelative(-0.25f, -0.07f, -0.52f, -0.1f, -0.78f, -0.1f)
                lineToRelative(0.09f, -0.5f)
                curveToRelative(0.13f, -0.79f, -0.05f, -1.59f, -0.51f, -2.24f)
                reflectiveCurveTo(13.29f, 0.18f, 12.48f, 0.04f)
                curveToRelative(-1.19f, -0.21f, -2.35f, 0.34f, -2.99f, 1.29f)
                curveTo(8.85f, 0.38f, 7.7f, -0.16f, 6.5f, 0.04f)
                curveToRelative(-0.79f, 0.13f, -1.48f, 0.57f, -1.94f, 1.22f)
                reflectiveCurveToRelative(-0.64f, 1.45f, -0.5f, 2.29f)
                lineToRelative(0.1f, 0.46f)
                curveToRelative(-0.27f, 0.0f, -0.53f, 0.04f, -0.8f, 0.11f)
                curveToRelative(-1.7f, 0.48f, -2.71f, 2.25f, -2.24f, 3.96f)
                lineToRelative(1.14f, 4.02f)
                curveToRelative(-0.61f, 0.16f, -1.16f, 0.5f, -1.57f, 0.99f)
                curveTo(0.11f, 13.79f, -0.12f, 14.7f, 0.06f, 15.59f)
                lineToRelative(0.88f, 4.41f)
                curveToRelative(0.46f, 2.33f, 2.53f, 4.02f, 4.9f, 4.02f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-1.14f, -1.17f, -1.84f, -2.77f, -1.84f, -4.52f)
                close()
                moveTo(4.3f, 12.0f)
                lineToRelative(-1.26f, -4.46f)
                curveToRelative(-0.18f, -0.65f, 0.21f, -1.32f, 0.85f, -1.5f)
                curveToRelative(0.24f, -0.07f, 0.48f, -0.05f, 0.71f, 0.02f)
                lineToRelative(1.3f, 5.93f)
                horizontalLineToRelative(-1.61f)
                close()
            }
        }
        .build()
        return _burgerFries!!
    }

private var _burgerFries: ImageVector? = null
