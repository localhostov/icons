package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.CommentUser: ImageVector
    get() {
        if (_commentUser != null) {
            return _commentUser!!
        }
        _commentUser = Builder(name = "CommentUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0002f, 7.9458f)
                    curveTo(12.8413f, 7.9458f, 13.5232f, 7.2639f, 13.5232f, 6.4228f)
                    curveTo(13.5232f, 5.5817f, 12.8413f, 4.8998f, 12.0002f, 4.8998f)
                    curveTo(11.1591f, 4.8998f, 10.4772f, 5.5817f, 10.4772f, 6.4228f)
                    curveTo(10.4772f, 7.2639f, 11.1591f, 7.9458f, 12.0002f, 7.9458f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 6.0E-4f)
                    horizontalLineTo(3.9999f)
                    curveTo(1.7762f, 0.0182f, -0.0134f, 1.8329f, -1.0E-4f, 4.0566f)
                    verticalLineTo(16.2266f)
                    curveTo(-0.0134f, 18.4505f, 1.776f, 20.2654f, 3.9999f, 20.2836f)
                    horizontalLineTo(6.9229f)
                    lineTo(10.6708f, 23.4836f)
                    curveTo(11.4132f, 24.162f, 12.5477f, 24.172f, 13.3018f, 23.5066f)
                    lineTo(17.1469f, 20.2826f)
                    horizontalLineTo(19.9999f)
                    curveTo(22.2237f, 20.2644f, 24.0132f, 18.4495f, 23.9998f, 16.2256f)
                    verticalLineTo(4.0566f)
                    curveTo(24.0132f, 1.8329f, 22.2236f, 0.0182f, 19.9999f, 6.0E-4f)
                    close()
                    moveTo(11.9999f, 3.0426f)
                    curveTo(16.6149f, 3.1646f, 16.6139f, 10.0196f, 11.9999f, 10.1426f)
                    curveTo(7.3849f, 10.0196f, 7.3859f, 3.1676f, 11.9999f, 3.0426f)
                    close()
                    moveTo(16.2489f, 17.2086f)
                    curveTo(15.7137f, 17.3452f, 15.1693f, 17.022f, 15.0327f, 16.4869f)
                    curveTo(15.0321f, 16.4844f, 15.0315f, 16.482f, 15.0309f, 16.4796f)
                    curveTo(14.519f, 14.8054f, 12.7468f, 13.863f, 11.0726f, 14.3749f)
                    curveTo(10.0648f, 14.683f, 9.276f, 15.4718f, 8.9679f, 16.4796f)
                    curveTo(8.8281f, 17.0142f, 8.2815f, 17.3343f, 7.7469f, 17.1946f)
                    curveTo(7.2123f, 17.0549f, 6.8922f, 16.5082f, 7.0319f, 15.9736f)
                    curveTo(7.8051f, 13.2296f, 10.6565f, 11.6319f, 13.4005f, 12.4052f)
                    curveTo(15.1299f, 12.8925f, 16.4815f, 14.2441f, 16.9689f, 15.9736f)
                    curveTo(17.1081f, 16.513f, 16.7869f, 17.064f, 16.2489f, 17.2086f)
                    close()
                }
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
