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

public val Icons.Filled.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.7899f, 12.08f)
                    curveTo(19.0199f, 9.212f, 17.8669f, 6.067f, 17.2899f, 4.546f)
                    curveTo(17.7802f, 4.3473f, 18.281f, 4.1754f, 18.7899f, 4.031f)
                    curveTo(18.9289f, 3.9949f, 19.0743f, 3.9915f, 19.2148f, 4.021f)
                    curveTo(19.3554f, 4.0505f, 19.4872f, 4.1121f, 19.5999f, 4.201f)
                    curveTo(19.7245f, 4.2958f, 19.8255f, 4.4182f, 19.8949f, 4.5585f)
                    curveTo(19.9643f, 4.6989f, 20.0002f, 4.8534f, 19.9999f, 5.01f)
                    horizontalLineTo(21.9999f)
                    curveTo(22.0014f, 4.5467f, 21.8955f, 4.0894f, 21.6906f, 3.6738f)
                    curveTo(21.4857f, 3.2583f, 21.1873f, 2.8959f, 20.8189f, 2.615f)
                    curveTo(20.4636f, 2.3386f, 20.0491f, 2.1482f, 19.6079f, 2.0588f)
                    curveTo(19.1667f, 1.9695f, 18.7108f, 1.9836f, 18.2759f, 2.1f)
                    curveTo(17.359f, 2.3687f, 16.4613f, 2.6991f, 15.5889f, 3.089f)
                    lineTo(14.7159f, 3.482f)
                    lineTo(15.0709f, 4.373f)
                    curveTo(15.0809f, 4.397f, 15.5769f, 5.64f, 16.1919f, 7.363f)
                    lineTo(12.0199f, 10.606f)
                    lineTo(8.4139f, 7.0f)
                    horizontalLineTo(9.9999f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(5.5859f)
                    lineTo(10.4289f, 11.844f)
                    lineTo(8.4409f, 13.39f)
                    curveTo(7.5475f, 12.5493f, 6.374f, 12.07f, 5.1475f, 12.0448f)
                    curveTo(3.921f, 12.0197f, 2.7288f, 12.4505f, 1.8017f, 13.2538f)
                    curveTo(0.8746f, 14.0572f, 0.2785f, 15.176f, 0.1289f, 16.3935f)
                    curveTo(-0.0207f, 17.6111f, 0.2867f, 18.8409f, 0.9918f, 19.8449f)
                    curveTo(1.6968f, 20.8488f, 2.7492f, 21.5554f, 3.9453f, 21.828f)
                    curveTo(5.1414f, 22.1005f, 6.396f, 21.9196f, 7.4664f, 21.3202f)
                    curveTo(8.5367f, 20.7209f, 9.3467f, 19.7457f, 9.7393f, 18.5835f)
                    curveTo(10.132f, 17.4213f, 10.0794f, 16.1547f, 9.5919f, 15.029f)
                    lineTo(16.8799f, 9.361f)
                    curveTo(17.1799f, 10.279f, 17.4799f, 11.242f, 17.7459f, 12.179f)
                    curveTo(16.5489f, 12.491f, 15.51f, 13.2357f, 14.8301f, 14.2691f)
                    curveTo(14.1501f, 15.3025f, 13.8774f, 16.5513f, 14.0647f, 17.7741f)
                    curveTo(14.2519f, 18.9969f, 14.8858f, 20.1068f, 15.8438f, 20.8895f)
                    curveTo(16.8017f, 21.6721f, 18.0158f, 22.0718f, 19.2514f, 22.0113f)
                    curveTo(20.487f, 21.9509f, 21.6562f, 21.4346f, 22.5333f, 20.5622f)
                    curveTo(23.4103f, 19.6898f, 23.9328f, 18.5232f, 23.9997f, 17.288f)
                    curveTo(24.0667f, 16.0528f, 23.6734f, 14.8366f, 22.8959f, 13.8745f)
                    curveTo(22.1183f, 12.9124f, 21.0117f, 12.2727f, 19.7899f, 12.079f)
                    verticalLineTo(12.08f)
                    close()
                }
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
