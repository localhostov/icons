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

public val Icons.Filled.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.062f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveTo(2.554f, 3.054f, 5.92f, 0.0f, 10.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(4.081f, 0.0f, 7.442f, 3.058f, 7.932f, 7.007f)
                curveToRelative(-2.177f, 0.037f, -3.932f, 1.807f, -3.932f, 3.993f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.188f, -1.758f, -3.966f, -3.938f, -4.0f)
                close()
                moveTo(21.664f, 9.027f)
                curveToRelative(-0.983f, 0.16f, -1.664f, 1.083f, -1.664f, 2.08f)
                verticalLineToRelative(7.893f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.893f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.56f, 0.795f, 2.933f, 2.0f, 3.74f)
                verticalLineToRelative(1.76f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.05f)
                curveToRelative(0.166f, 0.019f, 0.329f, 0.05f, 0.5f, 0.05f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.171f, 0.0f, 0.334f, -0.032f, 0.5f, -0.05f)
                verticalLineToRelative(1.05f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.76f)
                curveToRelative(1.205f, -0.807f, 2.0f, -2.18f, 2.0f, -3.74f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.215f, -1.083f, -2.176f, -2.336f, -1.973f)
                close()
            }
        }
        .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
