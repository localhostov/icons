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

public val Icons.Bold.BookTanakh: ImageVector
    get() {
        if (_bookTanakh != null) {
            return _bookTanakh!!
        }
        _bookTanakh = Builder(name = "BookTanakh", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(2.122f, 0.0f, 1.0f, 1.122f, 1.0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(23.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(12.142f)
                curveToRelative(-0.322f, -0.084f, -0.653f, -0.142f, -1.0f, -0.142f)
                horizontalLineToRelative(-6.722f)
                lineToRelative(1.829f, -3.0f)
                horizontalLineToRelative(4.268f)
                lineToRelative(-2.133f, -3.502f)
                lineToRelative(2.133f, -3.498f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(-1.827f, -3.0f)
                horizontalLineToRelative(6.716f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(8.929f, 9.498f)
                lineToRelative(1.521f, -2.498f)
                horizontalLineToRelative(3.099f)
                lineToRelative(1.521f, 2.498f)
                lineToRelative(-1.526f, 2.502f)
                horizontalLineToRelative(-3.091f)
                lineToRelative(-1.526f, -2.502f)
                close()
                moveTo(9.283f, 12.0f)
                horizontalLineToRelative(-1.878f)
                lineToRelative(0.938f, -1.541f)
                lineToRelative(0.94f, 1.541f)
                close()
                moveTo(8.343f, 8.537f)
                lineToRelative(-0.937f, -1.537f)
                horizontalLineToRelative(1.874f)
                lineToRelative(-0.936f, 1.537f)
                close()
                moveTo(11.059f, 6.0f)
                lineToRelative(0.94f, -1.544f)
                lineToRelative(0.94f, 1.544f)
                horizontalLineToRelative(-1.881f)
                close()
                moveTo(14.72f, 7.0f)
                horizontalLineToRelative(1.874f)
                lineToRelative(-0.937f, 1.537f)
                lineToRelative(-0.936f, -1.537f)
                close()
                moveTo(15.656f, 10.459f)
                lineToRelative(0.938f, 1.541f)
                horizontalLineToRelative(-1.878f)
                lineToRelative(0.94f, -1.541f)
                close()
                moveTo(12.935f, 13.0f)
                lineToRelative(-0.936f, 1.534f)
                lineToRelative(-0.936f, -1.534f)
                horizontalLineToRelative(1.871f)
                close()
                moveTo(11.715f, 3.0f)
                lineToRelative(-1.827f, 3.0f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(2.133f, 3.498f)
                lineToRelative(-2.133f, 3.502f)
                horizontalLineToRelative(4.268f)
                lineToRelative(1.829f, 3.0f)
                horizontalLineToRelative(-7.722f)
                lineTo(3.999f, 3.0f)
                horizontalLineToRelative(7.716f)
                close()
                moveTo(18.999f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _bookTanakh!!
    }

private var _bookTanakh: ImageVector? = null
