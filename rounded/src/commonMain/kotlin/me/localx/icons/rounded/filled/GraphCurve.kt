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

public val Icons.Filled.GraphCurve: ImageVector
    get() {
        if (_graphCurve != null) {
            return _graphCurve!!
        }
        _graphCurve = Builder(name = "GraphCurve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.719f, 0.0f, -1.37f, -0.264f, -1.887f, -0.687f)
                curveToRelative(0.95f, -7.917f, 8.454f, -14.313f, 16.887f, -14.313f)
                horizontalLineToRelative(1.025f)
                lineToRelative(-2.275f, 2.275f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(3.25f, -3.25f)
                curveToRelative(0.395f, -0.394f, 0.588f, -0.914f, 0.584f, -1.431f)
                curveToRelative(0.0f, -0.003f, 0.002f, -0.005f, 0.002f, -0.008f)
                curveToRelative(0.0f, -0.008f, -0.004f, -0.014f, -0.004f, -0.022f)
                curveToRelative(-0.011f, -0.494f, -0.199f, -0.984f, -0.572f, -1.357f)
                lineToRelative(-3.207f, -3.293f)
                curveToRelative(-0.385f, -0.398f, -1.019f, -0.402f, -1.414f, -0.02f)
                curveToRelative(-0.396f, 0.386f, -0.404f, 1.019f, -0.019f, 1.414f)
                lineToRelative(2.218f, 2.277f)
                horizontalLineToRelative(-1.001f)
                curveToRelative(-8.096f, 0.0f, -15.419f, 5.313f, -18.0f, 12.451f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(0.0f, 0.447f, 0.0f, 1.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _graphCurve!!
    }

private var _graphCurve: ImageVector? = null
