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

public val Icons.Outline.Resources: ImageVector
    get() {
        if (_resources != null) {
            return _resources!!
        }
        _resources = Builder(name = "Resources", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                lineTo(13.0f, 7.736f)
                lineTo(10.329f, 3.108f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.464f, 0.0f)
                lineTo(0.0f, 15.0f)
                lineTo(7.294f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 13.023f, -1.0f)
                lineTo(24.0f, 14.0f)
                close()
                moveTo(3.464f, 13.0f)
                lineTo(8.6f, 4.109f)
                lineToRelative(3.548f, 6.147f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.26f, 13.0f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, -5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 14.0f, 22.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(18.894f, 12.0f)
                arcTo(6.969f, 6.969f, 0.0f, false, false, 15.0f, 10.08f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _resources!!
    }

private var _resources: ImageVector? = null
