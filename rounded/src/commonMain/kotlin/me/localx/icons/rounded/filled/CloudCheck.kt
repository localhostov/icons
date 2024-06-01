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

public val Icons.Filled.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.3561f, 7.36f)
                    curveTo(18.1847f, 7.3071f, 18.0292f, 7.2125f, 17.9034f, 7.0848f)
                    curveTo(17.7776f, 6.957f, 17.6854f, 6.8001f, 17.6351f, 6.628f)
                    curveTo(17.106f, 4.9276f, 16.0247f, 3.4524f, 14.5625f, 2.4359f)
                    curveTo(13.1003f, 1.4195f, 11.3407f, 0.92f, 9.5626f, 1.0165f)
                    curveTo(7.7844f, 1.1131f, 6.0893f, 1.8002f, 4.7457f, 2.9689f)
                    curveTo(3.4021f, 4.1377f, 2.4869f, 5.7214f, 2.1451f, 7.469f)
                    curveTo(1.7936f, 9.236f, 2.0769f, 11.0704f, 2.9451f, 12.649f)
                    curveTo(1.9335f, 13.171f, 1.1109f, 13.9968f, 0.5929f, 15.0104f)
                    curveTo(0.0749f, 16.024f, -0.1125f, 17.1744f, 0.0571f, 18.3f)
                    curveTo(0.3179f, 19.6078f, 1.0181f, 20.787f, 2.0415f, 21.6419f)
                    curveTo(3.0648f, 22.4968f, 4.3498f, 22.976f, 5.6831f, 23.0f)
                    horizontalLineTo(14.7831f)
                    curveTo(19.8561f, 23.0f, 23.6351f, 19.972f, 23.9731f, 15.638f)
                    curveTo(24.1241f, 13.824f, 23.649f, 12.013f, 22.627f, 10.5067f)
                    curveTo(21.6049f, 9.0004f, 20.0975f, 7.8899f, 18.3561f, 7.36f)
                    close()
                    moveTo(19.2281f, 14.707f)
                    lineTo(13.8131f, 20.121f)
                    curveTo(13.2505f, 20.6834f, 12.4875f, 20.9994f, 11.6921f, 20.9994f)
                    curveTo(10.8966f, 20.9994f, 10.1336f, 20.6834f, 9.571f, 20.121f)
                    lineTo(6.1841f, 16.7f)
                    curveTo(6.0774f, 16.6106f, 5.9905f, 16.4999f, 5.929f, 16.375f)
                    curveTo(5.8676f, 16.2501f, 5.8329f, 16.1138f, 5.8272f, 15.9747f)
                    curveTo(5.8215f, 15.8356f, 5.8448f, 15.6968f, 5.8958f, 15.5673f)
                    curveTo(5.9468f, 15.4378f, 6.0243f, 15.3203f, 6.1233f, 15.2224f)
                    curveTo(6.2222f, 15.1246f, 6.3406f, 15.0485f, 6.4707f, 14.9989f)
                    curveTo(6.6008f, 14.9494f, 6.7398f, 14.9276f, 6.8788f, 14.9349f)
                    curveTo(7.0178f, 14.9422f, 7.1538f, 14.9785f, 7.278f, 15.0414f)
                    curveTo(7.4022f, 15.1042f, 7.5119f, 15.1923f, 7.6f, 15.3f)
                    lineTo(10.9841f, 18.714f)
                    curveTo(11.1745f, 18.8947f, 11.427f, 18.9955f, 11.6896f, 18.9955f)
                    curveTo(11.9521f, 18.9955f, 12.2046f, 18.8947f, 12.3951f, 18.714f)
                    lineTo(17.8091f, 13.3f)
                    curveTo(17.9966f, 13.1124f, 18.2509f, 13.0069f, 18.5162f, 13.0068f)
                    curveTo(18.7815f, 13.0067f, 19.0359f, 13.112f, 19.2236f, 13.2995f)
                    curveTo(19.4112f, 13.487f, 19.5167f, 13.7414f, 19.5168f, 14.0067f)
                    curveTo(19.5168f, 14.2719f, 19.4116f, 14.5264f, 19.2241f, 14.714f)
                    lineTo(19.2281f, 14.707f)
                    close()
                }
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
