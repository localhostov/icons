package me.localx.icons.straight.bold

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

public val Icons.Bold.BasketballHoop: ImageVector
    get() {
        if (_basketballHoop != null) {
            return _basketballHoop!!
        }
        _basketballHoop = Builder(name = "BasketballHoop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                lineTo(24.0f, 4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 0.0f)
                lineTo(4.5f, 0.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 4.5f)
                lineTo(0.0f, 18.0f)
                lineTo(5.7f, 18.0f)
                lineTo(6.0f, 20.587f)
                lineTo(6.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 22.0f)
                lineTo(15.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 20.811f)
                lineTo(18.324f, 18.0f)
                close()
                moveTo(3.0f, 15.0f)
                lineTo(3.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 4.5f)
                lineTo(21.0f, 15.0f)
                lineTo(18.67f, 15.0f)
                lineToRelative(0.347f, -3.0f)
                lineTo(5.009f, 12.0f)
                lineToRelative(0.346f, 3.0f)
                close()
                moveTo(15.189f, 19.0f)
                lineTo(8.837f, 19.0f)
                lineToRelative(-0.462f, -4.0f)
                lineTo(15.65f, 15.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                close()
            }
        }
        .build()
        return _basketballHoop!!
    }

private var _basketballHoop: ImageVector? = null
