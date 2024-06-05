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

public val Icons.Outline.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2f, 16.262f)
                arcTo(12.143f, 12.143f, 0.0f, false, true, 7.746f, 9.793f)
                lineToRelative(3.406f, -3.406f)
                lineTo(4.887f, 0.122f)
                lineTo(1.716f, 3.292f)
                arcTo(5.892f, 5.892f, 0.0f, false, false, 0.0f, 7.5f)
                curveTo(0.0f, 14.748f, 9.252f, 24.0f, 16.5f, 24.0f)
                arcToRelative(5.886f, 5.886f, 0.0f, false, false, 4.207f, -1.716f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.264f)
                close()
                moveTo(19.292f, 20.871f)
                arcTo(3.906f, 3.906f, 0.0f, false, true, 16.5f, 22.0f)
                curveTo(10.266f, 22.0f, 2.0f, 13.733f, 2.0f, 7.5f)
                arcTo(3.907f, 3.907f, 0.0f, false, true, 3.13f, 4.707f)
                lineTo(4.887f, 2.95f)
                lineTo(8.324f, 6.387f)
                lineTo(5.388f, 9.322f)
                lineToRelative(0.246f, 0.614f)
                arcToRelative(14.372f, 14.372f, 0.0f, false, false, 8.447f, 8.436f)
                lineToRelative(0.606f, 0.231f)
                lineToRelative(2.926f, -2.926f)
                lineToRelative(3.436f, 3.436f)
                close()
                moveTo(20.914f, 4.5f)
                lineToRelative(3.043f, 3.043f)
                lineTo(22.543f, 8.957f)
                lineTo(19.5f, 5.914f)
                lineTo(16.457f, 8.957f)
                lineTo(15.043f, 7.543f)
                lineTo(18.086f, 4.5f)
                lineTo(15.043f, 1.457f)
                lineTo(16.457f, 0.043f)
                lineTo(19.5f, 3.086f)
                lineTo(22.543f, 0.043f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
