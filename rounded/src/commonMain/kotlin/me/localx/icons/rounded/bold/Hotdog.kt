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

public val Icons.Bold.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                close()
                moveTo(17.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 4.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 6.0f)
                close()
                moveTo(6.5f, 5.989f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 4.486f)
                lineTo(8.0f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                lineTo(5.0f, 4.486f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 5.987f)
                close()
                moveTo(21.858f, 19.976f)
                arcTo(19.323f, 19.323f, 0.0f, false, true, 12.0f, 23.0f)
                arcToRelative(19.323f, 19.323f, 0.0f, false, true, -9.855f, -3.021f)
                arcTo(4.824f, 4.824f, 0.0f, false, true, 0.812f, 13.3f)
                arcToRelative(4.745f, 4.745f, 0.0f, false, true, 0.823f, -0.919f)
                arcTo(9.084f, 9.084f, 0.0f, false, true, 0.746f, 11.6f)
                arcTo(2.728f, 2.728f, 0.0f, false, true, 4.69f, 7.824f)
                curveTo(4.833f, 7.965f, 8.0f, 10.978f, 12.0f, 10.979f)
                reflectiveCurveToRelative(7.168f, -3.014f, 7.311f, -3.155f)
                arcTo(2.728f, 2.728f, 0.0f, false, true, 23.257f, 11.6f)
                arcToRelative(9.041f, 9.041f, 0.0f, false, true, -0.887f, 0.78f)
                arcToRelative(4.758f, 4.758f, 0.0f, false, true, -0.512f, 7.6f)
                close()
                moveTo(20.7f, 14.958f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, -1.162f, -0.775f)
                arcToRelative(1.784f, 1.784f, 0.0f, false, false, -1.337f, 0.261f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 12.0f, 16.5f)
                arcToRelative(12.193f, 12.193f, 0.0f, false, true, -6.19f, -2.05f)
                arcToRelative(1.778f, 1.778f, 0.0f, false, false, -0.986f, -0.3f)
                arcToRelative(1.818f, 1.818f, 0.0f, false, false, -1.013f, 3.33f)
                arcTo(16.071f, 16.071f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(16.071f, 16.071f, 0.0f, false, false, 8.191f, -2.517f)
                arcTo(1.821f, 1.821f, 0.0f, false, false, 20.7f, 14.958f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
