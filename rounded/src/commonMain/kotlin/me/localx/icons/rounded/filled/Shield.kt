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

public val Icons.Filled.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5811f, 2.1407f)
                    lineTo(12.3161f, 0.0517f)
                    curveTo(12.111f, -0.0167f, 11.8893f, -0.0167f, 11.6841f, 0.0517f)
                    lineTo(5.4181f, 2.1407f)
                    curveTo(4.4222f, 2.4717f, 3.5559f, 3.1082f, 2.9424f, 3.9596f)
                    curveTo(2.3288f, 4.811f, 1.9991f, 5.8342f, 2.0001f, 6.8837f)
                    verticalLineTo(12.0007f)
                    curveTo(2.0001f, 19.5637f, 11.2001f, 23.7407f, 11.5941f, 23.9147f)
                    curveTo(11.7219f, 23.9715f, 11.8603f, 24.0008f, 12.0001f, 24.0008f)
                    curveTo(12.14f, 24.0008f, 12.2783f, 23.9715f, 12.4061f, 23.9147f)
                    curveTo(12.8001f, 23.7407f, 22.0001f, 19.5637f, 22.0001f, 12.0007f)
                    verticalLineTo(6.8837f)
                    curveTo(22.0011f, 5.8341f, 21.6713f, 4.8108f, 21.0575f, 3.9594f)
                    curveTo(20.4437f, 3.1079f, 19.5772f, 2.4715f, 18.5811f, 2.1407f)
                    close()
                }
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
