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

public val Icons.Outline.HouseUser: ImageVector
    get() {
        if (_houseUser != null) {
            return _houseUser!!
        }
        _houseUser = Builder(name = "HouseUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.797f, 5.539f)
                lineTo(14.797f, 0.815f)
                curveToRelative(-1.699f, -1.146f, -3.895f, -1.146f, -5.594f, 0.0f)
                lineTo(2.203f, 5.539f)
                curveToRelative(-1.38f, 0.932f, -2.203f, 2.481f, -2.203f, 4.146f)
                verticalLineToRelative(9.315f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-9.315f)
                curveToRelative(0.0f, -1.664f, -0.823f, -3.214f, -2.203f, -4.146f)
                close()
                moveTo(8.0f, 22.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.315f)
                curveToRelative(0.0f, -0.999f, 0.494f, -1.929f, 1.322f, -2.487f)
                lineToRelative(7.0f, -4.724f)
                curveToRelative(0.51f, -0.344f, 1.094f, -0.516f, 1.678f, -0.516f)
                reflectiveCurveToRelative(1.168f, 0.172f, 1.678f, 0.516f)
                lineToRelative(7.0f, 4.724f)
                curveToRelative(0.828f, 0.559f, 1.322f, 1.488f, 1.322f, 2.487f)
                verticalLineToRelative(9.315f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _houseUser!!
    }

private var _houseUser: ImageVector? = null
