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

public val Icons.Outline.Invest: ImageVector
    get() {
        if (_invest != null) {
            return _invest!!
        }
        _invest = Builder(name = "Invest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 6.525f)
                verticalLineToRelative(2.16f)
                curveToRelative(2.361f, 1.126f, 4.0f, 3.53f, 4.0f, 6.315f)
                curveToRelative(0.0f, 1.57f, -0.52f, 3.021f, -1.396f, 4.19f)
                lineToRelative(-4.604f, -4.604f)
                verticalLineTo(3.0f)
                lineToRelative(1.596f, 1.596f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.596f, -2.596f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.577f, 2.577f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.577f, -1.577f)
                verticalLineToRelative(3.056f)
                curveToRelative(-4.494f, 0.499f, -8.0f, 4.32f, -8.0f, 8.944f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -3.909f, -2.51f, -7.235f, -6.0f, -8.475f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(0.0f, -3.52f, 2.612f, -6.442f, 6.0f, -6.928f)
                verticalLineToRelative(7.342f)
                lineToRelative(5.19f, 5.19f)
                curveToRelative(-1.169f, 0.876f, -2.62f, 1.396f, -4.19f, 1.396f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _invest!!
    }

private var _invest: ImageVector? = null
