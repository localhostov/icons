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

public val Icons.Filled.TableLayout: ImageVector
    get() {
        if (_tableLayout != null) {
            return _tableLayout!!
        }
        _tableLayout = Builder(name = "TableLayout", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(13.0f)
                lineTo(7.0f, 22.0f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(15.0f)
                lineTo(24.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _tableLayout!!
    }

private var _tableLayout: ImageVector? = null
