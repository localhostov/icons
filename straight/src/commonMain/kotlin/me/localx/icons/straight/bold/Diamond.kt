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

public val Icons.Bold.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.365f, 6.134f)
                lineToRelative(-3.365f, -4.718f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, false, -2.779f, -1.428f)
                horizontalLineToRelative(-10.442f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, false, -2.774f, 1.428f)
                lineToRelative(-3.371f, 4.719f)
                arcToRelative(3.434f, 3.434f, 0.0f, false, false, 0.109f, 4.105f)
                lineToRelative(11.257f, 13.87f)
                lineToRelative(11.271f, -13.888f)
                arcToRelative(3.427f, 3.427f, 0.0f, false, false, 0.094f, -4.088f)
                close()
                moveTo(3.076f, 7.878f)
                lineTo(6.446f, 3.16f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.333f, -0.172f)
                horizontalLineToRelative(2.921f)
                lineToRelative(-1.425f, 5.512f)
                horizontalLineToRelative(7.45f)
                lineToRelative(-1.425f, -5.512f)
                horizontalLineToRelative(2.923f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.333f, 0.172f)
                lineToRelative(3.369f, 4.717f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, 0.005f, 0.473f)
                lineToRelative(-0.122f, 0.15f)
                horizontalLineToRelative(-5.083f)
                lineToRelative(-3.725f, 10.848f)
                lineToRelative(-3.725f, -10.848f)
                horizontalLineToRelative(-5.081f)
                lineToRelative(-0.107f, -0.132f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, -0.011f, -0.49f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
