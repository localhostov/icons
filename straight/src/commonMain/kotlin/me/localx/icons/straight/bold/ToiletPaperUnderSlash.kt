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

public val Icons.Bold.ToiletPaperUnderSlash: ImageVector
    get() {
        if (_toiletPaperUnderSlash != null) {
            return _toiletPaperUnderSlash!!
        }
        _toiletPaperUnderSlash = Builder(name = "ToiletPaperUnderSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.035f, 21.0f)
                lineToRelative(2.997f, 3.0f)
                horizontalLineToRelative(-9.532f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-3.536f)
                curveToRelative(-2.841f, -0.357f, -5.0f, -3.724f, -5.0f, -7.964f)
                curveToRelative(0.0f, -0.945f, 0.114f, -1.864f, 0.323f, -2.726f)
                lineToRelative(2.679f, 2.681f)
                curveToRelative(0.0f, 0.015f, -0.002f, 0.03f, -0.002f, 0.045f)
                curveToRelative(0.0f, 2.862f, 1.32f, 5.0f, 2.5f, 5.0f)
                horizontalLineToRelative(2.542f)
                lineToRelative(2.997f, 3.0f)
                horizontalLineToRelative(-3.039f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.535f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.141f)
                lineTo(0.039f, 2.16f)
                lineTo(2.161f, 0.04f)
                lineToRelative(0.817f, 0.818f)
                curveToRelative(0.768f, -0.56f, 1.631f, -0.858f, 2.522f, -0.858f)
                horizontalLineToRelative(12.5f)
                curveToRelative(2.209f, 0.0f, 4.0f, 3.582f, 4.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, -1.892f, 0.329f, -3.63f, 0.878f, -5.0f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-0.113f, 0.0f, -0.223f, 0.02f, -0.328f, 0.054f)
                lineToRelative(9.575f, 9.584f)
                curveToRelative(-0.468f, -1.309f, -0.747f, -2.906f, -0.747f, -4.637f)
                close()
                moveTo(19.0f, 8.0f)
                curveToRelative(0.0f, -1.933f, -0.448f, -3.5f, -1.0f, -3.5f)
                reflectiveCurveToRelative(-1.0f, 1.567f, -1.0f, 3.5f)
                reflectiveCurveToRelative(0.448f, 3.5f, 1.0f, 3.5f)
                reflectiveCurveToRelative(1.0f, -1.567f, 1.0f, -3.5f)
                close()
            }
        }
        .build()
        return _toiletPaperUnderSlash!!
    }

private var _toiletPaperUnderSlash: ImageVector? = null
