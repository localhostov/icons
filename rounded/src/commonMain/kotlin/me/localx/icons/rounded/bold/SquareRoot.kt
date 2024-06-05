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

public val Icons.Bold.SquareRoot: ImageVector
    get() {
        if (_squareRoot != null) {
            return _squareRoot!!
        }
        _squareRoot = Builder(name = "SquareRoot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.991f, 5.0f)
                arcToRelative(2.512f, 2.512f, 0.0f, false, false, -2.4f, 1.793f)
                lineToRelative(-4.013f, 13.631f)
                arcToRelative(2.175f, 2.175f, 0.0f, false, true, -2.078f, 1.576f)
                arcToRelative(2.247f, 2.247f, 0.0f, false, true, -2.091f, -1.488f)
                lineToRelative(-2.31f, -6.7f)
                arcToRelative(2.936f, 2.936f, 0.0f, false, false, -1.952f, -1.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.706f, -2.916f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, true, 4.074f, 3.765f)
                lineToRelative(1.491f, 4.33f)
                lineToRelative(3.3f, -11.191f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, true, 5.273f, -3.95f)
                horizontalLineToRelative(6.509f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(23.4f, 11.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.1f, 0.3f)
                lineToRelative(-1.8f, 2.4f)
                lineToRelative(-1.8f, -2.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.4f, 1.8f)
                lineToRelative(2.325f, 3.1f)
                lineToRelative(-2.325f, 3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.4f, 1.8f)
                lineToRelative(1.8f, -2.4f)
                lineToRelative(1.8f, 2.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.4f, -1.8f)
                lineToRelative(-2.325f, -3.1f)
                lineToRelative(2.325f, -3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.3f, -2.1f)
                close()
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
