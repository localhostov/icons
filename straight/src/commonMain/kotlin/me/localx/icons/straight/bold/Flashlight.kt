package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.933f, 11.188f)
                lineTo(12.812f, 0.067f)
                lineToRelative(-3.812f, 3.812f)
                verticalLineToRelative(4.72f)
                lineTo(0.958f, 16.773f)
                curveToRelative(-1.363f, 1.364f, -1.363f, 3.585f, 0.0f, 4.949f)
                lineToRelative(1.252f, 1.252f)
                curveToRelative(0.681f, 0.682f, 1.576f, 1.022f, 2.472f, 1.022f)
                reflectiveCurveToRelative(1.799f, -0.344f, 2.487f, -1.031f)
                lineToRelative(7.836f, -7.966f)
                horizontalLineToRelative(5.117f)
                lineToRelative(3.812f, -3.812f)
                close()
                moveTo(12.325f, 13.446f)
                lineToRelative(-1.616f, 1.642f)
                lineToRelative(-1.959f, -1.959f)
                lineToRelative(1.616f, -1.642f)
                lineToRelative(1.959f, 1.959f)
                close()
                moveTo(5.039f, 20.853f)
                curveToRelative(-0.195f, 0.196f, -0.512f, 0.195f, -0.708f, 0.0f)
                lineToRelative(-1.251f, -1.252f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0.008f, -0.716f)
                lineToRelative(3.559f, -3.618f)
                lineToRelative(1.959f, 1.959f)
                lineToRelative(-3.567f, 3.627f)
                close()
                moveTo(18.879f, 11.999f)
                horizontalLineToRelative(-3.758f)
                lineToRelative(-3.121f, -3.121f)
                verticalLineToRelative(-3.758f)
                lineToRelative(0.812f, -0.812f)
                lineToRelative(6.879f, 6.879f)
                lineToRelative(-0.812f, 0.812f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
