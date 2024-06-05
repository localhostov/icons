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

public val Icons.Filled.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.49f, 16.0f)
                lineToRelative(-0.43f, 4.299f)
                curveToRelative(-0.153f, 1.54f, -1.437f, 2.701f, -2.985f, 2.701f)
                lineTo(4.804f, 23.0f)
                curveToRelative(-1.559f, 0.0f, -2.843f, -1.17f, -2.987f, -2.721f)
                lineToRelative(-0.399f, -4.279f)
                horizontalLineToRelative(21.072f)
                close()
                moveTo(22.69f, 14.0f)
                lineToRelative(1.301f, -13.0f)
                lineTo(0.018f, 1.0f)
                lineToRelative(1.213f, 13.0f)
                horizontalLineToRelative(21.459f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null
