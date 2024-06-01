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

public val Icons.Filled.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.948f, 23.0008f)
                    horizontalLineTo(4.0519f)
                    curveTo(3.3609f, 23.0048f, 2.6804f, 22.8311f, 2.0759f, 22.4962f)
                    curveTo(1.4714f, 22.1614f, 0.9631f, 21.6767f, 0.6f, 21.0888f)
                    curveTo(0.2413f, 20.515f, 0.0361f, 19.8586f, 0.0043f, 19.1826f)
                    curveTo(-0.0276f, 18.5067f, 0.1148f, 17.8339f, 0.418f, 17.2288f)
                    lineTo(8.3799f, 3.2128f)
                    curveTo(8.7226f, 2.5446f, 9.2435f, 1.9842f, 9.885f, 1.5938f)
                    curveTo(10.5265f, 1.2034f, 11.2635f, 0.9982f, 12.0144f, 1.0009f)
                    curveTo(12.7654f, 1.0036f, 13.5009f, 1.2141f, 14.1396f, 1.6091f)
                    curveTo(14.7782f, 2.0041f, 15.2951f, 2.5682f, 15.633f, 3.2388f)
                    lineTo(23.555f, 17.1798f)
                    curveTo(23.869f, 17.7893f, 24.0197f, 18.4698f, 23.9923f, 19.1549f)
                    curveTo(23.965f, 19.84f, 23.7605f, 20.5063f, 23.399f, 21.0888f)
                    curveTo(23.0359f, 21.6766f, 22.5278f, 22.1612f, 21.9234f, 22.496f)
                    curveTo(21.3191f, 22.8308f, 20.6388f, 23.0047f, 19.948f, 23.0008f)
                    close()
                }
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
