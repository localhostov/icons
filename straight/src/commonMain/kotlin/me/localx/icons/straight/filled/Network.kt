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

public val Icons.Filled.Network: ImageVector
    get() {
        if (_network != null) {
            return _network!!
        }
        _network = Builder(name = "Network", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.0f)
                horizontalLineToRelative(-9.184f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -5.632f, 0.0f)
                horizontalLineToRelative(-9.184f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.816f, -1.816f)
                verticalLineToRelative(-4.184f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.586f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(4.828f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(6.586f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.816f, 1.816f)
                horizontalLineToRelative(9.184f)
                close()
                moveTo(10.414f, 9.0f)
                horizontalLineToRelative(3.172f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(6.414f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.414f)
                close()
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
