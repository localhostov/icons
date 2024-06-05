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

public val Icons.Bold.TablePivot: ImageVector
    get() {
        if (_tablePivot != null) {
            return _tablePivot!!
        }
        _tablePivot = Builder(name = "TablePivot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                lineTo(0.025f, 7.0f)
                curveTo(0.264f, 4.366f, 2.366f, 2.264f, 5.0f, 2.025f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(10.5f, 19.0f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-0.171f, 0.0f, -0.338f, -0.018f, -0.5f, -0.051f)
                lineTo(5.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.798f, 13.566f)
                lineToRelative(-2.082f, -2.082f)
                curveToRelative(-0.646f, -0.646f, -1.694f, -0.646f, -2.34f, 0.0f)
                lineToRelative(-2.082f, 2.082f)
                curveToRelative(-0.529f, 0.529f, -0.154f, 1.434f, 0.594f, 1.434f)
                horizontalLineToRelative(1.112f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.158f)
                curveToRelative(0.0f, -0.749f, -0.904f, -1.123f, -1.433f, -0.594f)
                lineToRelative(-2.082f, 2.082f)
                curveToRelative(-0.646f, 0.646f, -0.646f, 1.694f, 0.0f, 2.34f)
                lineToRelative(2.082f, 2.082f)
                curveToRelative(0.529f, 0.529f, 1.433f, 0.154f, 1.433f, -0.594f)
                verticalLineToRelative(-1.158f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.204f)
                curveToRelative(0.749f, 0.0f, 1.123f, -0.905f, 0.594f, -1.434f)
                close()
            }
        }
        .build()
        return _tablePivot!!
    }

private var _tablePivot: ImageVector? = null
