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

public val Icons.Outline.CandyAlt: ImageVector
    get() {
        if (_candyAlt != null) {
            return _candyAlt!!
        }
        _candyAlt = Builder(name = "CandyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 7.971f, 14.615f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.928f, -7.928f)
                arcTo(9.0f, 9.0f, 0.0f, true, false, 15.0f, 0.0f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(6.971f, 6.971f, 0.0f, false, true, -4.631f, -1.756f)
                lineToRelative(-0.613f, -0.613f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.952f, 2.952f, 0.0f, false, false, 3.0f, -3.0f)
                arcToRelative(3.079f, 3.079f, 0.0f, false, false, -3.0f, -3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                arcToRelative(7.011f, 7.011f, 0.0f, false, false, 6.928f, -6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.0f, 16.0f)
                close()
            }
        }
        .build()
        return _candyAlt!!
    }

private var _candyAlt: ImageVector? = null
