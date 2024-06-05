package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Seller: ImageVector
    get() {
        if (_seller != null) {
            return _seller!!
        }
        _seller = Builder(name = "Seller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.978f, 16.306f)
                curveToRelative(-0.137f, 0.959f, -0.906f, 1.694f, -1.836f, 1.694f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.929f, 0.0f, -1.699f, -0.735f, -1.836f, -1.694f)
                curveToRelative(-0.028f, -0.199f, 0.018f, -0.403f, 0.095f, -0.589f)
                lineToRelative(0.355f, -0.861f)
                curveToRelative(0.463f, -1.123f, 1.558f, -1.856f, 2.773f, -1.856f)
                horizontalLineToRelative(6.509f)
                curveToRelative(1.215f, 0.0f, 2.31f, 0.733f, 2.773f, 1.856f)
                lineToRelative(0.355f, 0.861f)
                curveToRelative(0.077f, 0.186f, 0.124f, 0.39f, 0.095f, 0.589f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 2.691f, 4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(3.589f, 14.0f, 0.0f, 17.589f, 0.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _seller!!
    }

private var _seller: ImageVector? = null
