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

public val Icons.Outline.ToDo: ImageVector
    get() {
        if (_toDo != null) {
            return _toDo!!
        }
        _toDo = Builder(name = "ToDo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 3.0f)
                close()
                moveTo(17.0f, 20.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.662f, 22.0f)
                curveToRelative(0.217f, -0.455f, 0.338f, -0.964f, 0.338f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(5.0f, 18.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                lineTo(5.0f, 18.0f)
                close()
                moveTo(21.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(12.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 14.586f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(11.586f)
                close()
                moveTo(8.602f, 4.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                close()
                moveTo(8.602f, 10.293f)
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
        return _toDo!!
    }

private var _toDo: ImageVector? = null
