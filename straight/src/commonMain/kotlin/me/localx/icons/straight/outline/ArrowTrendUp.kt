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

public val Icons.Outline.ArrowTrendUp: ImageVector
    get() {
        if (_arrowTrendUp != null) {
            return _arrowTrendUp!!
        }
        _arrowTrendUp = Builder(name = "ArrowTrendUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.586f)
                lineToRelative(-7.586f, 7.586f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(0.03f, 16.556f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.556f, -5.556f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(9.0f, -9.0f)
                verticalLineToRelative(5.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowTrendUp!!
    }

private var _arrowTrendUp: ImageVector? = null
