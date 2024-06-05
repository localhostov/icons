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

public val Icons.Outline.Grill: ImageVector
    get() {
        if (_grill != null) {
            return _grill!!
        }
        _grill = Builder(name = "Grill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                lineTo(24.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 7.0f)
                arcTo(12.007f, 12.007f, 0.0f, false, false, 6.146f, 17.472f)
                lineTo(2.882f, 24.0f)
                lineTo(5.118f, 24.0f)
                lineToRelative(2.849f, -5.7f)
                arcTo(11.891f, 11.891f, 0.0f, false, false, 11.0f, 18.958f)
                lineTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 18.958f)
                arcToRelative(11.891f, 11.891f, 0.0f, false, false, 3.033f, -0.656f)
                lineTo(18.882f, 24.0f)
                horizontalLineToRelative(2.236f)
                lineToRelative(-3.264f, -6.528f)
                arcTo(12.007f, 12.007f, 0.0f, false, false, 24.0f, 7.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcTo(10.013f, 10.013f, 0.0f, false, true, 2.05f, 8.0f)
                horizontalLineToRelative(19.9f)
                arcTo(10.013f, 10.013f, 0.0f, false, true, 12.0f, 17.0f)
                close()
                moveTo(13.0f, 4.0f)
                lineTo(11.0f, 4.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 4.0f)
                lineTo(15.0f, 4.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                close()
            }
        }
        .build()
        return _grill!!
    }

private var _grill: ImageVector? = null
