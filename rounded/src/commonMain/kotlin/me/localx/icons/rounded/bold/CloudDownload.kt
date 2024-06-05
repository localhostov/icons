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

public val Icons.Bold.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.976f, 15.5f)
                arcToRelative(7.626f, 7.626f, 0.0f, false, true, -0.691f, 2.636f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.717f, -1.272f)
                arcToRelative(4.619f, 4.619f, 0.0f, false, false, 0.417f, -1.6f)
                arcToRelative(5.163f, 5.163f, 0.0f, false, false, -4.475f, -5.512f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.289f, -1.287f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, false, -2.0f, -3.42f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -3.908f, -0.988f)
                arcToRelative(5.052f, 5.052f, 0.0f, false, false, -4.219f, 4.093f)
                arcToRelative(5.118f, 5.118f, 0.0f, false, false, 0.456f, 3.3f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, -1.012f, 3.356f)
                arcToRelative(2.763f, 2.763f, 0.0f, false, false, -1.444f, 3.156f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, false, 2.875f, 2.038f)
                horizontalLineToRelative(2.531f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.531f)
                arcToRelative(5.886f, 5.886f, 0.0f, false, true, -5.778f, -4.281f)
                arcToRelative(5.764f, 5.764f, 0.0f, false, true, 2.5f, -6.3f)
                arcToRelative(8.121f, 8.121f, 0.0f, false, true, 12.335f, -9.766f)
                arcToRelative(8.214f, 8.214f, 0.0f, false, true, 2.948f, 4.34f)
                arcToRelative(8.16f, 8.16f, 0.0f, false, true, 6.002f, 8.507f)
                close()
                moveTo(18.563f, 19.0f)
                horizontalLineToRelative(-1.563f)
                verticalLineToRelative(-4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.563f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, false, -0.685f, 1.653f)
                lineToRelative(3.063f, 3.063f)
                arcToRelative(0.967f, 0.967f, 0.0f, false, false, 1.37f, 0.0f)
                lineToRelative(3.063f, -3.063f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, false, -0.685f, -1.653f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
