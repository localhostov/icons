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

public val Icons.Bold.Fence: ImageVector
    get() {
        if (_fence != null) {
            return _fence!!
        }
        _fence = Builder(name = "Fence", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.996f)
                lineTo(18.0f, 0.004f)
                lineToRelative(-5.0f, 5.0f)
                verticalLineToRelative(2.996f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.996f)
                lineTo(6.0f, 0.004f)
                lineTo(1.0f, 5.004f)
                verticalLineToRelative(2.996f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(11.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 6.246f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(1.754f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.754f)
                close()
                moveTo(4.0f, 6.246f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(1.754f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(-1.754f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _fence!!
    }

private var _fence: ImageVector? = null
