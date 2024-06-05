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

public val Icons.Outline.HouseChimneyWindow: ImageVector
    get() {
        if (_houseChimneyWindow != null) {
            return _houseChimneyWindow!!
        }
        _houseChimneyWindow = Builder(name = "HouseChimneyWindow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(10.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 5.724f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.367f)
                lineTo(14.797f, 0.855f)
                curveToRelative(-1.699f, -1.146f, -3.895f, -1.146f, -5.594f, 0.0f)
                lineTo(2.204f, 5.579f)
                curveToRelative(-1.38f, 0.931f, -2.204f, 2.479f, -2.204f, 4.145f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 9.724f)
                curveToRelative(0.0f, -1.581f, -0.744f, -3.058f, -2.0f, -3.999f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 9.724f)
                curveToRelative(0.0f, -0.999f, 0.494f, -1.928f, 1.322f, -2.486f)
                lineTo(10.322f, 2.514f)
                curveToRelative(0.51f, -0.345f, 1.094f, -0.517f, 1.678f, -0.517f)
                reflectiveCurveToRelative(1.168f, 0.172f, 1.678f, 0.517f)
                lineToRelative(7.0f, 4.724f)
                curveToRelative(0.828f, 0.559f, 1.322f, 1.487f, 1.322f, 2.486f)
                verticalLineToRelative(9.276f)
                close()
            }
        }
        .build()
        return _houseChimneyWindow!!
    }

private var _houseChimneyWindow: ImageVector? = null
