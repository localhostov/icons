package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TruckSide: ImageVector
    get() {
        if (_truckSide != null) {
            return _truckSide!!
        }
        _truckSide = Builder(name = "TruckSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 17.9994f)
                    horizontalLineTo(4.0f)
                    curveTo(2.9391f, 17.9994f, 1.9217f, 17.5779f, 1.1716f, 16.8278f)
                    curveTo(0.4214f, 16.0776f, 0.0f, 15.0602f, 0.0f, 13.9994f)
                    verticalLineTo(5.9994f)
                    curveTo(0.0f, 4.6733f, 0.5268f, 3.4015f, 1.4645f, 2.4638f)
                    curveTo(2.4021f, 1.5261f, 3.6739f, 0.9994f, 5.0f, 0.9994f)
                    horizontalLineTo(10.0f)
                    curveTo(10.6566f, 0.9994f, 11.3068f, 1.1287f, 11.9134f, 1.38f)
                    curveTo(12.52f, 1.6312f, 13.0712f, 1.9995f, 13.5355f, 2.4638f)
                    curveTo(13.9998f, 2.9281f, 14.3681f, 3.4793f, 14.6194f, 4.0859f)
                    curveTo(14.8707f, 4.6926f, 15.0f, 5.3428f, 15.0f, 5.9994f)
                    verticalLineTo(17.9994f)
                    close()
                    moveTo(24.0f, 10.9994f)
                    verticalLineTo(9.9994f)
                    curveTo(24.0f, 9.3427f, 23.8707f, 8.6926f, 23.6194f, 8.0859f)
                    curveTo(23.3681f, 7.4793f, 22.9998f, 6.9281f, 22.5355f, 6.4638f)
                    curveTo(22.0712f, 5.9995f, 21.52f, 5.6312f, 20.9134f, 5.38f)
                    curveTo(20.3068f, 5.1287f, 19.6566f, 4.9994f, 19.0f, 4.9994f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(10.9994f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(17.0f, 12.9994f)
                    verticalLineTo(17.9994f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 17.9994f, 22.0783f, 17.5779f, 22.8284f, 16.8278f)
                    curveTo(23.5786f, 16.0776f, 24.0f, 15.0602f, 24.0f, 13.9994f)
                    verticalLineTo(12.9994f)
                    horizontalLineTo(17.0f)
                    close()
                    moveTo(4.058f, 19.9994f)
                    curveTo(4.0214f, 20.1636f, 4.0019f, 20.3311f, 4.0f, 20.4994f)
                    curveTo(4.0f, 21.1624f, 4.2634f, 21.7983f, 4.7322f, 22.2671f)
                    curveTo(5.2011f, 22.736f, 5.837f, 22.9994f, 6.5f, 22.9994f)
                    curveTo(7.163f, 22.9994f, 7.7989f, 22.736f, 8.2678f, 22.2671f)
                    curveTo(8.7366f, 21.7983f, 9.0f, 21.1624f, 9.0f, 20.4994f)
                    curveTo(8.9981f, 20.3311f, 8.9786f, 20.1636f, 8.942f, 19.9994f)
                    horizontalLineTo(4.058f)
                    close()
                    moveTo(15.058f, 19.9994f)
                    curveTo(15.0214f, 20.1636f, 15.0019f, 20.3311f, 15.0f, 20.4994f)
                    curveTo(15.0f, 21.1624f, 15.2634f, 21.7983f, 15.7322f, 22.2671f)
                    curveTo(16.2011f, 22.736f, 16.837f, 22.9994f, 17.5f, 22.9994f)
                    curveTo(18.163f, 22.9994f, 18.7989f, 22.736f, 19.2678f, 22.2671f)
                    curveTo(19.7366f, 21.7983f, 20.0f, 21.1624f, 20.0f, 20.4994f)
                    curveTo(19.9981f, 20.3311f, 19.9786f, 20.1636f, 19.942f, 19.9994f)
                    horizontalLineTo(15.058f)
                    close()
                }
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
