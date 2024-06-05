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

public val Icons.Filled.HexagonDivide: ImageVector
    get() {
        if (_hexagonDivide != null) {
            return _hexagonDivide!!
        }
        _hexagonDivide = Builder(name = "HexagonDivide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.396f, 9.636f)
                lineToRelative(-3.28f, -6.0f)
                curveToRelative(-0.89f, -1.626f, -2.61f, -2.636f, -4.491f, -2.636f)
                horizontalLineToRelative(-7.229f)
                curveToRelative(-1.877f, 0.0f, -3.596f, 1.007f, -4.487f, 2.628f)
                lineTo(0.61f, 9.632f)
                curveToRelative(-0.815f, 1.486f, -0.815f, 3.261f, 0.002f, 4.746f)
                lineToRelative(3.295f, 5.996f)
                curveToRelative(0.891f, 1.62f, 2.608f, 2.627f, 4.485f, 2.627f)
                horizontalLineToRelative(7.231f)
                curveToRelative(1.881f, 0.0f, 3.602f, -1.01f, 4.49f, -2.636f)
                lineToRelative(3.282f, -6.0f)
                curveToRelative(0.809f, -1.48f, 0.809f, -3.248f, 0.0f, -4.728f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _hexagonDivide!!
    }

private var _hexagonDivide: ImageVector? = null
