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
                moveToRelative(22.657f, 7.407f)
                lineTo(14.157f, 0.756f)
                curveToRelative(-1.271f, -0.994f, -3.043f, -0.992f, -4.314f, 0.0f)
                lineTo(1.344f, 7.407f)
                curveToRelative(-0.854f, 0.668f, -1.344f, 1.673f, -1.344f, 2.757f)
                verticalLineToRelative(13.823f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.823f)
                curveToRelative(0.0f, -1.084f, -0.489f, -2.089f, -1.343f, -2.757f)
                close()
                moveTo(21.0f, 20.987f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.987f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.987f)
                lineTo(3.0f, 20.987f)
                verticalLineToRelative(-10.823f)
                curveToRelative(0.0f, -0.155f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineTo(11.692f, 3.119f)
                curveToRelative(0.182f, -0.143f, 0.436f, -0.143f, 0.615f, 0.0f)
                lineToRelative(8.501f, 6.651f)
                curveToRelative(0.121f, 0.095f, 0.191f, 0.238f, 0.191f, 0.394f)
                verticalLineToRelative(10.823f)
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
