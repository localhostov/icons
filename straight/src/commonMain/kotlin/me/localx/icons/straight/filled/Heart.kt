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

public val Icons.Filled.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.5002f, 0.9171f)
                    curveTo(16.3742f, 0.9346f, 15.2727f, 1.249f, 14.307f, 1.8284f)
                    curveTo(13.3413f, 2.4078f, 12.5456f, 3.2318f, 12.0002f, 4.2171f)
                    curveTo(11.4548f, 3.2318f, 10.6591f, 2.4078f, 9.6934f, 1.8284f)
                    curveTo(8.7277f, 1.249f, 7.6262f, 0.9346f, 6.5002f, 0.9171f)
                    curveTo(4.7051f, 0.9951f, 3.0139f, 1.7804f, 1.796f, 3.1014f)
                    curveTo(0.5781f, 4.4223f, -0.0675f, 6.1716f, 2.0E-4f, 7.9671f)
                    curveTo(2.0E-4f, 14.7421f, 10.9562f, 22.5671f, 11.4222f, 22.8991f)
                    lineTo(12.0002f, 23.3081f)
                    lineTo(12.5782f, 22.8991f)
                    curveTo(13.0442f, 22.5691f, 24.0002f, 14.7421f, 24.0002f, 7.9671f)
                    curveTo(24.068f, 6.1716f, 23.4223f, 4.4223f, 22.2044f, 3.1014f)
                    curveTo(20.9865f, 1.7804f, 19.2953f, 0.9951f, 17.5002f, 0.9171f)
                    close()
                }
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
