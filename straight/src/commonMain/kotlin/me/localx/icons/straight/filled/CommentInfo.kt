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
                    moveTo(12.0f, 0.0f)
                    curveTo(8.8174f, 0.0f, 5.7652f, 1.2643f, 3.5147f, 3.5147f)
                    curveTo(1.2643f, 5.7652f, 0.0f, 8.8174f, 0.0f, 12.0f)
                    curveTo(0.0f, 15.1826f, 1.2643f, 18.2348f, 3.5147f, 20.4853f)
                    curveTo(5.7652f, 22.7357f, 8.8174f, 24.0f, 12.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0f, 5.0f)
                    curveTo(12.2967f, 5.0f, 12.5867f, 5.088f, 12.8334f, 5.2528f)
                    curveTo(13.08f, 5.4176f, 13.2723f, 5.6519f, 13.3858f, 5.926f)
                    curveTo(13.4994f, 6.2001f, 13.5291f, 6.5017f, 13.4712f, 6.7926f)
                    curveTo(13.4133f, 7.0836f, 13.2704f, 7.3509f, 13.0607f, 7.5607f)
                    curveTo(12.8509f, 7.7704f, 12.5836f, 7.9133f, 12.2926f, 7.9712f)
                    curveTo(12.0017f, 8.0291f, 11.7001f, 7.9994f, 11.426f, 7.8858f)
                    curveTo(11.1519f, 7.7723f, 10.9176f, 7.58f, 10.7528f, 7.3334f)
                    curveTo(10.588f, 7.0867f, 10.5f, 6.7967f, 10.5f, 6.5f)
                    curveTo(10.5f, 6.1022f, 10.658f, 5.7206f, 10.9393f, 5.4393f)
                    curveTo(11.2206f, 5.158f, 11.6022f, 5.0f, 12.0f, 5.0f)
                    close()
                    moveTo(14.0f, 19.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(12.0f)
                    curveTo(12.5304f, 10.0f, 13.0391f, 10.2107f, 13.4142f, 10.5858f)
                    curveTo(13.7893f, 10.9609f, 14.0f, 11.4696f, 14.0f, 12.0f)
                    verticalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _commentInfo!!
    }

private var _commentInfo: ImageVector? = null
