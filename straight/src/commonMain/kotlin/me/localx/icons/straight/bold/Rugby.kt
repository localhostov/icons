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

public val Icons.Bold.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0238f, 1.9752f)
                    curveTo(18.4998f, -1.5538f, 9.3768f, -0.1778f, 4.5998f, 4.5992f)
                    curveTo(-0.1772f, 9.3762f, -1.5512f, 18.4992f, 1.9758f, 22.0232f)
                    curveTo(3.6224f, 23.429f, 5.7521f, 24.1378f, 7.9128f, 23.9992f)
                    curveTo(12.1831f, 23.9602f, 16.2829f, 22.3184f, 19.3998f, 19.3992f)
                    curveTo(24.1768f, 14.6202f, 25.5508f, 5.4992f, 22.0238f, 1.9752f)
                    close()
                    moveTo(17.2778f, 17.2752f)
                    curveTo(14.9395f, 19.4166f, 11.9503f, 20.7114f, 8.7888f, 20.9522f)
                    lineTo(3.0458f, 15.2112f)
                    curveTo(3.2865f, 12.0496f, 4.5809f, 9.0601f, 6.7218f, 6.7212f)
                    curveTo(9.061f, 4.5802f, 12.0508f, 3.2858f, 15.2128f, 3.0452f)
                    lineTo(20.9538f, 8.7862f)
                    curveTo(20.7133f, 11.9482f, 19.4189f, 14.938f, 17.2778f, 17.2772f)
                    verticalLineTo(17.2752f)
                    close()
                    moveTo(18.3168f, 9.6802f)
                    lineTo(16.1998f, 11.7992f)
                    lineTo(15.2608f, 10.8592f)
                    lineTo(14.1208f, 11.9992f)
                    lineTo(15.0608f, 12.9382f)
                    lineTo(12.9388f, 15.0602f)
                    lineTo(11.9998f, 14.1202f)
                    lineTo(10.8778f, 15.2422f)
                    lineTo(11.8168f, 16.1822f)
                    lineTo(9.6998f, 18.2992f)
                    lineTo(5.6998f, 14.2992f)
                    lineTo(7.8208f, 12.1782f)
                    lineTo(8.7608f, 13.1172f)
                    lineTo(9.8788f, 11.9992f)
                    lineTo(8.9388f, 11.0602f)
                    lineTo(11.0608f, 8.9382f)
                    lineTo(11.9998f, 9.8782f)
                    lineTo(13.1358f, 8.7422f)
                    lineTo(12.1998f, 7.7992f)
                    lineTo(14.3208f, 5.6782f)
                    lineTo(18.3168f, 9.6802f)
                    close()
                }
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
