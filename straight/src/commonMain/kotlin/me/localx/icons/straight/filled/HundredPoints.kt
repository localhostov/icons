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

public val Icons.Filled.HundredPoints: ImageVector
    get() {
        if (_hundredPoints != null) {
            return _hundredPoints!!
        }
        _hundredPoints = Builder(name = "HundredPoints", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.41f, 7.971f)
                lineToRelative(-1.432f, -1.397f)
                lineToRelative(2.514f, -2.573f)
                horizontalLineToRelative(1.508f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.634f)
                lineToRelative(-0.59f, 0.604f)
                close()
                moveTo(16.0f, 7.5f)
                lineTo(16.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(18.0f, 7.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 9.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(9.0f, 9.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(23.549f, 13.477f)
                lineTo(0.049f, 18.303f)
                lineToRelative(0.402f, 1.959f)
                lineToRelative(23.5f, -4.826f)
                lineToRelative(-0.402f, -1.959f)
                close()
                moveTo(23.594f, 19.049f)
                lineToRelative(-14.544f, 2.971f)
                lineToRelative(0.4f, 1.96f)
                lineToRelative(14.544f, -2.971f)
                lineToRelative(-0.4f, -1.96f)
                close()
            }
        }
        .build()
        return _hundredPoints!!
    }

private var _hundredPoints: ImageVector? = null
