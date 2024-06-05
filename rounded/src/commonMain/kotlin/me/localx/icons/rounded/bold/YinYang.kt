package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 6.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 17.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(6.21f, 18.88f)
                curveToRelative(-1.96f, -1.65f, -3.21f, -4.12f, -3.21f, -6.88f)
                curveTo(3.0f, 7.14f, 6.87f, 3.18f, 11.7f, 3.02f)
                curveToRelative(1.83f, 0.26f, 3.3f, 1.88f, 3.3f, 3.73f)
                reflectiveCurveToRelative(-1.38f, 3.49f, -3.21f, 3.77f)
                curveToRelative(-3.3f, 0.47f, -5.79f, 3.37f, -5.79f, 6.73f)
                curveToRelative(0.0f, 0.56f, 0.08f, 1.1f, 0.21f, 1.63f)
                close()
                moveTo(12.31f, 20.99f)
                curveToRelative(-1.83f, -0.26f, -3.3f, -1.88f, -3.3f, -3.73f)
                reflectiveCurveToRelative(1.38f, -3.5f, 3.22f, -3.77f)
                curveToRelative(3.29f, -0.49f, 5.78f, -3.39f, 5.78f, -6.73f)
                curveToRelative(0.0f, -0.56f, -0.08f, -1.1f, -0.21f, -1.63f)
                curveToRelative(1.96f, 1.65f, 3.21f, 4.12f, 3.21f, 6.88f)
                curveToRelative(0.0f, 4.86f, -3.87f, 8.82f, -8.7f, 8.98f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
