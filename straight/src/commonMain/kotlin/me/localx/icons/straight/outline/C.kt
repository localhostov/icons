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

public val Icons.Outline.C: ImageVector
    get() {
        if (_c != null) {
            return _c!!
        }
        _c = Builder(name = "C", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                verticalLineToRelative(-4.0f)
                curveTo(2.0f, 4.486f, 6.486f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.824f, 0.0f, 7.257f, 2.128f, 8.96f, 5.554f)
                lineToRelative(-1.791f, 0.891f)
                curveToRelative(-1.362f, -2.742f, -4.109f, -4.445f, -7.169f, -4.445f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.006f, 0.0f, 5.73f, -1.66f, 7.111f, -4.333f)
                lineToRelative(1.777f, 0.918f)
                curveToRelative(-1.727f, 3.34f, -5.132f, 5.415f, -8.889f, 5.415f)
                close()
            }
        }
        .build()
        return _c!!
    }

private var _c: ImageVector? = null
