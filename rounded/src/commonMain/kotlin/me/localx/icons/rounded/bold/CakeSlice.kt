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

public val Icons.Bold.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) {
            return _cakeSlice!!
        }
        _cakeSlice = Builder(name = "CakeSlice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.331f, 7.215f)
                curveToRelative(-1.229f, -1.655f, -3.28f, -4.066f, -6.075f, -6.156f)
                curveToRelative(-1.826f, -1.365f, -4.352f, -1.415f, -6.285f, -0.126f)
                curveToRelative(-0.035f, 0.023f, -7.36f, 5.858f, -7.36f, 5.858f)
                curveToRelative(-1.635f, 1.221f, -2.611f, 3.168f, -2.611f, 5.208f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.223f)
                curveToRelative(0.0f, -1.84f, -0.577f, -3.59f, -1.669f, -5.062f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 16.0f)
                close()
                moveTo(4.443f, 9.167f)
                lineToRelative(7.239f, -5.768f)
                curveToRelative(0.872f, -0.555f, 1.98f, -0.531f, 2.778f, 0.064f)
                curveToRelative(2.504f, 1.872f, 4.353f, 4.046f, 5.461f, 5.54f)
                curveToRelative(0.447f, 0.603f, 0.761f, 1.279f, 0.93f, 1.997f)
                lineTo(3.148f, 11.0f)
                curveToRelative(0.216f, -0.715f, 0.663f, -1.361f, 1.295f, -1.833f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(17.899f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.45f, 2.0f)
                close()
            }
        }
        .build()
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
