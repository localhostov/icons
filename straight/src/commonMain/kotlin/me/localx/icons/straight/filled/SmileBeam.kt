package me.localx.icons.straight.filled

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

public val Icons.Filled.SmileBeam: ImageVector
    get() {
        if (_smileBeam != null) {
            return _smileBeam!!
        }
        _smileBeam = Builder(name = "SmileBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.894f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(1.768f, 0.0f, 3.0f, 2.108f, 3.0f, 4.0f)
                lineTo(9.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.666f, -2.254f)
                lineToRelative(1.332f, -1.492f)
                arcToRelative(6.359f, 6.359f, 0.0f, false, false, 8.67f, 0.0f)
                lineToRelative(1.33f, 1.493f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 18.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(13.0f, 11.0f)
                curveToRelative(0.249f, -5.287f, 5.753f, -5.28f, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
