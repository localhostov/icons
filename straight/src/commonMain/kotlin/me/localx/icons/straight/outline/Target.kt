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

public val Icons.Outline.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(13.0f, 21.949f)
                verticalLineToRelative(-2.949f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.949f)
                arcToRelative(10.015f, 10.015f, 0.0f, false, true, -8.949f, -8.949f)
                horizontalLineToRelative(2.949f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.949f)
                arcToRelative(10.015f, 10.015f, 0.0f, false, true, 8.949f, -8.949f)
                verticalLineToRelative(2.949f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.949f)
                arcToRelative(10.015f, 10.015f, 0.0f, false, true, 8.949f, 8.949f)
                horizontalLineToRelative(-2.949f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.949f)
                arcToRelative(10.015f, 10.015f, 0.0f, false, true, -8.949f, 8.949f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
