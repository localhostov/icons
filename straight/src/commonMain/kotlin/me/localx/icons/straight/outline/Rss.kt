package me.localx.icons.straight.outline

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

public val Icons.Outline.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.905f, 0.0f)
                lineTo(3.095f, 0.0f)
                curveTo(1.389f, 0.0f, 0.0f, 1.389f, 0.0f, 3.096f)
                verticalLineToRelative(20.904f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.096f)
                curveToRelative(0.0f, -1.707f, -1.389f, -3.096f, -3.095f, -3.096f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.096f)
                curveToRelative(0.0f, -0.604f, 0.491f, -1.096f, 1.095f, -1.096f)
                horizontalLineToRelative(17.81f)
                curveToRelative(0.604f, 0.0f, 1.095f, 0.491f, 1.095f, 1.096f)
                verticalLineToRelative(18.904f)
                close()
                moveTo(8.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 19.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
                moveTo(18.5f, 19.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -6.341f, -5.159f, -11.5f, -11.5f, -11.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(7.444f, 0.0f, 13.5f, 6.056f, 13.5f, 13.5f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
