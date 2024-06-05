package me.localx.icons.straight.bold

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

public val Icons.Bold.ToiletPaperBlank: ImageVector
    get() {
        if (_toiletPaperBlank != null) {
            return _toiletPaperBlank!!
        }
        _toiletPaperBlank = Builder(name = "ToiletPaperBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveTo(4.416f, 0.0f, 2.0f, 3.514f, 2.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(14.5f, 24.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -3.582f, 4.0f, -8.0f)
                reflectiveCurveTo(22.209f, 0.0f, 20.0f, 0.0f)
                close()
                moveTo(16.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(4.582f, 21.0f)
                curveToRelative(0.269f, -0.612f, 0.418f, -1.289f, 0.418f, -2.0f)
                lineTo(5.0f, 8.0f)
                curveToRelative(0.0f, -2.861f, 1.32f, -5.0f, 2.5f, -5.0f)
                horizontalLineToRelative(9.378f)
                curveToRelative(-0.549f, 1.37f, -0.878f, 3.108f, -0.878f, 5.0f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(20.0f, 11.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -1.567f, -1.0f, -3.5f)
                reflectiveCurveToRelative(0.448f, -3.5f, 1.0f, -3.5f)
                reflectiveCurveToRelative(1.0f, 1.567f, 1.0f, 3.5f)
                reflectiveCurveToRelative(-0.448f, 3.5f, -1.0f, 3.5f)
                close()
            }
        }
        .build()
        return _toiletPaperBlank!!
    }

private var _toiletPaperBlank: ImageVector? = null
