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

public val Icons.Bold.BeerMugEmpty: ImageVector
    get() {
        if (_beerMugEmpty != null) {
            return _beerMugEmpty!!
        }
        _beerMugEmpty = Builder(name = "BeerMugEmpty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 1.0f)
                lineTo(0.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(15.5f, 20.0f)
                lineTo(4.5f, 20.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _beerMugEmpty!!
    }

private var _beerMugEmpty: ImageVector? = null
