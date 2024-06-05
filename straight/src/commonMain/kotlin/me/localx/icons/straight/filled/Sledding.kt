package me.localx.icons.straight.filled

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

public val Icons.Filled.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.729f)
                arcToRelative(3.971f, 3.971f, 0.0f, false, true, -2.278f, 2.044f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, true, -3.058f, -0.167f)
                lineTo(0.033f, 14.769f)
                lineTo(0.89f, 12.962f)
                lineTo(19.522f, 21.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.672f, -0.936f)
                close()
                moveTo(18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(11.731f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(9.388f)
                lineToRelative(2.73f, 1.766f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.169f, 4.148f)
                curveToRelative(0.0f, 0.006f, 0.0f, 0.012f, -0.008f, 0.018f)
                lineTo(13.749f, 14.0f)
                horizontalLineToRelative(4.058f)
                lineToRelative(1.149f, 5.312f)
                lineToRelative(-2.28f, -1.082f)
                lineTo(16.193f, 16.0f)
                horizontalLineTo(10.944f)
                arcToRelative(2.874f, 2.874f, 0.0f, false, true, -2.583f, -1.5f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, true, 0.221f, -3.343f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
