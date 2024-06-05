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

public val Icons.Outline.ArrowUpToArc: ImageVector
    get() {
        if (_arrowUpToArc != null) {
            return _arrowUpToArc!!
        }
        _arrowUpToArc = Builder(name = "ArrowUpToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.501f, 7.616f)
                lineToRelative(5.71f, 5.667f)
                lineToRelative(-1.408f, 1.42f)
                lineToRelative(-4.789f, -4.752f)
                verticalLineToRelative(14.049f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-14.049f)
                lineToRelative(-4.802f, 4.765f)
                lineToRelative(-1.409f, -1.42f)
                lineToRelative(5.728f, -5.684f)
                curveToRelative(0.787f, -0.789f, 2.176f, -0.793f, 2.971f, 0.003f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowUpToArc!!
    }

private var _arrowUpToArc: ImageVector? = null
