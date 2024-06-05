package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.707f, 9.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                close()
                moveTo(22.18f, 12.924f)
                lineToRelative(-1.24f, 1.281f)
                curveToRelative(0.187f, 0.884f, -0.06f, 1.842f, -0.745f, 2.527f)
                lineToRelative(-6.244f, 6.449f)
                curveToRelative(-0.532f, 0.532f, -1.225f, 0.819f, -1.962f, 0.819f)
                reflectiveCurveToRelative(-1.43f, -0.287f, -1.95f, -0.808f)
                lineTo(1.025f, 14.18f)
                lineTo(2.034f, 5.057f)
                lineToRelative(9.137f, -1.25f)
                lineToRelative(8.663f, 8.663f)
                lineToRelative(0.92f, -0.95f)
                curveToRelative(0.308f, -0.307f, 0.308f, -0.788f, 0.012f, -1.084f)
                lineTo(12.435f, 2.107f)
                lineToRelative(-7.255f, 0.937f)
                lineToRelative(-0.256f, -1.983f)
                lineTo(13.153f, -0.002f)
                lineToRelative(9.026f, 9.026f)
                curveToRelative(1.075f, 1.075f, 1.075f, 2.825f, 0.0f, 3.901f)
                close()
                moveTo(18.781f, 14.245f)
                lineTo(10.458f, 5.924f)
                lineToRelative(-6.607f, 0.904f)
                lineToRelative(-0.731f, 6.617f)
                lineToRelative(8.333f, 8.333f)
                curveToRelative(0.287f, 0.287f, 0.785f, 0.287f, 1.072f, 0.0f)
                lineToRelative(6.244f, -6.449f)
                curveToRelative(0.308f, -0.307f, 0.308f, -0.788f, 0.012f, -1.084f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
