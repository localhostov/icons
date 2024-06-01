package me.localx.icons.straight.outline

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

public val Icons.Outline.CommentInfo: ImageVector
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
                    moveTo(13.5f, 6.5f)
                    curveTo(13.5f, 6.7967f, 13.412f, 7.0867f, 13.2472f, 7.3334f)
                    curveTo(13.0824f, 7.58f, 12.8481f, 7.7723f, 12.574f, 7.8858f)
                    curveTo(12.2999f, 7.9994f, 11.9983f, 8.0291f, 11.7074f, 7.9712f)
                    curveTo(11.4164f, 7.9133f, 11.1491f, 7.7704f, 10.9393f, 7.5607f)
                    curveTo(10.7296f, 7.3509f, 10.5867f, 7.0836f, 10.5288f, 6.7926f)
                    curveTo(10.471f, 6.5017f, 10.5007f, 6.2001f, 10.6142f, 5.926f)
                    curveTo(10.7277f, 5.6519f, 10.92f, 5.4176f, 11.1667f, 5.2528f)
                    curveTo(11.4133f, 5.088f, 11.7033f, 5.0f, 12.0f, 5.0f)
                    curveTo(12.3978f, 5.0f, 12.7794f, 5.158f, 13.0607f, 5.4393f)
                    curveTo(13.342f, 5.7207f, 13.5f, 6.1022f, 13.5f, 6.5f)
                    close()
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 9.6266f, 23.2962f, 7.3066f, 21.9776f, 5.3332f)
                    curveTo(20.6591f, 3.3598f, 18.7849f, 1.8217f, 16.5922f, 0.9135f)
                    curveTo(14.3995f, 0.0052f, 11.9867f, -0.2324f, 9.6589f, 0.2306f)
                    curveTo(7.3312f, 0.6936f, 5.1929f, 1.8365f, 3.5147f, 3.5147f)
                    curveTo(1.8365f, 5.1929f, 0.6936f, 7.3312f, 0.2306f, 9.6589f)
                    curveTo(-0.2324f, 11.9867f, 0.0052f, 14.3995f, 0.9135f, 16.5922f)
                    curveTo(1.8217f, 18.7849f, 3.3598f, 20.6591f, 5.3332f, 21.9776f)
                    curveTo(7.3066f, 23.2962f, 9.6266f, 24.0f, 12.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.0f)
                    close()
                    moveTo(22.0f, 12.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(12.0f)
                    curveTo(10.0222f, 22.0f, 8.0888f, 21.4135f, 6.4443f, 20.3147f)
                    curveTo(4.7998f, 19.2159f, 3.5181f, 17.6541f, 2.7612f, 15.8268f)
                    curveTo(2.0043f, 13.9996f, 1.8063f, 11.9889f, 2.1922f, 10.0491f)
                    curveTo(2.578f, 8.1093f, 3.5304f, 6.3275f, 4.9289f, 4.9289f)
                    curveTo(6.3275f, 3.5304f, 8.1093f, 2.578f, 10.0491f, 2.1922f)
                    curveTo(11.9889f, 1.8063f, 13.9996f, 2.0043f, 15.8268f, 2.7612f)
                    curveTo(17.6541f, 3.5181f, 19.2159f, 4.7998f, 20.3147f, 6.4443f)
                    curveTo(21.4135f, 8.0888f, 22.0f, 10.0222f, 22.0f, 12.0f)
                    close()
                    moveTo(14.0f, 12.0f)
                    curveTo(14.0f, 11.4696f, 13.7893f, 10.9609f, 13.4142f, 10.5858f)
                    curveTo(13.0391f, 10.2107f, 12.5304f, 10.0f, 12.0f, 10.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _commentInfo!!
    }

private var _commentInfo: ImageVector? = null
