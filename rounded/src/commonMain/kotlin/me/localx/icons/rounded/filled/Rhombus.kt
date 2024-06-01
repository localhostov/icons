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

public val Icons.Filled.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.466f, 8.4641f)
                    lineTo(15.536f, 1.5331f)
                    curveTo(14.5972f, 0.5971f, 13.3257f, 0.0715f, 12.0f, 0.0715f)
                    curveTo(10.6743f, 0.0715f, 9.4028f, 0.5971f, 8.464f, 1.5331f)
                    lineTo(1.534f, 8.4641f)
                    curveTo(0.5966f, 9.4017f, 0.0701f, 10.6733f, 0.0701f, 11.9991f)
                    curveTo(0.0701f, 13.3249f, 0.5966f, 14.5965f, 1.534f, 15.5341f)
                    lineTo(8.464f, 22.4651f)
                    curveTo(9.4026f, 23.4014f, 10.6743f, 23.9271f, 12.0f, 23.9271f)
                    curveTo(13.3257f, 23.9271f, 14.5974f, 23.4014f, 15.536f, 22.4651f)
                    lineTo(22.466f, 15.5341f)
                    curveTo(23.4034f, 14.5965f, 23.9299f, 13.3249f, 23.9299f, 11.9991f)
                    curveTo(23.9299f, 10.6733f, 23.4034f, 9.4017f, 22.466f, 8.4641f)
                    close()
                }
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
