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

public val Icons.Outline.Flute: ImageVector
    get() {
        if (_flute != null) {
            return _flute!!
        }
        _flute = Builder(name = "Flute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.799f, 4.384f)
                lineTo(19.617f, 0.208f)
                lineToRelative(-0.705f, 0.639f)
                curveToRelative(-0.018f, 0.017f, -1.842f, 1.666f, -3.96f, 1.575f)
                lineToRelative(-0.432f, -0.013f)
                lineTo(-0.021f, 16.95f)
                lineToRelative(7.07f, 7.071f)
                lineToRelative(14.541f, -14.541f)
                lineToRelative(-0.013f, -0.432f)
                curveToRelative(-0.064f, -2.125f, 1.559f, -3.942f, 1.572f, -3.958f)
                lineToRelative(0.648f, -0.706f)
                close()
                moveTo(19.5f, 2.914f)
                lineToRelative(1.586f, 1.586f)
                curveToRelative(-0.394f, 0.571f, -0.889f, 1.434f, -1.203f, 2.469f)
                lineToRelative(-2.851f, -2.851f)
                curveToRelative(1.035f, -0.314f, 1.897f, -0.81f, 2.468f, -1.203f)
                close()
                moveTo(2.808f, 16.95f)
                lineTo(14.922f, 4.836f)
                lineToRelative(4.242f, 4.243f)
                lineToRelative(-12.114f, 12.114f)
                lineToRelative(-4.242f, -4.243f)
                close()
                moveTo(16.207f, 9.207f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(12.293f, 10.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(9.793f, 12.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(7.293f, 15.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _flute!!
    }

private var _flute: ImageVector? = null
