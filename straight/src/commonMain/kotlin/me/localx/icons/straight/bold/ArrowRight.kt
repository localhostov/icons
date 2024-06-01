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

public val Icons.Bold.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.935f, 16.2711f)
                    lineTo(19.715f, 13.4911f)
                    lineTo(0.0f, 13.4661f)
                    verticalLineTo(10.4661f)
                    lineTo(19.7f, 10.4911f)
                    lineTo(16.935f, 7.7271f)
                    lineTo(19.056f, 5.6071f)
                    lineTo(22.975f, 9.5251f)
                    curveTo(23.6308f, 10.1814f, 23.9993f, 11.0712f, 23.9993f, 11.9991f)
                    curveTo(23.9993f, 12.9269f, 23.6308f, 13.8167f, 22.975f, 14.4731f)
                    lineTo(19.056f, 18.3911f)
                    lineTo(16.935f, 16.2711f)
                    close()
                }
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
