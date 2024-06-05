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

public val Icons.Bold.MouseField: ImageVector
    get() {
        if (_mouseField != null) {
            return _mouseField!!
        }
        _mouseField = Builder(name = "MouseField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(-0.013f)
                curveTo(16.818f, 0.437f, 14.829f, -0.319f, 12.85f, 0.13f)
                curveToRelative(-1.864f, 0.423f, -3.37f, 1.97f, -3.747f, 3.849f)
                curveToRelative(-0.282f, 1.404f, 0.021f, 2.799f, 0.846f, 3.936f)
                curveToRelative(-4.072f, 1.673f, -5.58f, 5.32f, -5.889f, 8.085f)
                horizontalLineToRelative(-0.059f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                lineTo(12.5f, 24.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -3.441f, -2.244f, -7.0f, -6.0f, -7.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(7.094f, 16.0f)
                curveToRelative(0.289f, -1.873f, 1.429f, -5.005f, 5.708f, -5.799f)
                curveToRelative(0.711f, 1.155f, 1.847f, 2.029f, 3.198f, 2.47f)
                verticalLineToRelative(3.329f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.465f, 0.0f, -2.712f, -0.883f, -2.952f, -2.12f)
                curveToRelative(-0.098f, -0.508f, -0.531f, -0.88f, -1.048f, -0.88f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.694f, 0.0f, 1.38f, -0.724f, 1.74f, -1.5f)
                horizontalLineToRelative(0.26f)
                curveToRelative(2.069f, 0.0f, 3.0f, 2.339f, 3.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _mouseField!!
    }

private var _mouseField: ImageVector? = null
