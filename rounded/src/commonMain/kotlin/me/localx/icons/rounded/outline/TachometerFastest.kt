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

public val Icons.Outline.TachometerFastest: ImageVector
    get() {
        if (_tachometerFastest != null) {
            return _tachometerFastest!!
        }
        _tachometerFastest = Builder(name = "TachometerFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                arcToRelative(11.914f, 11.914f, 0.0f, false, true, -3.508f, 8.47f)
                arcToRelative(3.037f, 3.037f, 0.0f, false, true, -4.12f, 0.174f)
                lineToRelative(-1.026f, -0.887f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.308f, -1.514f)
                lineToRelative(1.027f, 0.888f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, false, 1.395f, -0.075f)
                arcToRelative(10.044f, 10.044f, 0.0f, false, false, -0.414f, -14.513f)
                arcTo(9.91f, 9.91f, 0.0f, false, false, 10.84f, 3.065f)
                arcTo(9.992f, 9.992f, 0.0f, false, false, 4.963f, 20.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.356f, 0.038f)
                lineToRelative(1.027f, -0.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.308f, 1.514f)
                lineToRelative(-1.026f, 0.888f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, -4.073f, -0.13f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 13.0f)
                close()
                moveTo(18.051f, 16.748f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.8f, -1.832f)
                lineTo(13.988f, 12.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.8f, 1.832f)
                close()
            }
        }
        .build()
        return _tachometerFastest!!
    }

private var _tachometerFastest: ImageVector? = null
