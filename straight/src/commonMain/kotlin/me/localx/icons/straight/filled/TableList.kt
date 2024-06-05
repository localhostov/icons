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

public val Icons.Filled.TableList: ImageVector
    get() {
        if (_tableList != null) {
            return _tableList!!
        }
        _tableList = Builder(name = "TableList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(24.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-5.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(6.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _tableList!!
    }

private var _tableList: ImageVector? = null
