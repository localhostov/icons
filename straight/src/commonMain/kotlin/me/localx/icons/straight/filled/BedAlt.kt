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

public val Icons.Filled.BedAlt: ImageVector
    get() {
        if (_bedAlt != null) {
            return _bedAlt!!
        }
        _bedAlt = Builder(name = "BedAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                lineTo(24.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.771f, 0.0f, -1.468f, 0.301f, -2.0f, 0.78f)
                curveToRelative(-0.532f, -0.48f, -1.229f, -0.78f, -2.0f, -0.78f)
                lineTo(6.0f, 8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 13.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(0.0f, 15.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(22.0f, 19.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.0f, 15.0f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(6.0f, 10.0f)
                close()
            }
        }
        .build()
        return _bedAlt!!
    }

private var _bedAlt: ImageVector? = null
