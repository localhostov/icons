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
                moveToRelative(22.657f, 7.408f)
                lineToRelative(-0.657f, -0.514f)
                lineTo(22.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.546f)
                lineTo(14.157f, 0.755f)
                curveToRelative(-1.271f, -0.993f, -3.044f, -0.994f, -4.313f, 0.0f)
                lineTo(1.343f, 7.407f)
                curveToRelative(-0.854f, 0.668f, -1.343f, 1.673f, -1.343f, 2.757f)
                verticalLineToRelative(13.824f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.824f)
                curveToRelative(0.0f, -1.084f, -0.49f, -2.089f, -1.343f, -2.756f)
                close()
                moveTo(21.0f, 20.988f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.988f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.988f)
                lineTo(3.0f, 20.988f)
                verticalLineToRelative(-10.824f)
                curveToRelative(0.0f, -0.155f, 0.07f, -0.298f, 0.192f, -0.394f)
                lineTo(11.692f, 3.119f)
                curveToRelative(0.182f, -0.143f, 0.435f, -0.142f, 0.616f, 0.0f)
                lineToRelative(8.5f, 6.652f)
                curveToRelative(0.122f, 0.095f, 0.192f, 0.239f, 0.192f, 0.394f)
                verticalLineToRelative(10.824f)
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
