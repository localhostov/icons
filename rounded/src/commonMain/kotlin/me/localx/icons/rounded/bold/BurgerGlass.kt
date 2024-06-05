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
                moveTo(18.5f, 10.0f)
                horizontalLineToRelative(-1.15f)
                lineToRelative(0.62f, -6.21f)
                curveToRelative(0.11f, -0.96f, -0.2f, -1.93f, -0.84f, -2.66f)
                curveToRelative(-0.65f, -0.72f, -1.57f, -1.14f, -2.54f, -1.14f)
                lineTo(3.41f, -0.01f)
                curveTo(2.44f, 0.01f, 1.51f, 0.43f, 0.87f, 1.15f)
                curveTo(0.22f, 1.88f, -0.09f, 2.84f, 0.02f, 3.79f)
                lineToRelative(1.55f, 15.43f)
                curveToRelative(0.27f, 2.73f, 2.55f, 4.79f, 5.29f, 4.79f)
                horizontalLineToRelative(11.64f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20.95f, 15.0f)
                lineTo(11.55f, 15.0f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2.0f, 2.45f, -2.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.21f, 0.0f, 2.22f, 0.86f, 2.45f, 2.0f)
                close()
                moveTo(3.1f, 3.15f)
                curveToRelative(0.06f, -0.06f, 0.15f, -0.14f, 0.31f, -0.14f)
                lineTo(14.59f, 3.01f)
                curveToRelative(0.15f, -0.01f, 0.25f, 0.06f, 0.3f, 0.12f)
                reflectiveCurveToRelative(0.12f, 0.17f, 0.1f, 0.34f)
                lineToRelative(-0.15f, 1.53f)
                lineTo(3.16f, 5.0f)
                lineToRelative(-0.15f, -1.53f)
                curveToRelative(-0.02f, -0.15f, 0.05f, -0.25f, 0.1f, -0.32f)
                close()
                moveTo(4.55f, 18.91f)
                lineToRelative(-1.1f, -10.91f)
                lineTo(14.54f, 8.0f)
                lineToRelative(-0.2f, 2.0f)
                horizontalLineToRelative(-0.34f)
                curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.9f, 0.22f, 1.75f, 0.61f, 2.5f)
                horizontalLineToRelative(-2.24f)
                curveToRelative(-1.2f, 0.0f, -2.19f, -0.9f, -2.31f, -2.09f)
                close()
                moveTo(18.49f, 21.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.05f)
                lineToRelative(2.62f, 1.75f)
                curveToRelative(0.25f, 0.17f, 0.54f, 0.25f, 0.83f, 0.25f)
                reflectiveCurveToRelative(0.58f, -0.08f, 0.83f, -0.25f)
                lineToRelative(2.62f, -1.75f)
                horizontalLineToRelative(0.55f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _burgerGlass!!
    }

private var _burgerGlass: ImageVector? = null
