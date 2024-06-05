package me.localx.icons.rounded.bold

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

public val Icons.Bold.TrashUndo: ImageVector
    get() {
        if (_trashUndo != null) {
            return _trashUndo!!
        }
        _trashUndo = Builder(name = "TrashUndo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 3.0f)
                horizontalLineToRelative(-4.757f)
                curveToRelative(-0.619f, -1.746f, -2.287f, -3.0f, -4.243f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.956f, 0.0f, -3.624f, 1.254f, -4.243f, 3.0f)
                lineTo(1.5f, 3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.62f)
                lineToRelative(1.08f, 12.957f)
                curveToRelative(0.236f, 2.828f, 2.644f, 5.043f, 5.481f, 5.043f)
                horizontalLineToRelative(6.639f)
                curveToRelative(2.838f, 0.0f, 5.245f, -2.215f, 5.481f, -5.043f)
                lineToRelative(1.08f, -12.957f)
                horizontalLineToRelative(0.62f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.811f, 18.708f)
                curveToRelative(-0.106f, 1.286f, -1.201f, 2.292f, -2.491f, 2.292f)
                horizontalLineToRelative(-6.639f)
                curveToRelative(-1.29f, 0.0f, -2.385f, -1.007f, -2.491f, -2.292f)
                lineToRelative(-1.059f, -12.708f)
                horizontalLineToRelative(13.739f)
                lineToRelative(-1.059f, 12.708f)
                close()
                moveTo(16.0f, 14.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.597f)
                curveToRelative(0.0f, 0.863f, -1.043f, 1.295f, -1.653f, 0.685f)
                lineToRelative(-3.063f, -3.063f)
                curveToRelative(-0.378f, -0.378f, -0.378f, -0.991f, 0.0f, -1.369f)
                lineToRelative(3.063f, -3.063f)
                curveToRelative(0.61f, -0.61f, 1.653f, -0.178f, 1.653f, 0.685f)
                verticalLineToRelative(1.53f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _trashUndo!!
    }

private var _trashUndo: ImageVector? = null
