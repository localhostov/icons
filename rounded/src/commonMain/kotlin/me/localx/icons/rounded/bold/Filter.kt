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

public val Icons.Bold.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.5001f, 24.0f)
                    curveTo(14.2283f, 24.0004f, 13.9617f, 23.9264f, 13.7291f, 23.786f)
                    lineTo(8.7291f, 20.786f)
                    curveTo(8.5068f, 20.6528f, 8.3229f, 20.4644f, 8.1951f, 20.239f)
                    curveTo(8.0674f, 20.0137f, 8.0002f, 19.7591f, 8.0001f, 19.5f)
                    verticalLineTo(14.335f)
                    lineTo(2.0341f, 7.035f)
                    curveTo(1.3623f, 6.2644f, 0.9947f, 5.2753f, 1.0001f, 4.253f)
                    curveTo(1.0014f, 3.1254f, 1.4499f, 2.0444f, 2.2472f, 1.2471f)
                    curveTo(3.0445f, 0.4498f, 4.1255f, 0.0013f, 5.2531f, 0.0f)
                    lineTo(18.7471f, 0.0f)
                    curveTo(19.5669f, 3.0E-4f, 20.3691f, 0.2375f, 21.0573f, 0.683f)
                    curveTo(21.7455f, 1.1285f, 22.2903f, 1.7634f, 22.6262f, 2.5113f)
                    curveTo(22.962f, 3.2592f, 23.0746f, 4.0882f, 22.9504f, 4.8985f)
                    curveTo(22.8262f, 5.7088f, 22.4705f, 6.4661f, 21.9261f, 7.079f)
                    lineTo(16.0001f, 14.382f)
                    verticalLineTo(22.5f)
                    curveTo(16.0001f, 22.8978f, 15.842f, 23.2794f, 15.5607f, 23.5607f)
                    curveTo(15.2794f, 23.842f, 14.8979f, 24.0f, 14.5001f, 24.0f)
                    close()
                    moveTo(11.0001f, 18.65f)
                    lineTo(13.0001f, 19.85f)
                    verticalLineTo(13.85f)
                    curveTo(12.9998f, 13.5056f, 13.1181f, 13.1715f, 13.3351f, 12.904f)
                    lineTo(19.6401f, 5.137f)
                    curveTo(19.867f, 4.8981f, 19.9956f, 4.5825f, 20.0001f, 4.253f)
                    curveTo(19.9995f, 3.9209f, 19.8673f, 3.6024f, 19.6325f, 3.3676f)
                    curveTo(19.3976f, 3.1327f, 19.0792f, 3.0005f, 18.7471f, 3.0f)
                    horizontalLineTo(5.2531f)
                    curveTo(5.0115f, 3.0002f, 4.7752f, 3.0702f, 4.5725f, 3.2015f)
                    curveTo(4.3698f, 3.3328f, 4.2094f, 3.5199f, 4.1104f, 3.7402f)
                    curveTo(4.0114f, 3.9605f, 3.9782f, 4.2047f, 4.0147f, 4.4434f)
                    curveTo(4.0512f, 4.6822f, 4.1558f, 4.9053f, 4.3161f, 5.086f)
                    lineTo(10.6621f, 12.851f)
                    curveTo(10.8808f, 13.1189f, 11.0002f, 13.4542f, 11.0001f, 13.8f)
                    verticalLineTo(18.65f)
                    close()
                }
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
