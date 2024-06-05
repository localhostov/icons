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

public val Icons.Bold.TrashCheck: ImageVector
    get() {
        if (_trashCheck != null) {
            return _trashCheck!!
        }
        _trashCheck = Builder(name = "TrashCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.637f, 11.028f)
                curveToRelative(0.568f, 0.604f, 0.54f, 1.553f, -0.063f, 2.12f)
                lineToRelative(-3.046f, 2.867f)
                curveToRelative(-0.661f, 0.652f, -1.541f, 0.98f, -2.424f, 0.98f)
                reflectiveCurveToRelative(-1.776f, -0.33f, -2.455f, -0.992f)
                lineToRelative(-1.167f, -1.023f)
                curveToRelative(-0.622f, -0.547f, -0.684f, -1.495f, -0.136f, -2.117f)
                curveToRelative(0.546f, -0.621f, 1.494f, -0.683f, 2.117f, -0.137f)
                lineToRelative(1.226f, 1.077f)
                curveToRelative(0.251f, 0.243f, 0.565f, 0.243f, 0.759f, 0.052f)
                lineToRelative(3.071f, -2.891f)
                curveToRelative(0.604f, -0.568f, 1.552f, -0.541f, 2.12f, 0.063f)
                close()
                moveTo(24.058f, 4.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.619f)
                lineToRelative(-1.08f, 12.957f)
                curveToRelative(-0.236f, 2.828f, -2.644f, 5.043f, -5.481f, 5.043f)
                horizontalLineToRelative(-6.639f)
                curveToRelative(-2.838f, 0.0f, -5.246f, -2.215f, -5.481f, -5.043f)
                lineToRelative(-1.08f, -12.957f)
                horizontalLineToRelative(-0.62f)
                curveTo(0.729f, 6.0f, 0.058f, 5.328f, 0.058f, 4.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.757f)
                curveToRelative(0.619f, -1.746f, 2.287f, -3.0f, 4.243f, -3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.956f, 0.0f, 3.624f, 1.254f, 4.243f, 3.0f)
                horizontalLineToRelative(4.757f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.927f, 6.0f)
                lineTo(5.188f, 6.0f)
                lineToRelative(1.059f, 12.707f)
                curveToRelative(0.107f, 1.286f, 1.202f, 2.293f, 2.492f, 2.293f)
                horizontalLineToRelative(6.639f)
                curveToRelative(1.29f, 0.0f, 2.385f, -1.007f, 2.491f, -2.293f)
                lineToRelative(1.059f, -12.707f)
                close()
            }
        }
        .build()
        return _trashCheck!!
    }

private var _trashCheck: ImageVector? = null
