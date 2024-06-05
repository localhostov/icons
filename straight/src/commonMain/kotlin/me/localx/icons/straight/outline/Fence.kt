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

public val Icons.Outline.Fence: ImageVector
    get() {
        if (_fence != null) {
            return _fence!!
        }
        _fence = Builder(name = "Fence", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 3.086f)
                lineTo(20.0f, 0.086f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(3.914f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 3.086f)
                lineTo(12.0f, 0.086f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(3.914f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 3.086f)
                lineTo(4.0f, 0.086f)
                lineTo(1.0f, 3.086f)
                verticalLineToRelative(3.914f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 9.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.0f, 3.914f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 3.914f)
                close()
                moveTo(11.0f, 3.914f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 3.914f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 3.914f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.086f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 3.914f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(5.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _fence!!
    }

private var _fence: ImageVector? = null
