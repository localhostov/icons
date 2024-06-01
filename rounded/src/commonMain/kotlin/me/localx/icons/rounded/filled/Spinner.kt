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

public val Icons.Filled.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.5815f, 24.0f)
                    curveTo(17.1015f, 24.0115f, 21.2414f, 21.4726f, 23.2804f, 17.4387f)
                    curveTo(23.5164f, 16.9395f, 23.303f, 16.3434f, 22.8037f, 16.1075f)
                    curveTo(22.3254f, 15.8814f, 21.7538f, 16.067f, 21.4996f, 16.5309f)
                    curveTo(18.9981f, 21.454f, 12.9792f, 23.4172f, 8.056f, 20.9157f)
                    curveTo(3.1328f, 18.4142f, 1.1696f, 12.3953f, 3.6711f, 7.4721f)
                    curveTo(6.1726f, 2.5489f, 12.1915f, 0.5858f, 17.1147f, 3.0873f)
                    curveTo(19.0115f, 4.0511f, 20.5514f, 5.5947f, 21.5105f, 7.4939f)
                    curveTo(21.7439f, 7.9943f, 22.3388f, 8.2109f, 22.8393f, 7.9775f)
                    curveTo(23.3398f, 7.7442f, 23.5563f, 7.1493f, 23.323f, 6.6488f)
                    curveTo(23.3143f, 6.6302f, 23.3051f, 6.6119f, 23.2953f, 6.5939f)
                    curveTo(20.3089f, 0.6783f, 13.0924f, -1.6962f, 7.1768f, 1.2902f)
                    curveTo(1.2612f, 4.2766f, -1.1133f, 11.4932f, 1.8731f, 17.4087f)
                    curveTo(3.9133f, 21.4501f, 8.0544f, 23.999f, 12.5815f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
