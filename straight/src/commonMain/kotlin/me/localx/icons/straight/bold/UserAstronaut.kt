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

public val Icons.Bold.UserAstronaut: ImageVector
    get() {
        if (_userAstronaut != null) {
            return _userAstronaut!!
        }
        _userAstronaut = Builder(name = "UserAstronaut", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 11.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.525f)
                curveTo(19.236f, 2.51f, 15.91f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.764f, 2.51f, 3.525f, 6.0f)
                horizontalLineToRelative(-1.525f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.232f)
                curveToRelative(0.36f, 1.579f, 1.136f, 2.997f, 2.206f, 4.14f)
                curveToRelative(-1.968f, 0.48f, -3.438f, 2.246f, -3.438f, 4.36f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -2.114f, -1.47f, -3.88f, -3.438f, -4.36f)
                curveToRelative(1.07f, -1.143f, 1.846f, -2.562f, 2.206f, -4.14f)
                horizontalLineToRelative(1.232f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(7.0f, 8.0f)
                curveToRelative(0.0f, -0.343f, 0.357f, -1.0f, 1.101f, -1.0f)
                horizontalLineToRelative(7.899f)
                curveToRelative(0.716f, 0.0f, 1.0f, 0.657f, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _userAstronaut!!
    }

private var _userAstronaut: ImageVector? = null
