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

public val Icons.Bold.TableRows: ImageVector
    get() {
        if (_tableRows != null) {
            return _tableRows!!
        }
        _tableRows = Builder(name = "TableRows", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveTo(1.57f, 2.0f, 0.0f, 3.57f, 0.0f, 5.5f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 5.5f)
                verticalLineToRelative(4.5f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                close()
                moveTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(14.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.5f)
                close()
                moveTo(9.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(6.0f)
                lineTo(9.0f, 19.0f)
                close()
            }
        }
        .build()
        return _tableRows!!
    }

private var _tableRows: ImageVector? = null
