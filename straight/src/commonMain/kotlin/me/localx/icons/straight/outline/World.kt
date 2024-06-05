package me.localx.icons.straight.outline

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
                arcToRelative(9.941f, 9.941f, 0.0f, false, true, -1.646f, 5.482f)
                arcTo(5.288f, 5.288f, 0.0f, false, true, 19.0f, 13.99f)
                lineTo(19.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(12.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(2.914f)
                lineToRelative(1.109f, -1.109f)
                arcTo(9.969f, 9.969f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(2.049f, 12.963f)
                lineTo(6.086f, 17.0f)
                lineTo(10.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.949f)
                arcTo(10.016f, 10.016f, 0.0f, false, true, 2.049f, 12.963f)
                close()
                moveTo(13.0f, 21.949f)
                lineTo(13.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(6.914f, 15.0f)
                lineTo(2.163f, 10.249f)
                arcTo(9.978f, 9.978f, 0.0f, false, true, 17.456f, 3.63f)
                lineToRelative(-0.37f, 0.37f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 2.072f, 5.063f)
                arcTo(9.969f, 9.969f, 0.0f, false, true, 13.0f, 21.949f)
                close()
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
