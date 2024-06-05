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

public val Icons.Filled.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.762f, 22.157f)
                curveToRelative(0.87f, 0.498f, 0.57f, 1.706f, -0.448f, 1.792f)
                curveToRelative(-0.447f, 0.037f, -0.902f, 0.052f, -1.375f, 0.052f)
                curveTo(4.767f, 24.001f, -1.636f, 16.974f, 0.371f, 9.079f)
                curveTo(1.857f, 3.237f, 7.8f, -0.463f, 14.248f, 0.048f)
                curveToRelative(0.037f, 0.003f, 0.074f, 0.006f, 0.111f, 0.009f)
                curveToRelative(0.993f, 0.087f, 1.247f, 1.302f, 0.399f, 1.788f)
                curveToRelative(-3.675f, 2.107f, -6.758f, 5.851f, -6.758f, 10.155f)
                reflectiveCurveToRelative(3.085f, 8.05f, 6.762f, 10.157f)
                close()
                moveTo(16.75f, 16.562f)
                lineToRelative(2.257f, -1.51f)
                lineToRelative(2.295f, 1.495f)
                curveToRelative(0.296f, 0.192f, 0.682f, 0.177f, 0.964f, -0.038f)
                curveToRelative(0.281f, -0.216f, 0.394f, -0.586f, 0.282f, -0.922f)
                lineToRelative(-0.815f, -2.484f)
                lineToRelative(1.971f, -1.606f)
                curveToRelative(0.268f, -0.225f, 0.366f, -0.594f, 0.246f, -0.923f)
                reflectiveCurveToRelative(-0.433f, -0.548f, -0.783f, -0.548f)
                horizontalLineToRelative(-2.501f)
                lineToRelative(-0.885f, -2.483f)
                curveToRelative(-0.121f, -0.326f, -0.433f, -0.542f, -0.781f, -0.542f)
                reflectiveCurveToRelative(-0.66f, 0.216f, -0.781f, 0.542f)
                lineToRelative(-0.885f, 2.483f)
                horizontalLineToRelative(-2.501f)
                curveToRelative(-0.35f, 0.0f, -0.662f, 0.218f, -0.782f, 0.546f)
                curveToRelative(-0.121f, 0.328f, -0.024f, 0.696f, 0.243f, 0.922f)
                lineToRelative(1.981f, 1.612f)
                lineToRelative(-0.784f, 2.513f)
                curveToRelative(-0.106f, 0.337f, 0.012f, 0.705f, 0.295f, 0.917f)
                curveToRelative(0.148f, 0.111f, 0.323f, 0.166f, 0.5f, 0.166f)
                curveToRelative(0.162f, 0.0f, 0.323f, -0.047f, 0.463f, -0.141f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
