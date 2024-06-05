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

public val Icons.Outline.Rv: ImageVector
    get() {
        if (_rv != null) {
            return _rv!!
        }
        _rv = Builder(name = "Rv", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.723f, 7.0f)
                lineTo(22.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(5.0f, 1.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineToRelative(6.515f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, false, 2.05f, 4.949f)
                lineToRelative(0.95f, 0.95f)
                lineTo(3.0f, 19.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(22.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(24.0f, 14.593f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, false, -0.922f, -3.472f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(8.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(5.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(4.414f, 17.0f)
                lineToRelative(-0.95f, -0.95f)
                arcTo(4.967f, 4.967f, 0.0f, false, true, 2.0f, 12.515f)
                lineTo(2.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 5.0f)
                lineTo(2.172f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(17.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(20.7f, 11.0f)
                lineTo(15.0f, 11.0f)
                lineTo(15.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.419f)
                close()
                moveTo(20.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(17.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 13.0f)
                horizontalLineToRelative(6.739f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 22.0f, 14.593f)
                close()
            }
        }
        .build()
        return _rv!!
    }

private var _rv: ImageVector? = null
