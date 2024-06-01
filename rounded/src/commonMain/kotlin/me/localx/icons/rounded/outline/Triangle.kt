package me.localx.icons.rounded.outline

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

public val Icons.Outline.Triangle: ImageVector
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
                    moveTo(19.948f, 24.0002f)
                    horizontalLineTo(4.0519f)
                    curveTo(3.3609f, 24.0042f, 2.6804f, 23.8304f, 2.0759f, 23.4956f)
                    curveTo(1.4714f, 23.1608f, 0.9631f, 22.6761f, 0.6f, 22.0882f)
                    curveTo(0.2413f, 21.5143f, 0.0361f, 20.8579f, 0.0043f, 20.182f)
                    curveTo(-0.0276f, 19.506f, 0.1148f, 18.8332f, 0.418f, 18.2282f)
                    lineTo(8.3799f, 4.2122f)
                    curveTo(8.7226f, 3.544f, 9.2435f, 2.9836f, 9.885f, 2.5932f)
                    curveTo(10.5265f, 2.2028f, 11.2635f, 1.9976f, 12.0144f, 2.0003f)
                    curveTo(12.7654f, 2.003f, 13.5009f, 2.2135f, 14.1396f, 2.6084f)
                    curveTo(14.7782f, 3.0034f, 15.2951f, 3.5675f, 15.633f, 4.2382f)
                    lineTo(23.555f, 18.1792f)
                    curveTo(23.869f, 18.7887f, 24.0197f, 19.4692f, 23.9923f, 20.1542f)
                    curveTo(23.965f, 20.8393f, 23.7605f, 21.5056f, 23.399f, 22.0882f)
                    curveTo(23.0359f, 22.676f, 22.5278f, 23.1605f, 21.9234f, 23.4954f)
                    curveTo(21.3191f, 23.8302f, 20.6388f, 24.004f, 19.948f, 24.0002f)
                    close()
                    moveTo(12.0f, 4.0002f)
                    curveTo(11.6174f, 3.9938f, 11.2409f, 4.0967f, 10.9147f, 4.2966f)
                    curveTo(10.5884f, 4.4966f, 10.3259f, 4.7854f, 10.158f, 5.1292f)
                    lineTo(10.132f, 5.1782f)
                    lineTo(2.1839f, 19.1672f)
                    curveTo(2.0424f, 19.4624f, 1.9788f, 19.789f, 1.9991f, 20.1158f)
                    curveTo(2.0194f, 20.4426f, 2.123f, 20.7587f, 2.2999f, 21.0342f)
                    curveTo(2.4847f, 21.3318f, 2.7429f, 21.577f, 3.0497f, 21.7462f)
                    curveTo(3.3565f, 21.9153f, 3.7016f, 22.0028f, 4.0519f, 22.0002f)
                    horizontalLineTo(19.952f)
                    curveTo(20.3023f, 22.0028f, 20.6474f, 21.9153f, 20.9542f, 21.7462f)
                    curveTo(21.261f, 21.577f, 21.5192f, 21.3318f, 21.704f, 21.0342f)
                    curveTo(21.884f, 20.7501f, 21.987f, 20.4241f, 22.0028f, 20.0881f)
                    curveTo(22.0185f, 19.7521f, 21.9466f, 19.4179f, 21.794f, 19.1182f)
                    lineTo(13.868f, 5.1782f)
                    curveTo(13.7026f, 4.8232f, 13.4385f, 4.5233f, 13.1072f, 4.3144f)
                    curveTo(12.776f, 4.1055f, 12.3916f, 3.9964f, 12.0f, 4.0002f)
                    close()
                }
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
