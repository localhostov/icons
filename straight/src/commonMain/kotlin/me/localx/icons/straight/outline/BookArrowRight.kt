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

public val Icons.Outline.BookArrowRight: ImageVector
    get() {
        if (_bookArrowRight != null) {
            return _bookArrowRight!!
        }
        _bookArrowRight = Builder(name = "BookArrowRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.001f, 11.0f)
                lineTo(12.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.001f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.779f, 0.779f, 0.779f, 2.049f, 0.0f, 2.828f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 3.0f)
                verticalLineToRelative(15.172f)
                curveToRelative(0.313f, -0.111f, 0.649f, -0.172f, 1.0f, -0.172f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _bookArrowRight!!
    }

private var _bookArrowRight: ImageVector? = null
