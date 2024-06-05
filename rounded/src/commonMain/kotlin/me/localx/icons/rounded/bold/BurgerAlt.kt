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

public val Icons.Bold.BurgerAlt: ImageVector
    get() {
        if (_burgerAlt != null) {
            return _burgerAlt!!
        }
        _burgerAlt = Builder(name = "BurgerAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 17.0f)
                lineTo(2.5f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 14.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.0f, 21.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(20.0f, 24.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(22.42f, 11.1f)
                curveToRelative(0.48f, -0.57f, 0.67f, -1.31f, 0.54f, -2.04f)
                curveTo(22.03f, 3.81f, 17.42f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.99f, 3.81f, 1.03f, 9.06f)
                curveToRelative(-0.13f, 0.73f, 0.06f, 1.47f, 0.54f, 2.04f)
                curveToRelative(0.48f, 0.57f, 1.18f, 0.9f, 1.93f, 0.9f)
                lineTo(20.5f, 12.0f)
                curveToRelative(0.74f, 0.0f, 1.44f, -0.33f, 1.92f, -0.9f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.76f, 0.0f, 6.98f, 2.49f, 7.89f, 6.0f)
                lineTo(4.12f, 9.0f)
                curveToRelative(0.92f, -3.46f, 4.21f, -6.0f, 7.88f, -6.0f)
                close()
            }
        }
        .build()
        return _burgerAlt!!
    }

private var _burgerAlt: ImageVector? = null
