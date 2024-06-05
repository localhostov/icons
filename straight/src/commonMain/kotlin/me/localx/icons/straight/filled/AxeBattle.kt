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

public val Icons.Filled.AxeBattle: ImageVector
    get() {
        if (_axeBattle != null) {
            return _axeBattle!!
        }
        _axeBattle = Builder(name = "AxeBattle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 3.944f)
                verticalLineToRelative(12.103f)
                curveToRelative(-2.279f, 0.217f, -4.378f, 1.177f, -5.992f, 2.757f)
                lineToRelative(-0.7f, 0.685f)
                lineToRelative(-0.7f, -0.685f)
                curveTo(1.349f, 16.592f, 0.0f, 13.302f, 0.0f, 10.004f)
                curveTo(0.0f, 6.634f, 1.383f, 3.187f, 3.609f, 1.007f)
                lineToRelative(0.7f, -0.685f)
                lineToRelative(0.7f, 0.685f)
                curveToRelative(1.712f, 1.676f, 3.809f, 2.697f, 5.992f, 2.938f)
                close()
                moveTo(20.391f, 1.007f)
                lineToRelative(-0.7f, -0.685f)
                lineToRelative(-0.7f, 0.685f)
                curveToRelative(-1.712f, 1.676f, -3.809f, 2.697f, -5.992f, 2.938f)
                verticalLineToRelative(12.103f)
                curveToRelative(2.279f, 0.217f, 4.378f, 1.177f, 5.992f, 2.757f)
                lineToRelative(0.7f, 0.685f)
                lineToRelative(0.7f, -0.685f)
                curveToRelative(2.26f, -2.212f, 3.609f, -5.502f, 3.609f, -8.8f)
                curveToRelative(0.0f, -3.371f, -1.383f, -6.818f, -3.609f, -8.997f)
                close()
                moveTo(13.0f, 3.944f)
                verticalLineToRelative(-1.944f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.944f)
                curveToRelative(0.332f, 0.037f, 0.665f, 0.056f, 1.0f, 0.056f)
                reflectiveCurveToRelative(0.668f, -0.019f, 1.0f, -0.056f)
                close()
                moveTo(11.0f, 16.047f)
                verticalLineToRelative(7.952f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.952f)
                curveToRelative(-0.33f, -0.031f, -0.664f, -0.048f, -1.0f, -0.048f)
                reflectiveCurveToRelative(-0.67f, 0.016f, -1.0f, 0.048f)
                close()
            }
        }
        .build()
        return _axeBattle!!
    }

private var _axeBattle: ImageVector? = null
