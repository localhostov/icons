package me.localx.icons.straight.outline

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

public val Icons.Outline.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.586f, 5.929f)
                    lineTo(12.707f, 15.808f)
                    curveTo(12.5169f, 15.9904f, 12.2636f, 16.0923f, 12.0f, 16.0923f)
                    curveTo(11.7365f, 16.0923f, 11.4832f, 15.9904f, 11.293f, 15.808f)
                    lineTo(1.42f, 5.934f)
                    lineTo(0.006f, 7.348f)
                    lineTo(9.879f, 17.222f)
                    curveTo(10.4509f, 17.767f, 11.2106f, 18.071f, 12.0005f, 18.071f)
                    curveTo(12.7905f, 18.071f, 13.5502f, 17.767f, 14.122f, 17.222f)
                    lineTo(24.0f, 7.343f)
                    lineTo(22.586f, 5.929f)
                    close()
                }
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
