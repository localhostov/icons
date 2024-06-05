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

public val Icons.Filled.BasketballHoop: ImageVector
    get() {
        if (_basketballHoop != null) {
            return _basketballHoop!!
        }
        _basketballHoop = Builder(name = "BasketballHoop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.867f, 12.0f)
                lineTo(5.0f, 21.062f)
                lineTo(5.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 21.274f)
                lineToRelative(0.019f, -0.153f)
                horizontalLineToRelative(0.0f)
                lineTo(20.129f, 12.0f)
                close()
                moveTo(17.627f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 14.0f)
                horizontalLineToRelative(2.871f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.383f, 16.0f)
                lineToRelative(-0.25f, -2.0f)
                close()
                moveTo(6.883f, 20.0f)
                lineToRelative(-0.25f, -2.0f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(2.384f)
                lineToRelative(-0.244f, 2.0f)
                lineTo(15.0f, 20.0f)
                close()
                moveTo(16.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 10.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(24.0f, 4.0f)
                lineTo(24.0f, 18.0f)
                lineTo(21.413f, 18.0f)
                lineTo(22.0f, 13.181f)
                lineTo(22.0f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(3.188f)
                lineTo(2.6f, 18.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 4.0f)
                close()
            }
        }
        .build()
        return _basketballHoop!!
    }

private var _basketballHoop: ImageVector? = null
