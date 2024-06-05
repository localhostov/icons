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

public val Icons.Outline.HomeLocationAlt: ImageVector
    get() {
        if (_homeLocationAlt != null) {
            return _homeLocationAlt!!
        }
        _homeLocationAlt = Builder(name = "HomeLocationAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.007f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 7.058f, 18.964f)
                lineTo(12.0f, 23.8f)
                lineToRelative(4.95f, -4.841f)
                arcTo(6.952f, 6.952f, 0.0f, false, false, 19.0f, 14.007f)
                close()
                moveTo(12.0f, 21.0f)
                lineTo(8.464f, 17.542f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.079f, -0.008f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
                moveTo(24.0f, 10.046f)
                lineTo(24.0f, 24.0f)
                lineTo(14.653f, 24.0f)
                lineTo(16.7f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 10.043f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, -0.384f, -0.787f)
                lineToRelative(-9.0f, -7.044f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.232f, 0.0f)
                lineToRelative(-9.0f, 7.042f)
                arcTo(0.994f, 0.994f, 0.0f, false, false, 2.0f, 10.043f)
                lineTo(2.0f, 22.0f)
                lineTo(7.3f, 22.0f)
                lineToRelative(2.045f, 2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.043f)
                arcTo(2.985f, 2.985f, 0.0f, false, true, 1.151f, 7.68f)
                lineToRelative(9.0f, -7.042f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.7f, 0.0f)
                lineToRelative(9.0f, 7.044f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 24.0f, 10.043f)
                close()
            }
        }
        .build()
        return _homeLocationAlt!!
    }

private var _homeLocationAlt: ImageVector? = null
