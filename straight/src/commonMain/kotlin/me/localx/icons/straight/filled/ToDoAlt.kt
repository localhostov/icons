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

public val Icons.Filled.ToDoAlt: ImageVector
    get() {
        if (_toDoAlt != null) {
            return _toDoAlt!!
        }
        _toDoAlt = Builder(name = "ToDoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 24.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(19.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(19.0f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(12.829f, 2.0f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-4.171f)
                close()
                moveTo(7.188f, 16.534f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                close()
                moveTo(7.188f, 10.534f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                close()
            }
        }
        .build()
        return _toDoAlt!!
    }

private var _toDoAlt: ImageVector? = null
