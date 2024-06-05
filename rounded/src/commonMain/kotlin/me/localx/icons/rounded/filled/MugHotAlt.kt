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

public val Icons.Filled.MugHotAlt: ImageVector
    get() {
        if (_mugHotAlt != null) {
            return _mugHotAlt!!
        }
        _mugHotAlt = Builder(name = "MugHotAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.025f, 3.0f)
                lineTo(13.025f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(15.025f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.025f, 3.0f)
                close()
                moveTo(10.025f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(11.025f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(9.025f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.025f, 4.0f)
                close()
                moveTo(6.025f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(7.025f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(5.025f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.025f, 4.0f)
                close()
                moveTo(24.0f, 13.143f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 20.0f, 17.0f)
                lineTo(17.525f, 17.0f)
                arcToRelative(6.875f, 6.875f, 0.0f, false, true, -5.742f, 3.0f)
                lineTo(8.216f, 20.0f)
                arcToRelative(6.877f, 6.877f, 0.0f, false, true, -5.808f, -3.088f)
                curveTo(0.992f, 14.653f, -2.453f, 6.371f, 3.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 2.882f, 4.0f)
                curveTo(22.353f, 10.0f, 24.0f, 11.205f, 24.0f, 13.143f)
                close()
                moveTo(22.0f, 13.143f)
                curveToRelative(0.088f, -0.927f, -1.25f, -1.224f, -2.458f, -1.143f)
                arcToRelative(16.82f, 16.82f, 0.0f, false, true, -0.954f, 3.0f)
                lineTo(20.0f, 15.0f)
                arcTo(1.984f, 1.984f, 0.0f, false, false, 22.0f, 13.143f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(19.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _mugHotAlt!!
    }

private var _mugHotAlt: ImageVector? = null
