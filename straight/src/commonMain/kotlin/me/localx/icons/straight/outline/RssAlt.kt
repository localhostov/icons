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

public val Icons.Outline.RssAlt: ImageVector
    get() {
        if (_rssAlt != null) {
            return _rssAlt!!
        }
        _rssAlt = Builder(name = "RssAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3.5f, 19.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(12.131f, 0.0f, 22.0f, 9.869f, 22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                curveTo(24.0f, 10.767f, 13.233f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(7.168f, 0.0f, 13.0f, 5.832f, 13.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -8.271f, -6.729f, -15.0f, -15.0f, -15.0f)
                close()
            }
        }
        .build()
        return _rssAlt!!
    }

private var _rssAlt: ImageVector? = null
