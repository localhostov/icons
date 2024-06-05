package me.localx.icons.rounded.outline

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
                moveTo(19.17f, 12.0f)
                horizontalLineToRelative(-2.23f)
                lineToRelative(0.87f, -8.66f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                curveToRelative(-0.57f, -0.64f, -1.38f, -1.0f, -2.24f, -1.0f)
                lineTo(2.83f, 0.0f)
                curveTo(1.97f, 0.01f, 1.16f, 0.38f, 0.59f, 1.01f)
                curveTo(0.02f, 1.65f, -0.25f, 2.5f, -0.15f, 3.34f)
                lineTo(1.47f, 19.5f)
                curveToRelative(0.26f, 2.56f, 2.4f, 4.5f, 4.98f, 4.5f)
                horizontalLineToRelative(12.73f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.17f, 17.0f)
                lineTo(10.17f, 17.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(2.08f, 2.35f)
                curveToRelative(0.19f, -0.22f, 0.46f, -0.33f, 0.75f, -0.33f)
                lineTo(14.83f, 2.02f)
                curveToRelative(0.29f, -0.01f, 0.55f, 0.11f, 0.75f, 0.32f)
                curveToRelative(0.19f, 0.22f, 0.28f, 0.49f, 0.25f, 0.79f)
                lineToRelative(-0.29f, 2.87f)
                lineTo(2.12f, 6.0f)
                lineToRelative(-0.29f, -2.88f)
                curveToRelative(-0.03f, -0.29f, 0.06f, -0.56f, 0.25f, -0.78f)
                close()
                moveTo(3.46f, 19.3f)
                lineToRelative(-1.14f, -11.3f)
                lineTo(15.33f, 8.0f)
                lineToRelative(-0.4f, 4.0f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.13f, 0.39f, 2.16f, 1.03f, 3.0f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-1.55f, 0.0f, -2.83f, -1.16f, -2.99f, -2.7f)
                close()
                moveTo(19.17f, 22.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                horizontalLineToRelative(3.7f)
                lineToRelative(2.75f, 1.83f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.17f, 0.55f, 0.17f)
                reflectiveCurveToRelative(0.39f, -0.06f, 0.55f, -0.17f)
                lineToRelative(2.75f, -1.83f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _burgerGlass!!
    }

private var _burgerGlass: ImageVector? = null
