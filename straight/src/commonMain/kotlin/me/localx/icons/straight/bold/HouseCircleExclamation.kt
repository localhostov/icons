package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HouseCircleExclamation: ImageVector
    get() {
        if (_houseCircleExclamation != null) {
            return _houseCircleExclamation!!
        }
        _houseCircleExclamation = Builder(name = "HouseCircleExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.164f)
                verticalLineToRelative(2.557f)
                curveToRelative(-0.815f, -0.926f, -1.838f, -1.663f, -3.0f, -2.134f)
                verticalLineToRelative(-0.423f)
                curveToRelative(0.0f, -0.155f, -0.07f, -0.299f, -0.191f, -0.394f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(12.308f, 3.119f)
                curveToRelative(-0.182f, -0.143f, -0.435f, -0.143f, -0.616f, 0.0f)
                lineTo(3.192f, 9.771f)
                curveToRelative(-0.122f, 0.095f, -0.192f, 0.238f, -0.192f, 0.394f)
                verticalLineToRelative(10.823f)
                horizontalLineToRelative(7.582f)
                curveToRelative(0.468f, 1.161f, 1.202f, 2.184f, 2.124f, 3.0f)
                lineTo(0.0f, 23.988f)
                verticalLineToRelative(-13.823f)
                curveToRelative(0.0f, -1.084f, 0.49f, -2.089f, 1.343f, -2.757f)
                lineTo(9.843f, 0.756f)
                curveToRelative(1.27f, -0.992f, 3.043f, -0.992f, 4.313f, 0.0f)
                lineToRelative(8.501f, 6.651f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.854f, 0.668f, 1.343f, 1.673f, 1.343f, 2.757f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _houseCircleExclamation!!
    }

private var _houseCircleExclamation: ImageVector? = null
