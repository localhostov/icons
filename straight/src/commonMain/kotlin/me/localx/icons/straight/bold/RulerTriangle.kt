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

public val Icons.Bold.RulerTriangle: ImageVector
    get() {
        if (_rulerTriangle != null) {
            return _rulerTriangle!!
        }
        _rulerTriangle = Builder(name = "RulerTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.162f, 19.131f)
                lineTo(4.87f, 0.839f)
                curveTo(4.051f, 0.021f, 2.831f, -0.222f, 1.761f, 0.22f)
                curveTo(0.691f, 0.663f, 0.0f, 1.697f, 0.0f, 2.855f)
                lineTo(0.0f, 24.0f)
                lineTo(21.145f, 24.0f)
                curveToRelative(1.158f, 0.0f, 2.192f, -0.691f, 2.635f, -1.761f)
                curveToRelative(0.443f, -1.069f, 0.201f, -2.289f, -0.618f, -3.108f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(3.0f, 3.212f)
                lineToRelative(3.945f, 3.945f)
                lineToRelative(-1.394f, 1.394f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.394f, -1.394f)
                lineToRelative(1.768f, 1.768f)
                lineToRelative(-1.394f, 1.394f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.394f, -1.394f)
                lineToRelative(1.768f, 1.768f)
                lineToRelative(-1.394f, 1.394f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.394f, -1.394f)
                lineToRelative(3.945f, 3.945f)
                lineTo(3.0f, 21.001f)
                close()
                moveTo(6.0f, 12.0f)
                lineToRelative(6.0f, 6.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _rulerTriangle!!
    }

private var _rulerTriangle: ImageVector? = null
