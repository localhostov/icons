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

public val Icons.Filled.Cello: ImageVector
    get() {
        if (_cello != null) {
            return _cello!!
        }
        _cello = Builder(name = "Cello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.707f, 14.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(7.221f, -7.221f)
                curveToRelative(-1.604f, -1.295f, -3.644f, -2.072f, -5.862f, -2.072f)
                curveToRelative(-0.087f, 0.0f, -0.174f, 0.0f, -0.256f, 0.005f)
                curveToRelative(-1.384f, 0.048f, -2.56f, 0.998f, -2.857f, 2.31f)
                curveToRelative(-0.197f, 0.87f, -0.636f, 1.664f, -1.27f, 2.298f)
                curveToRelative(-0.838f, 0.838f, -1.952f, 1.329f, -3.135f, 1.383f)
                curveToRelative(-1.245f, 0.056f, -2.345f, 0.929f, -2.736f, 2.173f)
                curveToRelative(-0.265f, 0.842f, -0.398f, 1.678f, -0.398f, 2.484f)
                curveToRelative(0.0f, 2.218f, 0.777f, 4.257f, 2.072f, 5.862f)
                lineToRelative(3.221f, -3.221f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-3.221f, 3.221f)
                curveToRelative(1.604f, 1.295f, 3.644f, 2.072f, 5.862f, 2.072f)
                curveToRelative(0.801f, 0.0f, 1.63f, -0.132f, 2.466f, -0.393f)
                curveToRelative(1.271f, -0.396f, 2.17f, -1.566f, 2.188f, -2.847f)
                curveToRelative(0.016f, -1.241f, 0.509f, -2.408f, 1.387f, -3.287f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.63f, -0.632f, 1.421f, -1.07f, 2.286f, -1.269f)
                curveToRelative(1.343f, -0.307f, 2.321f, -1.499f, 2.325f, -2.857f)
                curveToRelative(0.0f, -2.218f, -0.777f, -4.257f, -2.072f, -5.862f)
                lineToRelative(-7.221f, 7.221f)
                close()
                moveTo(17.928f, 7.486f)
                lineToRelative(5.779f, -5.779f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-5.779f, 5.779f)
                curveToRelative(0.52f, 0.42f, 0.994f, 0.894f, 1.414f, 1.414f)
                close()
                moveTo(2.072f, 20.514f)
                lineToRelative(-1.779f, 1.779f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(1.779f, -1.779f)
                curveToRelative(-0.52f, -0.42f, -0.994f, -0.894f, -1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _cello!!
    }

private var _cello: ImageVector? = null
