package me.localx.icons.rounded.filled

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

public val Icons.Filled.CarBump: ImageVector
    get() {
        if (_carBump != null) {
            return _carBump!!
        }
        _carBump = Builder(name = "CarBump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.784f, 23.621f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, -1.245f)
                curveToRelative(1.231f, -4.947f, 8.773f, -4.935f, 9.943f, 0.016f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.784f, 23.621f)
                close()
                moveTo(19.084f, 5.543f)
                lineTo(15.265f, 2.067f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.958f, -0.7f)
                lineTo(3.2f, 4.138f)
                arcTo(5.012f, 5.012f, 0.0f, false, false, 0.125f, 8.106f)
                curveTo(0.121f, 8.143f, 0.0f, 13.385f, 0.0f, 13.385f)
                curveToRelative(0.0f, 0.217f, 0.006f, 0.489f, 0.022f, 0.788f)
                lineToRelative(19.8f, -7.911f)
                arcTo(5.442f, 5.442f, 0.0f, false, false, 19.083f, 5.543f)
                close()
                moveTo(17.124f, 15.961f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.8f, 14.4f)
                lineToRelative(-0.072f, -0.177f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, 0.976f, -4.42f)
                lineToRelative(-0.53f, -1.3f)
                curveToRelative(-0.074f, -0.184f, -0.164f, -0.353f, -0.249f, -0.527f)
                lineTo(17.242f, 9.445f)
                lineToRelative(0.381f, 0.937f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.853f, 0.753f)
                lineToRelative(-0.385f, -0.948f)
                lineTo(5.866f, 13.992f)
                lineToRelative(0.363f, 0.915f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.858f, 0.738f)
                lineToRelative(-0.362f, -0.911f)
                lineTo(0.326f, 16.206f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 0.189f, 0.575f)
                lineToRelative(0.529f, 1.3f)
                arcToRelative(3.955f, 3.955f, 0.0f, false, false, 4.02f, 2.466f)
                lineToRelative(0.083f, 0.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.707f, -1.5f)
                close()
            }
        }
        .build()
        return _carBump!!
    }

private var _carBump: ImageVector? = null
