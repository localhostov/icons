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

public val Icons.Outline.TachometerSlowest: ImageVector
    get() {
        if (_tachometerSlowest != null) {
            return _tachometerSlowest!!
        }
        _tachometerSlowest = Builder(name = "TachometerSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.445f, 21.516f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, -4.073f, 0.128f)
                lineToRelative(-1.026f, -0.887f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.308f, -1.514f)
                lineToRelative(1.027f, 0.888f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.357f, -0.037f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -14.114f, -0.038f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, 1.395f, 0.076f)
                lineToRelative(1.027f, -0.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.308f, 1.514f)
                lineToRelative(-1.027f, 0.888f)
                arcToRelative(3.036f, 3.036f, 0.0f, false, true, -4.119f, -0.176f)
                arcTo(12.057f, 12.057f, 0.0f, false, true, 4.0f, 4.052f)
                curveTo(11.021f, -2.364f, 22.755f, 2.0f, 23.9f, 11.437f)
                arcTo(11.958f, 11.958f, 0.0f, false, true, 20.445f, 21.516f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.988f, 1.78f)
                lineTo(5.145f, 14.916f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.8f, 1.832f)
                lineToRelative(4.867f, -2.136f)
                arcTo(1.993f, 1.993f, 0.0f, true, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _tachometerSlowest!!
    }

private var _tachometerSlowest: ImageVector? = null
