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

public val Icons.Filled.ArrowComparison: ImageVector
    get() {
        if (_arrowComparison != null) {
            return _arrowComparison!!
        }
        _arrowComparison = Builder(name = "ArrowComparison", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.55f, 10.037f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-8.964f, 8.963f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(-6.586f, 6.586f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 24.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(7.55f, -7.549f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-6.586f, 6.586f)
                lineToRelative(-5.0f, -5.0f)
                lineTo(0.075f, 12.511f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.511f, -7.511f)
                lineToRelative(5.0f, 5.0f)
                lineTo(22.0f, 3.414f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowComparison!!
    }

private var _arrowComparison: ImageVector? = null
