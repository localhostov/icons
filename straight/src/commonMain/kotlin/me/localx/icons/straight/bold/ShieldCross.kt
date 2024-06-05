package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ShieldCross: ImageVector
    get() {
        if (_shieldCross != null) {
            return _shieldCross!!
        }
        _shieldCross = Builder(name = "ShieldCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.679f, 2.555f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-7.678f, 2.555f)
                curveToRelative(-1.389f, 0.462f, -2.322f, 1.757f, -2.322f, 3.223f)
                verticalLineToRelative(6.185f)
                curveToRelative(0.0f, 6.542f, 6.852f, 10.489f, 8.952f, 11.543f)
                lineToRelative(0.984f, 0.494f)
                lineToRelative(1.021f, -0.412f)
                curveToRelative(2.122f, -0.857f, 9.043f, -4.226f, 9.043f, -11.624f)
                verticalLineToRelative(-6.185f)
                curveToRelative(0.0f, -1.466f, -0.933f, -2.762f, -2.321f, -3.223f)
                close()
                moveTo(19.0f, 11.963f)
                curveToRelative(0.0f, 5.279f, -5.032f, 7.925f, -6.932f, 8.734f)
                curveToRelative(-1.926f, -1.002f, -7.068f, -4.113f, -7.068f, -8.734f)
                verticalLineToRelative(-6.185f)
                curveToRelative(0.0f, -0.166f, 0.106f, -0.312f, 0.266f, -0.365f)
                lineToRelative(6.734f, -2.242f)
                lineToRelative(6.735f, 2.242f)
                curveToRelative(0.161f, 0.053f, 0.265f, 0.197f, 0.265f, 0.365f)
                verticalLineToRelative(6.185f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 5.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-3.5f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(3.5f, 0.0f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(3.5f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-3.5f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _shieldCross!!
    }

private var _shieldCross: ImageVector? = null
