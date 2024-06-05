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

public val Icons.Filled.Lion: ImageVector
    get() {
        if (_lion != null) {
            return _lion!!
        }
        _lion = Builder(name = "Lion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.837f, 19.474f)
                lineToRelative(2.163f, 1.492f)
                verticalLineToRelative(3.035f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.354f)
                curveToRelative(-0.1f, -0.329f, -0.202f, -0.63f, -0.301f, -0.919f)
                curveToRelative(-0.29f, -0.854f, -0.564f, -1.675f, -0.661f, -2.806f)
                curveToRelative(-0.567f, 1.051f, -1.039f, 2.646f, -1.039f, 5.079f)
                lineTo(0.0f, 20.001f)
                curveToRelative(0.0f, -6.522f, 3.095f, -8.375f, 4.146f, -8.817f)
                curveToRelative(0.63f, -0.64f, 1.482f, -1.044f, 2.437f, -1.142f)
                curveToRelative(0.22f, 1.419f, 0.968f, 3.372f, 3.216f, 5.058f)
                lineToRelative(3.2f, 2.4f)
                verticalLineToRelative(-0.605f)
                curveToRelative(0.828f, 0.928f, 1.776f, 1.82f, 2.837f, 2.579f)
                close()
                moveTo(23.0f, 6.0f)
                lineToRelative(-1.121f, -0.985f)
                curveToRelative(-0.292f, -0.009f, -0.573f, -0.015f, -0.831f, -0.015f)
                curveToRelative(-1.709f, 0.0f, -3.048f, 1.297f, -3.048f, 2.952f)
                curveToRelative(0.0f, 1.681f, 1.367f, 3.048f, 3.048f, 3.048f)
                horizontalLineToRelative(0.952f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.0f, -1.0f)
                close()
                moveTo(16.0f, 7.952f)
                curveToRelative(0.0f, -2.777f, 2.361f, -4.951f, 5.192f, -4.951f)
                curveToRelative(-1.036f, -1.794f, -2.971f, -3.001f, -5.192f, -3.001f)
                curveToRelative(-2.972f, 0.0f, -6.5f, 1.5f, -8.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-1.582f, 0.85f, -2.5f, 2.5f, -2.5f, 4.0f)
                curveToRelative(0.0f, 1.232f, 0.5f, 3.0f, 2.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.297f, 1.04f, 2.5f, 5.346f, 6.0f, 7.846f)
                curveToRelative(0.0f, 0.0f, 1.845f, -2.419f, 3.147f, -4.937f)
                curveToRelative(-2.354f, -0.427f, -4.147f, -2.482f, -4.147f, -4.957f)
                close()
            }
        }
        .build()
        return _lion!!
    }

private var _lion: ImageVector? = null
