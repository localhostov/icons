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

public val Icons.Bold.ToiletPaperBlankUnder: ImageVector
    get() {
        if (_toiletPaperBlankUnder != null) {
            return _toiletPaperBlankUnder!!
        }
        _toiletPaperBlankUnder = Builder(name = "ToiletPaperBlankUnder", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 19.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -4.418f, -1.791f, -8.0f, -4.0f, -8.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.416f, 0.0f, 0.0f, 3.514f, 0.0f, 8.0f)
                curveToRelative(0.0f, 4.24f, 2.159f, 7.612f, 5.0f, 7.968f)
                verticalLineToRelative(3.532f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 4.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 1.567f, 1.0f, 3.5f)
                reflectiveCurveToRelative(-0.448f, 3.5f, -1.0f, 3.5f)
                reflectiveCurveToRelative(-1.0f, -1.567f, -1.0f, -3.5f)
                reflectiveCurveToRelative(0.448f, -3.5f, 1.0f, -3.5f)
                close()
                moveTo(5.5f, 13.0f)
                curveToRelative(-1.18f, 0.0f, -2.5f, -2.138f, -2.5f, -5.0f)
                reflectiveCurveToRelative(1.32f, -5.0f, 2.5f, -5.0f)
                horizontalLineToRelative(9.378f)
                curveToRelative(-0.549f, 1.37f, -0.878f, 3.108f, -0.878f, 5.0f)
                reflectiveCurveToRelative(0.329f, 3.63f, 0.878f, 5.0f)
                lineTo(5.5f, 13.0f)
                close()
                moveTo(9.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.345f, 0.0f, 0.68f, -0.088f, 1.0f, -0.252f)
                verticalLineToRelative(3.252f)
                curveToRelative(0.0f, 0.71f, 0.149f, 1.387f, 0.418f, 2.0f)
                horizontalLineToRelative(-9.918f)
                close()
            }
        }
        .build()
        return _toiletPaperBlankUnder!!
    }

private var _toiletPaperBlankUnder: ImageVector? = null
