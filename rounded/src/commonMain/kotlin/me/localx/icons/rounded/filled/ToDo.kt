package me.localx.icons.rounded.filled

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
                curveToRelative(-0.213f, 0.0f, -0.426f, -0.081f, -0.589f, -0.244f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(-0.787f, -0.787f, -1.221f, -1.833f, -1.221f, -2.947f)
                lineTo(19.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(11.619f)
                curveToRelative(0.0f, 1.113f, -0.434f, 2.16f, -1.221f, 2.947f)
                lineToRelative(-0.69f, 0.69f)
                curveToRelative(-0.163f, 0.163f, -0.376f, 0.244f, -0.589f, 0.244f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.791f, 0.0f, 0.0f, 1.791f, 0.0f, 4.0f)
                verticalLineToRelative(17.357f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.499f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.0f)
                lineTo(17.0f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(9.727f, 11.207f)
                lineToRelative(-2.179f, 2.179f)
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
                close()
                moveTo(9.727f, 5.207f)
                lineToRelative(-2.179f, 2.179f)
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
                close()
                moveTo(17.0f, 24.0f)
                lineTo(6.24f, 24.0f)
                curveToRelative(0.48f, -0.716f, 0.76f, -1.576f, 0.76f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _toDo!!
    }

private var _toDo: ImageVector? = null
