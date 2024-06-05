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

public val Icons.Bold.CaravanAlt: ImageVector
    get() {
        if (_caravanAlt != null) {
            return _caravanAlt!!
        }
        _caravanAlt = Builder(name = "CaravanAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 3.0f)
                lineTo(5.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                lineTo(3.0f, 16.0f)
                arcToRelative(1.764f, 1.764f, 0.0f, false, false, 0.533f, 1.338f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.066f, 2.176f)
                arcTo(4.718f, 4.718f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(0.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(12.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 23.0f, 5.5f)
                lineTo(23.0f, 18.086f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 19.5f)
                close()
                moveTo(8.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 17.0f)
                close()
                moveTo(16.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 10.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 7.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 8.5f)
                verticalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 12.0f)
                close()
                moveTo(9.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 10.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 7.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 8.5f)
                verticalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 12.0f)
                close()
            }
        }
        .build()
        return _caravanAlt!!
    }

private var _caravanAlt: ImageVector? = null
