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

public val Icons.Outline.ToDoAlt: ImageVector
    get() {
        if (_toDoAlt != null) {
            return _toDoAlt!!
        }
        _toDoAlt = Builder(name = "ToDoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(-4.171f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                close()
                moveTo(14.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(21.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.914f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 20.086f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(17.086f)
                close()
                moveTo(8.602f, 6.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                close()
                moveTo(8.602f, 12.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                close()
            }
        }
        .build()
        return _toDoAlt!!
    }

private var _toDoAlt: ImageVector? = null
