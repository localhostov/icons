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

public val Icons.Outline.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(9.938f, 9.938f, 0.0f, false, true, -1.662f, 5.508f)
                lineToRelative(-1.192f, -1.193f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 19.0f, 15.962f)
                lineTo(19.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 7.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.379f)
                arcToRelative(2.516f, 2.516f, 0.0f, false, false, 1.767f, -0.732f)
                lineToRelative(0.377f, -0.377f)
                arcTo(9.969f, 9.969f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(2.049f, 12.963f)
                lineTo(5.207f, 16.121f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 7.329f, 17.0f)
                lineTo(10.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.949f)
                arcTo(10.016f, 10.016f, 0.0f, false, true, 2.049f, 12.963f)
                close()
                moveTo(13.0f, 21.949f)
                lineTo(13.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(7.329f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.708f, -0.293f)
                lineTo(2.163f, 10.249f)
                arcTo(9.978f, 9.978f, 0.0f, false, true, 17.456f, 3.63f)
                lineToRelative(-0.224f, 0.224f)
                arcTo(0.507f, 0.507f, 0.0f, false, true, 16.879f, 4.0f)
                lineTo(15.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 6.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.0f, 10.5f)
                lineTo(10.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.962f)
                arcToRelative(2.516f, 2.516f, 0.0f, false, false, 0.732f, 1.767f)
                lineToRelative(1.337f, 1.337f)
                arcTo(9.971f, 9.971f, 0.0f, false, true, 13.0f, 21.949f)
                close()
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
