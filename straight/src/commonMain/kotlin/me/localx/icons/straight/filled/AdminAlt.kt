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

public val Icons.Filled.AdminAlt: ImageVector
    get() {
        if (_adminAlt != null) {
            return _adminAlt!!
        }
        _adminAlt = Builder(name = "AdminAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(22.5f, 18.0f)
                curveToRelative(0.0f, -0.46f, -0.089f, -0.895f, -0.218f, -1.313f)
                lineToRelative(1.416f, -0.816f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.411f, 0.813f)
                curveToRelative(-0.605f, -0.652f, -1.393f, -1.125f, -2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(-0.896f, 0.205f, -1.685f, 0.678f, -2.289f, 1.33f)
                lineToRelative(-1.411f, -0.813f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(1.416f, 0.816f)
                curveToRelative(-0.129f, 0.418f, -0.218f, 0.853f, -0.218f, 1.313f)
                reflectiveCurveToRelative(0.089f, 0.895f, 0.218f, 1.313f)
                lineToRelative(-1.416f, 0.816f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(1.411f, -0.813f)
                curveToRelative(0.605f, 0.652f, 1.393f, 1.125f, 2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(0.896f, -0.205f, 1.685f, -0.678f, 2.289f, -1.33f)
                lineToRelative(1.411f, 0.813f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.416f, -0.816f)
                curveToRelative(0.129f, -0.418f, 0.218f, -0.853f, 0.218f, -1.313f)
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -1.459f, 0.397f, -2.822f, 1.079f, -4.0f)
                horizontalLineToRelative(-6.579f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(12.721f)
                curveToRelative(-1.665f, -1.466f, -2.721f, -3.607f, -2.721f, -6.0f)
                close()
            }
        }
        .build()
        return _adminAlt!!
    }

private var _adminAlt: ImageVector? = null
