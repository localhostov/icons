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

public val Icons.Bold.ToDoAlt: ImageVector
    get() {
        if (_toDoAlt != null) {
            return _toDoAlt!!
        }
        _toDoAlt = Builder(name = "ToDoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.394f, 0.0f, -2.6f, 0.818f, -3.162f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-4.338f)
                curveToRelative(-0.562f, -1.182f, -1.769f, -2.0f, -3.162f, -2.0f)
                close()
                moveTo(15.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(24.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(20.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(9.478f, 6.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.827f, 2.827f)
                curveToRelative(-0.407f, 0.407f, -0.942f, 0.611f, -1.478f, 0.611f)
                reflectiveCurveToRelative(-1.07f, -0.204f, -1.478f, -0.611f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.004f, 1.004f)
                lineToRelative(2.184f, -2.184f)
                close()
                moveTo(9.478f, 12.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.827f, 2.827f)
                curveToRelative(-0.407f, 0.407f, -0.942f, 0.611f, -1.478f, 0.611f)
                reflectiveCurveToRelative(-1.07f, -0.204f, -1.478f, -0.611f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.004f, 1.004f)
                lineToRelative(2.184f, -2.184f)
                close()
            }
        }
        .build()
        return _toDoAlt!!
    }

private var _toDoAlt: ImageVector? = null
