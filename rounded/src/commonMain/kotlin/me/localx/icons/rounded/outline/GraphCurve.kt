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

public val Icons.Outline.GraphCurve: ImageVector
    get() {
        if (_graphCurve != null) {
            return _graphCurve!!
        }
        _graphCurve = Builder(name = "GraphCurve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineTo(1.0f)
                curveTo(0.0f, 0.447f, 0.448f, 0.0f, 1.0f, 0.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(16.451f)
                curveToRelative(2.581f, -7.138f, 9.904f, -12.451f, 18.0f, -12.451f)
                horizontalLineToRelative(1.001f)
                lineToRelative(-2.218f, -2.277f)
                curveToRelative(-0.385f, -0.396f, -0.377f, -1.028f, 0.019f, -1.414f)
                curveToRelative(0.395f, -0.383f, 1.029f, -0.379f, 1.414f, 0.02f)
                lineToRelative(3.207f, 3.293f)
                curveToRelative(0.373f, 0.372f, 0.561f, 0.862f, 0.572f, 1.357f)
                curveToRelative(0.0f, 0.008f, 0.004f, 0.014f, 0.004f, 0.022f)
                curveToRelative(0.0f, 0.003f, -0.002f, 0.005f, -0.002f, 0.008f)
                curveToRelative(0.004f, 0.517f, -0.19f, 1.037f, -0.584f, 1.431f)
                lineToRelative(-3.25f, 3.25f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.275f, -2.275f)
                horizontalLineToRelative(-1.025f)
                curveToRelative(-8.433f, 0.0f, -15.937f, 6.396f, -16.887f, 14.313f)
                curveToRelative(0.517f, 0.423f, 1.168f, 0.687f, 1.887f, 0.687f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _graphCurve!!
    }

private var _graphCurve: ImageVector? = null
