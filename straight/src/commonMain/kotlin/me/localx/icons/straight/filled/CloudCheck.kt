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

public val Icons.Filled.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.791f, 7.209f)
                curveTo(17.3457f, 5.299f, 16.2143f, 3.6192f, 14.6117f, 2.4886f)
                curveTo(13.0092f, 1.358f, 11.0471f, 0.8555f, 9.0984f, 1.0765f)
                curveTo(7.1497f, 1.2975f, 5.35f, 2.2267f, 4.0414f, 3.6874f)
                curveTo(2.7327f, 5.1482f, 2.0063f, 7.0388f, 2.0f, 9.0f)
                curveTo(1.999f, 10.2784f, 2.3078f, 11.538f, 2.9f, 12.671f)
                curveTo(1.8211f, 13.2492f, 0.9664f, 14.1713f, 0.4716f, 15.2908f)
                curveTo(-0.0231f, 16.4104f, -0.1296f, 17.6632f, 0.1692f, 18.8502f)
                curveTo(0.468f, 20.0372f, 1.1549f, 21.0902f, 2.1207f, 21.8421f)
                curveTo(3.0866f, 22.594f, 4.276f, 23.0016f, 5.5f, 23.0f)
                horizontalLineTo(16.0f)
                curveTo(17.9612f, 22.9938f, 19.8518f, 22.2673f, 21.3126f, 20.9587f)
                curveTo(22.7734f, 19.65f, 23.7025f, 17.8504f, 23.9236f, 15.9016f)
                curveTo(24.1446f, 13.9529f, 23.6421f, 11.9909f, 22.5115f, 10.3883f)
                curveTo(21.3809f, 8.7858f, 19.701f, 7.6543f, 17.791f, 7.209f)
                close()
                moveTo(13.813f, 19.121f)
                curveTo(13.2504f, 19.6834f, 12.4875f, 19.9994f, 11.692f, 19.9994f)
                curveTo(10.8965f, 19.9994f, 10.1336f, 19.6834f, 9.571f, 19.121f)
                lineTo(6.187f, 15.737f)
                lineTo(7.6f, 14.323f)
                lineTo(10.984f, 17.707f)
                curveTo(11.1744f, 17.8891f, 11.4276f, 17.9907f, 11.691f, 17.9907f)
                curveTo(11.9544f, 17.9907f, 12.2077f, 17.8891f, 12.398f, 17.707f)
                lineTo(18.052f, 12.053f)
                lineTo(19.466f, 13.467f)
                lineTo(13.813f, 19.121f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
