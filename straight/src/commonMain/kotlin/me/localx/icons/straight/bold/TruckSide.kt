package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.TruckSide: ImageVector
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
                    moveTo(18.5f, 4.9994f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(4.4994f)
                    curveTo(17.0f, 3.5711f, 16.6313f, 2.6809f, 15.9749f, 2.0245f)
                    curveTo(15.3185f, 1.3681f, 14.4283f, 0.9994f, 13.5f, 0.9994f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 0.9994f, 1.6815f, 1.3681f, 1.0251f, 2.0245f)
                    curveTo(0.3687f, 2.6809f, 0.0f, 3.5711f, 0.0f, 4.4994f)
                    lineTo(0.0f, 19.9994f)
                    horizontalLineTo(3.058f)
                    curveTo(3.0214f, 20.1636f, 3.0019f, 20.3311f, 3.0f, 20.4994f)
                    curveTo(3.0f, 21.1624f, 3.2634f, 21.7983f, 3.7322f, 22.2671f)
                    curveTo(4.2011f, 22.736f, 4.837f, 22.9994f, 5.5f, 22.9994f)
                    curveTo(6.163f, 22.9994f, 6.7989f, 22.736f, 7.2678f, 22.2671f)
                    curveTo(7.7366f, 21.7983f, 8.0f, 21.1624f, 8.0f, 20.4994f)
                    curveTo(7.9981f, 20.3311f, 7.9786f, 20.1636f, 7.942f, 19.9994f)
                    horizontalLineTo(16.058f)
                    curveTo(16.0214f, 20.1636f, 16.0019f, 20.3311f, 16.0f, 20.4994f)
                    curveTo(16.0f, 21.1624f, 16.2634f, 21.7983f, 16.7322f, 22.2671f)
                    curveTo(17.2011f, 22.736f, 17.837f, 22.9994f, 18.5f, 22.9994f)
                    curveTo(19.163f, 22.9994f, 19.7989f, 22.736f, 20.2678f, 22.2671f)
                    curveTo(20.7366f, 21.7983f, 21.0f, 21.1624f, 21.0f, 20.4994f)
                    curveTo(20.9981f, 20.3311f, 20.9786f, 20.1636f, 20.942f, 19.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(10.4994f)
                    curveTo(23.9981f, 9.0412f, 23.4181f, 7.6434f, 22.387f, 6.6123f)
                    curveTo(21.356f, 5.5813f, 19.9581f, 5.0012f, 18.5f, 4.9994f)
                    close()
                    moveTo(14.0f, 16.9994f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(4.4994f)
                    curveTo(3.0f, 4.3667f, 3.0527f, 4.2396f, 3.1465f, 4.1458f)
                    curveTo(3.2402f, 4.052f, 3.3674f, 3.9994f, 3.5f, 3.9994f)
                    horizontalLineTo(13.5f)
                    curveTo(13.6326f, 3.9994f, 13.7598f, 4.052f, 13.8536f, 4.1458f)
                    curveTo(13.9473f, 4.2396f, 14.0f, 4.3667f, 14.0f, 4.4994f)
                    verticalLineTo(16.9994f)
                    close()
                    moveTo(18.5f, 7.9994f)
                    curveTo(19.163f, 7.9994f, 19.7989f, 8.2627f, 20.2678f, 8.7316f)
                    curveTo(20.7366f, 9.2004f, 21.0f, 9.8363f, 21.0f, 10.4994f)
                    verticalLineTo(12.9994f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(7.9994f)
                    horizontalLineTo(18.5f)
                    close()
                }
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
