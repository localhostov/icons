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

public val Icons.Outline.ComputerClassic: ImageVector
    get() {
        if (_computerClassic != null) {
            return _computerClassic!!
        }
        _computerClassic = Builder(name = "ComputerClassic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(2.346f, 0.0f, 1.0f, 1.346f, 1.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.415f, 2.0f, 2.828f)
                verticalLineToRelative(4.172f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-4.172f)
                curveToRelative(1.164f, -0.413f, 2.0f, -1.524f, 2.0f, -2.828f)
                lineTo(23.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(21.0f, 17.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _computerClassic!!
    }

private var _computerClassic: ImageVector? = null
