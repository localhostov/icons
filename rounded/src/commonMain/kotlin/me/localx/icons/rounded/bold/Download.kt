package me.localx.icons.rounded.bold

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

public val Icons.Bold.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.8508f, 17.7f)
                    curveTo(10.6082f, 19.4574f, 13.4574f, 19.4574f, 15.2148f, 17.7f)
                    lineTo(15.2149f, 17.7f)
                    lineTo(18.4269f, 14.488f)
                    curveTo(19.0228f, 13.9125f, 19.0393f, 12.9629f, 18.4637f, 12.367f)
                    curveTo(17.8882f, 11.7711f, 16.9386f, 11.7546f, 16.3427f, 12.3301f)
                    curveTo(16.3302f, 12.3422f, 16.3179f, 12.3545f, 16.3059f, 12.367f)
                    lineTo(13.5229f, 15.149f)
                    lineTo(13.4999f, 1.5f)
                    curveTo(13.4999f, 0.6716f, 12.8283f, 0.0f, 11.9999f, 0.0f)
                    curveTo(11.1714f, 0.0f, 10.4999f, 0.6716f, 10.4999f, 1.5f)
                    lineTo(10.5209f, 15.127f)
                    lineTo(7.7599f, 12.366f)
                    curveTo(7.164f, 11.7905f, 6.2144f, 11.807f, 5.6389f, 12.4028f)
                    curveTo(5.0774f, 12.9841f, 5.0774f, 13.9057f, 5.6389f, 14.487f)
                    lineTo(8.8508f, 17.7f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5f, 14.5f)
                    curveTo(21.6716f, 14.5f, 21.0f, 15.1716f, 21.0f, 16.0f)
                    verticalLineTo(20.591f)
                    curveTo(20.9994f, 20.8166f, 20.8167f, 20.9995f, 20.591f, 21.0f)
                    horizontalLineTo(3.409f)
                    curveTo(3.1833f, 20.9994f, 3.0005f, 20.8166f, 3.0f, 20.591f)
                    verticalLineTo(16.0f)
                    curveTo(3.0f, 15.1716f, 2.3284f, 14.5f, 1.5f, 14.5f)
                    curveTo(0.6716f, 14.5f, 0.0f, 15.1716f, 0.0f, 16.0f)
                    verticalLineTo(20.591f)
                    curveTo(0.0022f, 22.4728f, 1.5272f, 23.9978f, 3.409f, 24.0f)
                    horizontalLineTo(20.591f)
                    curveTo(22.4728f, 23.9978f, 23.9977f, 22.4728f, 24.0f, 20.591f)
                    verticalLineTo(16.0f)
                    curveTo(24.0f, 15.1716f, 23.3284f, 14.5f, 22.5f, 14.5f)
                    close()
                }
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
