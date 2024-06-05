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

public val Icons.Outline.ArrowTrendDown: ImageVector
    get() {
        if (_arrowTrendDown != null) {
            return _arrowTrendDown!!
        }
        _arrowTrendDown = Builder(name = "ArrowTrendDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(5.586f)
                lineTo(13.0f, 5.586f)
                lineToRelative(-6.0f, 6.0f)
                lineTo(1.444f, 6.03f)
                lineTo(0.03f, 7.444f)
                lineToRelative(6.97f, 6.97f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(7.586f, 7.586f)
                horizontalLineToRelative(-5.586f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _arrowTrendDown!!
    }

private var _arrowTrendDown: ImageVector? = null
