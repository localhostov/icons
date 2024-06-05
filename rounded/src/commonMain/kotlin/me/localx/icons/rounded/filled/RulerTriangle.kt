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

public val Icons.Filled.RulerTriangle: ImageVector
    get() {
        if (_rulerTriangle != null) {
            return _rulerTriangle!!
        }
        _rulerTriangle = Builder(name = "RulerTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.824f, 17.179f)
                lineToRelative(-1.611f, -1.611f)
                lineToRelative(-2.322f, 2.322f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.322f, -2.322f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.323f, 2.323f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.323f, -2.323f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.323f, 2.323f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.323f, -2.323f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(-2.322f, 2.322f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.322f, -2.322f)
                lineToRelative(-1.466f, -1.466f)
                lineToRelative(-2.323f, 2.323f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.323f, -2.323f)
                lineToRelative(-1.611f, -1.611f)
                curveTo(5.656f, 0.012f, 3.986f, -0.322f, 2.467f, 0.311f)
                curveTo(0.945f, 0.94f, 0.0f, 2.354f, 0.0f, 4.002f)
                verticalLineToRelative(14.991f)
                curveToRelative(0.0f, 2.761f, 2.246f, 5.007f, 5.007f, 5.007f)
                horizontalLineToRelative(14.991f)
                curveToRelative(1.646f, 0.0f, 3.061f, -0.945f, 3.691f, -2.467f)
                reflectiveCurveToRelative(0.298f, -3.189f, -0.866f, -4.354f)
                close()
                moveTo(12.424f, 17.383f)
                curveToRelative(-0.155f, 0.374f, -0.52f, 0.617f, -0.924f, 0.617f)
                lineTo(7.0f, 18.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.404f, 0.244f, -0.77f, 0.617f, -0.924f)
                curveToRelative(0.374f, -0.157f, 0.804f, -0.07f, 1.09f, 0.217f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.286f, 0.286f, 0.372f, 0.716f, 0.217f, 1.09f)
                close()
            }
        }
        .build()
        return _rulerTriangle!!
    }

private var _rulerTriangle: ImageVector? = null
