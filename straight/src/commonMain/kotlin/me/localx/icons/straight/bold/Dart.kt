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

public val Icons.Bold.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                horizontalLineToRelative(-5.121f)
                lineToRelative(-5.379f, 5.379f)
                verticalLineToRelative(6.121f)
                curveToRelative(-2.815f, 2.044f, -6.6f, 4.821f, -7.112f, 5.33f)
                arcToRelative(3.019f, 3.019f, 0.0f, false, false, -0.768f, 2.934f)
                lineToRelative(-2.1f, 2.1f)
                lineToRelative(2.121f, 2.116f)
                lineToRelative(2.1f, -2.1f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, false, 2.937f, -0.77f)
                curveToRelative(0.509f, -0.509f, 3.286f, -4.3f, 5.33f, -7.112f)
                horizontalLineToRelative(6.115f)
                lineToRelative(5.377f, -5.377f)
                verticalLineToRelative(-5.121f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 7.379f)
                lineTo(17.379f, 11.0f)
                horizontalLineToRelative(-2.258f)
                lineToRelative(4.44f, -4.439f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(-4.439f, 4.44f)
                verticalLineToRelative(-2.258f)
                lineToRelative(3.621f, -3.621f)
                horizontalLineToRelative(3.879f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
