package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 2.9905f)
                    curveTo(14.3871f, 2.9986f, 16.6737f, 3.9513f, 18.3601f, 5.6405f)
                    lineTo(15.9861f, 8.0145f)
                    horizontalLineTo(21.8161f)
                    curveTo(22.1201f, 8.0145f, 22.4116f, 7.8938f, 22.6265f, 7.6789f)
                    curveTo(22.8414f, 7.464f, 22.9621f, 7.1725f, 22.9621f, 6.8685f)
                    verticalLineTo(1.0385f)
                    lineTo(20.4711f, 3.5295f)
                    curveTo(18.7968f, 1.8473f, 16.6604f, 0.7003f, 14.3332f, 0.2341f)
                    curveTo(12.0059f, -0.2321f, 9.5926f, 0.0035f, 7.3994f, 0.9111f)
                    curveTo(5.2063f, 1.8186f, 3.3321f, 3.3571f, 2.0148f, 5.3315f)
                    curveTo(0.6974f, 7.3059f, -0.0038f, 9.627f, 1.0E-4f, 12.0005f)
                    horizontalLineTo(2.9901f)
                    curveTo(2.9928f, 9.6117f, 3.9429f, 7.3215f, 5.632f, 5.6324f)
                    curveTo(7.3212f, 3.9433f, 9.6114f, 2.9932f, 12.0001f, 2.9905f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.01f, 12.0f)
                    curveTo(21.0133f, 13.7822f, 20.487f, 15.5252f, 19.4979f, 17.0079f)
                    curveTo(18.5089f, 18.4905f, 17.1017f, 19.6458f, 15.4549f, 20.3272f)
                    curveTo(13.808f, 21.0087f, 11.9959f, 21.1855f, 10.2484f, 20.8352f)
                    curveTo(8.501f, 20.485f, 6.8969f, 19.6235f, 5.64f, 18.36f)
                    lineTo(8.014f, 15.986f)
                    horizontalLineTo(1.993f)
                    curveTo(1.7398f, 15.9863f, 1.497f, 16.087f, 1.318f, 16.266f)
                    curveTo(1.1389f, 16.445f, 1.0382f, 16.6878f, 1.038f, 16.941f)
                    verticalLineTo(22.962f)
                    lineTo(3.529f, 20.471f)
                    curveTo(5.2033f, 22.1533f, 7.3397f, 23.3002f, 9.667f, 23.7664f)
                    curveTo(11.9942f, 24.2326f, 14.4075f, 23.997f, 16.6007f, 23.0895f)
                    curveTo(18.7938f, 22.1819f, 20.668f, 20.6434f, 21.9853f, 18.669f)
                    curveTo(23.3027f, 16.6947f, 24.0039f, 14.3735f, 24.0f, 12.0f)
                    horizontalLineTo(21.01f)
                    close()
                }
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
