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

public val Icons.Filled.Watermelon: ImageVector
    get() {
        if (_watermelon != null) {
            return _watermelon!!
        }
        _watermelon = Builder(name = "Watermelon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.049f, 0.749f)
                lineTo(19.34f, 0.04f)
                lineTo(0.04f, 19.34f)
                lineToRelative(0.709f, 0.71f)
                arcToRelative(13.648f, 13.648f, 0.0f, false, false, 19.3f, -19.3f)
                close()
                moveTo(9.627f, 19.666f)
                arcToRelative(1.248f, 1.248f, 0.0f, false, true, -1.764f, 0.0f)
                arcToRelative(8.243f, 8.243f, 0.0f, false, true, -0.883f, -2.647f)
                arcToRelative(8.253f, 8.253f, 0.0f, false, true, 2.647f, 0.882f)
                arcTo(1.249f, 1.249f, 0.0f, false, true, 9.627f, 19.666f)
                close()
                moveTo(14.646f, 18.666f)
                arcToRelative(1.248f, 1.248f, 0.0f, false, true, -1.764f, 0.0f)
                arcTo(8.26f, 8.26f, 0.0f, false, true, 12.0f, 16.015f)
                arcToRelative(8.231f, 8.231f, 0.0f, false, true, 2.646f, 0.883f)
                arcTo(1.248f, 1.248f, 0.0f, false, true, 14.646f, 18.662f)
                close()
                moveTo(17.658f, 15.654f)
                arcToRelative(1.248f, 1.248f, 0.0f, false, true, -1.764f, 0.0f)
                arcTo(8.224f, 8.224f, 0.0f, false, true, 15.012f, 13.0f)
                arcToRelative(8.249f, 8.249f, 0.0f, false, true, 2.646f, 0.882f)
                arcTo(1.248f, 1.248f, 0.0f, false, true, 17.658f, 15.65f)
                close()
                moveTo(19.665f, 10.635f)
                arcToRelative(1.248f, 1.248f, 0.0f, false, true, -1.764f, 0.0f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, -0.882f, -2.647f)
                arcToRelative(8.249f, 8.249f, 0.0f, false, true, 2.646f, 0.882f)
                arcTo(1.247f, 1.247f, 0.0f, false, true, 19.665f, 10.631f)
                close()
            }
        }
        .build()
        return _watermelon!!
    }

private var _watermelon: ImageVector? = null
