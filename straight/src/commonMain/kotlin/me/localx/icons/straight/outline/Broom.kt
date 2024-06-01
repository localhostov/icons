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

public val Icons.Outline.Broom: ImageVector
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
                    moveTo(18.9649f, 8.464f)
                    lineTo(23.9939f, 3.435f)
                    lineTo(22.5649f, 2.006f)
                    lineTo(17.5189f, 7.051f)
                    lineTo(15.3129f, 4.895f)
                    curveTo(14.9509f, 4.5431f, 14.4698f, 4.3403f, 13.9652f, 4.3268f)
                    curveTo(13.4605f, 4.3133f, 12.9693f, 4.49f, 12.5889f, 4.822f)
                    curveTo(10.7327f, 6.5028f, 8.5732f, 7.8146f, 6.2259f, 8.687f)
                    lineTo(-0.0061f, 10.514f)
                    verticalLineTo(11.27f)
                    curveTo(0.0351f, 14.6829f, 1.428f, 17.9403f, 3.8672f, 20.3278f)
                    curveTo(6.3064f, 22.7152f, 9.5929f, 24.038f, 13.0059f, 24.006f)
                    horizontalLineTo(14.2469f)
                    lineTo(14.5079f, 23.824f)
                    curveTo(16.5468f, 22.5169f, 18.2384f, 20.735f, 19.4377f, 18.6309f)
                    curveTo(20.637f, 16.5268f, 21.3082f, 14.1633f, 21.3939f, 11.743f)
                    curveTo(21.4015f, 11.4643f, 21.3511f, 11.187f, 21.2459f, 10.9288f)
                    curveTo(21.1408f, 10.6706f, 20.9831f, 10.4371f, 20.7829f, 10.243f)
                    lineTo(18.9649f, 8.464f)
                    close()
                    moveTo(13.8999f, 6.34f)
                    lineTo(19.3769f, 11.681f)
                    curveTo(19.347f, 12.7007f, 19.1939f, 13.713f, 18.9209f, 14.696f)
                    lineTo(11.9409f, 7.9f)
                    curveTo(12.6199f, 7.4134f, 13.2737f, 6.8928f, 13.8999f, 6.34f)
                    close()
                    moveTo(13.6059f, 21.985f)
                    horizontalLineTo(13.0059f)
                    curveTo(11.5322f, 21.9851f, 10.0731f, 21.6931f, 8.7129f, 21.126f)
                    curveTo(10.4606f, 20.2479f, 11.9567f, 18.9404f, 13.0609f, 17.326f)
                    lineTo(13.5789f, 16.566f)
                    lineTo(11.9099f, 15.43f)
                    lineTo(11.3919f, 16.191f)
                    curveTo(10.479f, 17.5224f, 9.2431f, 18.6004f, 7.7999f, 19.324f)
                    lineTo(6.5709f, 19.942f)
                    curveTo(5.5717f, 19.2386f, 4.6978f, 18.3722f, 3.9859f, 17.379f)
                    curveTo(5.617f, 16.8267f, 7.1052f, 15.9192f, 8.3429f, 14.722f)
                    lineTo(6.9319f, 13.277f)
                    curveTo(5.8144f, 14.3596f, 4.4506f, 15.1547f, 2.9579f, 15.594f)
                    curveTo(2.4402f, 14.4668f, 2.1283f, 13.256f, 2.0369f, 12.019f)
                    lineTo(6.7919f, 10.625f)
                    curveTo(7.9944f, 10.2389f, 9.1442f, 9.7048f, 10.2149f, 9.035f)
                    lineTo(18.1259f, 16.735f)
                    curveTo(17.0799f, 18.8334f, 15.527f, 20.6379f, 13.6079f, 21.985f)
                    horizontalLineTo(13.6059f)
                    close()
                }
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
