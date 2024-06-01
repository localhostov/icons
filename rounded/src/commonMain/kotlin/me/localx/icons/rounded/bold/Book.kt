package me.localx.icons.rounded.bold

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

public val Icons.Bold.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.5002f, 0.0f)
                    horizontalLineTo(8.5001f)
                    curveTo(6.7769f, 0.0021f, 5.1248f, 0.6876f, 3.9063f, 1.9061f)
                    curveTo(2.6878f, 3.1247f, 2.0023f, 4.7767f, 2.0001f, 6.5f)
                    verticalLineTo(19.5f)
                    curveTo(2.0015f, 20.6931f, 2.476f, 21.8369f, 3.3196f, 22.6805f)
                    curveTo(4.1633f, 23.5241f, 5.3071f, 23.9987f, 6.5002f, 24.0f)
                    horizontalLineTo(16.5002f)
                    curveTo(17.9583f, 23.9981f, 19.3561f, 23.4181f, 20.3872f, 22.387f)
                    curveTo(21.4182f, 21.356f, 21.9983f, 19.9581f, 22.0002f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(21.9983f, 4.0419f, 21.4182f, 2.644f, 20.3872f, 1.613f)
                    curveTo(19.3561f, 0.5819f, 17.9583f, 0.0019f, 16.5002f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(8.0001f, 3.051f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(6.5002f)
                    curveTo(5.988f, 15.0049f, 5.4805f, 15.0983f, 5.0002f, 15.276f)
                    verticalLineTo(6.5f)
                    curveTo(5.0025f, 5.6606f, 5.307f, 4.8502f, 5.8579f, 4.2168f)
                    curveTo(6.4088f, 3.5835f, 7.1692f, 3.1697f, 8.0001f, 3.051f)
                    close()
                    moveTo(19.0002f, 18.5f)
                    curveTo(19.0002f, 19.163f, 18.7368f, 19.7989f, 18.2679f, 20.2678f)
                    curveTo(17.7991f, 20.7366f, 17.1632f, 21.0f, 16.5002f, 21.0f)
                    horizontalLineTo(6.5002f)
                    curveTo(6.1023f, 21.0f, 5.7208f, 20.842f, 5.4395f, 20.5607f)
                    curveTo(5.1582f, 20.2794f, 5.0002f, 19.8978f, 5.0002f, 19.5f)
                    curveTo(5.0002f, 19.1022f, 5.1582f, 18.7206f, 5.4395f, 18.4393f)
                    curveTo(5.7208f, 18.158f, 6.1023f, 18.0f, 6.5002f, 18.0f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(18.5f)
                    close()
                    moveTo(11.0002f, 15.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.5002f)
                    curveTo(17.1632f, 3.0f, 17.7991f, 3.2634f, 18.2679f, 3.7322f)
                    curveTo(18.7368f, 4.2011f, 19.0002f, 4.837f, 19.0002f, 5.5f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0002f)
                    close()
                }
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
