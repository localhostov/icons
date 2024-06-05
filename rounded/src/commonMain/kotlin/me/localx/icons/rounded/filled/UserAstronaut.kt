package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

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
                moveToRelative(20.124f, 11.0f)
                horizontalLineToRelative(0.376f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.376f)
                curveTo(19.053f, 2.53f, 15.817f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.947f, 2.53f, 3.876f, 6.0f)
                horizontalLineToRelative(-0.376f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.376f)
                curveToRelative(0.679f, 2.202f, 2.232f, 4.022f, 4.25f, 5.061f)
                curveToRelative(-3.448f, 0.432f, -6.126f, 3.377f, -6.126f, 6.939f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -3.563f, -2.678f, -6.507f, -6.126f, -6.939f)
                curveToRelative(2.018f, -1.039f, 3.571f, -2.859f, 4.25f, -5.061f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -0.946f, 0.862f, -2.0f, 2.101f, -2.0f)
                horizontalLineToRelative(7.899f)
                curveToRelative(1.235f, 0.0f, 2.0f, 1.038f, 2.0f, 2.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
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
                moveToRelative(15.0f, 22.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _userAstronaut!!
    }

private var _userAstronaut: ImageVector? = null
