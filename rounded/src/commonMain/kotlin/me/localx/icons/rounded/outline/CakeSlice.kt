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
                moveToRelative(22.896f, 8.593f)
                curveToRelative(-1.215f, -2.062f, -3.378f, -5.055f, -6.78f, -7.597f)
                curveToRelative(-0.89f, -0.664f, -1.968f, -0.991f, -3.081f, -0.996f)
                curveToRelative(-1.013f, 0.012f, -1.997f, 0.316f, -2.844f, 0.881f)
                curveToRelative(-0.062f, 0.042f, -8.547f, 8.984f, -8.547f, 8.984f)
                curveToRelative(-1.061f, 1.119f, -1.645f, 2.584f, -1.645f, 4.127f)
                verticalLineToRelative(5.007f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.35f)
                curveToRelative(0.0f, -1.43f, -0.381f, -2.833f, -1.104f, -4.057f)
                close()
                moveTo(2.0f, 14.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.389f, 2.488f)
                curveToRelative(0.504f, -0.313f, 1.08f, -0.481f, 1.67f, -0.488f)
                curveToRelative(0.669f, -0.016f, 1.326f, 0.199f, 1.86f, 0.598f)
                curveToRelative(3.135f, 2.344f, 5.132f, 5.106f, 6.254f, 7.011f)
                curveToRelative(0.431f, 0.731f, 0.699f, 1.547f, 0.79f, 2.391f)
                lineTo(2.531f, 12.0f)
                curveToRelative(0.156f, -0.272f, 0.346f, -0.526f, 0.566f, -0.758f)
                lineTo(11.389f, 2.488f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
