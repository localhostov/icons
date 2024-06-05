package me.localx.icons.straight.filled

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

public val Icons.Filled.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 2.691f, 5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveTo(3.0f, 9.309f, 3.0f, 6.0f)
                close()
                moveTo(21.724f, 18.567f)
                lineToRelative(1.841f, 1.06f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(-0.706f, 0.796f, -1.646f, 1.378f, -2.726f, 1.598f)
                verticalLineToRelative(2.101f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.101f)
                curveToRelative(-1.08f, -0.22f, -2.021f, -0.802f, -2.726f, -1.598f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(1.841f, -1.06f)
                curveToRelative(-0.165f, -0.496f, -0.276f, -1.016f, -0.276f, -1.567f)
                reflectiveCurveToRelative(0.111f, -1.071f, 0.276f, -1.567f)
                lineToRelative(-1.841f, -1.06f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(0.706f, -0.796f, 1.646f, -1.378f, 2.726f, -1.598f)
                verticalLineToRelative(-2.101f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(1.08f, 0.22f, 2.021f, 0.802f, 2.726f, 1.598f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(-1.841f, 1.06f)
                curveToRelative(0.165f, 0.496f, 0.276f, 1.016f, 0.276f, 1.567f)
                reflectiveCurveToRelative(-0.111f, 1.071f, -0.276f, 1.567f)
                close()
                moveTo(18.5f, 17.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
                moveTo(8.0f, 17.0f)
                curveToRelative(0.0f, -1.054f, 0.19f, -2.06f, 0.523f, -3.0f)
                horizontalLineToRelative(-3.523f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                lineTo(11.349f, 24.0f)
                curveToRelative(-2.041f, -1.65f, -3.349f, -4.171f, -3.349f, -7.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
