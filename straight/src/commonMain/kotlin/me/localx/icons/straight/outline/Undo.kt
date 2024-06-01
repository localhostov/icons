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

public val Icons.Outline.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9998f, 23.9994f)
                    horizontalLineTo(21.9998f)
                    curveTo(21.9977f, 22.1435f, 21.2595f, 20.3643f, 19.9472f, 19.052f)
                    curveTo(18.6349f, 17.7397f, 16.8557f, 17.0015f, 14.9998f, 16.9994f)
                    horizontalLineTo(10.1698f)
                    verticalLineTo(23.4134f)
                    lineTo(0.8768f, 14.1204f)
                    curveTo(0.3144f, 13.5578f, -0.0015f, 12.7949f, -0.0015f, 11.9994f)
                    curveTo(-0.0015f, 11.2039f, 0.3144f, 10.441f, 0.8768f, 9.8784f)
                    lineTo(10.1698f, 0.5854f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(14.9998f)
                    curveTo(17.386f, 7.002f, 19.6736f, 7.9511f, 21.3609f, 9.6383f)
                    curveTo(23.0481f, 11.3256f, 23.9972f, 13.6133f, 23.9998f, 15.9994f)
                    verticalLineTo(23.9994f)
                    close()
                    moveTo(8.1698f, 5.4134f)
                    lineTo(2.2908f, 11.2924f)
                    curveTo(2.1034f, 11.4799f, 1.998f, 11.7342f, 1.998f, 11.9994f)
                    curveTo(1.998f, 12.2646f, 2.1034f, 12.5189f, 2.2908f, 12.7064f)
                    lineTo(8.1698f, 18.5854f)
                    verticalLineTo(14.9994f)
                    horizontalLineTo(14.9998f)
                    curveTo(16.3427f, 14.9993f, 17.6685f, 15.3001f, 18.8798f, 15.8796f)
                    curveTo(20.0912f, 16.4592f, 21.1573f, 17.3028f, 21.9998f, 18.3484f)
                    verticalLineTo(15.9994f)
                    curveTo(21.9977f, 14.1435f, 21.2595f, 12.3643f, 19.9472f, 11.052f)
                    curveTo(18.6349f, 9.7397f, 16.8557f, 9.0015f, 14.9998f, 8.9994f)
                    horizontalLineTo(8.1698f)
                    verticalLineTo(5.4134f)
                    close()
                }
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
