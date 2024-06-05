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

public val Icons.Bold.Duration: ImageVector
    get() {
        if (_duration != null) {
            return _duration!!
        }
        _duration = Builder(name = "Duration", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-2.939f, 0.0f, -5.768f, -1.074f, -7.964f, -3.023f)
                curveToRelative(-0.619f, -0.55f, -0.676f, -1.498f, -0.125f, -2.118f)
                curveToRelative(0.55f, -0.619f, 1.498f, -0.676f, 2.117f, -0.125f)
                curveToRelative(1.647f, 1.461f, 3.768f, 2.267f, 5.972f, 2.267f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -2.33f, -0.917f, -4.539f, -2.494f, -6.197f)
                lineToRelative(-0.924f, 0.924f)
                curveToRelative(-0.584f, 0.584f, -1.582f, 0.17f, -1.582f, -0.655f)
                lineTo(16.0f, 1.927f)
                curveToRelative(0.0f, -0.512f, 0.415f, -0.927f, 0.927f, -0.927f)
                horizontalLineToRelative(4.145f)
                curveToRelative(0.825f, 0.0f, 1.239f, 0.998f, 0.655f, 1.582f)
                lineToRelative(-1.103f, 1.103f)
                curveToRelative(2.134f, 2.217f, 3.377f, 5.183f, 3.377f, 8.315f)
                close()
                moveTo(8.5f, 16.091f)
                curveToRelative(0.0f, 0.502f, 0.399f, 0.909f, 0.891f, 0.909f)
                horizontalLineToRelative(5.218f)
                curveToRelative(0.492f, 0.0f, 0.891f, -0.407f, 0.891f, -0.909f)
                curveToRelative(0.0f, -1.895f, -1.204f, -3.272f, -2.214f, -4.091f)
                curveToRelative(1.01f, -0.819f, 2.214f, -2.196f, 2.214f, -4.091f)
                curveToRelative(0.0f, -0.502f, -0.399f, -0.909f, -0.891f, -0.909f)
                horizontalLineToRelative(-5.218f)
                curveToRelative(-0.492f, 0.0f, -0.891f, 0.407f, -0.891f, 0.909f)
                curveToRelative(0.0f, 1.901f, 1.212f, 3.274f, 2.223f, 4.091f)
                curveToRelative(-1.012f, 0.817f, -2.223f, 2.19f, -2.223f, 4.091f)
                close()
                moveTo(5.033f, 5.506f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(1.853f, 7.506f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.853f, 13.533f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _duration!!
    }

private var _duration: ImageVector? = null
