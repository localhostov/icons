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

public val Icons.Filled.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9999f, 12.4176f)
                verticalLineTo(10.9996f)
                curveTo(20.9999f, 8.6127f, 20.0517f, 6.3235f, 18.3639f, 4.6357f)
                curveTo(16.676f, 2.9478f, 14.3869f, 1.9996f, 11.9999f, 1.9996f)
                curveTo(9.613f, 1.9996f, 7.3238f, 2.9478f, 5.636f, 4.6357f)
                curveTo(3.9481f, 6.3235f, 2.9999f, 8.6127f, 2.9999f, 10.9996f)
                verticalLineTo(12.4176f)
                curveTo(1.9475f, 12.8773f, 1.0853f, 13.6853f, 0.5585f, 14.7058f)
                curveTo(0.0316f, 15.7263f, -0.1279f, 16.897f, 0.1067f, 18.0212f)
                curveTo(0.3414f, 19.1455f, 0.9559f, 20.1547f, 1.847f, 20.8792f)
                curveTo(2.7381f, 21.6037f, 3.8514f, 21.9993f, 4.9999f, 21.9996f)
                horizontalLineTo(6.9999f)
                verticalLineTo(11.9996f)
                horizontalLineTo(4.9999f)
                verticalLineTo(10.9996f)
                curveTo(4.9999f, 9.1431f, 5.7374f, 7.3626f, 7.0502f, 6.0499f)
                curveTo(8.3629f, 4.7371f, 10.1434f, 3.9996f, 11.9999f, 3.9996f)
                curveTo(13.8564f, 3.9996f, 15.6369f, 4.7371f, 16.9497f, 6.0499f)
                curveTo(18.2624f, 7.3626f, 18.9999f, 9.1431f, 18.9999f, 10.9996f)
                verticalLineTo(11.9996f)
                horizontalLineTo(16.9999f)
                verticalLineTo(19.9996f)
                horizontalLineTo(12.9999f)
                verticalLineTo(21.9996f)
                horizontalLineTo(18.9999f)
                curveTo(20.1484f, 21.9993f, 21.2617f, 21.6037f, 22.1528f, 20.8792f)
                curveTo(23.0439f, 20.1547f, 23.6585f, 19.1455f, 23.8931f, 18.0212f)
                curveTo(24.1278f, 16.897f, 23.9682f, 15.7263f, 23.4414f, 14.7058f)
                curveTo(22.9145f, 13.6853f, 22.0524f, 12.8773f, 20.9999f, 12.4176f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
