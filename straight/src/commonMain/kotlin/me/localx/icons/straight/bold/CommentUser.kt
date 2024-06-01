package me.localx.icons.straight.bold

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

public val Icons.Bold.CommentUser: ImageVector
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
                    moveTo(12.014f, 23.666f)
                    curveTo(11.3965f, 23.6668f, 10.8003f, 23.4404f, 10.339f, 23.03f)
                    lineTo(6.741f, 20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.5f)
                    curveTo(0.0f, 2.5717f, 0.3687f, 1.6815f, 1.0251f, 1.0251f)
                    curveTo(1.6815f, 0.3687f, 2.5717f, 0.0f, 3.5f, 0.0f)
                    lineTo(20.5f, 0.0f)
                    curveTo(21.4283f, 0.0f, 22.3185f, 0.3687f, 22.9749f, 1.0251f)
                    curveTo(23.6313f, 1.6815f, 24.0f, 2.5717f, 24.0f, 3.5f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(17.328f)
                    lineTo(13.62f, 23.065f)
                    curveTo(13.1769f, 23.4563f, 12.6051f, 23.6703f, 12.014f, 23.666f)
                    close()
                    moveTo(3.0f, 17.0f)
                    horizontalLineTo(7.836f)
                    lineTo(12.0f, 20.511f)
                    lineTo(16.248f, 17.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(3.5f)
                    curveTo(21.0f, 3.3674f, 20.9473f, 3.2402f, 20.8536f, 3.1465f)
                    curveTo(20.7598f, 3.0527f, 20.6326f, 3.0f, 20.5f, 3.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 3.0f, 3.2402f, 3.0527f, 3.1465f, 3.1465f)
                    curveTo(3.0527f, 3.2402f, 3.0f, 3.3674f, 3.0f, 3.5f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(12.0f, 10.0f)
                    curveTo(12.4945f, 10.0f, 12.9778f, 9.8534f, 13.3889f, 9.5787f)
                    curveTo(13.8f, 9.304f, 14.1205f, 8.9135f, 14.3097f, 8.4567f)
                    curveTo(14.4989f, 7.9999f, 14.5484f, 7.4972f, 14.452f, 7.0123f)
                    curveTo(14.3555f, 6.5273f, 14.1174f, 6.0819f, 13.7678f, 5.7322f)
                    curveTo(13.4181f, 5.3826f, 12.9727f, 5.1445f, 12.4877f, 5.048f)
                    curveTo(12.0028f, 4.9516f, 11.5001f, 5.0011f, 11.0433f, 5.1903f)
                    curveTo(10.5865f, 5.3795f, 10.196f, 5.7f, 9.9213f, 6.1111f)
                    curveTo(9.6466f, 6.5222f, 9.5f, 7.0055f, 9.5f, 7.5f)
                    curveTo(9.5f, 8.163f, 9.7634f, 8.7989f, 10.2322f, 9.2678f)
                    curveTo(10.7011f, 9.7366f, 11.337f, 10.0f, 12.0f, 10.0f)
                    close()
                    moveTo(8.0f, 13.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(13.0f)
                    curveTo(16.0f, 12.4696f, 15.7893f, 11.9609f, 15.4142f, 11.5858f)
                    curveTo(15.0391f, 11.2107f, 14.5304f, 11.0f, 14.0f, 11.0f)
                    horizontalLineTo(10.0f)
                    curveTo(9.4696f, 11.0f, 8.9609f, 11.2107f, 8.5858f, 11.5858f)
                    curveTo(8.2107f, 11.9609f, 8.0f, 12.4696f, 8.0f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
