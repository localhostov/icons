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

public val Icons.Bold.NetworkCloud: ImageVector
    get() {
        if (_networkCloud != null) {
            return _networkCloud!!
        }
        _networkCloud = Builder(name = "NetworkCloud", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                horizontalLineToRelative(-8.85f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.65f, -1.65f)
                verticalLineToRelative(-3.35f)
                horizontalLineToRelative(2.25f)
                arcToRelative(5.251f, 5.251f, 0.0f, false, false, 0.884f, -10.426f)
                arcToRelative(5.489f, 5.489f, 0.0f, false, false, -10.628f, 1.681f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.494f, 8.745f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.35f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.65f, 1.65f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.85f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineToRelative(8.85f)
                close()
                moveTo(6.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.438f, -1.5f)
                lineToRelative(2.181f, 0.112f)
                arcToRelative(20.492f, 20.492f, 0.0f, false, true, -0.619f, -2.612f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 4.964f, -0.293f)
                lineToRelative(0.169f, 1.431f)
                arcToRelative(12.29f, 12.29f, 0.0f, false, true, 1.655f, -0.138f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.038f, 4.5f)
                horizontalLineToRelative(-8.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _networkCloud!!
    }

private var _networkCloud: ImageVector? = null
