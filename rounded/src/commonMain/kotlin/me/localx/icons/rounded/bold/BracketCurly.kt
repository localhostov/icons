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

public val Icons.Bold.BracketCurly: ImageVector
    get() {
        if (_bracketCurly != null) {
            return _bracketCurly!!
        }
        _bracketCurly = Builder(name = "BracketCurly", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 24.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0.0f, -0.66f, -0.27f, -1.3f, -0.73f, -1.77f)
                lineToRelative(-1.83f, -1.83f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.11f, 0.73f, -1.77f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0.0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.84f)
                curveToRelative(0.0f, 1.47f, -0.57f, 2.85f, -1.61f, 3.89f)
                lineToRelative(-0.77f, 0.77f)
                lineToRelative(0.77f, 0.77f)
                curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
                verticalLineToRelative(1.84f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bracketCurly!!
    }

private var _bracketCurly: ImageVector? = null
