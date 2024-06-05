package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(16.5f, 18.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(16.0f, 4.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-7.0f)
                curveTo(2.019f, 0.0f, 0.0f, 2.019f, 0.0f, 4.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.93f, 1.569f, 3.499f, 3.498f, 3.5f)
                horizontalLineToRelative(12.502f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                lineTo(2.0f, 4.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(17.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.662f, 22.0f)
                curveToRelative(0.217f, -0.455f, 0.338f, -0.964f, 0.338f, -1.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 1.336f, 0.521f, 2.592f, 1.465f, 3.536f)
                lineToRelative(0.828f, 0.828f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(0.828f, -0.828f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 13.343f)
                curveToRelative(0.0f, 0.802f, -0.313f, 1.556f, -0.879f, 2.122f)
                lineToRelative(-0.121f, 0.121f)
                lineToRelative(-0.121f, -0.121f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.32f, -0.879f, -2.122f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(10.343f)
                close()
                moveTo(3.293f, 7.097f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.288f, 1.289f)
                curveToRelative(0.033f, 0.033f, 0.105f, 0.033f, 0.139f, 0.0f)
                lineToRelative(2.179f, -2.179f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.179f, 2.179f)
                curveToRelative(-0.409f, 0.409f, -0.946f, 0.613f, -1.483f, 0.613f)
                reflectiveCurveToRelative(-1.074f, -0.204f, -1.483f, -0.613f)
                lineToRelative(-1.288f, -1.289f)
                close()
                moveTo(7.548f, 14.386f)
                curveToRelative(-0.409f, 0.409f, -0.946f, 0.613f, -1.483f, 0.613f)
                reflectiveCurveToRelative(-1.074f, -0.204f, -1.483f, -0.613f)
                lineToRelative(-1.288f, -1.289f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.288f, 1.289f)
                curveToRelative(0.033f, 0.033f, 0.105f, 0.033f, 0.139f, 0.0f)
                lineToRelative(2.179f, -2.179f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.179f, 2.179f)
                close()
            }
        }
        .build()
        return _toDo!!
    }

private var _toDo: ImageVector? = null
