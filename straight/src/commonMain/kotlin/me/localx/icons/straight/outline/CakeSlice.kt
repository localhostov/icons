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

public val Icons.Outline.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) {
            return _cakeSlice!!
        }
        _cakeSlice = Builder(name = "CakeSlice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.291f, 9.289f)
                curveToRelative(-1.002f, -1.844f, -3.268f, -5.374f, -7.174f, -8.292f)
                curveToRelative(-0.89f, -0.664f, -1.968f, -0.991f, -3.081f, -0.996f)
                curveToRelative(-1.013f, 0.012f, -1.997f, 0.316f, -2.844f, 0.881f)
                lineTo(0.0f, 11.602f)
                verticalLineToRelative(12.398f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.881f)
                curveToRelative(0.0f, -0.999f, -0.245f, -1.978f, -0.709f, -2.831f)
                close()
                moveTo(11.389f, 2.488f)
                curveToRelative(0.504f, -0.313f, 1.08f, -0.481f, 1.67f, -0.488f)
                curveToRelative(0.669f, -0.016f, 1.326f, 0.199f, 1.86f, 0.598f)
                curveToRelative(3.601f, 2.691f, 5.689f, 5.945f, 6.614f, 7.646f)
                curveToRelative(0.287f, 0.527f, 0.441f, 1.132f, 0.459f, 1.756f)
                lineTo(2.378f, 12.0f)
                lineTo(11.389f, 2.488f)
                close()
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 22.0f)
                close()
            }
        }
        .build()
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
