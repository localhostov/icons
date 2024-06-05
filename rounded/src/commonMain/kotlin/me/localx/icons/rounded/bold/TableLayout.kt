package me.localx.icons.rounded.bold

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

public val Icons.Bold.TableLayout: ImageVector
    get() {
        if (_tableLayout != null) {
            return _tableLayout!!
        }
        _tableLayout = Builder(name = "TableLayout", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                lineTo(5.5f, 2.0f)
                curveTo(2.467f, 2.0f, 0.0f, 4.468f, 0.0f, 7.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(5.5f, 5.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.207f, 0.0f, 2.217f, 0.86f, 2.45f, 2.0f)
                lineTo(3.05f, 7.0f)
                curveToRelative(0.232f, -1.14f, 1.242f, -2.0f, 2.45f, -2.0f)
                close()
                moveTo(3.0f, 16.5f)
                verticalLineToRelative(-6.5f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 10.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _tableLayout!!
    }

private var _tableLayout: ImageVector? = null
