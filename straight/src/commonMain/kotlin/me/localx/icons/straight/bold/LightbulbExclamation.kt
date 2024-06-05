package me.localx.icons.straight.bold

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

public val Icons.Bold.LightbulbExclamation: ImageVector
    get() {
        if (_lightbulbExclamation != null) {
            return _lightbulbExclamation!!
        }
        _lightbulbExclamation = Builder(name = "LightbulbExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.988f, 2.287f)
                curveTo(16.079f, 0.581f, 13.519f, -0.228f, 10.951f, 0.059f)
                curveTo(6.899f, 0.517f, 3.585f, 3.783f, 3.068f, 7.825f)
                curveToRelative(-0.359f, 2.83f, 0.859f, 6.01f, 3.106f, 8.102f)
                curveToRelative(1.173f, 1.092f, 1.819f, 2.466f, 1.819f, 3.87f)
                verticalLineToRelative(4.204f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.048f)
                curveToRelative(0.0f, -1.422f, 0.83f, -3.223f, 1.933f, -4.188f)
                curveToRelative(1.949f, -1.709f, 3.067f, -4.175f, 3.067f, -6.764f)
                curveToRelative(0.0f, -2.56f, -1.096f, -5.007f, -3.006f, -6.713f)
                close()
                moveTo(15.949f, 13.508f)
                curveToRelative(-1.278f, 1.12f, -2.253f, 2.784f, -2.695f, 4.492f)
                horizontalLineToRelative(-2.474f)
                curveToRelative(-0.38f, -1.58f, -1.257f, -3.055f, -2.561f, -4.269f)
                curveToRelative(-1.239f, -1.153f, -2.448f, -3.375f, -2.174f, -5.526f)
                curveToRelative(0.343f, -2.688f, 2.548f, -4.86f, 5.243f, -5.165f)
                curveToRelative(1.743f, -0.199f, 3.41f, 0.33f, 4.701f, 1.484f)
                curveToRelative(1.274f, 1.138f, 2.005f, 2.77f, 2.005f, 4.476f)
                curveToRelative(0.0f, 1.725f, -0.745f, 3.368f, -2.045f, 4.508f)
                close()
                moveTo(10.5f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _lightbulbExclamation!!
    }

private var _lightbulbExclamation: ImageVector? = null
