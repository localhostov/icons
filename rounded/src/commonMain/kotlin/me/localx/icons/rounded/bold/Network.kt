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

public val Icons.Bold.Network: ImageVector
    get() {
        if (_network != null) {
            return _network!!
        }
        _network = Builder(name = "Network", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 19.0f)
                horizontalLineTo(15.149f)
                arcTo(3.509f, 3.509f, 0.0f, false, false, 13.5f, 17.351f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(7.654f)
                arcTo(1.847f, 1.847f, 0.0f, false, false, 23.0f, 12.154f)
                verticalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                verticalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 16.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 3.0f, 4.5f)
                verticalLineTo(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.154f)
                arcTo(1.847f, 1.847f, 0.0f, false, false, 2.846f, 14.0f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(3.351f)
                arcTo(3.509f, 3.509f, 0.0f, false, false, 8.851f, 19.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(8.851f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(8.934f, 9.678f)
                lineToRelative(-0.329f, -0.356f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.87f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 4.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.735f, 0.322f)
                lineToRelative(-0.329f, 0.356f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.735f, 0.322f)
                horizontalLineTo(9.669f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.934f, 9.678f)
                close()
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
