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

public val Icons.Filled.Mistletoe: ImageVector
    get() {
        if (_mistletoe != null) {
            return _mistletoe!!
        }
        _mistletoe = Builder(name = "Mistletoe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 5.983f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(12.975f, 9.216f)
                curveTo(12.743f, 5.576f, 10.71f, 0.343f, 1.021f, 0.0f)
                curveTo(0.462f, -0.019f, 0.0f, 0.442f, 0.0f, 1.002f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.545f, 0.439f, 0.978f, 0.984f, 0.998f)
                curveToRelative(6.3f, 0.224f, 9.649f, 2.65f, 9.982f, 7.215f)
                curveTo(8.152f, 10.093f, 0.249f, 13.161f, 0.006f, 19.674f)
                curveToRelative(-0.077f, 2.054f, 1.337f, 3.951f, 3.369f, 4.261f)
                curveToRelative(2.481f, 0.378f, 4.625f, -1.542f, 4.625f, -3.952f)
                curveToRelative(0.0f, -4.922f, 2.788f, -7.752f, 3.997f, -8.748f)
                curveToRelative(1.192f, 0.992f, 3.981f, 3.826f, 4.003f, 8.688f)
                curveToRelative(0.009f, 2.012f, 1.517f, 3.795f, 3.516f, 4.031f)
                curveToRelative(2.421f, 0.286f, 4.484f, -1.606f, 4.484f, -3.971f)
                curveToRelative(0.0f, -6.945f, -8.437f, -9.994f, -11.025f, -10.767f)
                close()
                moveTo(8.0f, 6.983f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _mistletoe!!
    }

private var _mistletoe: ImageVector? = null
