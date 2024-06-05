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

public val Icons.Filled.RugbyHelmet: ImageVector
    get() {
        if (_rugbyHelmet != null) {
            return _rugbyHelmet!!
        }
        _rugbyHelmet = Builder(name = "RugbyHelmet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.949f, 14.684f)
                lineTo(22.721f, 14.0f)
                lineTo(18.337f, 14.0f)
                lineToRelative(-0.329f, -3.944f)
                lineTo(18.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.791f, -1.2f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, false, 0.07f, -1.918f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 0.0f, 10.5f)
                arcToRelative(50.976f, 50.976f, 0.0f, false, false, 0.8f, 6.431f)
                arcTo(2.991f, 2.991f, 0.0f, false, false, 2.924f, 19.3f)
                arcToRelative(35.572f, 35.572f, 0.0f, false, true, 8.553f, 3.55f)
                lineToRelative(0.672f, 0.412f)
                lineTo(15.414f, 20.0f)
                lineTo(16.83f, 20.0f)
                lineToRelative(0.222f, 2.665f)
                lineToRelative(0.531f, 0.244f)
                arcTo(13.463f, 13.463f, 0.0f, false, false, 23.0f, 24.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 23.0f)
                arcTo(28.48f, 28.48f, 0.0f, false, false, 22.949f, 14.684f)
                close()
                moveTo(9.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.0f)
                close()
                moveTo(21.238f, 16.0f)
                curveToRelative(0.112f, 0.454f, 0.257f, 1.136f, 0.391f, 2.0f)
                lineTo(18.67f, 18.0f)
                lineTo(18.5f, 16.0f)
                close()
                moveTo(12.06f, 13.479f)
                lineToRelative(0.614f, -2.166f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.826f, -0.747f)
                lineToRelative(2.52f, -0.285f)
                lineTo(16.33f, 14.0f)
                lineTo(12.088f, 14.0f)
                arcTo(0.972f, 0.972f, 0.0f, false, true, 12.06f, 13.479f)
                close()
                moveTo(14.605f, 18.0f)
                lineToRelative(-1.291f, -2.0f)
                lineTo(16.5f, 16.0f)
                lineToRelative(0.166f, 2.0f)
                close()
                moveTo(18.946f, 21.311f)
                lineTo(18.837f, 20.0f)
                horizontalLineToRelative(3.034f)
                curveToRelative(0.053f, 0.6f, 0.093f, 1.257f, 0.114f, 1.959f)
                arcTo(11.434f, 11.434f, 0.0f, false, true, 18.946f, 21.311f)
                close()
            }
        }
        .build()
        return _rugbyHelmet!!
    }

private var _rugbyHelmet: ImageVector? = null
