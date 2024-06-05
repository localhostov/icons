package me.localx.icons.rounded.filled

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

public val Icons.Filled.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.103f, 21.517f)
                curveToRelative(-0.734f, 0.312f, -1.529f, 0.483f, -2.343f, 0.483f)
                horizontalLineTo(3.414f)
                lineToRelative(-1.707f, 1.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.707f, -1.707f)
                verticalLineToRelative(-4.346f)
                curveToRelative(0.0f, -0.814f, 0.171f, -1.609f, 0.483f, -2.344f)
                lineToRelative(7.62f, 7.62f)
                close()
                moveTo(22.682f, 1.705f)
                lineToRelative(-0.387f, -0.387f)
                curveToRelative(-1.662f, -1.662f, -4.357f, -1.757f, -6.136f, -0.212f)
                lineTo(4.007f, 11.762f)
                curveToRelative(-0.147f, 0.131f, -0.285f, 0.27f, -0.417f, 0.414f)
                lineToRelative(8.234f, 8.234f)
                curveToRelative(0.145f, -0.134f, 0.286f, -0.274f, 0.419f, -0.423f)
                lineTo(22.897f, 7.837f)
                curveToRelative(1.543f, -1.776f, 1.447f, -4.47f, -0.216f, -6.133f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
