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

public val Icons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.424f)
                lineTo(21.0f, 11.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 11.0f)
                verticalLineToRelative(1.424f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                lineTo(7.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 11.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 12.0f)
                verticalLineToRelative(8.0f)
                lineTo(13.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 2.0f, -9.576f)
                close()
                moveTo(5.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(19.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
