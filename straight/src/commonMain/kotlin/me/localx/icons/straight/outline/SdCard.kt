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

public val Icons.Outline.SdCard: ImageVector
    get() {
        if (_sdCard != null) {
            return _sdCard!!
        }
        _sdCard = Builder(name = "SdCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                horizontalLineToRelative(-7.758f)
                curveToRelative(-1.054f, 0.0f, -2.084f, 0.427f, -2.828f, 1.172f)
                lineToRelative(-3.242f, 3.242f)
                curveToRelative(-0.756f, 0.756f, -1.172f, 1.761f, -1.172f, 2.829f)
                verticalLineToRelative(16.757f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 7.243f)
                curveToRelative(0.0f, -0.534f, 0.208f, -1.036f, 0.586f, -1.415f)
                lineToRelative(3.242f, -3.242f)
                curveToRelative(0.372f, -0.373f, 0.888f, -0.586f, 1.414f, -0.586f)
                horizontalLineToRelative(7.758f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(12.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.391f, -0.391f, 0.609f, -0.609f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _sdCard!!
    }

private var _sdCard: ImageVector? = null
