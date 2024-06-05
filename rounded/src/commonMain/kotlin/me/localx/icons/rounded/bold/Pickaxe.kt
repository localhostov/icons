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

public val Icons.Bold.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = Builder(name = "Pickaxe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.867f, 18.985f)
                curveToRelative(-0.515f, 0.0f, -0.946f, -0.361f, -1.067f, -0.862f)
                curveToRelative(-0.772f, -3.204f, -2.479f, -6.366f, -4.762f, -9.041f)
                lineTo(2.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineTo(14.918f, 6.961f)
                curveToRelative(-2.678f, -2.29f, -5.846f, -4.002f, -9.057f, -4.776f)
                curveToRelative(-0.5f, -0.121f, -0.862f, -0.552f, -0.862f, -1.067f)
                curveTo(5.0f, 0.505f, 5.507f, -0.001f, 6.12f, 0.02f)
                curveToRelative(4.948f, 0.174f, 8.915f, 1.516f, 11.844f, 3.895f)
                lineToRelative(1.476f, -1.476f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                reflectiveCurveToRelative(0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-1.477f, 1.477f)
                curveToRelative(2.371f, 2.928f, 3.708f, 6.889f, 3.882f, 11.828f)
                curveToRelative(0.022f, 0.613f, -0.484f, 1.12f, -1.098f, 1.12f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
