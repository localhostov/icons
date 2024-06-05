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

public val Icons.Outline.AddressCard: ImageVector
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
                moveTo(9.0f, 21.273f)
                verticalLineToRelative(-5.273f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.0f)
                lineTo(9.0f, 2.729f)
                lineToRelative(8.28f, 7.576f)
                curveToRelative(0.476f, 0.473f, 0.721f, 1.063f, 0.72f, 1.691f)
                curveToRelative(0.0f, 0.627f, -0.246f, 1.217f, -0.691f, 1.66f)
                lineToRelative(-8.309f, 7.616f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(2.727f)
                lineToRelative(4.928f, -4.517f)
                curveToRelative(0.059f, -0.059f, 0.072f, -0.162f, 0.072f, -0.215f)
                curveToRelative(0.0f, -0.054f, -0.013f, -0.156f, -0.101f, -0.244f)
                lineToRelative(-4.899f, -4.481f)
                verticalLineToRelative(2.73f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
