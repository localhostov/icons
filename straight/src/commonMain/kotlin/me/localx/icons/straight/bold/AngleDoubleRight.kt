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

public val Icons.Bold.AngleDoubleRight: ImageVector
    get() {
        if (_angleDoubleRight != null) {
            return _angleDoubleRight!!
        }
        _angleDoubleRight = Builder(name = "AngleDoubleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.3302f, 9.533f)
                    lineTo(12.8002f, 0.005f)
                    lineTo(10.6802f, 2.126f)
                    lineTo(20.2092f, 11.654f)
                    curveTo(20.3008f, 11.7459f, 20.3522f, 11.8703f, 20.3522f, 12.0f)
                    curveTo(20.3522f, 12.1297f, 20.3008f, 12.2542f, 20.2092f, 12.346f)
                    lineTo(10.6802f, 21.874f)
                    lineTo(12.8002f, 24.0f)
                    lineTo(22.3292f, 14.472f)
                    curveTo(22.9841f, 13.8171f, 23.3521f, 12.9289f, 23.3523f, 12.0027f)
                    curveTo(23.3525f, 11.0765f, 22.9848f, 10.1882f, 22.3302f, 9.533f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.8002f, 10.939f)
                    lineTo(2.8602f, 0.005f)
                    lineTo(0.7392f, 2.126f)
                    lineTo(10.6132f, 12.0f)
                    lineTo(0.7392f, 21.874f)
                    lineTo(2.8602f, 24.0f)
                    lineTo(13.8002f, 13.061f)
                    curveTo(13.9396f, 12.9217f, 14.0502f, 12.7563f, 14.1256f, 12.5743f)
                    curveTo(14.201f, 12.3922f, 14.2399f, 12.1971f, 14.2399f, 12.0f)
                    curveTo(14.2399f, 11.803f, 14.201f, 11.6078f, 14.1256f, 11.4258f)
                    curveTo(14.0502f, 11.2437f, 13.9396f, 11.0783f, 13.8002f, 10.939f)
                    close()
                }
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
