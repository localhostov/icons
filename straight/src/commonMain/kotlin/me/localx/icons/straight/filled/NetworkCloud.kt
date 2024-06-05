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

public val Icons.Filled.NetworkCloud: ImageVector
    get() {
        if (_networkCloud != null) {
            return _networkCloud!!
        }
        _networkCloud = Builder(name = "NetworkCloud", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                horizontalLineToRelative(-9.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, -1.816f)
                verticalLineToRelative(-4.184f)
                horizontalLineToRelative(3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.787f, -9.938f)
                arcToRelative(5.488f, 5.488f, 0.0f, false, false, -10.787f, 1.438f)
                arcToRelative(5.147f, 5.147f, 0.0f, false, false, 0.038f, 0.617f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.962f, 7.883f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, 1.816f)
                horizontalLineToRelative(-9.184f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.184f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 5.632f, 0.0f)
                horizontalLineToRelative(9.184f)
                close()
            }
        }
        .build()
        return _networkCloud!!
    }

private var _networkCloud: ImageVector? = null
