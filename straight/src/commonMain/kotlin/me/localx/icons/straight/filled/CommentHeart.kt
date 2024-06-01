package me.localx.icons.straight.filled

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
                    moveTo(16.0f, 10.7f)
                    curveTo(16.0f, 12.2f, 13.741f, 14.432f, 12.0f, 15.762f)
                    curveTo(10.259f, 14.432f, 8.0f, 12.202f, 8.0f, 10.7f)
                    curveTo(7.9759f, 10.2762f, 8.1198f, 9.86f, 8.4007f, 9.5418f)
                    curveTo(8.6815f, 9.2235f, 9.0765f, 9.0288f, 9.5f, 9.0f)
                    curveTo(9.6967f, 8.9858f, 9.8942f, 9.0132f, 10.0796f, 9.0806f)
                    curveTo(10.265f, 9.148f, 10.434f, 9.2538f, 10.5756f, 9.3911f)
                    curveTo(10.7172f, 9.5284f, 10.8282f, 9.694f, 10.9014f, 9.8772f)
                    curveTo(10.9745f, 10.0604f, 11.0081f, 10.2569f, 11.0f, 10.454f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(10.454f)
                    curveTo(12.9919f, 10.2569f, 13.0255f, 10.0604f, 13.0986f, 9.8772f)
                    curveTo(13.1718f, 9.694f, 13.2828f, 9.5284f, 13.4244f, 9.3911f)
                    curveTo(13.566f, 9.2538f, 13.7351f, 9.148f, 13.9204f, 9.0806f)
                    curveTo(14.1058f, 9.0132f, 14.3033f, 8.9858f, 14.5f, 9.0f)
                    curveTo(14.9235f, 9.0288f, 15.3185f, 9.2235f, 15.5994f, 9.5418f)
                    curveTo(15.8802f, 9.86f, 16.0242f, 10.2762f, 16.0f, 10.7f)
                    close()
                    moveTo(24.0f, 12.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(12.0f)
                    curveTo(9.6266f, 24.0f, 7.3066f, 23.2962f, 5.3332f, 21.9776f)
                    curveTo(3.3598f, 20.6591f, 1.8217f, 18.7849f, 0.9135f, 16.5922f)
                    curveTo(0.0052f, 14.3995f, -0.2324f, 11.9867f, 0.2306f, 9.6589f)
                    curveTo(0.6936f, 7.3312f, 1.8365f, 5.1929f, 3.5147f, 3.5147f)
                    curveTo(5.1929f, 1.8365f, 7.3312f, 0.6936f, 9.6589f, 0.2306f)
                    curveTo(11.9867f, -0.2324f, 14.3995f, 0.0052f, 16.5922f, 0.9135f)
                    curveTo(18.7849f, 1.8217f, 20.6591f, 3.3598f, 21.9776f, 5.3332f)
                    curveTo(23.2962f, 7.3066f, 24.0f, 9.6266f, 24.0f, 12.0f)
                    close()
                    moveTo(18.0f, 10.7f)
                    curveTo(18.0248f, 9.7457f, 17.6703f, 8.8205f, 17.0143f, 8.127f)
                    curveTo(16.3583f, 7.4335f, 15.4542f, 7.0283f, 14.5f, 7.0f)
                    curveTo(13.5684f, 6.9855f, 12.6691f, 7.3416f, 12.0f, 7.99f)
                    curveTo(11.3309f, 7.3416f, 10.4316f, 6.9855f, 9.5f, 7.0f)
                    curveTo(8.5458f, 7.0283f, 7.6417f, 7.4335f, 6.9857f, 8.127f)
                    curveTo(6.3297f, 8.8205f, 5.9752f, 9.7457f, 6.0f, 10.7f)
                    curveTo(6.0f, 13.956f, 10.874f, 17.436f, 11.43f, 17.821f)
                    lineTo(12.0f, 18.221f)
                    lineTo(12.57f, 17.821f)
                    curveTo(13.126f, 17.436f, 18.0f, 13.956f, 18.0f, 10.7f)
                    close()
                }
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null
