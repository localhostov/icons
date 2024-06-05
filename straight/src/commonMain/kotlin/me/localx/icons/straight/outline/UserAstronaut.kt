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

public val Icons.Outline.UserAstronaut: ImageVector
    get() {
        if (_userAstronaut != null) {
            return _userAstronaut!!
        }
        _userAstronaut = Builder(name = "UserAstronaut", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.124f, 11.0f)
                horizontalLineToRelative(1.876f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.876f)
                curveTo(19.053f, 2.53f, 15.817f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.947f, 2.53f, 3.876f, 6.0f)
                horizontalLineToRelative(-1.876f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.876f)
                curveToRelative(0.487f, 1.579f, 1.424f, 2.96f, 2.658f, 4.0f)
                horizontalLineToRelative(-0.534f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-0.534f)
                curveToRelative(1.234f, -1.04f, 2.171f, -2.421f, 2.658f, -4.0f)
                close()
                moveTo(5.5f, 8.5f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.916f, -6.5f, -6.5f)
                close()
                moveTo(18.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.343f, 0.357f, -1.0f, 1.101f, -1.0f)
                horizontalLineToRelative(7.899f)
                curveToRelative(0.716f, 0.0f, 1.0f, 0.657f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _userAstronaut!!
    }

private var _userAstronaut: ImageVector? = null
