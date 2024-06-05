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

public val Icons.Filled.PenFancySlash: ImageVector
    get() {
        if (_penFancySlash != null) {
            return _penFancySlash!!
        }
        _penFancySlash = Builder(name = "PenFancySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(9.204f, 9.204f)
                lineTo(19.666f, 0.742f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.479f, 0.479f, 0.744f, 1.117f, 0.744f, 1.795f)
                reflectiveCurveToRelative(-0.264f, 1.316f, -0.744f, 1.795f)
                lineToRelative(-8.755f, 8.755f)
                lineToRelative(9.206f, 9.206f)
                close()
                moveTo(4.676f, 12.321f)
                curveToRelative(-1.438f, 0.452f, -2.546f, 1.645f, -2.891f, 3.113f)
                lineTo(0.123f, 22.526f)
                lineToRelative(5.202f, -5.202f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-5.202f, 5.202f)
                lineToRelative(7.093f, -1.663f)
                curveToRelative(1.468f, -0.345f, 2.66f, -1.452f, 3.112f, -2.89f)
                lineToRelative(0.846f, -2.692f)
                lineToRelative(-5.205f, -5.205f)
                lineToRelative(-2.708f, 0.83f)
                close()
            }
        }
        .build()
        return _penFancySlash!!
    }

private var _penFancySlash: ImageVector? = null
