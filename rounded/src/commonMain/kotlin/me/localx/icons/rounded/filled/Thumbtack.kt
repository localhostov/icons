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

public val Icons.Filled.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.274f, 6.743f)
                lineTo(17.328f, 0.8f)
                arcTo(2.58f, 2.58f, 0.0f, false, false, 14.035f, 0.451f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.318f, 3.806f)
                lineToRelative(0.592f, 0.591f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, 0.0f, 1.142f)
                lineToRelative(-2.1f, 2.1f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, true, -1.431f, 0.393f)
                lineToRelative(-0.82f, -0.21f)
                arcToRelative(8.124f, 8.124f, 0.0f, false, false, -2.9f, -0.219f)
                arcToRelative(3.368f, 3.368f, 0.0f, false, false, -2.837f, 2.256f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, 0.817f, 3.682f)
                lineTo(6.784f, 15.8f)
                lineTo(0.293f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(8.174f, 17.24f)
                lineToRelative(1.25f, 1.294f)
                arcTo(4.675f, 4.675f, 0.0f, false, false, 12.675f, 20.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 1.172f, -0.2f)
                arcToRelative(3.143f, 3.143f, 0.0f, false, false, 2.106f, -2.7f)
                arcToRelative(8.093f, 8.093f, 0.0f, false, false, -0.214f, -2.874f)
                lineTo(15.527f, 13.2f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, true, 0.4f, -1.414f)
                lineTo(18.016f, 9.7f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, 0.593f, -0.244f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, 0.52f, 0.217f)
                lineToRelative(0.506f, 0.506f)
                arcToRelative(2.575f, 2.575f, 0.0f, false, false, 3.32f, 0.374f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.319f, -3.806f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
