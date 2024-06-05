package me.localx.icons.rounded.bold

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

public val Icons.Bold.BreadSliceButter: ImageVector
    get() {
        if (_breadSliceButter != null) {
            return _breadSliceButter!!
        }
        _breadSliceButter = Builder(name = "BreadSliceButter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.622f, 12.09f)
                curveToRelative(0.503f, 0.503f, 0.503f, 1.318f, 0.0f, 1.82f)
                lineToRelative(-2.712f, 2.712f)
                curveToRelative(-0.503f, 0.503f, -1.318f, 0.503f, -1.821f, 0.0f)
                lineToRelative(-2.712f, -2.712f)
                curveToRelative(-0.503f, -0.503f, -0.503f, -1.318f, 0.0f, -1.82f)
                lineToRelative(2.712f, -2.712f)
                curveToRelative(0.503f, -0.503f, 1.318f, -0.503f, 1.821f, 0.0f)
                lineToRelative(2.712f, 2.712f)
                close()
                moveTo(21.997f, 10.355f)
                verticalLineToRelative(7.151f)
                curveToRelative(0.0f, 3.029f, -2.466f, 5.494f, -5.497f, 5.494f)
                lineTo(7.494f, 23.0f)
                curveToRelative(-3.031f, 0.0f, -5.497f, -2.465f, -5.497f, -5.494f)
                verticalLineToRelative(-7.151f)
                curveTo(0.4f, 9.053f, -0.333f, 7.009f, 0.15f, 5.023f)
                curveTo(0.727f, 2.654f, 2.909f, 1.0f, 5.456f, 1.0f)
                horizontalLineToRelative(13.082f)
                curveToRelative(2.547f, 0.0f, 4.729f, 1.654f, 5.307f, 4.024f)
                curveToRelative(0.483f, 1.984f, -0.251f, 4.028f, -1.848f, 5.33f)
                close()
                moveTo(20.93f, 5.734f)
                curveToRelative(-0.245f, -1.004f, -1.25f, -1.733f, -2.392f, -1.733f)
                lineTo(5.456f, 4.001f)
                curveToRelative(-1.141f, 0.0f, -2.146f, 0.729f, -2.391f, 1.733f)
                curveToRelative(-0.273f, 1.121f, 0.399f, 2.085f, 1.187f, 2.543f)
                curveToRelative(0.462f, 0.27f, 0.746f, 0.763f, 0.746f, 1.297f)
                verticalLineToRelative(7.933f)
                curveToRelative(0.0f, 1.375f, 1.12f, 2.494f, 2.497f, 2.494f)
                horizontalLineToRelative(9.006f)
                curveToRelative(1.377f, 0.0f, 2.497f, -1.119f, 2.497f, -2.494f)
                verticalLineToRelative(-7.933f)
                curveToRelative(0.0f, -0.534f, 0.284f, -1.027f, 0.746f, -1.297f)
                curveToRelative(0.788f, -0.458f, 1.46f, -1.422f, 1.187f, -2.543f)
                close()
            }
        }
        .build()
        return _breadSliceButter!!
    }

private var _breadSliceButter: ImageVector? = null
