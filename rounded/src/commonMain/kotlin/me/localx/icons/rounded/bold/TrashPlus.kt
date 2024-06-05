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

public val Icons.Bold.TrashPlus: ImageVector
    get() {
        if (_trashPlus != null) {
            return _trashPlus!!
        }
        _trashPlus = Builder(name = "TrashPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 4.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.619f)
                lineToRelative(-1.08f, 12.957f)
                curveToRelative(-0.236f, 2.828f, -2.644f, 5.043f, -5.481f, 5.043f)
                horizontalLineToRelative(-6.639f)
                curveToRelative(-2.838f, 0.0f, -5.245f, -2.215f, -5.481f, -5.043f)
                lineToRelative(-1.08f, -12.957f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.757f)
                curveToRelative(0.619f, -1.746f, 2.287f, -3.0f, 4.243f, -3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.956f, 0.0f, 3.624f, 1.254f, 4.243f, 3.0f)
                horizontalLineToRelative(4.757f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.869f, 6.0f)
                lineTo(5.131f, 6.0f)
                lineToRelative(1.059f, 12.707f)
                curveToRelative(0.106f, 1.286f, 1.201f, 2.293f, 2.491f, 2.293f)
                horizontalLineToRelative(6.639f)
                curveToRelative(1.29f, 0.0f, 2.385f, -1.007f, 2.491f, -2.293f)
                lineToRelative(1.059f, -12.707f)
                close()
            }
        }
        .build()
        return _trashPlus!!
    }

private var _trashPlus: ImageVector? = null
