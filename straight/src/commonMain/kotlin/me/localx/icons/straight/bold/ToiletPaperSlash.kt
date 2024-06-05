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

public val Icons.Bold.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -3.582f, 4.0f, -8.0f)
                reflectiveCurveTo(22.209f, 0.0f, 20.0f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveToRelative(-1.342f, 0.0f, -2.579f, 0.651f, -3.548f, 1.831f)
                lineTo(2.16f, 0.039f)
                lineTo(0.039f, 2.16f)
                lineToRelative(21.801f, 21.801f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-4.961f, -4.961f)
                verticalLineToRelative(-0.879f)
                close()
                moveTo(21.0f, 8.0f)
                curveToRelative(0.0f, 1.657f, -0.448f, 3.0f, -1.0f, 3.0f)
                reflectiveCurveToRelative(-1.0f, -1.343f, -1.0f, -3.0f)
                reflectiveCurveToRelative(0.448f, -3.0f, 1.0f, -3.0f)
                reflectiveCurveToRelative(1.0f, 1.343f, 1.0f, 3.0f)
                close()
                moveTo(7.5f, 3.0f)
                horizontalLineToRelative(9.378f)
                curveToRelative(-0.549f, 1.37f, -0.878f, 3.108f, -0.878f, 5.0f)
                verticalLineToRelative(5.879f)
                lineTo(6.093f, 3.972f)
                curveToRelative(0.431f, -0.613f, 0.939f, -0.972f, 1.407f, -0.972f)
                close()
                moveTo(15.585f, 20.534f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(-0.817f, 0.83f, -1.952f, 1.345f, -3.206f, 1.345f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.34f, 0.015f, -0.677f, 0.042f, -1.009f)
                lineToRelative(2.958f, 2.958f)
                verticalLineToRelative(9.051f)
                curveToRelative(0.0f, 0.711f, -0.149f, 1.388f, -0.418f, 2.0f)
                horizontalLineToRelative(9.918f)
                curveToRelative(0.426f, 0.0f, 0.812f, -0.179f, 1.085f, -0.466f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
