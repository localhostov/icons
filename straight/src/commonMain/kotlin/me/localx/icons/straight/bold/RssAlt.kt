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

public val Icons.Bold.RssAlt: ImageVector
    get() {
        if (_rssAlt != null) {
            return _rssAlt!!
        }
        _rssAlt = Builder(name = "RssAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.994f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveTo(-0.006f, 22.657f, -0.006f, 21.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(-0.006f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(11.58f, 0.0f, 21.0f, 9.42f, 21.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                curveTo(23.994f, 10.766f, 13.228f, 0.0f, -0.006f, 0.0f)
                close()
                moveTo(-0.006f, 9.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                curveTo(14.994f, 15.729f, 8.265f, 9.0f, -0.006f, 9.0f)
                close()
            }
        }
        .build()
        return _rssAlt!!
    }

private var _rssAlt: ImageVector? = null
