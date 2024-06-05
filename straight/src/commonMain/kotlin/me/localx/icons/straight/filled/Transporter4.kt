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

public val Icons.Filled.Transporter4: ImageVector
    get() {
        if (_transporter4 != null) {
            return _transporter4!!
        }
        _transporter4 = Builder(name = "Transporter4", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.333f, 15.353f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(2.333f, -1.167f)
                close()
                moveTo(17.5f, 3.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _transporter4!!
    }

private var _transporter4: ImageVector? = null
