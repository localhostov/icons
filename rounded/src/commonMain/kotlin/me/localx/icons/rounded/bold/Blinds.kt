package me.localx.icons.rounded.bold

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

public val Icons.Bold.Blinds: ImageVector
    get() {
        if (_blinds != null) {
            return _blinds!!
        }
        _blinds = Builder(name = "Blinds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.338f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                lineTo(13.5f, 23.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(15.5f, 18.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(17.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.338f)
                curveToRelative(-1.181f, 0.563f, -2.0f, 1.769f, -2.0f, 3.162f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.393f, -0.819f, -2.599f, -2.0f, -3.162f)
                close()
                moveTo(14.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(14.0f, 8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(14.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                lineTo(14.0f, 3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _blinds!!
    }

private var _blinds: ImageVector? = null
