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

public val Icons.Outline.TachometerFast: ImageVector
    get() {
        if (_tachometerFast != null) {
            return _tachometerFast!!
        }
        _tachometerFast = Builder(name = "TachometerFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, -7.823f, -2.478f)
                arcTo(9.992f, 9.992f, 0.0f, false, false, 4.962f, 20.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.357f, 0.038f)
                lineToRelative(1.027f, -0.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.308f, 1.514f)
                lineToRelative(-1.026f, 0.888f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, -4.073f, -0.129f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 13.0f)
                close()
                moveTo(17.707f, 8.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineToRelative(-3.775f, 3.775f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _tachometerFast!!
    }

private var _tachometerFast: ImageVector? = null
