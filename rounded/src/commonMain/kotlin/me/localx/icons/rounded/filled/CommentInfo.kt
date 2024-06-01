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

public val Icons.Filled.CommentInfo: ImageVector
    get() {
        if (_commentInfo != null) {
            return _commentInfo!!
        }
        _commentInfo = Builder(name = "CommentInfo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.8358f, 0.0278f)
                    curveTo(11.1213f, -0.0922f, 9.4011f, 0.1575f, 7.7916f, 0.76f)
                    curveTo(6.182f, 1.3625f, 4.7206f, 2.3037f, 3.5063f, 3.5199f)
                    curveTo(2.292f, 4.7361f, 1.3531f, 6.1989f, 0.7531f, 7.8095f)
                    curveTo(0.1532f, 9.42f, -0.0938f, 11.1406f, 0.0288f, 12.8548f)
                    curveTo(0.4698f, 19.2078f, 6.0818f, 23.9998f, 13.0828f, 23.9998f)
                    horizontalLineTo(18.9998f)
                    curveTo(20.3254f, 23.9982f, 21.5962f, 23.4709f, 22.5336f, 22.5336f)
                    curveTo(23.4709f, 21.5962f, 23.9982f, 20.3254f, 23.9998f, 18.9998f)
                    verticalLineTo(12.3398f)
                    curveTo(24.0371f, 9.2572f, 22.9069f, 6.2747f, 20.8361f, 3.991f)
                    curveTo(18.7653f, 1.7072f, 15.9073f, 0.2914f, 12.8358f, 0.0278f)
                    close()
                    moveTo(11.9998f, 4.9998f)
                    curveTo(12.3976f, 4.9998f, 12.7791f, 5.1578f, 13.0605f, 5.4391f)
                    curveTo(13.3418f, 5.7204f, 13.4998f, 6.102f, 13.4998f, 6.4998f)
                    curveTo(13.4998f, 6.8976f, 13.3418f, 7.2792f, 13.0605f, 7.5605f)
                    curveTo(12.7791f, 7.8418f, 12.3976f, 7.9998f, 11.9998f, 7.9998f)
                    curveTo(11.602f, 7.9998f, 11.2204f, 7.8418f, 10.9391f, 7.5605f)
                    curveTo(10.6578f, 7.2792f, 10.4998f, 6.8976f, 10.4998f, 6.4998f)
                    curveTo(10.4998f, 6.102f, 10.6578f, 5.7204f, 10.9391f, 5.4391f)
                    curveTo(11.2204f, 5.1578f, 11.602f, 4.9998f, 11.9998f, 4.9998f)
                    close()
                    moveTo(13.9998f, 17.9998f)
                    curveTo(13.9998f, 18.265f, 13.8944f, 18.5194f, 13.7069f, 18.7069f)
                    curveTo(13.5194f, 18.8944f, 13.265f, 18.9998f, 12.9998f, 18.9998f)
                    curveTo(12.7346f, 18.9998f, 12.4802f, 18.8944f, 12.2927f, 18.7069f)
                    curveTo(12.1051f, 18.5194f, 11.9998f, 18.265f, 11.9998f, 17.9998f)
                    verticalLineTo(11.9998f)
                    horizontalLineTo(10.9998f)
                    curveTo(10.7346f, 11.9998f, 10.4802f, 11.8944f, 10.2927f, 11.7069f)
                    curveTo(10.1051f, 11.5194f, 9.9998f, 11.265f, 9.9998f, 10.9998f)
                    curveTo(9.9998f, 10.7346f, 10.1051f, 10.4802f, 10.2927f, 10.2927f)
                    curveTo(10.4802f, 10.1052f, 10.7346f, 9.9998f, 10.9998f, 9.9998f)
                    horizontalLineTo(11.9998f)
                    curveTo(12.5302f, 9.9998f, 13.0389f, 10.2105f, 13.414f, 10.5856f)
                    curveTo(13.7891f, 10.9607f, 13.9998f, 11.4694f, 13.9998f, 11.9998f)
                    verticalLineTo(17.9998f)
                    close()
                }
            }
        }
        .build()
        return _commentInfo!!
    }

private var _commentInfo: ImageVector? = null
