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
                moveTo(13.5f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.989f)
                horizontalLineTo(8.0f)
                close()
                moveTo(21.855f, 19.98f)
                arcTo(19.316f, 19.316f, 0.0f, false, true, 12.0f, 23.0f)
                arcToRelative(19.316f, 19.316f, 0.0f, false, true, -9.855f, -3.02f)
                arcTo(4.822f, 4.822f, 0.0f, false, true, 0.809f, 13.3f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, true, 0.824f, -0.918f)
                arcToRelative(9.183f, 9.183f, 0.0f, false, true, -0.89f, -0.782f)
                arcToRelative(2.728f, 2.728f, 0.0f, false, true, 3.944f, -3.77f)
                curveTo(4.83f, 7.973f, 8.0f, 10.985f, 12.0f, 10.986f)
                reflectiveCurveToRelative(7.168f, -3.013f, 7.311f, -3.154f)
                arcToRelative(2.728f, 2.728f, 0.0f, false, true, 3.944f, 3.77f)
                arcToRelative(9.041f, 9.041f, 0.0f, false, true, -0.887f, 0.78f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -0.512f, 7.6f)
                close()
                moveTo(20.7f, 14.965f)
                arcToRelative(1.818f, 1.818f, 0.0f, false, false, -1.163f, -0.776f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, false, -1.336f, 0.261f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 12.0f, 16.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -6.191f, -2.049f)
                arcToRelative(1.778f, 1.778f, 0.0f, false, false, -0.986f, -0.3f)
                arcToRelative(1.817f, 1.817f, 0.0f, false, false, -1.013f, 3.329f)
                arcTo(16.074f, 16.074f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(16.074f, 16.074f, 0.0f, false, false, 8.191f, -2.516f)
                arcTo(1.818f, 1.818f, 0.0f, false, false, 20.7f, 14.965f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
