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

public val Icons.Bold.HouseUser: ImageVector
    get() {
        if (_houseUser != null) {
            return _houseUser!!
        }
        _houseUser = Builder(name = "HouseUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.576f, 5.327f)
                lineTo(15.077f, 0.941f)
                curveToRelative(-1.869f, -1.262f, -4.286f, -1.262f, -6.153f, 0.0f)
                lineTo(2.424f, 5.327f)
                curveToRelative(-1.518f, 1.024f, -2.424f, 2.729f, -2.424f, 4.559f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.83f, -0.906f, -3.534f, -2.424f, -4.559f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.239f, -5.0f, 5.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -0.832f, 0.412f, -1.606f, 1.102f, -2.072f)
                lineToRelative(6.501f, -4.386f)
                curveToRelative(0.424f, -0.287f, 0.911f, -0.431f, 1.397f, -0.431f)
                reflectiveCurveToRelative(0.974f, 0.144f, 1.398f, 0.431f)
                lineToRelative(6.5f, 4.386f)
                curveToRelative(0.689f, 0.466f, 1.102f, 1.24f, 1.102f, 2.072f)
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
        return _houseUser!!
    }

private var _houseUser: ImageVector? = null
