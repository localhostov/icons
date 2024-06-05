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

public val Icons.Filled.Revenue: ImageVector
    get() {
        if (_revenue != null) {
            return _revenue!!
        }
        _revenue = Builder(name = "Revenue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.026f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(-0.941f, 0.599f, -1.5f, 1.192f, -2.0f, 2.026f)
                close()
                moveTo(21.685f, 16.268f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                close()
                moveTo(6.0f, 24.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(1.0f, 24.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.0f)
                lineTo(1.0f, 12.001f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(11.0f, 24.001f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(23.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 0.0f)
                close()
            }
        }
        .build()
        return _revenue!!
    }

private var _revenue: ImageVector? = null
