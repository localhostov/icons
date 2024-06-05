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

public val Icons.Filled.BurgerAlt: ImageVector
    get() {
        if (_burgerAlt != null) {
            return _burgerAlt!!
        }
        _burgerAlt = Builder(name = "BurgerAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 12.0f)
                lineTo(3.06f, 12.0f)
                curveToRelative(-0.57f, 0.0f, -1.11f, -0.24f, -1.49f, -0.67f)
                curveToRelative(-0.38f, -0.43f, -0.56f, -1.0f, -0.5f, -1.56f)
                curveTo(1.69f, 4.2f, 6.39f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.32f, 4.2f, 10.93f, 9.77f)
                curveToRelative(0.06f, 0.57f, -0.12f, 1.14f, -0.5f, 1.57f)
                curveToRelative(-0.38f, 0.42f, -0.92f, 0.67f, -1.49f, 0.67f)
                close()
                moveTo(23.0f, 15.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(2.0f, 14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(22.0f, 16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(19.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                lineTo(21.0f, 18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _burgerAlt!!
    }

private var _burgerAlt: ImageVector? = null
