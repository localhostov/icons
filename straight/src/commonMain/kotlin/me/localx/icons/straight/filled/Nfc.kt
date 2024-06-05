package me.localx.icons.straight.filled

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

public val Icons.Filled.Nfc: ImageVector
    get() {
        if (_nfc != null) {
            return _nfc!!
        }
        _nfc = Builder(name = "Nfc", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(5.41f)
                lineToRelative(-3.41f, 3.41f)
                verticalLineToRelative(12.59f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-6.09f)
                lineToRelative(-2.91f, 2.91f)
                verticalLineToRelative(6.09f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 7.09f)
                lineTo(12.09f, 3.0f)
                horizontalLineToRelative(8.91f)
                lineTo(21.0f, 21.0f)
                close()
            }
        }
        .build()
        return _nfc!!
    }

private var _nfc: ImageVector? = null
