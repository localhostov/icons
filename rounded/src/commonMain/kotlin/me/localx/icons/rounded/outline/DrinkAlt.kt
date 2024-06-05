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

public val Icons.Outline.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.341f, 5.125f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 19.0f, 4.0f)
                lineTo(14.673f, 4.0f)
                lineTo(14.8f, 2.89f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.79f, 2.0f)
                lineTo(20.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(15.79f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.981f, 2.669f)
                lineTo(12.661f, 4.0f)
                lineTo(5.0f, 4.0f)
                arcTo(3.02f, 3.02f, 0.0f, false, false, 2.056f, 7.556f)
                lineTo(3.568f, 19.622f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 8.529f, 24.0f)
                lineTo(15.47f, 24.0f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, 4.962f, -4.379f)
                lineToRelative(1.5f, -11.968f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 21.341f, 5.125f)
                close()
                moveTo(19.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.781f, 0.375f)
                arcToRelative(1.068f, 1.068f, 0.0f, false, true, 0.179f, 0.937f)
                lineTo(19.622f, 10.0f)
                lineTo(14.006f, 10.0f)
                lineToRelative(0.445f, -4.0f)
                close()
                moveTo(4.221f, 6.374f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 6.0f)
                horizontalLineToRelative(7.437f)
                lineToRelative(-0.445f, 4.0f)
                lineTo(4.374f, 10.0f)
                lineToRelative(-0.35f, -2.784f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 4.221f, 6.374f)
                close()
                moveTo(18.447f, 19.374f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 15.47f, 22.0f)
                lineTo(8.529f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.976f, -2.626f)
                lineTo(4.626f, 12.0f)
                lineTo(19.371f, 12.0f)
                close()
                moveTo(13.438f, 15.11f)
                lineToRelative(-0.444f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.988f, -0.22f)
                lineToRelative(0.444f, -4.0f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, 1.105f, -0.884f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.438f, 15.11f)
                close()
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
