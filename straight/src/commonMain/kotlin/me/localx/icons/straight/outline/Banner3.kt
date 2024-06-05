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

public val Icons.Outline.Banner3: ImageVector
    get() {
        if (_banner3 != null) {
            return _banner3!!
        }
        _banner3 = Builder(name = "Banner3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.023f)
                lineTo(1.075f, 1.234f)
                lineTo(0.0f, 11.0f)
                lineToRelative(4.784f, 2.791f)
                lineToRelative(-2.785f, 4.244f)
                verticalLineToRelative(3.965f)
                lineToRelative(8.0f, 2.0f)
                lineToRelative(-4.595f, -3.402f)
                lineToRelative(6.595f, -2.695f)
                verticalLineToRelative(-6.417f)
                lineToRelative(12.0f, 0.562f)
                lineTo(23.999f, 0.023f)
                close()
                moveTo(4.0f, 19.011f)
                verticalLineToRelative(-0.379f)
                lineToRelative(2.515f, -3.832f)
                lineToRelative(3.209f, 1.872f)
                lineToRelative(-5.724f, 2.339f)
                close()
                moveTo(10.0f, 14.517f)
                lineToRelative(-5.827f, -3.399f)
                lineToRelative(5.827f, 0.273f)
                verticalLineToRelative(3.126f)
                close()
                moveTo(22.0f, 9.952f)
                lineToRelative(-19.762f, -0.927f)
                lineToRelative(0.641f, -5.884f)
                lineToRelative(19.121f, -1.01f)
                verticalLineToRelative(7.821f)
                close()
            }
        }
        .build()
        return _banner3!!
    }

private var _banner3: ImageVector? = null
