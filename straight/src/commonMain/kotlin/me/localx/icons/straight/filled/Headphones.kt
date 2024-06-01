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

public val Icons.Filled.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9997f, 12.4176f)
                verticalLineTo(10.9996f)
                curveTo(20.9997f, 8.6127f, 20.0515f, 6.3235f, 18.3636f, 4.6357f)
                curveTo(16.6758f, 2.9478f, 14.3866f, 1.9996f, 11.9997f, 1.9996f)
                curveTo(9.6127f, 1.9996f, 7.3235f, 2.9478f, 5.6357f, 4.6357f)
                curveTo(3.9479f, 6.3235f, 2.9997f, 8.6127f, 2.9997f, 10.9996f)
                verticalLineTo(12.4176f)
                curveTo(1.9472f, 12.8773f, 1.0851f, 13.6853f, 0.5582f, 14.7058f)
                curveTo(0.0313f, 15.7263f, -0.1282f, 16.897f, 0.1065f, 18.0212f)
                curveTo(0.3411f, 19.1455f, 0.9556f, 20.1547f, 1.8468f, 20.8792f)
                curveTo(2.7378f, 21.6037f, 3.8512f, 21.9993f, 4.9997f, 21.9996f)
                horizontalLineTo(6.9997f)
                verticalLineTo(11.9996f)
                horizontalLineTo(4.9997f)
                verticalLineTo(10.9996f)
                curveTo(4.9997f, 9.1431f, 5.7372f, 7.3626f, 7.0499f, 6.0499f)
                curveTo(8.3627f, 4.7371f, 10.1432f, 3.9996f, 11.9997f, 3.9996f)
                curveTo(13.8562f, 3.9996f, 15.6367f, 4.7371f, 16.9494f, 6.0499f)
                curveTo(18.2622f, 7.3626f, 18.9997f, 9.1431f, 18.9997f, 10.9996f)
                verticalLineTo(11.9996f)
                horizontalLineTo(16.9997f)
                verticalLineTo(21.9996f)
                horizontalLineTo(18.9997f)
                curveTo(20.1481f, 21.9993f, 21.2615f, 21.6037f, 22.1526f, 20.8792f)
                curveTo(23.0437f, 20.1547f, 23.6582f, 19.1455f, 23.8929f, 18.0212f)
                curveTo(24.1275f, 16.897f, 23.968f, 15.7263f, 23.4411f, 14.7058f)
                curveTo(22.9142f, 13.6853f, 22.0521f, 12.8773f, 20.9997f, 12.4176f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
