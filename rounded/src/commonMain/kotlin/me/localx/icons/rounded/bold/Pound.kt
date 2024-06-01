package me.localx.icons.rounded.bold

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

public val Icons.Bold.Pound: ImageVector
    get() {
        if (_pound != null) {
            return _pound!!
        }
        _pound = Builder(name = "Pound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5002f, 21.0f)
                    horizontalLineTo(8.4931f)
                    curveTo(8.8475f, 20.0403f, 9.0195f, 19.0228f, 9.0001f, 18.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(14.5002f)
                    curveTo(14.898f, 14.0f, 15.2795f, 13.842f, 15.5608f, 13.5607f)
                    curveTo(15.8421f, 13.2794f, 16.0002f, 12.8978f, 16.0002f, 12.5f)
                    curveTo(16.0002f, 12.1022f, 15.8421f, 11.7206f, 15.5608f, 11.4393f)
                    curveTo(15.2795f, 11.158f, 14.898f, 11.0f, 14.5002f, 11.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(8.0f)
                    curveTo(9.0027f, 6.7155f, 9.4981f, 5.481f, 10.3844f, 4.5512f)
                    curveTo(11.2706f, 3.6214f, 12.4799f, 3.0672f, 13.7628f, 3.0031f)
                    curveTo(15.0457f, 2.9389f, 16.3043f, 3.3697f, 17.2788f, 4.2064f)
                    curveTo(18.2534f, 5.0432f, 18.8695f, 6.2222f, 19.0002f, 7.5f)
                    curveTo(19.0002f, 7.8978f, 19.1582f, 8.2794f, 19.4395f, 8.5607f)
                    curveTo(19.7208f, 8.842f, 20.1023f, 9.0f, 20.5002f, 9.0f)
                    curveTo(20.898f, 9.0f, 21.2795f, 8.842f, 21.5608f, 8.5607f)
                    curveTo(21.8421f, 8.2794f, 22.0002f, 7.8978f, 22.0002f, 7.5f)
                    curveTo(22.0002f, 3.505f, 18.2622f, 0.0f, 14.0002f, 0.0f)
                    curveTo(11.8792f, 0.0024f, 9.8457f, 0.846f, 8.3459f, 2.3458f)
                    curveTo(6.8461f, 3.8456f, 6.0025f, 5.879f, 6.0002f, 8.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(4.5002f)
                    curveTo(4.1023f, 11.0f, 3.7208f, 11.158f, 3.4395f, 11.4393f)
                    curveTo(3.1582f, 11.7206f, 3.0001f, 12.1022f, 3.0001f, 12.5f)
                    curveTo(3.0001f, 12.8978f, 3.1582f, 13.2794f, 3.4395f, 13.5607f)
                    curveTo(3.7208f, 13.842f, 4.1023f, 14.0f, 4.5002f, 14.0f)
                    horizontalLineTo(6.0002f)
                    verticalLineTo(18.0f)
                    curveTo(6.0002f, 20.583f, 5.2632f, 21.0f, 3.5001f, 21.0f)
                    curveTo(3.1023f, 21.0f, 2.7208f, 21.158f, 2.4395f, 21.4393f)
                    curveTo(2.1582f, 21.7206f, 2.0001f, 22.1022f, 2.0001f, 22.5f)
                    curveTo(2.0001f, 22.8978f, 2.1582f, 23.2794f, 2.4395f, 23.5607f)
                    curveTo(2.7208f, 23.842f, 3.1023f, 24.0f, 3.5001f, 24.0f)
                    horizontalLineTo(20.5002f)
                    curveTo(20.898f, 24.0f, 21.2795f, 23.842f, 21.5608f, 23.5607f)
                    curveTo(21.8421f, 23.2794f, 22.0002f, 22.8978f, 22.0002f, 22.5f)
                    curveTo(22.0002f, 22.1022f, 21.8421f, 21.7206f, 21.5608f, 21.4393f)
                    curveTo(21.2795f, 21.158f, 20.898f, 21.0f, 20.5002f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _pound!!
    }

private var _pound: ImageVector? = null
