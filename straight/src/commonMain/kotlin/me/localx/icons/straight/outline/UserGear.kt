package me.localx.icons.straight.outline

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

public val Icons.Outline.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -0.552f, -0.09f, -1.082f, -0.256f, -1.579f)
                lineToRelative(1.82f, -1.049f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.823f, 1.05f)
                curveToRelative(-0.706f, -0.797f, -1.662f, -1.368f, -2.743f, -1.589f)
                verticalLineToRelative(-2.101f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(-1.082f, 0.221f, -2.037f, 0.792f, -2.743f, 1.589f)
                lineToRelative(-1.823f, -1.05f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(1.82f, 1.049f)
                curveToRelative(-0.166f, 0.497f, -0.256f, 1.027f, -0.256f, 1.579f)
                reflectiveCurveToRelative(0.09f, 1.082f, 0.256f, 1.579f)
                lineToRelative(-1.82f, 1.049f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(1.823f, -1.05f)
                curveToRelative(0.706f, 0.797f, 1.662f, 1.368f, 2.743f, 1.589f)
                verticalLineToRelative(2.101f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.101f)
                curveToRelative(1.082f, -0.221f, 2.037f, -0.792f, 2.743f, -1.589f)
                lineToRelative(1.823f, 1.05f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.82f, -1.049f)
                curveToRelative(0.166f, -0.497f, 0.256f, -1.027f, 0.256f, -1.579f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
