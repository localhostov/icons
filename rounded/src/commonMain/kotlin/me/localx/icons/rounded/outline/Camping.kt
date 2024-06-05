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

public val Icons.Outline.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.005f, 24.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.522f, -7.132f)
                lineTo(16.535f, 2.9f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -9.057f, -0.026f)
                lineToRelative(-7.0f, 14.0f)
                lineTo(0.47f, 16.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.005f, 24.0f)
                close()
                moveTo(8.405f, 22.0f)
                lineTo(11.122f, 16.562f)
                arcTo(0.958f, 0.958f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, 0.893f, 0.588f)
                lineTo(15.6f, 22.0f)
                close()
                moveTo(2.278f, 17.748f)
                lineToRelative(7.0f, -14.012f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.454f, 0.027f)
                lineToRelative(6.988f, 13.973f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                lineTo(17.836f, 22.0f)
                lineTo(14.7f, 15.72f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, false, -5.377f, -0.027f)
                lineTo(6.168f, 22.0f)
                lineTo(5.005f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.727f, -4.252f)
                close()
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
