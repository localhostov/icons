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

public val Icons.Bold.LariSign: ImageVector
    get() {
        if (_lariSign != null) {
            return _lariSign!!
        }
        _lariSign = Builder(name = "LariSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.46f)
                curveToRelative(-2.13f, -2.01f, -3.46f, -4.85f, -3.46f, -8.0f)
                curveTo(1.0f, 8.35f, 3.91f, 4.36f, 8.0f, 2.75f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.05f)
                curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1.0f, -0.05f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1.0f, 0.05f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.75f)
                curveToRelative(4.09f, 1.6f, 7.0f, 5.59f, 7.0f, 10.25f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.95f, -1.61f, -5.54f, -4.0f, -6.93f)
                verticalLineToRelative(5.93f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(5.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1.0f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1.0f, 0.06f)
                verticalLineToRelative(6.94f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.07f)
                curveToRelative(-2.39f, 1.39f, -4.0f, 3.97f, -4.0f, 6.93f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _lariSign!!
    }

private var _lariSign: ImageVector? = null
