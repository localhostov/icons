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

public val Icons.Filled.IndianRupeeSign: ImageVector
    get() {
        if (_indianRupeeSign != null) {
            return _indianRupeeSign!!
        }
        _indianRupeeSign = Builder(name = "IndianRupeeSign", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(-0.26f, 3.9f, -3.51f, 7.0f, -7.47f, 7.0f)
                horizontalLineToRelative(-2.7f)
                lineToRelative(8.83f, 7.23f)
                curveToRelative(0.43f, 0.35f, 0.49f, 0.98f, 0.14f, 1.41f)
                curveToRelative(-0.2f, 0.24f, -0.49f, 0.37f, -0.78f, 0.37f)
                curveToRelative(-0.22f, 0.0f, -0.45f, -0.07f, -0.63f, -0.23f)
                lineTo(3.37f, 14.77f)
                curveToRelative(-0.33f, -0.27f, -0.45f, -0.71f, -0.31f, -1.11f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.86f, 0.0f, 5.22f, -2.2f, 5.47f, -5.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(14.79f)
                curveToRelative(-0.66f, -2.3f, -2.77f, -4.0f, -5.29f, -4.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(1.13f, 1.05f, 1.93f, 2.44f, 2.25f, 4.0f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _indianRupeeSign!!
    }

private var _indianRupeeSign: ImageVector? = null
