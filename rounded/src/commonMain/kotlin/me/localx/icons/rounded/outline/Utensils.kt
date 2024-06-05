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

public val Icons.Outline.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(12.0f, 7.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, -4.0f, 4.9f)
                lineTo(8.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(6.0f, 11.9f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 2.0f, 7.0f)
                lineTo(2.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 1.0f)
                lineTo(4.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 9.816f)
                lineTo(6.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 1.0f)
                lineTo(8.0f, 9.816f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 7.0f)
                lineTo(10.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 1.0f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(12.64f, 12.64f, 0.0f, false, true, -5.0f, 9.775f)
                lineTo(17.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(15.0f, 2.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 16.131f, 0.217f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, true, 2.356f, 0.459f)
                arcTo(13.474f, 13.474f, 0.0f, false, true, 22.0f, 10.0f)
                close()
                moveTo(20.0f, 10.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -3.0f, -7.937f)
                lineTo(17.0f, 17.07f)
                arcTo(10.3f, 10.3f, 0.0f, false, false, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
