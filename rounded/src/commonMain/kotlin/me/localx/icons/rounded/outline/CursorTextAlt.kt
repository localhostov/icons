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

public val Icons.Outline.CursorTextAlt: ImageVector
    get() {
        if (_cursorTextAlt != null) {
            return _cursorTextAlt!!
        }
        _cursorTextAlt = Builder(name = "CursorTextAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.351f)
                lineTo(22.0f, 6.649f)
                arcTo(3.492f, 3.492f, 0.0f, true, false, 17.351f, 2.0f)
                lineTo(6.649f, 2.0f)
                arcTo(3.492f, 3.492f, 0.0f, true, false, 2.0f, 6.649f)
                verticalLineToRelative(10.7f)
                arcTo(3.492f, 3.492f, 0.0f, true, false, 6.649f, 22.0f)
                horizontalLineToRelative(10.7f)
                arcTo(3.492f, 3.492f, 0.0f, true, false, 22.0f, 17.351f)
                close()
                moveTo(17.051f, 20.0f)
                lineTo(6.949f, 20.0f)
                arcTo(3.485f, 3.485f, 0.0f, false, false, 4.0f, 17.051f)
                lineTo(4.0f, 6.949f)
                arcTo(3.485f, 3.485f, 0.0f, false, false, 6.949f, 4.0f)
                horizontalLineToRelative(10.1f)
                arcTo(3.485f, 3.485f, 0.0f, false, false, 20.0f, 6.949f)
                verticalLineToRelative(10.1f)
                arcTo(3.485f, 3.485f, 0.0f, false, false, 17.051f, 20.0f)
                close()
                moveTo(20.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 19.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 2.0f)
                close()
                moveTo(3.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 2.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 2.0f)
                close()
                moveTo(3.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 22.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 22.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 22.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, -2.0f, -0.78f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(11.0f, 14.0f)
                lineTo(10.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, 2.0f, 0.78f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 14.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cursorTextAlt!!
    }

private var _cursorTextAlt: ImageVector? = null
