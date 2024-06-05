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

public val Icons.Filled.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 13.0f)
                horizontalLineToRelative(-22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(18.934f, 7.126f)
                arcToRelative(2.427f, 2.427f, 0.0f, false, false, -1.284f, -2.731f)
                lineToRelative(-7.982f, -3.967f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -3.268f, 0.005f)
                arcToRelative(2.809f, 2.809f, 0.0f, false, false, -1.4f, 2.481f)
                verticalLineToRelative(3.086f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(8.318f)
                arcToRelative(2.538f, 2.538f, 0.0f, false, false, 2.616f, -1.874f)
                close()
                moveTo(9.628f, 23.592f)
                lineTo(17.661f, 19.6f)
                arcToRelative(2.425f, 2.425f, 0.0f, false, false, 1.273f, -2.726f)
                arcToRelative(2.538f, 2.538f, 0.0f, false, false, -2.616f, -1.874f)
                horizontalLineToRelative(-8.318f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.085f)
                arcToRelative(2.808f, 2.808f, 0.0f, false, false, 1.4f, 2.481f)
                arcToRelative(3.212f, 3.212f, 0.0f, false, false, 1.632f, 0.434f)
                arcToRelative(3.287f, 3.287f, 0.0f, false, false, 1.596f, -0.408f)
                close()
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
