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

public val Icons.Filled.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = Builder(name = "Candy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.0f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.919f)
                curveToRelative(-3.343f, -1.77f, -7.833f, -0.911f, -10.911f, 2.168f)
                reflectiveCurveTo(2.151f, 13.654f, 3.92f, 17.0f)
                horizontalLineTo(0.042f)
                lineTo(0.0f, 17.959f)
                arcToRelative(5.652f, 5.652f, 0.0f, false, false, 1.686f, 4.055f)
                arcTo(6.185f, 6.185f, 0.0f, false, false, 6.0f, 24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.062f)
                arcTo(8.013f, 8.013f, 0.0f, false, false, 10.772f, 21.0f)
                arcToRelative(10.227f, 10.227f, 0.0f, false, false, 7.14f, -3.082f)
                curveTo(20.992f, 14.834f, 21.849f, 10.346f, 20.08f, 7.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(11.542f, 16.943f)
                arcToRelative(5.017f, 5.017f, 0.0f, false, true, -0.765f, 0.06f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.729f, -1.05f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, 1.775f, 0.428f)
                arcToRelative(4.546f, 4.546f, 0.0f, false, false, 2.434f, -1.3f)
                lineToRelative(1.413f, 1.414f)
                arcTo(6.477f, 6.477f, 0.0f, false, true, 11.542f, 16.943f)
                close()
            }
        }
        .build()
        return _candy!!
    }

private var _candy: ImageVector? = null
