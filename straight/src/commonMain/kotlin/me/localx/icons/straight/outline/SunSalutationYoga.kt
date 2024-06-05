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

public val Icons.Outline.SunSalutationYoga: ImageVector
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
                curveToRelative(-0.618f, -0.58f, -1.424f, -0.899f, -2.27f, -0.899f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.003f)
                curveToRelative(0.0f, 1.305f, 0.725f, 2.478f, 1.892f, 3.061f)
                lineToRelative(1.108f, 0.554f)
                verticalLineToRelative(6.382f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0.347f, -0.963f, 0.577f, -2.126f, 0.728f, -3.342f)
                lineToRelative(-1.804f, -2.233f)
                curveToRelative(-0.093f, 1.582f, -0.273f, 2.937f, -0.532f, 3.993f)
                lineToRelative(-0.606f, -0.303f)
                curveToRelative(-0.485f, -0.242f, -0.786f, -0.73f, -0.786f, -1.272f)
                verticalLineToRelative(-5.003f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.315f, 0.0f, 0.617f, 0.112f, 0.856f, 0.317f)
                lineToRelative(2.974f, 3.683f)
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
