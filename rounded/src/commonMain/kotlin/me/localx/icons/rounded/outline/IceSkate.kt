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

public val Icons.Outline.IceSkate: ImageVector
    get() {
        if (_iceSkate != null) {
            return _iceSkate!!
        }
        _iceSkate = Builder(name = "IceSkate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(16.0f, 22.0f)
                lineTo(16.0f, 18.0f)
                horizontalLineToRelative(2.1f)
                arcTo(3.905f, 3.905f, 0.0f, false, false, 22.0f, 14.1f)
                arcToRelative(6.014f, 6.014f, 0.0f, false, false, -4.823f, -5.883f)
                lineTo(13.3f, 7.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.592f, -1.7f)
                lineTo(11.3f, 2.576f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.619f, 0.086f)
                lineTo(2.91f, 1.42f)
                arcTo(4.015f, 4.015f, 0.0f, false, false, 0.0f, 5.269f)
                lineTo(0.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 19.0f)
                close()
                moveTo(2.0f, 14.0f)
                lineTo(2.0f, 5.269f)
                arcTo(2.01f, 2.01f, 0.0f, false, true, 3.455f, 3.344f)
                lineToRelative(4.652f, -1.32f)
                arcTo(1.053f, 1.053f, 0.0f, false, true, 8.328f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.986f, 0.848f)
                lineTo(9.466f, 4.0f)
                lineTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                lineTo(9.729f, 6.0f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, 0.245f, 0.915f)
                lineTo(7.635f, 8.338f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.039f, 1.709f)
                lineToRelative(2.466f, -1.5f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, 0.866f, 0.544f)
                lineToRelative(-1.375f, 2.413f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.738f, 0.99f)
                lineToRelative(1.638f, -2.874f)
                lineToRelative(2.777f, 0.556f)
                arcTo(4.011f, 4.011f, 0.0f, false, true, 20.0f, 14.1f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 18.1f, 16.0f)
                lineTo(4.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 14.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _iceSkate!!
    }

private var _iceSkate: ImageVector? = null
