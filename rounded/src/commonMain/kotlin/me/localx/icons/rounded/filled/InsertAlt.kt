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

public val Icons.Filled.InsertAlt: ImageVector
    get() {
        if (_insertAlt != null) {
            return _insertAlt!!
        }
        _insertAlt = Builder(name = "InsertAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-14.036f)
                lineToRelative(3.243f, 3.243f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-4.243f, -4.243f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.048f, 0.0f, -2.828f)
                lineToRelative(4.243f, -4.243f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-3.243f, 3.243f)
                horizontalLineToRelative(14.036f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(22.614f, 15.068f)
                curveToRelative(-0.516f, -0.201f, -1.095f, 0.054f, -1.295f, 0.568f)
                curveToRelative(-1.51f, 3.866f, -5.167f, 6.364f, -9.318f, 6.364f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.151f, 0.0f, 7.809f, 2.498f, 9.318f, 6.364f)
                curveToRelative(0.201f, 0.514f, 0.778f, 0.768f, 1.295f, 0.568f)
                curveToRelative(0.515f, -0.201f, 0.769f, -0.781f, 0.568f, -1.295f)
                curveTo(21.37f, 2.998f, 16.981f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(4.981f, 0.0f, 9.37f, -2.998f, 11.182f, -7.636f)
                curveToRelative(0.201f, -0.515f, -0.053f, -1.094f, -0.568f, -1.295f)
                close()
            }
        }
        .build()
        return _insertAlt!!
    }

private var _insertAlt: ImageVector? = null
