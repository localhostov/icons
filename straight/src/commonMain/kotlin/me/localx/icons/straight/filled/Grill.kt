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

public val Icons.Filled.Grill: ImageVector
    get() {
        if (_grill != null) {
            return _grill!!
        }
        _grill = Builder(name = "Grill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.852f, 17.467f)
                lineTo(21.118f, 24.0f)
                lineTo(18.882f, 24.0f)
                lineToRelative(-2.855f, -5.71f)
                arcTo(11.849f, 11.849f, 0.0f, false, true, 13.0f, 18.949f)
                lineTo(13.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 18.949f)
                arcToRelative(11.849f, 11.849f, 0.0f, false, true, -3.027f, -0.659f)
                lineTo(5.118f, 24.0f)
                lineTo(2.882f, 24.0f)
                lineToRelative(3.266f, -6.533f)
                arcTo(12.006f, 12.006f, 0.0f, false, true, 0.0f, 7.0f)
                lineTo(0.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 7.0f)
                arcTo(12.006f, 12.006f, 0.0f, false, true, 17.852f, 17.467f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _grill!!
    }

private var _grill: ImageVector? = null
