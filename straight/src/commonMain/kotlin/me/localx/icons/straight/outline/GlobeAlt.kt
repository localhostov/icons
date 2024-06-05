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

public val Icons.Outline.GlobeAlt: ImageVector
    get() {
        if (_globeAlt != null) {
            return _globeAlt!!
        }
        _globeAlt = Builder(name = "GlobeAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 19.939f)
                verticalLineToRelative(2.061f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.051f)
                arcToRelative(11.993f, 11.993f, 0.0f, false, true, -7.9f, -20.0f)
                lineToRelative(1.485f, 1.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 15.671f, 12.354f)
                lineToRelative(1.651f, 1.13f)
                arcToRelative(11.992f, 11.992f, 0.0f, false, true, -8.907f, 5.166f)
                close()
                moveTo(5.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, -8.0f)
                close()
                moveTo(7.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, -6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _globeAlt!!
    }

private var _globeAlt: ImageVector? = null
