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

public val Icons.Filled.Soup: ImageVector
    get() {
        if (_soup != null) {
            return _soup!!
        }
        _soup = Builder(name = "Soup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.958f, 13.485f)
                    curveTo(23.5821f, 15.7188f, 22.6881f, 17.8335f, 21.3477f, 19.6595f)
                    curveTo(20.0072f, 21.4855f, 18.2576f, 22.9721f, 16.239f, 24.0f)
                    horizontalLineTo(7.773f)
                    curveTo(5.7527f, 22.9729f, 4.0011f, 21.4868f, 2.6586f, 19.6608f)
                    curveTo(1.316f, 17.8348f, 0.4199f, 15.7197f, 0.042f, 13.485f)
                    curveTo(-0.0301f, 13.0585f, -0.0082f, 12.6213f, 0.1063f, 12.2041f)
                    curveTo(0.2209f, 11.787f, 0.4252f, 11.3999f, 0.705f, 11.07f)
                    curveTo(0.9879f, 10.7346f, 1.3407f, 10.465f, 1.7387f, 10.2802f)
                    curveTo(2.1367f, 10.0954f, 2.5702f, 9.9998f, 3.009f, 10.0f)
                    horizontalLineTo(20.99f)
                    curveTo(21.4282f, 10.0001f, 21.861f, 10.096f, 22.2583f, 10.2808f)
                    curveTo(22.6556f, 10.4656f, 23.0077f, 10.7349f, 23.29f, 11.07f)
                    curveTo(23.5707f, 11.3995f, 23.776f, 11.7864f, 23.8914f, 12.2036f)
                    curveTo(24.0068f, 12.6207f, 24.0295f, 13.0581f, 23.958f, 13.485f)
                    close()
                    moveTo(14.0f, 5.414f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(5.414f)
                    curveTo(16.0018f, 4.8341f, 15.8884f, 4.2596f, 15.6664f, 3.7239f)
                    curveTo(15.4445f, 3.1881f, 15.1184f, 2.7018f, 14.707f, 2.293f)
                    curveTo(14.256f, 1.8392f, 14.002f, 1.2258f, 14.0f, 0.586f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.586f)
                    curveTo(12.0036f, 1.756f, 12.4677f, 2.8776f, 13.292f, 3.708f)
                    curveTo(13.5171f, 3.9313f, 13.6956f, 4.1971f, 13.8172f, 4.49f)
                    curveTo(13.9387f, 4.7828f, 14.0009f, 5.0969f, 14.0f, 5.414f)
                    close()
                    moveTo(10.0f, 6.414f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(6.414f)
                    curveTo(12.0016f, 5.834f, 11.8882f, 5.2594f, 11.6662f, 4.7235f)
                    curveTo(11.4443f, 4.1876f, 11.1183f, 3.701f, 10.707f, 3.292f)
                    curveTo(10.4819f, 3.0687f, 10.3035f, 2.8029f, 10.1821f, 2.51f)
                    curveTo(10.0607f, 2.2171f, 9.9988f, 1.903f, 10.0f, 1.586f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(1.586f)
                    curveTo(7.9983f, 2.1658f, 8.1116f, 2.7402f, 8.3334f, 3.2759f)
                    curveTo(8.5551f, 3.8117f, 8.881f, 4.2981f, 9.292f, 4.707f)
                    curveTo(9.7437f, 5.1605f, 9.9981f, 5.7739f, 10.0f, 6.414f)
                    close()
                }
            }
        }
        .build()
        return _soup!!
    }

private var _soup: ImageVector? = null
