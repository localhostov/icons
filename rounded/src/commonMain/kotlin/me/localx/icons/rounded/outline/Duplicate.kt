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

public val Icons.Outline.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.155f, 3.272f)
                lineTo(18.871f, 0.913f)
                arcTo(3.02f, 3.02f, 0.0f, false, false, 16.715f, 0.0f)
                lineTo(12.0f, 0.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 7.1f, 4.0f)
                lineTo(7.0f, 4.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 9.0f)
                lineTo(2.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-0.1f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 22.0f, 14.0f)
                lineTo(22.0f, 5.36f)
                arcTo(2.988f, 2.988f, 0.0f, false, false, 21.155f, 3.272f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(4.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 6.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 22.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
