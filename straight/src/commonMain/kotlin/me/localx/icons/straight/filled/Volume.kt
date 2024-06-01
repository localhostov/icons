package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 5.9994f)
                    curveTo(1.4696f, 5.9994f, 0.9609f, 6.2101f, 0.5858f, 6.5852f)
                    curveTo(0.2107f, 6.9603f, 0.0f, 7.469f, 0.0f, 7.9994f)
                    lineTo(0.0f, 15.9994f)
                    curveTo(0.0f, 16.5299f, 0.2107f, 17.0386f, 0.5858f, 17.4136f)
                    curveTo(0.9609f, 17.7887f, 1.4696f, 17.9994f, 2.0f, 17.9994f)
                    horizontalLineTo(4.8f)
                    lineTo(12.0f, 23.9764f)
                    verticalLineTo(0.0164f)
                    lineTo(4.8f, 5.9994f)
                    horizontalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9997f, 11.9994f)
                    curveTo(19.9981f, 10.6738f, 19.4708f, 9.403f, 18.5335f, 8.4656f)
                    curveTo(17.5961f, 7.5283f, 16.3253f, 7.001f, 14.9997f, 6.9994f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(8.9994f)
                    horizontalLineTo(14.9997f)
                    curveTo(15.7953f, 8.9994f, 16.5584f, 9.3155f, 17.121f, 9.8781f)
                    curveTo(17.6836f, 10.4407f, 17.9997f, 11.2037f, 17.9997f, 11.9994f)
                    curveTo(17.9997f, 12.795f, 17.6836f, 13.5581f, 17.121f, 14.1207f)
                    curveTo(16.5584f, 14.6833f, 15.7953f, 14.9994f, 14.9997f, 14.9994f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(16.9994f)
                    horizontalLineTo(14.9997f)
                    curveTo(16.3253f, 16.9978f, 17.5961f, 16.4705f, 18.5335f, 15.5332f)
                    curveTo(19.4708f, 14.5958f, 19.9981f, 13.325f, 19.9997f, 11.9994f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9997f, 3.0f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(14.9997f)
                    curveTo(16.8562f, 5.0f, 18.6367f, 5.7375f, 19.9494f, 7.0503f)
                    curveTo(21.2622f, 8.363f, 21.9997f, 10.1435f, 21.9997f, 12.0f)
                    curveTo(21.9997f, 13.8565f, 21.2622f, 15.637f, 19.9494f, 16.9497f)
                    curveTo(18.6367f, 18.2625f, 16.8562f, 19.0f, 14.9997f, 19.0f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(14.9997f)
                    curveTo(17.3866f, 21.0f, 19.6758f, 20.0518f, 21.3636f, 18.364f)
                    curveTo(23.0515f, 16.6761f, 23.9997f, 14.3869f, 23.9997f, 12.0f)
                    curveTo(23.9997f, 9.6131f, 23.0515f, 7.3239f, 21.3636f, 5.636f)
                    curveTo(19.6758f, 3.9482f, 17.3866f, 3.0f, 14.9997f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
