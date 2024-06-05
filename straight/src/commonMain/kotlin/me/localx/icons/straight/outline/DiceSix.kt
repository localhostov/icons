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

public val Icons.Outline.DiceSix: ImageVector
    get() {
        if (_diceSix != null) {
            return _diceSix!!
        }
        _diceSix = Builder(name = "DiceSix", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 3.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
                moveTo(6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(6.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 17.0f)
                close()
                moveTo(16.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 17.0f)
                close()
            }
        }
        .build()
        return _diceSix!!
    }

private var _diceSix: ImageVector? = null
