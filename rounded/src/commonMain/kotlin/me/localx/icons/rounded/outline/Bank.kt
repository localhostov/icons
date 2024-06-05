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

public val Icons.Outline.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(0.291f, 8.552f)
                arcToRelative(2.443f, 2.443f, 0.0f, false, true, 0.153f, -2.566f)
                arcToRelative(4.716f, 4.716f, 0.0f, false, true, 1.668f, -1.5f)
                lineToRelative(7.501f, -3.904f)
                arcToRelative(5.174f, 5.174f, 0.0f, false, true, 4.774f, 0.0f)
                lineToRelative(7.5f, 3.907f)
                arcToRelative(4.716f, 4.716f, 0.0f, false, true, 1.668f, 1.5f)
                arcToRelative(2.443f, 2.443f, 0.0f, false, true, 0.153f, 2.566f)
                arcToRelative(2.713f, 2.713f, 0.0f, false, true, -2.416f, 1.445f)
                horizontalLineToRelative(-0.292f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-0.292f)
                arcToRelative(2.713f, 2.713f, 0.0f, false, true, -2.417f, -1.448f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(2.063f, 7.625f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, false, 0.645f, 0.375f)
                horizontalLineToRelative(18.584f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, false, 0.645f, -0.375f)
                arcToRelative(0.452f, 0.452f, 0.0f, false, false, -0.024f, -0.5f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -0.949f, -0.864f)
                lineToRelative(-7.5f, -3.907f)
                arcToRelative(3.176f, 3.176f, 0.0f, false, false, -2.926f, 0.0f)
                lineToRelative(-7.5f, 3.907f)
                arcToRelative(2.712f, 2.712f, 0.0f, false, false, -0.949f, 0.865f)
                arcToRelative(0.452f, 0.452f, 0.0f, false, false, -0.026f, 0.499f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
