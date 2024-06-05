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
                moveToRelative(24.0f, 19.0f)
                horizontalLineToRelative(-8.85f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.65f, -1.65f)
                verticalLineToRelative(-3.35f)
                horizontalLineToRelative(5.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3.35f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.65f, 1.65f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.85f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineToRelative(8.85f)
                close()
                moveTo(9.414f, 9.0f)
                horizontalLineToRelative(-3.414f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.414f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-3.172f)
                close()
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
