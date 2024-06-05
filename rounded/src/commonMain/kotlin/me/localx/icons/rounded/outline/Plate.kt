package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Plate: ImageVector
    get() {
        if (_plate != null) {
            return _plate!!
        }
        _plate = Builder(name = "Plate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.63f, -3.908f, 23.373f, -3.9f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 2.0f, 12.0f)
                curveToRelative(0.525f, 13.257f, 19.477f, 13.253f, 20.0f, 0.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(-0.251f, 7.929f, -11.749f, 7.928f, -12.0f, 0.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, 8.0f)
                curveTo(4.376f, 22.588f, 19.626f, 22.586f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _plate!!
    }

private var _plate: ImageVector? = null
