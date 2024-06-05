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

public val Icons.Outline.OliveOil: ImageVector
    get() {
        if (_oliveOil != null) {
            return _oliveOil!!
        }
        _oliveOil = Builder(name = "OliveOil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.211f, 12.32f)
                curveToRelative(4.205f, -2.912f, 0.264f, -9.264f, -4.211f, -6.77f)
                lineTo(15.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(8.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(9.0f, 8.0f)
                curveToRelative(0.0f, 0.661f, -1.212f, 1.68f, -2.281f, 2.579f)
                curveTo(4.976f, 12.044f, 3.0f, 13.7f, 3.0f, 16.0f)
                curveToRelative(0.089f, 3.525f, 3.167f, 8.02f, 6.732f, 8.0f)
                horizontalLineToRelative(4.536f)
                arcToRelative(5.059f, 5.059f, 0.0f, false, false, 3.758f, -1.7f)
                curveTo(20.506f, 19.8f, 22.573f, 15.281f, 19.211f, 12.32f)
                close()
                moveTo(17.0f, 7.0f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, true, 0.654f, 3.895f)
                arcTo(11.634f, 11.634f, 0.0f, false, true, 15.1f, 8.354f)
                arcTo(2.023f, 2.023f, 0.0f, false, true, 17.0f, 7.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(13.0f, 8.0f)
                curveToRelative(-0.041f, 1.955f, 2.447f, 3.563f, 4.031f, 5.0f)
                lineTo(6.969f, 13.0f)
                curveTo(8.554f, 11.563f, 11.041f, 9.955f, 11.0f, 8.0f)
                close()
                moveTo(16.536f, 20.967f)
                arcTo(3.061f, 3.061f, 0.0f, false, true, 14.268f, 22.0f)
                lineTo(9.732f, 22.0f)
                curveToRelative(-2.519f, 0.07f, -5.6f, -4.759f, -4.474f, -7.0f)
                lineTo(18.742f, 15.0f)
                curveTo(19.634f, 17.2f, 17.948f, 19.345f, 16.536f, 20.967f)
                close()
            }
        }
        .build()
        return _oliveOil!!
    }

private var _oliveOil: ImageVector? = null
