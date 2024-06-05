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

public val Icons.Filled.ToDo: ImageVector
    get() {
        if (_toDo != null) {
            return _toDo!!
        }
        _toDo = Builder(name = "ToDo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 18.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(19.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(14.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(18.357f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.499f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(12.0f)
                lineTo(17.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(6.774f, 13.534f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                close()
                moveTo(6.774f, 7.534f)
                curveToRelative(-0.31f, 0.31f, -0.717f, 0.465f, -1.124f, 0.465f)
                reflectiveCurveToRelative(-0.814f, -0.155f, -1.124f, -0.465f)
                lineToRelative(-1.647f, -1.647f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.357f, 1.357f)
                lineToRelative(2.537f, -2.537f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.827f, 2.827f)
                close()
                moveTo(20.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                reflectiveCurveToRelative(-13.0f, 0.0f, -13.0f, 0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.924f, -0.28f, 1.784f, -0.76f, 2.5f)
                horizontalLineToRelative(10.76f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _toDo!!
    }

private var _toDo: ImageVector? = null
