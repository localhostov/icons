package me.localx.icons.straight.filled

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

public val Icons.Filled.Dagger: ImageVector
    get() {
        if (_dagger != null) {
            return _dagger!!
        }
        _dagger = Builder(name = "Dagger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 9.122f)
                lineToRelative(-3.126f, -3.126f)
                lineToRelative(4.567f, -4.567f)
                lineTo(22.562f, 0.014f)
                lineToRelative(-4.567f, 4.567f)
                lineToRelative(-3.117f, -3.117f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.464f, -3.536f, -1.464f)
                horizontalLineToRelative(-2.343f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.343f)
                curveToRelative(0.802f, 0.0f, 1.556f, 0.312f, 2.122f, 0.878f)
                lineToRelative(0.745f, 0.746f)
                lineToRelative(-7.099f, 7.108f)
                curveToRelative(-2.463f, 2.463f, -4.507f, 5.291f, -6.074f, 8.403f)
                lineToRelative(-0.898f, 1.785f)
                lineToRelative(-0.083f, 0.234f)
                curveToRelative(-0.173f, 0.784f, 0.062f, 1.592f, 0.631f, 2.16f)
                curveToRelative(0.445f, 0.445f, 1.038f, 0.687f, 1.651f, 0.687f)
                curveToRelative(0.169f, 0.0f, 0.339f, -0.019f, 0.508f, -0.056f)
                lineToRelative(2.021f, -0.982f)
                curveToRelative(3.111f, -1.567f, 5.938f, -3.61f, 8.403f, -6.075f)
                lineToRelative(7.097f, -7.107f)
                lineToRelative(0.754f, 0.754f)
                curveToRelative(0.559f, 0.559f, 0.879f, 1.332f, 0.879f, 2.121f)
                verticalLineToRelative(2.343f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.343f)
                curveToRelative(0.0f, -1.335f, -0.521f, -2.591f, -1.465f, -3.535f)
                close()
            }
        }
        .build()
        return _dagger!!
    }

private var _dagger: ImageVector? = null
