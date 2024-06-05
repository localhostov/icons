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
                moveTo(21.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 3.806f, -3.0f, 8.5f)
                reflectiveCurveToRelative(1.343f, 8.5f, 3.0f, 8.5f)
                reflectiveCurveToRelative(3.0f, -3.806f, 3.0f, -8.5f)
                reflectiveCurveTo(22.657f, 0.0f, 21.0f, 0.0f)
                close()
                moveTo(21.0f, 10.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.895f, -1.0f, -2.0f)
                reflectiveCurveToRelative(0.448f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(-0.448f, 2.0f, -1.0f, 2.0f)
                close()
                moveTo(16.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(2.0f, 7.5f)
                curveTo(2.0f, 3.294f, 4.196f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.868f)
                curveToRelative(-1.273f, 2.009f, -1.868f, 5.262f, -1.868f, 8.5f)
                verticalLineToRelative(11.5f)
                close()
            }
        }
        .build()
        return _toiletPaperBlank!!
    }

private var _toiletPaperBlank: ImageVector? = null
