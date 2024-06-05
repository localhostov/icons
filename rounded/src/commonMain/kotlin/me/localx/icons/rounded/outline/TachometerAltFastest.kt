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

public val Icons.Outline.TachometerAltFastest: ImageVector
    get() {
        if (_tachometerAltFastest != null) {
            return _tachometerAltFastest!!
        }
        _tachometerAltFastest = Builder(name = "TachometerAltFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.052f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.612f, 21.572f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 7.12f, 23.0f)
                horizontalLineToRelative(9.767f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, false, 3.354f, -1.288f)
                arcTo(12.053f, 12.053f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(18.868f, 20.259f)
                arcTo(2.862f, 2.862f, 0.0f, false, true, 16.887f, 21.0f)
                lineTo(7.12f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.11f, -0.858f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 13.858f, 0.117f)
                close()
                moveTo(19.068f, 12.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.132f, -0.848f)
                arcTo(6.022f, 6.022f, 0.0f, false, false, 12.0f, 7.0f)
                curveToRelative(-5.268f, -0.1f, -8.04f, 6.686f, -4.193f, 10.285f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 1.43f)
                curveTo(1.287f, 13.848f, 4.939f, 4.915f, 12.0f, 5.0f)
                arcToRelative(8.035f, 8.035f, 0.0f, false, true, 7.919f, 6.858f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.07f, 12.99f)
                close()
                moveTo(19.368f, 16.234f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.318f, 0.514f)
                lineToRelative(-4.867f, -2.136f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.8f, -1.832f)
                lineToRelative(4.867f, 2.136f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.369f, 16.234f)
                close()
            }
        }
        .build()
        return _tachometerAltFastest!!
    }

private var _tachometerAltFastest: ImageVector? = null
