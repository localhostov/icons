package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.UserAstronaut: ImageVector
    get() {
        if (_userAstronaut != null) {
            return _userAstronaut!!
        }
        _userAstronaut = Builder(name = "UserAstronaut", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.991f, 8.082f)
                curveToRelative(0.009f, 2.124f, 1.803f, 3.918f, 4.009f, 3.918f)
                curveToRelative(2.193f, 0.0f, 3.98f, -1.774f, 4.0f, -3.964f)
                lineToRelative(-7.899f, -0.036f)
                curveToRelative(-0.068f, 0.0f, -0.097f, 0.045f, -0.109f, 0.082f)
                close()
            }
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
                curveToRelative(0.666f, 2.159f, 2.171f, 3.952f, 4.132f, 5.0f)
                horizontalLineToRelative(-2.009f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.009f)
                curveToRelative(1.961f, -1.048f, 3.466f, -2.841f, 4.132f, -5.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -0.946f, 0.862f, -2.0f, 2.101f, -2.0f)
                horizontalLineToRelative(7.899f)
                curveToRelative(1.235f, 0.0f, 2.0f, 1.038f, 2.0f, 2.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _userAstronaut!!
    }

private var _userAstronaut: ImageVector? = null
