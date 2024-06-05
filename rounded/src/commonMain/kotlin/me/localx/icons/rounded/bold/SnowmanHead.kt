package me.localx.icons.rounded.bold

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

public val Icons.Bold.SnowmanHead: ImageVector
    get() {
        if (_snowmanHead != null) {
            return _snowmanHead!!
        }
        _snowmanHead = Builder(name = "SnowmanHead", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.447f)
                curveToRelative(-0.613f, 1.237f, -0.947f, 2.607f, -0.947f, 4.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.393f, -0.334f, -2.763f, -0.947f, -4.0f)
                horizontalLineToRelative(0.447f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.577f, 1.433f, -3.913f, 1.478f, -4.0f)
                horizontalLineToRelative(9.044f)
                curveToRelative(0.045f, 0.087f, 1.478f, 1.692f, 1.478f, 4.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(10.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 16.495f)
                curveToRelative(0.0f, 0.398f, -0.192f, 1.818f, -0.71f, 2.958f)
                curveToRelative(-0.339f, 0.747f, -1.248f, 0.75f, -1.581f, 0.0f)
                curveToRelative(-0.517f, -1.166f, -0.71f, -2.56f, -0.71f, -2.958f)
                curveToRelative(0.0f, -0.826f, 0.672f, -1.495f, 1.5f, -1.495f)
                reflectiveCurveToRelative(1.5f, 0.669f, 1.5f, 1.495f)
                close()
            }
        }
        .build()
        return _snowmanHead!!
    }

private var _snowmanHead: ImageVector? = null
