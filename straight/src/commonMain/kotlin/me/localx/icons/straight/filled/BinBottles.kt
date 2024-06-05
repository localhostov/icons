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

public val Icons.Filled.BinBottles: ImageVector
    get() {
        if (_binBottles != null) {
            return _binBottles!!
        }
        _binBottles = Builder(name = "BinBottles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(23.571f, 12.0f)
                lineToRelative(-1.455f, 9.456f)
                curveToRelative(-0.227f, 1.474f, -1.474f, 2.544f, -2.965f, 2.544f)
                lineTo(4.849f, 24.0f)
                curveToRelative(-1.491f, 0.0f, -2.738f, -1.07f, -2.965f, -2.544f)
                lineTo(0.429f, 12.0f)
                lineTo(23.571f, 12.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(14.739f, 5.0f)
                curveToRelative(0.787f, 0.952f, 1.261f, 2.172f, 1.261f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.761f)
                close()
                moveTo(14.0f, 8.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 5.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(14.0f, 10.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(11.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 0.0f)
                close()
            }
        }
        .build()
        return _binBottles!!
    }

private var _binBottles: ImageVector? = null
