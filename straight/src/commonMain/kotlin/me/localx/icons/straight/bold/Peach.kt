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

public val Icons.Bold.Peach: ImageVector
    get() {
        if (_peach != null) {
            return _peach!!
        }
        _peach = Builder(name = "Peach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.782f, 6.337f)
                arcToRelative(8.678f, 8.678f, 0.0f, false, true, -1.039f, 0.994f)
                arcToRelative(9.091f, 9.091f, 0.0f, false, true, -1.342f, 0.892f)
                arcToRelative(4.761f, 4.761f, 0.0f, false, true, 1.6f, 3.3f)
                curveTo(21.0f, 16.9f, 14.61f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(-9.0f, -4.1f, -9.0f, -9.478f)
                arcTo(4.363f, 4.363f, 0.0f, false, true, 7.5f, 7.0f)
                curveTo(10.1f, 7.0f, 13.0f, 8.925f, 13.0f, 11.5f)
                arcToRelative(9.666f, 9.666f, 0.0f, false, true, -1.7f, 5.1f)
                lineToRelative(2.4f, 1.8f)
                arcTo(12.613f, 12.613f, 0.0f, false, false, 16.0f, 11.5f)
                arcToRelative(6.576f, 6.576f, 0.0f, false, false, -1.4f, -4.009f)
                arcToRelative(8.543f, 8.543f, 0.0f, false, false, 4.884f, -1.717f)
                arcToRelative(6.725f, 6.725f, 0.0f, false, false, 2.432f, -4.231f)
                lineToRelative(0.068f, -0.69f)
                lineTo(21.365f, 0.547f)
                arcTo(6.816f, 6.816f, 0.0f, false, false, 18.515f, 0.0f)
                arcToRelative(7.307f, 7.307f, 0.0f, false, false, -5.907f, 2.867f)
                arcTo(4.972f, 4.972f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.181f, 2.181f, 0.0f, false, true, 2.028f, 1.393f)
                arcTo(8.781f, 8.781f, 0.0f, false, false, 7.5f, 4.0f)
                arcTo(7.347f, 7.347f, 0.0f, false, false, 0.0f, 11.522f)
                curveTo(0.0f, 18.73f, 7.893f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -5.27f, 12.0f, -12.478f)
                arcTo(7.762f, 7.762f, 0.0f, false, false, 21.782f, 6.337f)
                close()
            }
        }
        .build()
        return _peach!!
    }

private var _peach: ImageVector? = null
