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

public val Icons.Bold.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.871f, 15.992f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-13.871f, -13.871f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(0.929f, 0.929f)
                lineToRelative(-1.879f, 1.879f)
                lineToRelative(-2.989f, -2.99f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(2.99f, 2.989f)
                lineToRelative(-3.889f, 3.889f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(7.07f, 7.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.951f, 0.0f)
                lineToRelative(7.889f, -7.889f)
                close()
                moveTo(10.939f, 20.839f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineToRelative(-7.071f, -7.071f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                lineToRelative(3.889f, -3.89f)
                lineToRelative(4.389f, 4.39f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-4.39f, -4.389f)
                lineToRelative(1.879f, -1.879f)
                lineToRelative(7.779f, 7.779f)
                close()
                moveTo(24.0f, 21.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -1.25f, 2.5f, -4.5f, 2.5f, -4.5f)
                reflectiveCurveToRelative(2.5f, 3.119f, 2.5f, 4.5f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
