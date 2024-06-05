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

public val Icons.Outline.Billiard: ImageVector
    get() {
        if (_billiard != null) {
            return _billiard!!
        }
        _billiard = Builder(name = "Billiard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, false, -10.0f, -10.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, 6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, -6.0f)
                close()
                moveTo(11.857f, 15.515f)
                lineTo(14.857f, 10.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.857f, -1.515f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.234f)
                lineToRelative(-2.091f, 3.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.714f, 1.03f)
                close()
            }
        }
        .build()
        return _billiard!!
    }

private var _billiard: ImageVector? = null
