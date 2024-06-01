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

public val Icons.Filled.CommentHeart: ImageVector
    get() {
        if (_commentHeart != null) {
            return _commentHeart!!
        }
        _commentHeart = Builder(name = "CommentHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9998f, 10.6998f)
                    curveTo(15.9998f, 12.1998f, 13.7408f, 14.4318f, 11.9998f, 15.7618f)
                    curveTo(10.2588f, 14.4318f, 7.9998f, 12.2018f, 7.9998f, 10.6998f)
                    curveTo(7.9238f, 8.6938f, 10.9128f, 8.2998f, 10.9998f, 10.4538f)
                    verticalLineTo(10.9998f)
                    curveTo(10.9998f, 11.265f, 11.1051f, 11.5194f, 11.2927f, 11.7069f)
                    curveTo(11.4802f, 11.8944f, 11.7346f, 11.9998f, 11.9998f, 11.9998f)
                    curveTo(12.265f, 11.9998f, 12.5194f, 11.8944f, 12.7069f, 11.7069f)
                    curveTo(12.8944f, 11.5194f, 12.9998f, 11.265f, 12.9998f, 10.9998f)
                    verticalLineTo(10.4538f)
                    curveTo(13.0868f, 8.2998f, 16.0758f, 8.6938f, 15.9998f, 10.6998f)
                    close()
                    moveTo(23.9998f, 12.3398f)
                    verticalLineTo(18.9998f)
                    curveTo(23.9979f, 20.3253f, 23.4706f, 21.596f, 22.5333f, 22.5333f)
                    curveTo(21.596f, 23.4706f, 20.3253f, 23.998f, 18.9998f, 23.9998f)
                    horizontalLineTo(13.0838f)
                    curveTo(6.0818f, 23.9998f, 0.4698f, 19.2078f, 0.0288f, 12.8548f)
                    curveTo(-0.0938f, 11.1406f, 0.1532f, 9.42f, 0.7531f, 7.8095f)
                    curveTo(1.3531f, 6.1989f, 2.292f, 4.7361f, 3.5063f, 3.5199f)
                    curveTo(4.7206f, 2.3037f, 6.182f, 1.3625f, 7.7916f, 0.76f)
                    curveTo(9.4011f, 0.1575f, 11.1213f, -0.0922f, 12.8358f, 0.0278f)
                    curveTo(15.9073f, 0.2914f, 18.7653f, 1.7072f, 20.8361f, 3.991f)
                    curveTo(22.9069f, 6.2747f, 24.0371f, 9.2572f, 23.9998f, 12.3398f)
                    close()
                    moveTo(17.9998f, 10.6998f)
                    curveTo(18.0201f, 9.9962f, 17.8318f, 9.3024f, 17.4586f, 8.7056f)
                    curveTo(17.0854f, 8.1088f, 16.544f, 7.6358f, 15.9026f, 7.3461f)
                    curveTo(15.2611f, 7.0563f, 14.5482f, 6.9629f, 13.8538f, 7.0774f)
                    curveTo(13.1593f, 7.192f, 12.5142f, 7.5094f, 11.9998f, 7.9898f)
                    curveTo(11.4854f, 7.5094f, 10.8403f, 7.192f, 10.1458f, 7.0774f)
                    curveTo(9.4513f, 6.9629f, 8.7385f, 7.0563f, 8.097f, 7.3461f)
                    curveTo(7.4556f, 7.6358f, 6.9142f, 8.1088f, 6.541f, 8.7056f)
                    curveTo(6.1678f, 9.3024f, 5.9795f, 9.9962f, 5.9998f, 10.6998f)
                    curveTo(5.9998f, 13.9558f, 10.8738f, 17.4358f, 11.4298f, 17.8218f)
                    curveTo(11.5972f, 17.9379f, 11.7961f, 18.0002f, 11.9998f, 18.0002f)
                    curveTo(12.2035f, 18.0002f, 12.4024f, 17.9379f, 12.5698f, 17.8218f)
                    curveTo(13.1258f, 17.4358f, 17.9998f, 13.9558f, 17.9998f, 10.6998f)
                    close()
                }
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null
