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

public val Icons.Filled.MapMarkerSlash: ImageVector
    get() {
        if (_mapMarkerSlash != null) {
            return _mapMarkerSlash!!
        }
        _mapMarkerSlash = Builder(name = "MapMarkerSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 22.293f)
                lineToRelative(-3.732f, -3.732f)
                curveToRelative(1.947f, -2.052f, 3.025f, -4.721f, 3.025f, -7.561f)
                curveToRelative(0.0f, -2.938f, -1.144f, -5.701f, -3.222f, -7.778f)
                curveTo(17.7f, 1.145f, 14.938f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.84f, 0.0f, -5.51f, 1.078f, -7.561f, 3.025f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(3.158f, 7.321f)
                curveToRelative(-0.248f, -0.248f, -0.607f, -0.347f, -0.947f, -0.264f)
                curveToRelative(-0.34f, 0.084f, -0.611f, 0.34f, -0.715f, 0.674f)
                curveToRelative(-1.215f, 3.917f, -0.171f, 8.149f, 2.754f, 11.073f)
                lineToRelative(3.943f, 3.643f)
                curveToRelative(1.023f, 1.001f, 2.375f, 1.552f, 3.807f, 1.552f)
                reflectiveCurveToRelative(2.784f, -0.551f, 3.787f, -1.533f)
                lineToRelative(0.545f, -0.503f)
                curveToRelative(0.2f, -0.185f, 0.316f, -0.442f, 0.321f, -0.714f)
                curveToRelative(0.005f, -0.272f, -0.101f, -0.535f, -0.293f, -0.727f)
                lineTo(3.158f, 7.321f)
                close()
            }
        }
        .build()
        return _mapMarkerSlash!!
    }

private var _mapMarkerSlash: ImageVector? = null
