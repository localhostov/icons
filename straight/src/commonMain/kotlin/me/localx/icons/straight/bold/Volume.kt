package me.localx.icons.straight.bold

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

public val Icons.Bold.Volume: ImageVector
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
                    moveTo(2.0f, 5.4996f)
                    curveTo(1.4696f, 5.4996f, 0.9609f, 5.7103f, 0.5858f, 6.0854f)
                    curveTo(0.2107f, 6.4604f, 0.0f, 6.9691f, 0.0f, 7.4996f)
                    lineTo(0.0f, 16.4996f)
                    curveTo(0.0f, 17.03f, 0.2107f, 17.5387f, 0.5858f, 17.9138f)
                    curveTo(0.9609f, 18.2888f, 1.4696f, 18.4996f, 2.0f, 18.4996f)
                    horizontalLineTo(5.214f)
                    lineTo(13.0f, 23.6346f)
                    verticalLineTo(0.3646f)
                    lineTo(5.214f, 5.4996f)
                    horizontalLineTo(2.0f)
                    close()
                    moveTo(10.0f, 5.9356f)
                    verticalLineTo(18.0636f)
                    lineTo(6.114f, 15.4996f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(8.4996f)
                    horizontalLineTo(6.114f)
                    lineTo(10.0f, 5.9356f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 8.8207f)
                    verticalLineTo(16.1847f)
                    curveTo(15.9765f, 16.1847f, 16.9131f, 15.7968f, 17.6036f, 15.1063f)
                    curveTo(18.2941f, 14.4158f, 18.682f, 13.4792f, 18.682f, 12.5027f)
                    curveTo(18.682f, 11.5262f, 18.2941f, 10.5897f, 17.6036f, 9.8991f)
                    curveTo(16.9131f, 9.2086f, 15.9765f, 8.8207f, 15.0f, 8.8207f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.8632f, 3.3673f)
                    verticalLineTo(6.3673f)
                    curveTo(15.6756f, 6.3569f, 16.482f, 6.508f, 17.2356f, 6.8117f)
                    curveTo(17.9892f, 7.1154f, 18.675f, 7.5658f, 19.2532f, 8.1367f)
                    curveTo(19.8314f, 8.7075f, 20.2905f, 9.3875f, 20.6038f, 10.1372f)
                    curveTo(20.9172f, 10.8868f, 21.0785f, 11.6913f, 21.0785f, 12.5038f)
                    curveTo(21.0785f, 13.3163f, 20.9172f, 14.1207f, 20.6038f, 14.8704f)
                    curveTo(20.2905f, 15.6201f, 19.8314f, 16.3001f, 19.2532f, 16.8709f)
                    curveTo(18.675f, 17.4418f, 17.9892f, 17.8921f, 17.2356f, 18.1959f)
                    curveTo(16.482f, 18.4996f, 15.6756f, 18.6507f, 14.8632f, 18.6403f)
                    verticalLineTo(21.6403f)
                    curveTo(16.071f, 21.6529f, 17.2694f, 21.4259f, 18.389f, 20.9725f)
                    curveTo(19.5086f, 20.519f, 20.5271f, 19.848f, 21.3857f, 18.9983f)
                    curveTo(22.2443f, 18.1487f, 22.9259f, 17.1372f, 23.3911f, 16.0224f)
                    curveTo(23.8562f, 14.9077f, 24.0957f, 13.7117f, 24.0957f, 12.5038f)
                    curveTo(24.0957f, 11.2959f, 23.8562f, 10.0999f, 23.3911f, 8.9852f)
                    curveTo(22.9259f, 7.8704f, 22.2443f, 6.8589f, 21.3857f, 6.0093f)
                    curveTo(20.5271f, 5.1596f, 19.5086f, 4.4886f, 18.389f, 4.0351f)
                    curveTo(17.2694f, 3.5816f, 16.071f, 3.3547f, 14.8632f, 3.3673f)
                    close()
                }
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
