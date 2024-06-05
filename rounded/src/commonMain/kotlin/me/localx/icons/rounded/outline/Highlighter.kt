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

public val Icons.Outline.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.682f, 1.705f)
                lineToRelative(-0.387f, -0.387f)
                curveToRelative(-1.662f, -1.662f, -4.357f, -1.757f, -6.136f, -0.212f)
                lineTo(4.007f, 11.762f)
                curveToRelative(-1.275f, 1.137f, -2.007f, 2.769f, -2.007f, 4.478f)
                verticalLineToRelative(4.346f)
                lineToRelative(-1.707f, 1.707f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(1.707f, -1.707f)
                horizontalLineTo(7.76f)
                curveToRelative(1.709f, 0.0f, 3.341f, -0.731f, 4.483f, -2.013f)
                lineTo(22.897f, 7.837f)
                curveToRelative(1.543f, -1.776f, 1.447f, -4.47f, -0.216f, -6.133f)
                close()
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-3.76f)
                curveToRelative(0.0f, -0.253f, 0.033f, -0.502f, 0.079f, -0.747f)
                lineToRelative(4.427f, 4.427f)
                curveToRelative(-0.245f, 0.047f, -0.494f, 0.079f, -0.747f, 0.079f)
                horizontalLineToRelative(-3.76f)
                close()
                moveTo(21.391f, 6.522f)
                lineToRelative(-10.646f, 12.141f)
                curveToRelative(-0.106f, 0.119f, -0.232f, 0.213f, -0.35f, 0.318f)
                lineToRelative(-5.376f, -5.376f)
                curveToRelative(0.103f, -0.116f, 0.195f, -0.24f, 0.312f, -0.344f)
                lineTo(17.474f, 2.612f)
                curveToRelative(0.986f, -0.856f, 2.482f, -0.805f, 3.407f, 0.12f)
                lineToRelative(0.387f, 0.387f)
                curveToRelative(0.924f, 0.924f, 0.977f, 2.42f, 0.123f, 3.404f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
