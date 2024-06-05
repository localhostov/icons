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

public val Icons.Bold.FlorinSign: ImageVector
    get() {
        if (_florinSign != null) {
            return _florinSign!!
        }
        _florinSign = Builder(name = "FlorinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.98f, 0.0f, -1.87f, 0.58f, -2.28f, 1.47f)
                lineToRelative(-2.06f, 4.53f)
                horizontalLineToRelative(2.49f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.85f)
                lineToRelative(-3.99f, 8.78f)
                curveToRelative(-0.89f, 1.96f, -2.86f, 3.22f, -5.01f, 3.22f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.98f, 0.0f, 1.87f, -0.58f, 2.28f, -1.47f)
                lineToRelative(3.42f, -7.53f)
                horizontalLineToRelative(-2.85f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.22f)
                lineToRelative(2.63f, -5.78f)
                curveToRelative(0.89f, -1.96f, 2.86f, -3.22f, 5.01f, -3.22f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _florinSign!!
    }

private var _florinSign: ImageVector? = null
