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

public val Icons.Outline.CandySweet: ImageVector
    get() {
        if (_candySweet != null) {
            return _candySweet!!
        }
        _candySweet = Builder(name = "CandySweet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.996f)
                curveToRelative(0.0f, -2.5f, -0.5f, -4.0f, -0.5f, -4.0f)
                lineToRelative(-2.657f, 2.362f)
                curveToRelative(-0.773f, -4.183f, -4.44f, -7.363f, -8.844f, -7.363f)
                reflectiveCurveTo(3.929f, 6.174f, 3.156f, 10.357f)
                lineTo(0.499f, 7.996f)
                reflectiveCurveToRelative(-0.499f, 1.5f, -0.499f, 4.0f)
                reflectiveCurveToRelative(0.499f, 4.0f, 0.499f, 4.0f)
                lineToRelative(2.657f, -2.361f)
                curveToRelative(0.774f, 4.182f, 4.441f, 7.361f, 8.843f, 7.361f)
                reflectiveCurveToRelative(8.07f, -3.18f, 8.843f, -7.362f)
                lineToRelative(2.658f, 2.362f)
                reflectiveCurveToRelative(0.5f, -1.5f, 0.5f, -4.0f)
                close()
                moveTo(4.999f, 11.996f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.776f, 0.0f, 1.521f, 0.132f, 2.22f, 0.367f)
                lineTo(5.366f, 14.215f)
                curveToRelative(-0.234f, -0.698f, -0.367f, -1.443f, -0.367f, -2.219f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, -0.002f, 0.0f, -0.002f)
                close()
                moveTo(6.328f, 16.083f)
                lineToRelative(9.758f, -9.758f)
                curveToRelative(0.61f, 0.441f, 1.145f, 0.976f, 1.586f, 1.586f)
                lineToRelative(-9.758f, 9.758f)
                curveToRelative(-0.61f, -0.441f, -1.145f, -0.976f, -1.586f, -1.586f)
                close()
                moveTo(11.999f, 18.997f)
                curveToRelative(-0.776f, 0.0f, -1.52f, -0.132f, -2.219f, -0.366f)
                lineToRelative(8.852f, -8.852f)
                curveToRelative(0.234f, 0.698f, 0.366f, 1.443f, 0.366f, 2.219f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _candySweet!!
    }

private var _candySweet: ImageVector? = null
