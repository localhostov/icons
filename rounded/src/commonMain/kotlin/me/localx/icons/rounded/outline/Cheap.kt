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

public val Icons.Outline.Cheap: ImageVector
    get() {
        if (_cheap != null) {
            return _cheap!!
        }
        _cheap = Builder(name = "Cheap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.994f, 19.11f)
                curveToRelative(-0.057f, 0.512f, -0.49f, 0.89f, -0.993f, 0.89f)
                curveTo(3.933f, 19.439f, 0.0f, 15.137f, 0.0f, 10.0f)
                curveTo(0.0f, 4.486f, 4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(1.561f, 0.0f, 3.056f, 0.35f, 4.445f, 1.04f)
                curveToRelative(0.495f, 0.246f, 0.696f, 0.846f, 0.451f, 1.34f)
                curveToRelative(-0.245f, 0.495f, -0.845f, 0.698f, -1.34f, 0.451f)
                curveToRelative(-1.11f, -0.551f, -2.307f, -0.831f, -3.556f, -0.831f)
                curveTo(5.589f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 4.116f, 3.057f, 7.558f, 7.11f, 8.006f)
                curveToRelative(0.549f, 0.061f, 0.945f, 0.555f, 0.884f, 1.104f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(23.707f, 18.174f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.293f, 3.293f)
                lineTo(19.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(20.366f)
                lineToRelative(-3.293f, -3.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.024f, 0.0f, 1.414f)
                lineToRelative(3.636f, 3.636f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.121f, 0.877f)
                reflectiveCurveToRelative(1.536f, -0.292f, 2.121f, -0.877f)
                lineToRelative(3.536f, -3.536f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _cheap!!
    }

private var _cheap: ImageVector? = null
