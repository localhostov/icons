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

public val Icons.Bold.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.566f, 19.0f)
                lineToRelative(-4.236f, 4.629f)
                curveToRelative(-0.443f, 0.494f, -1.217f, 0.494f, -1.66f, 0.0f)
                lineToRelative(-4.236f, -4.629f)
                horizontalLineToRelative(3.566f)
                verticalLineToRelative(-10.25f)
                curveToRelative(0.0f, -0.965f, -0.785f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.785f, -1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 2.619f, -2.131f, 4.75f, -4.75f, 4.75f)
                reflectiveCurveToRelative(-4.75f, -2.131f, -4.75f, -4.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(0.434f)
                lineTo(4.67f, 0.371f)
                curveToRelative(0.443f, -0.494f, 1.217f, -0.494f, 1.66f, 0.0f)
                lineToRelative(4.236f, 4.629f)
                horizontalLineToRelative(-3.566f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.965f, 0.785f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.785f, 1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -2.619f, 2.131f, -4.75f, 4.75f, -4.75f)
                reflectiveCurveToRelative(4.75f, 2.131f, 4.75f, 4.75f)
                verticalLineToRelative(10.25f)
                horizontalLineToRelative(3.566f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null
