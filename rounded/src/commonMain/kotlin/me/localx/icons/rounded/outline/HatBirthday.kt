package me.localx.icons.rounded.outline

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

public val Icons.Outline.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.1389f, 17.7784f)
                    lineTo(13.5919f, 5.5344f)
                    curveTo(14.9962f, 4.6551f, 15.4219f, 2.8039f, 14.5427f, 1.3996f)
                    curveTo(13.6634f, -0.0047f, 11.8123f, -0.4304f, 10.4079f, 0.4489f)
                    curveTo(9.0036f, 1.3282f, 8.5779f, 3.1793f, 9.4572f, 4.5837f)
                    curveTo(9.6981f, 4.9684f, 10.0232f, 5.2935f, 10.4079f, 5.5344f)
                    lineTo(1.8609f, 17.7784f)
                    curveTo(0.9307f, 18.9964f, 0.7532f, 20.6299f, 1.3999f, 22.0194f)
                    curveTo(2.1625f, 23.3367f, 3.6083f, 24.1052f, 5.1269f, 24.0003f)
                    horizontalLineTo(18.8729f)
                    curveTo(20.3915f, 24.1052f, 21.8373f, 23.3367f, 22.5999f, 22.0194f)
                    curveTo(23.2466f, 20.6299f, 23.069f, 18.9964f, 22.1389f, 17.7784f)
                    close()
                    moveTo(11.7309f, 22.0003f)
                    lineTo(17.1889f, 14.1814f)
                    lineTo(18.5999f, 16.2084f)
                    lineTo(14.5609f, 22.0004f)
                    horizontalLineTo(11.7309f)
                    verticalLineTo(22.0003f)
                    close()
                    moveTo(6.5389f, 22.0003f)
                    lineTo(14.5929f, 10.4623f)
                    lineTo(15.9689f, 12.4343f)
                    lineTo(9.2919f, 22.0003f)
                    horizontalLineTo(6.5389f)
                    close()
                    moveTo(3.1699f, 21.0943f)
                    curveTo(2.8733f, 20.3646f, 3.0f, 19.5311f, 3.4999f, 18.9223f)
                    lineTo(11.9999f, 6.7474f)
                    lineTo(13.3809f, 8.7253f)
                    curveTo(13.3669f, 8.7433f, 13.3469f, 8.7523f, 13.3339f, 8.7703f)
                    lineTo(4.1999f, 21.8593f)
                    curveTo(3.7668f, 21.755f, 3.3949f, 21.4788f, 3.1699f, 21.0943f)
                    close()
                    moveTo(20.8299f, 21.0943f)
                    curveTo(20.4013f, 21.7421f, 19.644f, 22.0926f, 18.8729f, 22.0003f)
                    horizontalLineTo(16.9999f)
                    lineTo(19.8219f, 17.9563f)
                    lineTo(20.4969f, 18.9223f)
                    curveTo(20.9978f, 19.5305f, 21.1257f, 20.3641f, 20.8299f, 21.0943f)
                    close()
                }
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
