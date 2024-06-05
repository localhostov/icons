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

public val Icons.Outline.StarShooting: ImageVector
    get() {
        if (_starShooting != null) {
            return _starShooting!!
        }
        _starShooting = Builder(name = "StarShooting", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 1.694f)
                lineToRelative(-10.0f, 10.0f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineTo(22.293f, 0.28f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(8.0f, 8.987f)
                curveToRelative(0.256f, 0.0f, 0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                close()
                moveTo(20.293f, 10.28f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                close()
                moveTo(11.0f, 15.987f)
                horizontalLineToRelative(-3.001f)
                lineToRelative(-1.062f, -2.852f)
                curveToRelative(-0.146f, -0.391f, -0.52f, -0.651f, -0.937f, -0.651f)
                reflectiveCurveToRelative(-0.792f, 0.26f, -0.937f, 0.651f)
                lineToRelative(-1.062f, 2.852f)
                lineTo(1.0f, 15.987f)
                curveToRelative(-0.419f, 0.0f, -0.794f, 0.262f, -0.938f, 0.655f)
                curveToRelative(-0.145f, 0.394f, -0.028f, 0.835f, 0.292f, 1.107f)
                lineToRelative(2.377f, 1.934f)
                lineToRelative(-0.941f, 3.016f)
                curveToRelative(-0.127f, 0.405f, 0.015f, 0.846f, 0.354f, 1.101f)
                curveToRelative(0.177f, 0.133f, 0.388f, 0.2f, 0.6f, 0.2f)
                curveToRelative(0.194f, 0.0f, 0.388f, -0.056f, 0.556f, -0.169f)
                lineToRelative(2.708f, -1.812f)
                lineToRelative(2.754f, 1.793f)
                curveToRelative(0.355f, 0.231f, 0.819f, 0.213f, 1.156f, -0.046f)
                curveToRelative(0.337f, -0.259f, 0.473f, -0.703f, 0.339f, -1.106f)
                lineToRelative(-0.979f, -2.98f)
                lineToRelative(2.366f, -1.927f)
                curveToRelative(0.321f, -0.271f, 0.439f, -0.713f, 0.295f, -1.108f)
                reflectiveCurveToRelative(-0.52f, -0.657f, -0.939f, -0.657f)
                close()
            }
        }
        .build()
        return _starShooting!!
    }

private var _starShooting: ImageVector? = null
