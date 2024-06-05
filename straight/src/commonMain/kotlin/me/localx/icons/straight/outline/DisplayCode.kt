package me.localx.icons.straight.outline

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

public val Icons.Outline.DisplayCode: ImageVector
    get() {
        if (_displayCode != null) {
            return _displayCode!!
        }
        _displayCode = Builder(name = "DisplayCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.418f, 8.594f)
                curveToRelative(0.775f, 0.775f, 0.775f, 2.037f, 0.0f, 2.812f)
                lineToRelative(-3.299f, 3.299f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                lineToRelative(-3.298f, -3.283f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.298f, 3.299f)
                close()
                moveTo(8.88f, 5.295f)
                lineToRelative(-3.299f, 3.299f)
                curveToRelative(-0.774f, 0.775f, -0.774f, 2.037f, 0.0f, 2.812f)
                lineToRelative(3.298f, 3.299f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.298f, -3.283f)
                lineToRelative(3.298f, -3.299f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                lineTo(21.0f, 1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                lineTo(13.0f, 19.0f)
                close()
                moveTo(2.0f, 17.0f)
                lineTo(22.0f, 17.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _displayCode!!
    }

private var _displayCode: ImageVector? = null
