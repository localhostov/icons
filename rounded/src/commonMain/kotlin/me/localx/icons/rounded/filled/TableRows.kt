package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TableRows: ImageVector
    get() {
        if (_tableRows != null) {
            return _tableRows!!
        }
        _tableRows = Builder(name = "TableRows", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(7.0f, 2.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(7.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-4.0f)
                lineTo(7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tableRows!!
    }

private var _tableRows: ImageVector? = null
