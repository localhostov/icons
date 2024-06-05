package me.localx.icons.rounded.bold

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

public val Icons.Bold.DiceFour: ImageVector
    get() {
        if (_diceFour != null) {
            return _diceFour!!
        }
        _diceFour = Builder(name = "DiceFour", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 24.0f, 18.5f)
                lineTo(24.0f, 5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 0.0f)
                close()
                moveTo(21.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                lineTo(3.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 5.5f)
                close()
                moveTo(9.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 7.5f)
                close()
                moveTo(18.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 7.5f)
                close()
                moveTo(9.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 16.5f)
                close()
                moveTo(18.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 16.5f)
                close()
            }
        }
        .build()
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
