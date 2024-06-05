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

public val Icons.Bold.BookSpells: ImageVector
    get() {
        if (_bookSpells != null) {
            return _bookSpells!!
        }
        _bookSpells = Builder(name = "BookSpells", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(3.467f, 0.0f, 1.0f, 2.467f, 1.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(6.5f, 3.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                lineTo(5.5f, 15.0f)
                curveToRelative(-0.526f, 0.0f, -1.031f, 0.091f, -1.5f, 0.257f)
                lineTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(5.0f, 6.952f)
                curveToRelative(0.006f, -0.307f, 0.198f, -0.579f, 0.484f, -0.687f)
                lineToRelative(1.299f, -0.492f)
                lineToRelative(0.52f, -1.301f)
                curveToRelative(0.114f, -0.285f, 0.39f, -0.472f, 0.697f, -0.472f)
                reflectiveCurveToRelative(0.583f, 0.187f, 0.697f, 0.472f)
                lineToRelative(0.523f, 1.308f)
                lineToRelative(1.308f, 0.523f)
                curveToRelative(0.285f, 0.114f, 0.472f, 0.39f, 0.472f, 0.697f)
                reflectiveCurveToRelative(-0.187f, 0.583f, -0.472f, 0.697f)
                lineToRelative(-1.308f, 0.523f)
                lineToRelative(-0.523f, 1.308f)
                curveToRelative(-0.114f, 0.285f, -0.39f, 0.472f, -0.697f, 0.472f)
                reflectiveCurveToRelative(-0.583f, -0.187f, -0.697f, -0.472f)
                lineToRelative(-0.526f, -1.316f)
                lineToRelative(-1.318f, -0.555f)
                curveToRelative(-0.283f, -0.119f, -0.464f, -0.398f, -0.459f, -0.705f)
                close()
                moveTo(12.0f, 10.444f)
                curveToRelative(0.007f, -0.358f, 0.231f, -0.675f, 0.565f, -0.802f)
                lineToRelative(1.515f, -0.574f)
                lineToRelative(0.607f, -1.518f)
                curveToRelative(0.133f, -0.332f, 0.455f, -0.55f, 0.813f, -0.55f)
                reflectiveCurveToRelative(0.68f, 0.218f, 0.813f, 0.55f)
                lineToRelative(0.611f, 1.527f)
                lineToRelative(1.527f, 0.611f)
                curveToRelative(0.332f, 0.133f, 0.55f, 0.455f, 0.55f, 0.813f)
                reflectiveCurveToRelative(-0.218f, 0.68f, -0.55f, 0.813f)
                lineToRelative(-1.527f, 0.611f)
                lineToRelative(-0.611f, 1.527f)
                curveToRelative(-0.133f, 0.332f, -0.455f, 0.55f, -0.813f, 0.55f)
                reflectiveCurveToRelative(-0.68f, -0.218f, -0.813f, -0.55f)
                lineToRelative(-0.614f, -1.536f)
                lineToRelative(-1.538f, -0.648f)
                curveToRelative(-0.33f, -0.139f, -0.542f, -0.464f, -0.535f, -0.822f)
                close()
            }
        }
        .build()
        return _bookSpells!!
    }

private var _bookSpells: ImageVector? = null
