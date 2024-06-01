package me.localx.icons.rounded.filled

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

public val Icons.Filled.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9968f, 3.847f)
                    curveTo(15.0032f, 4.2532f, 15.2502f, 4.6168f, 15.6255f, 4.7725f)
                    curveTo(18.983f, 6.2498f, 21.1071f, 9.6181f, 20.9933f, 13.2845f)
                    curveTo(20.9127f, 18.2522f, 16.8203f, 22.2139f, 11.8526f, 22.1333f)
                    curveTo(6.885f, 22.0527f, 2.9232f, 17.9603f, 3.0039f, 12.9927f)
                    curveTo(3.0086f, 9.432f, 5.1133f, 6.2092f, 8.3717f, 4.7735f)
                    curveTo(8.7471f, 4.6169f, 8.9939f, 4.2527f, 9.0003f, 3.8461f)
                    curveTo(9.0012f, 3.2941f, 8.5544f, 2.8459f, 8.0025f, 2.8451f)
                    curveTo(7.8739f, 2.8449f, 7.7464f, 2.8695f, 7.6272f, 2.9176f)
                    curveTo(2.0566f, 5.3327f, -0.5015f, 11.8063f, 1.9137f, 17.3769f)
                    curveTo(4.3288f, 22.9475f, 10.8024f, 25.5055f, 16.373f, 23.0904f)
                    curveTo(21.9436f, 20.6753f, 24.5016f, 14.2016f, 22.0865f, 8.6311f)
                    curveTo(20.9763f, 6.0704f, 18.9337f, 4.0278f, 16.373f, 2.9176f)
                    curveTo(15.8618f, 2.7095f, 15.2786f, 2.9552f, 15.0706f, 3.4664f)
                    curveTo(15.0214f, 3.5873f, 14.9963f, 3.7166f, 14.9968f, 3.847f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9986f, 0.0f)
                    curveTo(12.5506f, 0.0f, 12.998f, 0.4474f, 12.998f, 0.9994f)
                    verticalLineTo(6.9959f)
                    curveTo(12.998f, 7.5478f, 12.5506f, 7.9953f, 11.9986f, 7.9953f)
                    curveTo(11.4467f, 7.9953f, 10.9992f, 7.5478f, 10.9992f, 6.9959f)
                    verticalLineTo(0.9994f)
                    curveTo(10.9992f, 0.4474f, 11.4467f, 0.0f, 11.9986f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
