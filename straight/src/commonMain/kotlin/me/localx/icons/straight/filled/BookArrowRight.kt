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

public val Icons.Filled.BookArrowRight: ImageVector
    get() {
        if (_bookArrowRight != null) {
            return _bookArrowRight!!
        }
        _bookArrowRight = Builder(name = "BookArrowRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(15.765f)
                curveToRelative(0.549f, -0.494f, 1.262f, -0.766f, 2.0f, -0.765f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 2.0f)
                lineTo(22.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(19.419f, 8.594f)
                lineToRelative(-3.299f, -3.299f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.302f, 2.291f)
                horizontalLineToRelative(-7.008f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.997f)
                lineToRelative(-2.291f, 2.291f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.3f, -3.299f)
                curveToRelative(0.774f, -0.775f, 0.773f, -2.037f, 0.0f, -2.812f)
                close()
            }
        }
        .build()
        return _bookArrowRight!!
    }

private var _bookArrowRight: ImageVector? = null
