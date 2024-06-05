package me.localx.icons.rounded.outline

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

public val Icons.Outline.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.746f, 20.334f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.081f, 1.413f)
                lineToRelative(-1.586f, 1.414f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -2.064f, 0.839f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, true, -2.136f, -0.882f)
                lineToRelative(-1.544f, -1.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.33f, -1.494f)
                lineToRelative(1.335f, 1.194f)
                verticalLineToRelative(-7.444f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(7.445f)
                lineToRelative(1.335f, -1.192f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.411f, 0.081f)
                close()
                moveTo(18.356f, 7.361f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, true, -0.722f, -0.735f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.489f, 0.842f)
                arcToRelative(7.657f, 7.657f, 0.0f, false, false, 0.8f, 5.18f)
                arcToRelative(5.448f, 5.448f, 0.0f, false, false, -2.888f, 5.652f)
                arcToRelative(5.843f, 5.843f, 0.0f, false, false, 5.626f, 4.7f)
                horizontalLineToRelative(2.317f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.317f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, true, -3.646f, -2.982f)
                arcToRelative(3.469f, 3.469f, 0.0f, false, true, 1.834f, -3.6f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, 0.793f, -2.685f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.06f, -4.513f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 2.045f, 2.052f)
                arcToRelative(5.971f, 5.971f, 0.0f, false, true, 4.212f, 6.21f)
                arcToRelative(5.377f, 5.377f, 0.0f, false, true, -1.111f, 2.909f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.586f, 1.219f)
                arcToRelative(7.466f, 7.466f, 0.0f, false, false, 1.52f, -3.972f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -5.62f, -8.277f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
