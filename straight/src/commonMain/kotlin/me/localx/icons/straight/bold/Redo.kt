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

public val Icons.Bold.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 15.4994f)
                    verticalLineTo(23.9994f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(23.4754f)
                    curveTo(3.0082f, 21.7562f, 3.6964f, 20.1101f, 4.9143f, 18.8967f)
                    curveTo(6.1322f, 17.6833f, 7.7808f, 17.0012f, 9.5f, 16.9994f)
                    horizontalLineTo(12.831f)
                    verticalLineTo(22.7884f)
                    lineTo(22.978f, 13.9744f)
                    curveTo(23.6327f, 13.3171f, 24.0004f, 12.4271f, 24.0004f, 11.4994f)
                    curveTo(24.0004f, 10.5716f, 23.6327f, 9.6817f, 22.978f, 9.0244f)
                    lineTo(22.9f, 8.9524f)
                    lineTo(12.831f, 0.2104f)
                    verticalLineTo(5.9994f)
                    horizontalLineTo(9.5f)
                    curveTo(6.9813f, 6.0023f, 4.5667f, 7.0041f, 2.7857f, 8.7851f)
                    curveTo(1.0047f, 10.5661f, 0.0029f, 12.9807f, 0.0f, 15.4994f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(3.0f, 16.5774f)
                    verticalLineTo(15.4994f)
                    curveTo(3.0021f, 13.7761f, 3.6876f, 12.1241f, 4.9061f, 10.9055f)
                    curveTo(6.1247f, 9.687f, 7.7767f, 9.0015f, 9.5f, 8.9994f)
                    horizontalLineTo(15.831f)
                    verticalLineTo(6.7884f)
                    lineTo(20.88f, 11.1714f)
                    curveTo(20.9591f, 11.2624f, 21.0026f, 11.3788f, 21.0026f, 11.4994f)
                    curveTo(21.0026f, 11.6199f, 20.9591f, 11.7364f, 20.88f, 11.8274f)
                    lineTo(15.831f, 16.2104f)
                    verticalLineTo(13.9994f)
                    horizontalLineTo(9.5f)
                    curveTo(7.0837f, 13.9976f, 4.7582f, 14.92f, 3.0f, 16.5774f)
                    close()
                }
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
