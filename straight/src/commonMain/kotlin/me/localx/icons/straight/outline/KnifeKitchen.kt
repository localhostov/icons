package me.localx.icons.straight.outline

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

public val Icons.Outline.KnifeKitchen: ImageVector
    get() {
        if (_knifeKitchen != null) {
            return _knifeKitchen!!
        }
        _knifeKitchen = Builder(name = "KnifeKitchen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.245f, 23.0f)
                curveToRelative(-0.634f, 0.0f, -2.246f, -0.031f, -2.246f, -0.031f)
                verticalLineToRelative(-0.981f)
                curveToRelative(0.0f, -1.319f, 0.513f, -2.56f, 1.444f, -3.494f)
                lineTo(17.821f, 2.064f)
                curveToRelative(1.366f, -1.372f, 3.753f, -1.373f, 5.121f, 0.0f)
                curveToRelative(1.409f, 1.414f, 1.409f, 3.716f, 0.0f, 5.13f)
                lineToRelative(-4.036f, 4.108f)
                curveToRelative(-0.675f, 0.688f, -1.035f, 1.597f, -1.012f, 2.561f)
                curveToRelative(0.02f, 0.84f, 0.328f, 1.625f, 0.875f, 2.247f)
                lineToRelative(0.333f, 0.334f)
                lineToRelative(-1.385f, 1.442f)
                curveToRelative(-0.118f, -0.108f, -1.797f, -1.803f, -1.797f, -1.803f)
                lineToRelative(-2.752f, 2.789f)
                curveToRelative(-2.521f, 2.532f, -5.989f, 3.953f, -10.034f, 4.114f)
                curveToRelative(-0.241f, 0.01f, -0.566f, 0.013f, -0.89f, 0.013f)
                close()
                moveTo(2.168f, 21.0f)
                curveToRelative(0.323f, -0.001f, 0.647f, -0.002f, 0.887f, -0.011f)
                curveToRelative(2.462f, -0.098f, 5.969f, -0.789f, 8.692f, -3.523f)
                lineToRelative(2.761f, -2.798f)
                lineToRelative(-3.211f, -3.225f)
                lineTo(2.86f, 19.906f)
                curveToRelative(-0.313f, 0.314f, -0.547f, 0.687f, -0.691f, 1.094f)
                close()
                moveTo(12.709f, 10.025f)
                lineToRelative(3.208f, 3.222f)
                curveToRelative(0.119f, -1.259f, 0.661f, -2.428f, 1.562f, -3.345f)
                lineToRelative(4.041f, -4.113f)
                curveToRelative(0.639f, -0.642f, 0.639f, -1.677f, 0.005f, -2.313f)
                curveToRelative(-0.611f, -0.614f, -1.676f, -0.614f, -2.287f, 0.0f)
                lineToRelative(-6.528f, 6.549f)
                close()
            }
        }
        .build()
        return _knifeKitchen!!
    }

private var _knifeKitchen: ImageVector? = null
