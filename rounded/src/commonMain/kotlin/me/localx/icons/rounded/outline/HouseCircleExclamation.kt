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

public val Icons.Outline.HouseCircleExclamation: ImageVector
    get() {
        if (_houseCircleExclamation != null) {
            return _houseCircleExclamation!!
        }
        _houseCircleExclamation = Builder(name = "HouseCircleExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(16.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(18.5f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.204f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.203f, 4.893f)
                curveToRelative(0.99f, 0.748f, 1.692f, 1.844f, 1.918f, 3.07f)
                curveToRelative(0.101f, 0.543f, -0.259f, 1.064f, -0.802f, 1.165f)
                curveToRelative(-0.541f, 0.103f, -1.065f, -0.259f, -1.165f, -0.802f)
                curveToRelative(-0.146f, -0.788f, -0.609f, -1.497f, -1.272f, -1.944f)
                lineToRelative(-7.001f, -4.724f)
                curveToRelative(-1.02f, -0.689f, -2.336f, -0.689f, -3.355f, 0.0f)
                lineTo(3.322f, 7.237f)
                curveToRelative(-0.828f, 0.559f, -1.322f, 1.487f, -1.322f, 2.486f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _houseCircleExclamation!!
    }

private var _houseCircleExclamation: ImageVector? = null
