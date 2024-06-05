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
                moveToRelative(24.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-8.184f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -5.632f, 0.0f)
                horizontalLineToRelative(-8.184f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(8.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.816f, -1.816f)
                verticalLineToRelative(-4.184f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.586f)
                lineToRelative(0.414f, 0.414f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, false, 1.414f, 0.586f)
                horizontalLineToRelative(3.172f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, false, 1.414f, -0.586f)
                lineToRelative(0.414f, -0.414f)
                horizontalLineToRelative(5.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.816f, 1.816f)
                horizontalLineToRelative(8.184f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(10.0f, 8.586f)
                lineTo(10.414f, 9.0f)
                horizontalLineToRelative(3.172f)
                lineToRelative(0.414f, -0.414f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, true, 1.414f, -0.586f)
                horizontalLineToRelative(5.586f)
                verticalLineToRelative(-4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.586f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, true, 1.414f, 0.586f)
                close()
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
