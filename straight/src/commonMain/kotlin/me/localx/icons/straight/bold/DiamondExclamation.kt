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

public val Icons.Bold.DiamondExclamation: ImageVector
    get() {
        if (_diamondExclamation != null) {
            return _diamondExclamation!!
        }
        _diamondExclamation = Builder(name = "DiamondExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.089f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.089f)
                close()
                moveTo(10.5f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(22.969f, 14.47f)
                lineToRelative(-8.495f, 8.494f)
                curveToRelative(-0.661f, 0.661f, -1.54f, 1.025f, -2.475f, 1.025f)
                reflectiveCurveToRelative(-1.814f, -0.364f, -2.475f, -1.025f)
                lineTo(1.031f, 14.47f)
                curveToRelative(-1.365f, -1.364f, -1.365f, -3.586f, 0.0f, -4.95f)
                lineTo(9.525f, 1.025f)
                curveToRelative(1.321f, -1.322f, 3.627f, -1.322f, 4.95f, 0.0f)
                lineToRelative(8.494f, 8.494f)
                curveToRelative(1.365f, 1.364f, 1.365f, 3.586f, 0.0f, 4.95f)
                close()
                moveTo(20.848f, 11.641f)
                lineTo(12.354f, 3.146f)
                curveToRelative(-0.127f, -0.128f, -0.276f, -0.146f, -0.354f, -0.146f)
                reflectiveCurveToRelative(-0.226f, 0.019f, -0.353f, 0.146f)
                lineTo(3.152f, 11.641f)
                curveToRelative(-0.195f, 0.195f, -0.195f, 0.513f, 0.0f, 0.708f)
                lineToRelative(8.495f, 8.494f)
                curveToRelative(0.127f, 0.128f, 0.276f, 0.146f, 0.354f, 0.146f)
                reflectiveCurveToRelative(0.226f, -0.019f, 0.353f, -0.146f)
                lineToRelative(8.495f, -8.494f)
                curveToRelative(0.195f, -0.195f, 0.195f, -0.513f, 0.0f, -0.708f)
                close()
            }
        }
        .build()
        return _diamondExclamation!!
    }

private var _diamondExclamation: ImageVector? = null
