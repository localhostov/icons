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

public val Icons.Filled.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9998f, 6.857f)
                    curveTo(23.9998f, 7.542f, 23.6588f, 8.0f, 22.9738f, 8.0f)
                    horizontalLineTo(16.9838f)
                    curveTo(16.8178f, 15.694f, 14.7158f, 20.2f, 9.8358f, 22.369f)
                    curveTo(9.2409f, 20.4361f, 8.1818f, 18.6782f, 6.751f, 17.2488f)
                    curveTo(5.3203f, 15.8194f, 3.5614f, 14.762f, 1.6278f, 14.169f)
                    curveTo(3.7998f, 9.286f, 8.2998f, 7.182f, 15.9998f, 7.016f)
                    verticalLineTo(1.026f)
                    curveTo(15.9998f, 0.341f, 16.4578f, 0.0f, 17.1428f, 0.0f)
                    curveTo(18.0507f, 0.0047f, 18.92f, 0.3676f, 19.5619f, 1.0096f)
                    curveTo(20.2038f, 1.6517f, 20.5664f, 2.5211f, 20.5708f, 3.429f)
                    curveTo(21.4787f, 3.4335f, 22.3481f, 3.796f, 22.9902f, 4.4379f)
                    curveTo(23.6323f, 5.0798f, 23.9951f, 5.9491f, 23.9998f, 6.857f)
                    close()
                    moveTo(7.9608f, 23.066f)
                    curveTo(5.3638f, 23.7477f, 2.6841f, 24.0621f, -2.0E-4f, 24.0f)
                    curveTo(-0.0623f, 21.3185f, 0.2514f, 18.6415f, 0.9318f, 16.047f)
                    curveTo(2.5974f, 16.5349f, 4.1138f, 17.4333f, 5.3419f, 18.6596f)
                    curveTo(6.57f, 19.886f, 7.4705f, 21.4011f, 7.9608f, 23.066f)
                    close()
                    moveTo(3.9998f, 21.0f)
                    curveTo(3.9998f, 20.7348f, 3.8945f, 20.4804f, 3.7069f, 20.2929f)
                    curveTo(3.5194f, 20.1054f, 3.265f, 20.0f, 2.9998f, 20.0f)
                    curveTo(2.7346f, 20.0f, 2.4802f, 20.1054f, 2.2927f, 20.2929f)
                    curveTo(2.1052f, 20.4804f, 1.9998f, 20.7348f, 1.9998f, 21.0f)
                    curveTo(1.9998f, 21.2652f, 2.1052f, 21.5196f, 2.2927f, 21.7071f)
                    curveTo(2.4802f, 21.8946f, 2.7346f, 22.0f, 2.9998f, 22.0f)
                    curveTo(3.265f, 22.0f, 3.5194f, 21.8946f, 3.7069f, 21.7071f)
                    curveTo(3.8945f, 21.5196f, 3.9998f, 21.2652f, 3.9998f, 21.0f)
                    close()
                    moveTo(11.9998f, 5.3f)
                    verticalLineTo(3.0f)
                    curveTo(9.1224f, 3.0767f, 6.2832f, 3.6783f, 3.6218f, 4.775f)
                    curveTo(3.1331f, 5.0277f, 2.7232f, 5.41f, 2.4372f, 5.8801f)
                    curveTo(2.1511f, 6.3501f, 1.9998f, 6.8898f, 1.9998f, 7.44f)
                    verticalLineTo(9.914f)
                    curveTo(4.2408f, 7.4f, 7.4898f, 5.9f, 11.9998f, 5.3f)
                    close()
                    moveTo(18.6998f, 12.0f)
                    curveTo(18.4644f, 14.0736f, 17.9074f, 16.0979f, 17.0488f, 18.0f)
                    horizontalLineTo(18.2938f)
                    curveTo(21.3818f, 17.881f, 20.8508f, 14.414f, 21.0018f, 12.0f)
                    horizontalLineTo(18.6998f)
                    close()
                }
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
