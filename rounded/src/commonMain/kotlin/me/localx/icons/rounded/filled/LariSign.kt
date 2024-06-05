package me.localx.icons.rounded.filled

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

public val Icons.Filled.LariSign: ImageVector
    get() {
        if (_lariSign != null) {
            return _lariSign!!
        }
        _lariSign = Builder(name = "LariSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.7f)
                curveToRelative(-2.83f, -1.99f, -4.7f, -5.28f, -4.7f, -9.0f)
                curveTo(1.0f, 7.98f, 4.39f, 3.74f, 9.0f, 2.43f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.05f)
                curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1.0f, -0.05f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1.0f, 0.05f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.43f)
                curveToRelative(4.61f, 1.31f, 8.0f, 5.55f, 8.0f, 10.57f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.91f, -2.51f, -7.24f, -6.0f, -8.47f)
                verticalLineToRelative(6.47f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(4.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1.0f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1.0f, 0.06f)
                verticalLineToRelative(6.94f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(4.53f)
                curveToRelative(-3.49f, 1.24f, -6.0f, 4.57f, -6.0f, 8.47f)
                curveToRelative(0.0f, 4.96f, 4.04f, 9.0f, 9.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _lariSign!!
    }

private var _lariSign: ImageVector? = null
