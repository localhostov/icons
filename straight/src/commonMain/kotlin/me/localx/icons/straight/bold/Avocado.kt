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

public val Icons.Bold.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.017f)
                curveToRelative(0.0f, -2.531f, 1.711f, -4.972f, 3.0f, -4.972f)
                reflectiveCurveToRelative(3.0f, 2.441f, 3.0f, 4.972f)
                arcTo(2.9f, 2.9f, 0.0f, false, true, 12.0f, 19.0f)
                arcTo(2.9f, 2.9f, 0.0f, false, true, 9.0f, 16.017f)
                close()
                moveTo(22.0f, 14.69f)
                arcToRelative(8.527f, 8.527f, 0.0f, false, false, -1.962f, -5.773f)
                arcToRelative(13.829f, 13.829f, 0.0f, false, true, -2.226f, -4.368f)
                arcTo(5.989f, 5.989f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(8.019f, 0.0f, 2.0f, 5.859f, 2.0f, 14.69f)
                curveTo(2.0f, 19.824f, 6.486f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveTo(22.0f, 19.824f, 22.0f, 14.69f)
                close()
                moveTo(14.937f, 5.4f)
                arcToRelative(16.721f, 16.721f, 0.0f, false, false, 2.7f, 5.317f)
                arcTo(5.606f, 5.606f, 0.0f, false, true, 19.0f, 14.69f)
                curveTo(19.0f, 18.169f, 15.859f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(-7.0f, -2.831f, -7.0f, -6.31f)
                curveTo(5.0f, 7.1f, 9.968f, 3.0f, 12.0f, 3.0f)
                arcTo(3.018f, 3.018f, 0.0f, false, true, 14.937f, 5.4f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
