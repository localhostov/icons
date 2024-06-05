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

public val Icons.Filled.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(17.309f, 13.657f)
                curveToRelative(0.445f, -0.442f, 0.69f, -1.032f, 0.691f, -1.66f)
                curveToRelative(0.0f, -0.628f, -0.244f, -1.218f, -0.72f, -1.691f)
                lineTo(9.0f, 2.729f)
                verticalLineToRelative(5.271f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.273f)
                lineToRelative(8.309f, -7.616f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
