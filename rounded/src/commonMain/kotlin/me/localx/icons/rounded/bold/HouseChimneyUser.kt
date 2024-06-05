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

public val Icons.Bold.HouseChimneyUser: ImageVector
    get() {
        if (_houseChimneyUser != null) {
            return _houseChimneyUser!!
        }
        _houseChimneyUser = Builder(name = "HouseChimneyUser", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.644f)
                verticalLineToRelative(-3.144f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.089f)
                lineToRelative(-3.924f, -2.648f)
                curveToRelative(-1.869f, -1.261f, -4.284f, -1.26f, -6.152f, 0.0f)
                lineTo(2.424f, 5.327f)
                curveToRelative(-1.518f, 1.024f, -2.424f, 2.728f, -2.424f, 4.559f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.654f, -0.739f, -3.203f, -2.0f, -4.242f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.239f, -5.0f, 5.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -0.832f, 0.412f, -1.607f, 1.102f, -2.073f)
                lineToRelative(6.5f, -4.386f)
                curveToRelative(0.425f, -0.287f, 0.912f, -0.43f, 1.398f, -0.43f)
                reflectiveCurveToRelative(0.974f, 0.144f, 1.398f, 0.43f)
                lineToRelative(6.5f, 4.386f)
                curveToRelative(0.69f, 0.466f, 1.102f, 1.241f, 1.102f, 2.073f)
                verticalLineToRelative(8.614f)
                close()
                moveTo(15.0f, 11.0f)
                curveToRelative(0.0f, 1.655f, -1.345f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.345f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.345f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.345f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _houseChimneyUser!!
    }

private var _houseChimneyUser: ImageVector? = null
