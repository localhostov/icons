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

public val Icons.Bold.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.436f, 8.6399f)
                    lineTo(24.0f, 4.0739f)
                    lineTo(21.881f, 1.9529f)
                    lineTo(17.29f, 6.5439f)
                    lineTo(15.54f, 4.8339f)
                    curveTo(15.0976f, 4.4026f, 14.5089f, 4.1537f, 13.8913f, 4.1368f)
                    curveTo(13.2736f, 4.12f, 12.6723f, 4.3364f, 12.207f, 4.7429f)
                    curveTo(10.4944f, 6.2971f, 8.5021f, 7.5117f, 6.336f, 8.3219f)
                    lineTo(0.0f, 10.1799f)
                    verticalLineTo(11.2999f)
                    curveTo(0.0383f, 14.7016f, 1.4244f, 17.9492f, 3.8542f, 20.3301f)
                    curveTo(6.2841f, 22.711f, 9.5592f, 24.0308f, 12.961f, 23.9999f)
                    horizontalLineTo(14.314f)
                    lineTo(14.701f, 23.7299f)
                    curveTo(16.7175f, 22.4356f, 18.3901f, 20.6715f, 19.5753f, 18.589f)
                    curveTo(20.7605f, 16.5065f, 21.423f, 14.1676f, 21.506f, 11.7729f)
                    curveTo(21.5156f, 11.4319f, 21.4545f, 11.0926f, 21.3264f, 10.7765f)
                    curveTo(21.1984f, 10.4603f, 21.0062f, 10.1741f, 20.762f, 9.9359f)
                    lineTo(19.436f, 8.6399f)
                    close()
                    moveTo(13.36f, 20.9999f)
                    horizontalLineTo(12.96f)
                    curveTo(12.0179f, 21.0003f, 11.0803f, 20.8701f, 10.174f, 20.6129f)
                    curveTo(11.4686f, 19.7822f, 12.5844f, 18.7014f, 13.456f, 17.4339f)
                    lineTo(13.95f, 16.7069f)
                    lineTo(11.47f, 15.0199f)
                    lineTo(10.977f, 15.7449f)
                    curveTo(10.1575f, 16.9411f, 9.0483f, 17.9103f, 7.753f, 18.5619f)
                    lineTo(6.9f, 18.9899f)
                    curveTo(6.2916f, 18.5328f, 5.7379f, 18.007f, 5.25f, 17.4229f)
                    curveTo(6.603f, 16.8597f, 7.8371f, 16.0454f, 8.887f, 15.0229f)
                    lineTo(6.787f, 12.8809f)
                    curveTo(5.9033f, 13.7384f, 4.8463f, 14.3968f, 3.687f, 14.8119f)
                    curveTo(3.3753f, 14.0404f, 3.1672f, 13.231f, 3.068f, 12.4049f)
                    lineTo(7.18f, 11.1999f)
                    curveTo(8.716f, 10.6917f, 10.1709f, 9.9653f, 11.5f, 9.0429f)
                    lineTo(17.826f, 15.1999f)
                    curveTo(16.9499f, 17.5358f, 15.3944f, 19.5559f, 13.36f, 20.9999f)
                    close()
                }
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
