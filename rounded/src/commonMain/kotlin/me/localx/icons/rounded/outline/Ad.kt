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

public val Icons.Outline.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(19.0f, 6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.338f)
                curveToRelative(-0.455f, -0.217f, -0.964f, -0.338f, -1.5f, -0.338f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.608f, 0.0f, 1.18f, -0.156f, 1.679f, -0.43f)
                curveToRelative(0.181f, 0.26f, 0.481f, 0.43f, 0.821f, 0.43f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(20.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.5f, 16.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.958f, 6.713f)
                curveToRelative(-0.127f, -0.423f, -0.517f, -0.713f, -0.958f, -0.713f)
                reflectiveCurveToRelative(-0.831f, 0.29f, -0.958f, 0.713f)
                lineToRelative(-3.0f, 10.0f)
                curveToRelative(-0.159f, 0.529f, 0.142f, 1.086f, 0.671f, 1.245f)
                reflectiveCurveToRelative(1.086f, -0.141f, 1.245f, -0.671f)
                lineToRelative(0.386f, -1.287f)
                horizontalLineToRelative(3.312f)
                lineToRelative(0.386f, 1.287f)
                curveToRelative(0.13f, 0.434f, 0.527f, 0.713f, 0.958f, 0.713f)
                curveToRelative(0.095f, 0.0f, 0.192f, -0.014f, 0.288f, -0.042f)
                curveToRelative(0.529f, -0.159f, 0.83f, -0.716f, 0.671f, -1.245f)
                lineToRelative(-3.0f, -10.0f)
                close()
                moveTo(6.944f, 14.0f)
                lineToRelative(1.056f, -3.52f)
                lineToRelative(1.056f, 3.52f)
                horizontalLineToRelative(-2.112f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
