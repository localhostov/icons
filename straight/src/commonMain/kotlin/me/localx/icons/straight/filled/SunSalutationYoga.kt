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

public val Icons.Filled.SunSalutationYoga: ImageVector
    get() {
        if (_sunSalutationYoga != null) {
            return _sunSalutationYoga!!
        }
        _sunSalutationYoga = Builder(name = "SunSalutationYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(17.0f, 7.41f)
                lineToRelative(-1.57f, 2.149f)
                lineToRelative(-2.16f, -2.66f)
                curveToRelative(-0.592f, -0.555f, -1.356f, -0.872f, -2.163f, -0.897f)
                curveToRelative(-1.707f, -0.054f, -3.106f, 1.441f, -3.106f, 3.15f)
                verticalLineToRelative(5.031f)
                curveToRelative(0.0f, 1.205f, 0.62f, 2.325f, 1.64f, 2.965f)
                lineToRelative(1.36f, 0.853f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.098f)
                lineToRelative(-1.0f, -1.258f)
                verticalLineToRelative(-3.149f)
                lineToRelative(2.83f, 3.505f)
                horizontalLineToRelative(1.293f)
                lineToRelative(2.492f, -3.41f)
                lineToRelative(-1.615f, -1.18f)
                close()
            }
        }
        .build()
        return _sunSalutationYoga!!
    }

private var _sunSalutationYoga: ImageVector? = null
