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

public val Icons.Filled.Total: ImageVector
    get() {
        if (_total != null) {
            return _total!!
        }
        _total = Builder(name = "Total", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 24.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.885f)
                lineToRelative(9.151f, -10.115f)
                lineTo(2.0f, 1.885f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.801f)
                lineToRelative(9.048f, 10.0f)
                lineToRelative(-9.048f, 10.0f)
                horizontalLineToRelative(14.199f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _total!!
    }

private var _total: ImageVector? = null
