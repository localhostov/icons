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

public val Icons.Filled.CanFood: ImageVector
    get() {
        if (_canFood != null) {
            return _canFood!!
        }
        _canFood = Builder(name = "CanFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.064f, 5.0f)
                curveToRelative(-3.714f, 0.0f, -10.0f, -0.527f, -10.0f, -2.5f)
                reflectiveCurveTo(8.35f, 0.0f, 12.064f, 0.0f)
                reflectiveCurveToRelative(10.0f, 0.527f, 10.0f, 2.5f)
                reflectiveCurveToRelative(-6.286f, 2.5f, -10.0f, 2.5f)
                close()
                moveTo(12.064f, 10.0f)
                curveToRelative(5.938f, 0.0f, 9.707f, -1.413f, 10.0f, -2.147f)
                verticalLineToRelative(-2.452f)
                curveToRelative(-1.936f, 1.06f, -5.27f, 1.598f, -10.0f, 1.598f)
                reflectiveCurveToRelative(-8.064f, -0.539f, -10.0f, -1.598f)
                verticalLineToRelative(2.543f)
                curveToRelative(0.267f, 0.672f, 4.045f, 2.056f, 10.0f, 2.056f)
                close()
                moveTo(12.064f, 19.0f)
                curveToRelative(5.938f, 0.0f, 9.707f, -1.413f, 10.0f, -2.147f)
                verticalLineToRelative(-6.588f)
                curveToRelative(-2.477f, 1.237f, -6.764f, 1.735f, -10.0f, 1.735f)
                curveToRelative(-2.835f, 0.0f, -7.394f, -0.397f, -10.0f, -1.67f)
                verticalLineToRelative(6.615f)
                curveToRelative(0.267f, 0.672f, 4.045f, 2.056f, 10.0f, 2.056f)
                close()
                moveTo(12.064f, 21.0f)
                curveToRelative(-2.835f, 0.0f, -7.394f, -0.397f, -10.0f, -1.67f)
                verticalLineToRelative(1.17f)
                curveToRelative(0.0f, 2.763f, 6.286f, 3.5f, 10.0f, 3.5f)
                curveToRelative(3.459f, 0.0f, 10.0f, -0.742f, 10.0f, -3.55f)
                verticalLineToRelative(-1.185f)
                curveToRelative(-2.477f, 1.237f, -6.764f, 1.735f, -10.0f, 1.735f)
                close()
            }
        }
        .build()
        return _canFood!!
    }

private var _canFood: ImageVector? = null
