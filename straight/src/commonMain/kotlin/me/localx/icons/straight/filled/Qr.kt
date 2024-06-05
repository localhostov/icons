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

public val Icons.Filled.Qr: ImageVector
    get() {
        if (_qr != null) {
            return _qr!!
        }
        _qr = Builder(name = "Qr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(3.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _qr!!
    }

private var _qr: ImageVector? = null
