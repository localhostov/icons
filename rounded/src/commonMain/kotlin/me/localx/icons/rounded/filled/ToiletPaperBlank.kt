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

public val Icons.Filled.ToiletPaperBlank: ImageVector
    get() {
        if (_toiletPaperBlank != null) {
            return _toiletPaperBlank!!
        }
        _toiletPaperBlank = Builder(name = "ToiletPaperBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                horizontalLineToRelative(9.868f)
                curveToRelative(-1.273f, 2.009f, -1.868f, 5.262f, -1.868f, 8.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(1.654f, 24.0f)
                curveToRelative(-0.912f, 0.0f, -1.654f, -0.742f, -1.654f, -1.654f)
                curveToRelative(0.0f, -0.678f, 0.437f, -1.289f, 1.112f, -1.559f)
                curveToRelative(1.146f, -0.459f, 1.888f, -1.553f, 1.888f, -2.787f)
                lineTo(3.0f, 7.5f)
                curveTo(3.0f, 3.294f, 5.196f, 0.0f, 8.0f, 0.0f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 4.694f, -1.343f, 8.5f, -3.0f, 8.5f)
                reflectiveCurveToRelative(-3.0f, -3.806f, -3.0f, -8.5f)
                reflectiveCurveTo(19.343f, 0.0f, 21.0f, 0.0f)
                reflectiveCurveToRelative(3.0f, 3.806f, 3.0f, 8.5f)
                close()
                moveTo(22.0f, 8.5f)
                curveToRelative(0.0f, -1.105f, -0.448f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.895f, -1.0f, 2.0f)
                reflectiveCurveToRelative(0.448f, 2.0f, 1.0f, 2.0f)
                reflectiveCurveToRelative(1.0f, -0.895f, 1.0f, -2.0f)
                close()
            }
        }
        .build()
        return _toiletPaperBlank!!
    }

private var _toiletPaperBlank: ImageVector? = null
