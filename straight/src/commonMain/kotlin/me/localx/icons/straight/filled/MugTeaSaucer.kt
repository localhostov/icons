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

public val Icons.Filled.MugTeaSaucer: ImageVector
    get() {
        if (_mugTeaSaucer != null) {
            return _mugTeaSaucer!!
        }
        _mugTeaSaucer = Builder(name = "MugTeaSaucer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.008f, 20.0f)
                horizontalLineToRelative(20.992f)
                verticalLineToRelative(2.0f)
                lineTo(0.008f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _mugTeaSaucer!!
    }

private var _mugTeaSaucer: ImageVector? = null
