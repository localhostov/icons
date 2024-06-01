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

public val Icons.Filled.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 0.0f)
                    lineTo(2.0001f, 5.522f)
                    verticalLineTo(21.0f)
                    curveTo(2.0001f, 21.7956f, 2.3162f, 22.5587f, 2.8788f, 23.1213f)
                    curveTo(3.4414f, 23.6839f, 4.2045f, 24.0f, 5.0001f, 24.0f)
                    horizontalLineTo(19.0001f)
                    curveTo(19.795f, 23.9976f, 20.5567f, 23.6808f, 21.1188f, 23.1187f)
                    curveTo(21.6809f, 22.5566f, 21.9977f, 21.7949f, 22.0001f, 21.0f)
                    verticalLineTo(5.522f)
                    lineTo(12.0001f, 0.0f)
                    close()
                    moveTo(12.0001f, 8.5f)
                    curveTo(11.7035f, 8.5f, 11.4134f, 8.412f, 11.1668f, 8.2472f)
                    curveTo(10.9201f, 8.0824f, 10.7278f, 7.8481f, 10.6143f, 7.574f)
                    curveTo(10.5008f, 7.2999f, 10.4711f, 6.9983f, 10.5289f, 6.7074f)
                    curveTo(10.5868f, 6.4164f, 10.7297f, 6.1491f, 10.9395f, 5.9393f)
                    curveTo(11.1492f, 5.7296f, 11.4165f, 5.5867f, 11.7075f, 5.5288f)
                    curveTo(11.9985f, 5.4709f, 12.3001f, 5.5006f, 12.5741f, 5.6142f)
                    curveTo(12.8482f, 5.7277f, 13.0825f, 5.92f, 13.2473f, 6.1666f)
                    curveTo(13.4121f, 6.4133f, 13.5001f, 6.7033f, 13.5001f, 7.0f)
                    curveTo(13.5001f, 7.3978f, 13.3421f, 7.7794f, 13.0608f, 8.0607f)
                    curveTo(12.7795f, 8.342f, 12.3979f, 8.5f, 12.0001f, 8.5f)
                    close()
                }
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
