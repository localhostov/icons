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

public val Icons.Filled.DisplayCode: ImageVector
    get() {
        if (_displayCode != null) {
            return _displayCode!!
        }
        _displayCode = Builder(name = "DisplayCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(15.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(13.706f, 6.709f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.298f, 3.299f)
                curveToRelative(0.775f, 0.775f, 0.775f, 2.037f, 0.0f, 2.812f)
                lineToRelative(-3.299f, 3.299f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                lineToRelative(-3.298f, -3.283f)
                close()
                moveTo(10.295f, 13.291f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.298f, -3.299f)
                curveToRelative(-0.775f, -0.775f, -0.775f, -2.037f, 0.0f, -2.812f)
                lineToRelative(3.299f, -3.299f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.298f, 3.299f)
                lineToRelative(3.298f, 3.283f)
                close()
            }
        }
        .build()
        return _displayCode!!
    }

private var _displayCode: ImageVector? = null
