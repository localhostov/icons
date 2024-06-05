package me.localx.icons.straight.bold

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

public val Icons.Bold.Target: ImageVector
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
                moveTo(13.5f, 20.865f)
                verticalLineToRelative(-2.865f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.865f)
                arcToRelative(9.014f, 9.014f, 0.0f, false, true, -7.365f, -7.365f)
                horizontalLineToRelative(2.865f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.865f)
                arcToRelative(9.014f, 9.014f, 0.0f, false, true, 7.365f, -7.365f)
                verticalLineToRelative(2.865f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.865f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 7.365f, 7.365f)
                horizontalLineToRelative(-2.865f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.865f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -7.365f, 7.365f)
                close()
                moveTo(13.5f, 10.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
