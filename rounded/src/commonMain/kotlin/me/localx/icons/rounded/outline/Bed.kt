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

public val Icons.Outline.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                arcTo(4.987f, 4.987f, 0.0f, false, false, 8.584f, 8.705f)
                arcTo(3.464f, 3.464f, 0.0f, false, false, 6.5f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 11.5f)
                arcTo(3.464f, 3.464f, 0.0f, false, false, 3.351f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(2.0f, 19.0f)
                lineTo(22.0f, 19.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 11.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 6.0f)
                close()
                moveTo(10.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 13.0f)
                close()
                moveTo(5.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 11.5f)
                close()
                moveTo(2.0f, 17.0f)
                lineTo(2.0f, 15.0f)
                lineTo(22.0f, 15.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
